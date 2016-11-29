package classproject.runescape;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class PlayerSkills extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        //String user = "gogofatplaya";                   //TEMP HARDCORED, LOOK AT USER1 TO SEE ACTUAL USER
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_skills);
        Intent in = getIntent();
        String user = in.getExtras().getString("username");//THIS WILL GIVE YOU THE USERNAME FROM
                                                            //THE PREVIOUS PAGE CHANGE THE BELOW EXECUTE TO THIS VARIABLE


        new ApiRetrievalClass(new ApiRetrievalClass.RetrivalCallBack() {
            @Override
            public void onSuccess(SkillsHolder skillsHolder) {
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
                SkillsHolder skillz = skillsHolder;
                att.setText(skillz.Skills[1][1]);
                str.setText(skillz.Skills[3][1]);
                def.setText(skillz.Skills[2][1]);
                ran.setText(skillz.Skills[5][1]);
                pra.setText(skillz.Skills[6][1]);
                mag.setText(skillz.Skills[7][1]);
                con.setText(skillz.Skills[4][1]);
                cra.setText(skillz.Skills[13][1]);
                min.setText(skillz.Skills[15][1]);
                smi.setText(skillz.Skills[14][1]);
                fis.setText(skillz.Skills[11][1]);
                coo.setText(skillz.Skills[8][1]);
                fir.setText(skillz.Skills[12][1]);
                woo.setText(skillz.Skills[9][1]);
                run.setText(skillz.Skills[21][1]);
                dun.setText(skillz.Skills[25][1]);
                agi.setText(skillz.Skills[17][1]);
                her.setText(skillz.Skills[16][1]);
                thi.setText(skillz.Skills[18][1]);
                fle.setText(skillz.Skills[10][1]);
                sla.setText(skillz.Skills[19][1]);
                far.setText(skillz.Skills[20][1]);
                cons.setText(skillz.Skills[23][1]);
                hun.setText(skillz.Skills[22][1]);
                sum.setText(skillz.Skills[24][1]);
                div.setText(skillz.Skills[26][1]);
                inv.setText(skillz.Skills[27][1]);
                tot.setText(skillz.Skills[0][1]);
            }}).execute(user);                      //CHANGE THIS TO USER1 TO RECIEVE THE USER





    }

    public void goBack(View v){
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);

    }
}
