package kr.hs.emirim.s2019w09.myandlab.ch06advwidget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kr.hs.emirim.s2019w09.myandlab.R

class WebViewActivity : AppCompatActivity() {

    lateinit var etUrl : EditText
    lateinit var btnGo : Button
    lateinit var btnBack : Button
    lateinit var web : WebView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        etUrl = findViewById(R.id.etUrl)
        btnGo = findViewById(R.id.btnGo)
        btnBack = findViewById(R.id.btnBack)
        web = findViewById(R.id.webView1)

        web.webViewClient = CookWebViewClient()

        var webSet : WebSettings = web.settings
        webSet.builtInZoomControls = true

        btnGo.setOnClickListener {
            web.loadUrl(etUrl.text.toString())
        }

        btnBack.setOnClickListener {
            web.goBack()
        }
    }

    class CookWebViewClient : WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
            return super.shouldOverrideUrlLoading(view, url)
        }
    }
}