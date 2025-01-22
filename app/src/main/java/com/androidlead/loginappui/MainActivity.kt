package com.androidlead.loginappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.androidlead.loginappui.navigation.ScreenContainer
import com.androidlead.loginappui.ui.theme.LoginAppUiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginAppUiTheme {
                ScreenContainer()
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewScreen() {
    LoginAppUiTheme {
        ScreenContainer()
    }
}
