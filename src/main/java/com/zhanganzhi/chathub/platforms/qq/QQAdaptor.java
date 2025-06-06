package com.zhanganzhi.chathub.platforms.qq;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.zhanganzhi.chathub.ChatHub;
import com.zhanganzhi.chathub.core.adaptor.AbstractAdaptor;
import com.zhanganzhi.chathub.core.events.MessageEvent;
import com.zhanganzhi.chathub.platforms.Platform;
import com.zhanganzhi.chathub.platforms.qq.dto.QQEvent;
import com.zhanganzhi.chathub.platforms.qq.protocol.QQAPI;

import java.util.ArrayList;
import java.util.List;

public class QQAdaptor extends AbstractAdaptor<QQFormatter> {
    private final QQAPI qqAPI;
    private final Thread eventListener;
    private boolean listenerStopFlag = false;

    public QQAdaptor(ChatHub chatHub) {
        super(chatHub, Platform.QQ, new QQFormatter());
        qqAPI = new QQAPI(chatHub);
        eventListener = new Thread(this::eventListener, "chathub-qq-event-listener");
    }

    @Override
    public void start() {
        chatHub.getLogger().info("QQ适配器已启动（仅响应/list命令）");
        qqAPI.start();
        eventListener.start();
    }

    @Override
    public void stop() {
        listenerStopFlag = true;
        if (eventListener != null) {
            eventListener.interrupt();
        }
        qqAPI.stop();
    }

    // 修改点1：禁用所有主动发送到QQ群的消息
    @Override
    public void sendPublicMessage(String message) {
        // 空实现，不发送任何消息
        chatHub.getLogger().debug("消息发送被阻止: " + message);
    }

    private void eventListener() {
        while (!listenerStopFlag) {
            consumeEvent();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                if (listenerStopFlag) {
                    consumeEvent();
                    break;
                }
            }
        }
    }

    private void consumeEvent() {
        QQEvent curEvent;
        while ((curEvent = qqAPI.getQqEventQueue().poll()) != null) {
            if (isValidGroupMessage(curEvent)) {
                JSONArray message = curEvent.getMessage();

                // 修改点2：只处理/list命令
                if (isListCommand(message)) {
                    // 临时允许发送服务器列表
                    String serverList = getFormatter().formatListAll(chatHub.getProxyServer());
                    chatHub.getThreadPoolExecutor().submit(() -> 
                        qqAPI.sendMessage(serverList, config.getQQGroupId())
                    );
                    continue; // 处理完后继续下一个消息
                }

                // 修改点3：不再处理普通聊天消息
                chatHub.getLogger().debug("忽略非/list消息: " + curEvent.getMessage());
            }
        }
    }

    // 辅助方法：判断是否为/list命令
    private boolean isListCommand(JSONArray message) {
        if (message.size() != 1) return false;
        
        JSONObject firstPart = message.getJSONObject(0);
        return "text".equals(firstPart.getString("type")) &&
               "/list".equals(firstPart.getJSONObject("data").getString("text"));
    }

    // 辅助方法：验证合法群消息
    private boolean isValidGroupMessage(QQEvent event) {
        return "message".equals(event.getPostType()) &&
               "group".equals(event.getMessageType()) &&
               "array".equals(event.getMessageFormat()) &&
               config.getQQGroupId().equals(event.getGroupId().toString());
    }
}
