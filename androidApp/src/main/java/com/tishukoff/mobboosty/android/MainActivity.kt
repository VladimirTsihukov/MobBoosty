package com.tishukoff.mobboosty.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.tishukoff.mobboosty.App
import com.tishukoff.mobboosty.screens.MainScreen
import com.tishukoff.mobboosty.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { App() }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    AppTheme {
        MainScreen()
    }
}
