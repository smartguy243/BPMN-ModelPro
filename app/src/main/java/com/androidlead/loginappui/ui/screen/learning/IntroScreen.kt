package com.androidlead.loginappui.ui.screen.learning

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.androidlead.loginappui.ui.components.ActionButton
import com.androidlead.loginappui.ui.theme.DarkTextColor
import com.androidlead.loginappui.ui.theme.Lavender
import com.androidlead.loginappui.ui.theme.LightGray
import com.androidlead.loginappui.ui.theme.MintCream
import com.androidlead.loginappui.ui.theme.SoftBlue

@Composable
fun IntroScreen(onOpenMenuClicked: () -> Unit,
                     onLearnClicked: () -> Unit) {
    Scaffold(topBar = { TopAppBarComposeIntro() },
        bottomBar = {
            BottomAppBarComposeIntro(onOpenMenuClicked, onLearnClicked)
        }
    ) { innerPadding ->

        Box(modifier = Modifier.padding(innerPadding)) {
            AndroidView(
                factory = { context ->
                    WebView(context).apply {
                        settings.javaScriptEnabled = true
                        webViewClient = WebViewClient()

                        settings.loadWithOverviewMode = true
                        settings.useWideViewPort = true
                        settings.setSupportZoom(true)
                    }
                },
                update = { webView ->
                    webView.loadUrl("https://elma365.com/ru/articles/urok-1-vvod-v-notaciyu-bpmn/")
                }
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarComposeIntro() {
    TopAppBar(
        colors = TopAppBarColors(
            containerColor = Lavender,
            scrolledContainerColor = LightGray,
            navigationIconContentColor = LightGray,
            titleContentColor = DarkTextColor,
            actionIconContentColor = LightGray,
        ),
        title = {
            Text(
                text = "Ввод в нотацию BPMN",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 15.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }
    )
}


@Composable
fun BottomAppBarComposeIntro(onOpenMenuClicked: () -> Unit, onLearnClicked: () -> Unit) {
    BottomAppBar(
        containerColor = SoftBlue,
        contentColor = Color.Black.copy(alpha = 0.1f)
    ) {
        Spacer(modifier = Modifier.weight(weight = 1f))
        ActionButton(
            text = "Изучать BPMN",
            isNavigationArrowVisible = true,
            onClicked = onLearnClicked,
            colors = ButtonDefaults.buttonColors(
                containerColor = MintCream,
                contentColor = DarkTextColor
            ),
            shadowColor = DarkTextColor,
            modifier = Modifier.padding(end = 15.dp)
                .height(35.dp)
                .width(167.dp)
                .shadow(
                    elevation = 24.dp,
                    shape = RoundedCornerShape(percent = 50)
                )
        )
        Spacer(modifier = Modifier.weight(weight = 1f))
        ActionButton(
            text = "Меню",
            isNavigationArrowVisible = true,
            onClicked = onOpenMenuClicked,
            colors = ButtonDefaults.buttonColors(
                containerColor = MintCream,
                contentColor = DarkTextColor
            ),
            shadowColor = DarkTextColor,
            modifier = Modifier.padding(end = 11.dp)
                .height(35.dp)
                .width(140.dp)
                .shadow(
                    elevation = 24.dp,
                    shape = RoundedCornerShape(percent = 50)
                )
        )
    }
}