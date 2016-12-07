package classproject.runescape;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


/**
 * Created by Gabe on 11/23/16.
 */

public class sendUser extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send_user);
    }

    public void openPlayerSkill(View v){
        EditText textView2 = (EditText) findViewById(R.id.textView2);

        Intent i = new Intent(getApplicationContext(),PlayerSkills.class);
        i.putExtra("username", textView2.getText().toString());
        startActivity(i);

    }
}



