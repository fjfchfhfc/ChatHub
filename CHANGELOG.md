# Changelog

## [1.10.0](https://github.com/fjfchfhfc/ChatHub/compare/v1.9.0...v1.10.0) (2025-06-06)


### Features

* :sparkles: display list empty message when no player online ([74a4031](https://github.com/fjfchfhfc/ChatHub/commit/74a4031ffdf8d36d41717c0ca80cfd48a85ec9ce))
* ✨ add daemon thread for kook receiver ([fcb5e4c](https://github.com/fjfchfhfc/ChatHub/commit/fcb5e4c2c534f362f49ad3bb0c7e5516542add2a))
* ✨ add daemon thread for kook receiver ([eb29ea5](https://github.com/fjfchfhfc/ChatHub/commit/eb29ea5223624bee5314bc7ed1d4828dd891d1f1))
* ✨ add kook websocket reconnection ([d84ed0a](https://github.com/fjfchfhfc/ChatHub/commit/d84ed0ae03bcb27786ad4e225937f2964aa9bcd8))
* ✨ add qq platform ([#26](https://github.com/fjfchfhfc/ChatHub/issues/26)) ([3a664ea](https://github.com/fjfchfhfc/ChatHub/commit/3a664ea8e72af2fe4a1dabe9e4650ab743c1f1a8))
* ✨ add reloadKook command ([0fb0f8b](https://github.com/fjfchfhfc/ChatHub/commit/0fb0f8b50b5909ec70113cbdcf3ca67523b6d8bb))
* ✨ case insensitive while matching player names ([e2f4145](https://github.com/fjfchfhfc/ChatHub/commit/e2f41456642a597a032c664d2055e60f25cc82c5))
* ✨ enable plainServer message placeholder ([d5b0485](https://github.com/fjfchfhfc/ChatHub/commit/d5b04852026c6dcd481cbe4e9fed922a8428f173))
* ✨ list command only display servers has player ([6587cd7](https://github.com/fjfchfhfc/ChatHub/commit/6587cd7145552fc1af182d4c51be75d14d8ef15e))
* ✨ make player name clickable ([1802dc3](https://github.com/fjfchfhfc/ChatHub/commit/1802dc317e7b0101c4bd7e246b95d850f0abdc01))
* ✨ make server text clickable ([0539a87](https://github.com/fjfchfhfc/ChatHub/commit/0539a878e6b18dee3a2d0ebc4bed720d662c713d))
* ✨ print stack trace on kook websocket session failure ([86fdcbd](https://github.com/fjfchfhfc/ChatHub/commit/86fdcbdffe87ead69c884a4539b6501bb7b8d54d))
* ✨ QQ `list` command  support ([#29](https://github.com/fjfchfhfc/ChatHub/issues/29)) ([71397aa](https://github.com/fjfchfhfc/ChatHub/commit/71397aa0083bd9df92820ac63442e1092e102bef))
* ✨ remove net.deechael.khl and self handling kook ([edf4f27](https://github.com/fjfchfhfc/ChatHub/commit/edf4f27dd10c21077af5665d22dc30afec9e051d))
* ✨ split multiline message for velocity sender ([#4](https://github.com/fjfchfhfc/ChatHub/issues/4)) ([ee28fdd](https://github.com/fjfchfhfc/ChatHub/commit/ee28fdda4d00f1c2c6bea2de4b2e0546699ff572))
* ✨ support discord (resolve [#14](https://github.com/fjfchfhfc/ChatHub/issues/14)) ([cc17a9a](https://github.com/fjfchfhfc/ChatHub/commit/cc17a9a6bf025f52633d5d047f3a4564715d6580))
* 🎉 initial commit ([f748262](https://github.com/fjfchfhfc/ChatHub/commit/f748262ada4318e7fd5e803c93f57ea99a816392))
* 🔊 add kook reveiver debug ([2ccb6f5](https://github.com/fjfchfhfc/ChatHub/commit/2ccb6f5a3a9e8367a733b12e38f7f0db5527d4e6))
* 🔊 logging kook sender card json ([b47599e](https://github.com/fjfchfhfc/ChatHub/commit/b47599eaf0c525abf96b63d14f90948fe4a67a16))
* 🔒️ only introduce adaptors when config set to enabled ([5ad0012](https://github.com/fjfchfhfc/ChatHub/commit/5ad0012a2933927c5e5541af3d86b07c8468efd2))
* 🥅 catch exceptions in onProxyShutdown ([66b25f7](https://github.com/fjfchfhfc/ChatHub/commit/66b25f7639dad4c63d6649345815d92ddc9f06e2))
* add discord proxy support ([#36](https://github.com/fjfchfhfc/ChatHub/issues/36)) ([e6a98f1](https://github.com/fjfchfhfc/ChatHub/commit/e6a98f144d5926f03710c3c0c8c8351485de5775))
* **qq:** ✨ prioritize the use of group cards ([#32](https://github.com/fjfchfhfc/ChatHub/issues/32)) ([8b96456](https://github.com/fjfchfhfc/ChatHub/commit/8b96456a77bef737f9cee3b99f33ec1ff9559d38))


### Bug Fixes

* 🐛 automatically reconnect kook websocket when disconnected ([5a53061](https://github.com/fjfchfhfc/ChatHub/commit/5a53061b48d9a3a0d2e0c509f6393d3c3a7d1607))
* 🐛 fix KookReceiver scheduled task bug ([64bd6df](https://github.com/fjfchfhfc/ChatHub/commit/64bd6df58edd5934cef6c15b1520e741180b9e52))
* 🐛 fix message last arg does not greedy ([315c5bc](https://github.com/fjfchfhfc/ChatHub/commit/315c5bc96d207d707d9fa1cdc31ef768643e06ee))
* 🐛 fix minecraft list message plainServer ([70ad224](https://github.com/fjfchfhfc/ChatHub/commit/70ad224552537d6dfe74e368a6f99618e728ae96))
* 🐛 fix plainServerFrom in getMinecraftSwitchMessage ([ad4dd3e](https://github.com/fjfchfhfc/ChatHub/commit/ad4dd3e91679f276f48f650b45ad7abb0b0ffc4a))
* 🐛 fix private msg letter case ([c05373e](https://github.com/fjfchfhfc/ChatHub/commit/c05373e638ce33965236472c0a3238f6c46ee3f6))
* 🐛 futher fix KookReceiver restart bug ([cf35067](https://github.com/fjfchfhfc/ChatHub/commit/cf35067b741716356bc4b8233ef5be6849e2cd6e))
* 🐛 make KookReceiver restart method synchronized ([1651c94](https://github.com/fjfchfhfc/ChatHub/commit/1651c94afac8c5c695088aea56b7a70e9cd22ae4))
* 🐛 remove warning ([b927156](https://github.com/fjfchfhfc/ChatHub/commit/b9271562c84ef889bb30879b6ce79f9d6db4d40d))
* 🔇 remove kook websocket debug log ([01799b8](https://github.com/fjfchfhfc/ChatHub/commit/01799b8cf71994d6216f5cd969a3e55b8a25c154))
* 🔊 log response when get kook gateway error ([0b78358](https://github.com/fjfchfhfc/ChatHub/commit/0b78358d9898366316c44de0aa43cd5974b53497))
* 🔖 set metadata version to 1.5.0 ([ccaf82b](https://github.com/fjfchfhfc/ChatHub/commit/ccaf82b8d055a1762c94ea6e3319b9e35d1c7efe))
* 🩹 add null check ([f2411ae](https://github.com/fjfchfhfc/ChatHub/commit/f2411aea1537a1aaa94e50e3628790cd4cf01ca9))
* 🩹 thread names ([99b4cf7](https://github.com/fjfchfhfc/ChatHub/commit/99b4cf75db9561e17b3f17d2555d10b74519a43d))
* **qq:** 🐛 fix websocket connection with invalid path ([92d7208](https://github.com/fjfchfhfc/ChatHub/commit/92d720889f348335ad48eb40514a3a5089254d2c))
* **qq:** 🩹 fix QQAPI action name ([c11e134](https://github.com/fjfchfhfc/ChatHub/commit/c11e134734bab16c6d8203c2c385b177be99b9aa))


### Performance Improvements

* ⚡️ use new thread to init eventhub ([74714fc](https://github.com/fjfchfhfc/ChatHub/commit/74714fce01471f40a88be65f8838fff1302f6ea8))
* 🧵 thread management (resolve [#27](https://github.com/fjfchfhfc/ChatHub/issues/27)) ([7554ba4](https://github.com/fjfchfhfc/ChatHub/commit/7554ba46359022d9d64f329d6355e048f3b71692))
* 🧵 use thread pool to init EventHub ([aabd8b9](https://github.com/fjfchfhfc/ChatHub/commit/aabd8b96189f402447c9d2fe5e1da9baa8f881aa))

## [1.9.0](https://github.com/AnzhiZhang/ChatHub/compare/v1.8.1...v1.9.0) (2025-03-17)


### Features

* add discord proxy support ([#36](https://github.com/AnzhiZhang/ChatHub/issues/36)) ([e6a98f1](https://github.com/AnzhiZhang/ChatHub/commit/e6a98f144d5926f03710c3c0c8c8351485de5775))

## [1.8.1](https://github.com/AnzhiZhang/ChatHub/compare/v1.8.0...v1.8.1) (2024-10-02)


### Performance Improvements

* 🧵 use thread pool to init EventHub ([aabd8b9](https://github.com/AnzhiZhang/ChatHub/commit/aabd8b96189f402447c9d2fe5e1da9baa8f881aa))

## [1.8.0](https://github.com/AnzhiZhang/ChatHub/compare/v1.7.0...v1.8.0) (2024-10-02)


### Features

* **qq:** ✨ prioritize the use of group cards ([#32](https://github.com/AnzhiZhang/ChatHub/issues/32)) ([8b96456](https://github.com/AnzhiZhang/ChatHub/commit/8b96456a77bef737f9cee3b99f33ec1ff9559d38))


### Bug Fixes

* 🩹 add null check ([f2411ae](https://github.com/AnzhiZhang/ChatHub/commit/f2411aea1537a1aaa94e50e3628790cd4cf01ca9))
* 🩹 thread names ([99b4cf7](https://github.com/AnzhiZhang/ChatHub/commit/99b4cf75db9561e17b3f17d2555d10b74519a43d))
* **qq:** 🐛 fix websocket connection with invalid path ([92d7208](https://github.com/AnzhiZhang/ChatHub/commit/92d720889f348335ad48eb40514a3a5089254d2c))
* **qq:** 🩹 fix QQAPI action name ([c11e134](https://github.com/AnzhiZhang/ChatHub/commit/c11e134734bab16c6d8203c2c385b177be99b9aa))


### Performance Improvements

* 🧵 thread management (resolve [#27](https://github.com/AnzhiZhang/ChatHub/issues/27)) ([7554ba4](https://github.com/AnzhiZhang/ChatHub/commit/7554ba46359022d9d64f329d6355e048f3b71692))

## [1.7.0](https://github.com/AnzhiZhang/ChatHub/compare/v1.6.0...v1.7.0) (2024-07-27)


### Features

* ✨ QQ `list` command  support ([#29](https://github.com/AnzhiZhang/ChatHub/issues/29)) ([71397aa](https://github.com/AnzhiZhang/ChatHub/commit/71397aa0083bd9df92820ac63442e1092e102bef))

## [1.6.0](https://github.com/AnzhiZhang/ChatHub/compare/v1.5.1...v1.6.0) (2024-07-08)


### Features

* ✨ add qq platform ([#26](https://github.com/AnzhiZhang/ChatHub/issues/26)) ([3a664ea](https://github.com/AnzhiZhang/ChatHub/commit/3a664ea8e72af2fe4a1dabe9e4650ab743c1f1a8))
* 🔒️ only introduce adaptors when config set to enabled ([5ad0012](https://github.com/AnzhiZhang/ChatHub/commit/5ad0012a2933927c5e5541af3d86b07c8468efd2))

## [1.5.1](https://github.com/AnzhiZhang/ChatHub/compare/v1.5.0...v1.5.1) (2024-04-26)


### Bug Fixes

* 🐛 fix private msg letter case ([c05373e](https://github.com/AnzhiZhang/ChatHub/commit/c05373e638ce33965236472c0a3238f6c46ee3f6))
* 🔖 set metadata version to 1.5.0 ([ccaf82b](https://github.com/AnzhiZhang/ChatHub/commit/ccaf82b8d055a1762c94ea6e3319b9e35d1c7efe))
