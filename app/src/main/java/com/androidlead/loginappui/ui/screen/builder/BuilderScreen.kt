package com.androidlead.loginappui.ui.screen.builder

import android.content.Intent
import android.net.Uri
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun BuilderScreen() {
    val context = LocalContext.current

    LaunchedEffect(Unit) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://demo.bpmn.io/new"))
        context.startActivity(intent)
    }
}

//@Composable
//fun BuilderScreen() {
//
//    AndroidView(
//        factory = { context ->
//            WebView(context).apply {
//                settings.javaScriptEnabled = true
//                webViewClient = WebViewClient()
//
//                settings.loadWithOverviewMode = true
//                settings.useWideViewPort = true
//                settings.setSupportZoom(true)
//            }
//        },
//        update = { webView ->
//            webView.loadUrl("https://cdn.statically.io/gh/bpmn-io/bpmn-js-examples/main/starter/modeler.html")
//        }
//    )
//}