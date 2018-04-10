package com.example.android.buttonwithactiviy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        WebView webView= (WebView)findViewById(R.id.webWiew);
        webView.loadUrl("http://www.google.com");

    }
}
