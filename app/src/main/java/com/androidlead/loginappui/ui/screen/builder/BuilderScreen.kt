package com.androidlead.loginappui.ui.screen.builder

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun BuilderScreen(onBuilderClicked: () -> Unit) {

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
            webView.loadUrl("https://www.bpmn.io")
        }
    )
}

//https://www.bpmn-sketch-miner.ai/index.html
//https://products.aspose.app/diagram/bpmn