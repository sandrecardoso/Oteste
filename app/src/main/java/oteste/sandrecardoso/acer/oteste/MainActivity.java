package oteste.sandrecardoso.acer.oteste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView jogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jogo=(WebView)findViewById(R.id.areadojogo);

        jogo.getSettings().setJavaScriptEnabled(true);
        jogo.getSettings().setAllowFileAccessFromFileURLs(true);
        jogo.loadUrl("file:///android_asset/index.html");
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
