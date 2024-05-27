package com.tishukoff.mobboosty

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform