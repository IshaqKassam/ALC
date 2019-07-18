package com.example.alc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Main2Activity extends AppCompatActivity {

    //String url = "https://www.andela.com/alc/";
    //String url = "https://www.canva.com/design/DADfi55bXHI/A7VnxQ89MXNT6Ni-Fedqjg/edit";

    String url = "https://www.pluralsight.com/partners/google/africa/mobile-web?aid=7010c0000022HLAAA2&oid=&promo=&utm_campaign=&utm_content=&utm_medium=partner_referral_program&utm_source=partner_campaign&utm_term=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        WebView browser = findViewById(R.id.webview);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.getSettings().setLoadWithOverviewMode(true);
        browser.getSettings().setUseWideViewPort(true);
        browser.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);

                return true;
            }

            @Override
            public void onPageFinished(WebView view, final String url) {
            }
        });

        browser.loadUrl(url);
    }}