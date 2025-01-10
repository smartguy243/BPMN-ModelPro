package com.androidlead.loginappui.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

private val AppColorsNight = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)
private val AppColorsDay = lightColorScheme(
    primary = Color(0xFF6200EE),
    secondary = Color(0xFF03DAC5),
    tertiary = Color(0xFFFFC107)
)

@Composable
fun LoginAppUiTheme(content: @Composable () -> Unit) {
    var isNightMode by remember { mutableStateOf(false) }
    MaterialTheme(
        colorScheme = if (isNightMode) AppColorsNight else AppColorsDay,
        typography = Typography,
        content = content
    )
}