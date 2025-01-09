package com.androidlead.loginappui.ui.screen.builder

import android.content.Intent
import android.net.Uri
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext

@Composable
fun BuilderScreen(onBuilderClicked: () -> Unit) {
    val context = LocalContext.current

    LaunchedEffect(Unit) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://demo.bpmn.io/new"))
        context.startActivity(intent)
    }
}

//@Composable
//fun BuilderScreen(onBuilderClicked: () -> Unit) {
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
//            webView.loadUrl("https://www.bpmn.io")
//        }
//    )
//}


//https://www.bpmn-sketch-miner.ai/index.html
//https://products.aspose.app/diagram/bpmn