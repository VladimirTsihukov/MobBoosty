package com.tishukoff.mobboosty

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.tishukoff.mobboosty.navigation.AppScreens
import com.tishukoff.mobboosty.navigation.LocalNavHost
import com.tishukoff.mobboosty.screens.MainScreen
import com.tishukoff.mobboosty.theme.AppTheme

@Composable
fun App() = AppTheme {
    MobBoosty()
}

@Composable
fun MobBoosty(
    navController: NavHostController = rememberNavController()
) {

    CompositionLocalProvider(
        LocalNavHost provides navController
    ) {

        NavHost(
            navController = navController,
            startDestination = AppScreens.MAIN.screen
        ) {
            composable(route = AppScreens.MAIN.screen) {
                MainScreen()
            }
        }
    }
}