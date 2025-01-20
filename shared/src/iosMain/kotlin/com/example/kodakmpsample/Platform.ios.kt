package com.example.kodakmpsample

import cocoapods.KodaBotsSDK.KodaBotsSDK
import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
    override suspend fun unreadCount(): Int {
        KodaBotsSDK.shared //TODO FIXME
    }
}

actual fun getPlatform(): Platform = IOSPlatform()