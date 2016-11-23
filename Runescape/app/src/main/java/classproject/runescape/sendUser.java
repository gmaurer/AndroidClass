package classproject.runescape;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by Gabe on 11/23/16.
 */

public class sendUser extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.send_user);
    }

    /*public void openPlayerSkill(View v){
        TextView textView2 = (TextView) findViewById(R.id.textView2);

        Intent i = new Intent(getApplicationContext(),PlayerSkills.class);
        i.putExtra("username", textView2.getText().toString());
        startActivity(i);

    }*/
}



