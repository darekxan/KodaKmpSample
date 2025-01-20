package com.example.kodakmpsample

import ai.koda.mobile.sdk.core.CallResponse
import ai.koda.mobile.sdk.core.KodaBotsSDK
import kotlinx.coroutines.suspendCancellableCoroutine
import java.lang.IllegalStateException

class AndroidPlatform : Platform {
    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
    override suspend fun unreadCount(): Int = suspendCancellableCoroutine { continuation ->
        KodaBotsSDK.getUnreadCount {
            when(it) {
                is CallResponse.Error -> continuation.cancel(it.exception)
                is CallResponse.Success -> it.value ?: 0
                is CallResponse.Timeout -> continuation.cancel(IllegalStateException())
            }
        }
    }
}

actual fun getPlatform(): Platform = AndroidPlatform()