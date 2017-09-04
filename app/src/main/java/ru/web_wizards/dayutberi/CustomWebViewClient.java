package ru.web_wizards.dayutberi;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by ioc0 on 19.06.17.
 */

class CustomWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url)
    {
        view.loadUrl(url);
        return true;
    }
}
