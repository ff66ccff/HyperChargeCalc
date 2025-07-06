package com.hyperchargecalc

import android.os.Bundle
import android.webkit.WebView
import androidx.activity.OnBackPressedCallback // 导入新的返回键处理库
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        webView = WebView(this).apply {
            setContentView(this)
            settings.apply {
                javaScriptEnabled = true
                allowFileAccess = true
                domStorageEnabled = true
            }
            loadUrl("file:///android_asset/index.html")
        }

        // --- 这是新的、现代的处理返回键的方式 ---
        // 它会替换掉旧的 onBackPressed() 方法
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                // 当用户按下返回键时，这段代码会被执行
                if (webView.canGoBack()) {
                    // 如果WebView可以后退（比如用户在网页里点击了链接）
                    // 那么就让WebView后退
                    webView.goBack()
                } else {
                    // 如果WebView不能后退了（已经在了首页）
                    // 那我们就让应用执行默认的返回操作（也就是退出应用）
                    // 通过调用 finish() 来关闭当前的Activity
                    finish()
                }
            }
        })
    }

    // 我们将彻底删除旧的 onBackPressed() 方法，因为它已经被上面的新方法取代了
    // override fun onBackPressed() { ... } // <--- 这一整个方法都不要了
}