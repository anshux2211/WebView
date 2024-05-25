package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText

class WebPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_page)
        val webLink:WebView=findViewById(R.id.web)
        val link:String?=intent.getStringExtra("101")
        webLink.settings.javaScriptEnabled=true
        webLink.webViewClient= WebViewClient()
        webLink.loadUrl("$link")

    }
}