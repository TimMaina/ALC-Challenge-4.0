package com.example.alc4phase1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;


public class AboutALC extends AppCompatActivity {

    private WebView webView;



    @SuppressLint(value = "RestrictedApi")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

    webView = (WebView) findViewById(R.id.webView);
    webView.loadUrl("https://www.andela.com/alc/");

    }
}









