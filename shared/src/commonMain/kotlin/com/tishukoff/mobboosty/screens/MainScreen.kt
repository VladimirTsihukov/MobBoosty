package com.tishukoff.mobboosty.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.tishukoff.mobboosty.Greeting
import com.tishukoff.mobboosty.theme.AppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        ) {

        Text(
            text = Greeting().greet(),
            color = MaterialTheme.colorScheme.primary,
            fontSize = 34.sp,
        )
    }
}