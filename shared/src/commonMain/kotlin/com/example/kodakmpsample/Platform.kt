package com.example.kodakmpsample

interface Platform {
    val name: String
    suspend fun unreadCount(): Int
}

expect fun getPlatform(): Platform