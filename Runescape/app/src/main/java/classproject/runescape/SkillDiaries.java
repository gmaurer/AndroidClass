package classproject.runescape;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;

public class SkillDiaries extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.skill_diaries);

        WebView webView = (WebView)findViewById(R.id.webView);
        //you can load an html code
        //webView.loadData("yourCode Html to load on the webView " , "text/html", "utf-8");
        // you can load an URL
        webView.loadUrl("http://runescape.wikia.com/wiki/Achievements");
    }
    public void goBack(View v){
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);

    }
}
