package com.example.alc4phase1;

import android.annotation.SuppressLint;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {

    WebView webView;

    @SuppressLint(value = "RestrictedApi")
    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

    webView = (WebView) findViewById(R.id.webView);
    webView.setWebViewClient(new MyBrowser());
    webView.getSettings().setJavaScriptEnabled(true);
    webView.loadUrl("https://andela.com/alc/");
    }
    private class MyBrowser extends WebViewClient{


     @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            handler.proceed();
        }
    }
    }












