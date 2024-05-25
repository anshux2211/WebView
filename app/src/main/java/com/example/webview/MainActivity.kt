package com.example.webview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit: EditText =findViewById(R.id.edt)
        val but: Button =findViewById(R.id.btn)

        but.setOnClickListener {
            val link:String?=edit.text.toString()
            val intnt=Intent(this,WebPage::class.java)
            intnt.putExtra("101",link)
            startActivity(intnt)
        }
    }
}