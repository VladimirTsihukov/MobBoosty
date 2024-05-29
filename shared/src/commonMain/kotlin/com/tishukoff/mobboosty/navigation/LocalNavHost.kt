package com.tishukoff.mobboosty.navigation

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.navigation.NavHostController

val LocalNavHost = staticCompositionLocalOf<NavHostController> { error("No default nav host") }