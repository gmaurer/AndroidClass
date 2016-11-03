package classproject.runescape;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class PlayerSkills extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        String user = "triggerkin";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_skills);

        TextView att = (TextView)findViewById(R.id.attackText);
        TextView str = (TextView)findViewById(R.id.strengthText);
        TextView def = (TextView)findViewById(R.id.defenseText);
        TextView ran = (TextView)findViewById(R.id.rangeText);
        TextView pra = (TextView)findViewById(R.id.prayerText);
        TextView mag = (TextView)findViewById(R.id.magicText);
        TextView con = (TextView)findViewById(R.id.healthText);
        TextView cra = (TextView)findViewById(R.id.craftText);
        TextView min = (TextView)findViewById(R.id.miningText);
        TextView smi = (TextView)findViewById(R.id.smithingText);
        TextView fis = (TextView)findViewById(R.id.fishingText);
        TextView coo = (TextView)findViewById(R.id.cookingText);
        TextView fir = (TextView)findViewById(R.id.fireText);
        TextView woo = (TextView)findViewById(R.id.woodText);
        TextView run = (TextView)findViewById(R.id.runeText);
        TextView dun = (TextView)findViewById(R.id.dungeonText);
        TextView agi = (TextView)findViewById(R.id.agilityText);
        TextView her = (TextView)findViewById(R.id.herbText);
        TextView thi = (TextView)findViewById(R.id.thievingText);
        TextView fle = (TextView)findViewById(R.id.fletchText);
        TextView sla = (TextView)findViewById(R.id.slayerText);
        TextView far = (TextView)findViewById(R.id.farmText);
        TextView cons = (TextView)findViewById(R.id.buildText);
        TextView hun = (TextView)findViewById(R.id.huntText);
        TextView sum = (TextView)findViewById(R.id.summonText);
        TextView div = (TextView)findViewById(R.id.divinationText);
        TextView inv = (TextView)findViewById(R.id.inventionText);

        TextView tot = (TextView)findViewById(R.id.totalText);


        att.setText();
        str.setText();
        def.setText();
        ran.setText();
        pra.setText();
        mag.setText();
        con.setText();
        cra.setText();
        min.setText();
        smi.setText();
        fis.setText();
        coo.setText();
        fir.setText();
        woo.setText();
        run.setText();
        dun.setText();
        agi.setText();
        her.setText();
        thi.setText();
        fle.setText();
        sla.setText();
        far.setText();
        cons.setText();
        hun.setText();
        sum.setText();
        div.setText();
        inv.setText();
        tot.setText();



    }

    public void goBack(View v){
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);

    }
}
