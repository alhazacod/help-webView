package co.helpbullying.helpbullying;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity  {
    private WebView Wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        WebView Wv = findViewById(R.id.webview);
        Wv.getSettings().setJavaScriptEnabled(true);
        Wv.setWebViewClient(new WebViewClient());
        Wv.loadUrl("http://helpbullying.co/");
    }

}
