package classproject.runescape;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LookUpPlayer extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.look_up_player);
    }
    public void goBack(View v){
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);

    }
}
