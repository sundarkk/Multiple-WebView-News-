package com.sundar.connect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LoadActivity extends AppCompatActivity {

    WebView webView;

   // webView.getSettings().setJavaScriptEnabled(true);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);

        webView = (WebView) findViewById(R.id.webview);

        String url = getIntent().getStringExtra("URL");
        webView.loadUrl(url);




        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadsImagesAutomatically(true);
/*

        Intent webviewIntent =getIntent();
        String website =webviewIntent.getStringExtra("link");
        webView.loadUrl(website);

        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
*/


        /*String url = getIntent().getStringExtra("link");
        webView.loadUrl(url);
       // webView.setWebViewClient(new webView());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadsImagesAutomatically(true);
*/

    }
}
