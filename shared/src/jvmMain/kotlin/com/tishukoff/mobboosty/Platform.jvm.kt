package com.tishukoff.mobboosty

class JvmPlatform: Platform {
    override val name: String = "Desktop Screen"
}

actual fun getPlatform(): Platform = JvmPlatform()