package classproject.runescape;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TabHost;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public class MainActivity extends AppCompatActivity   {

    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        TabHost host = (TabHost)findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("New School");
        spec.setContent(R.id.tabNew);
        spec.setIndicator("New School");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Old School");
        spec.setContent(R.id.tabOld);
        spec.setIndicator("Old School");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("Iron Man");
        spec.setContent(R.id.tabIron);
        spec.setIndicator("Iron Man");
        host.addTab(spec);


        //tabHost.setCurrentTab(R.id.tabNew);
    }

    public void openClans(View v){
        Intent i = new Intent(getApplicationContext(),Clans.class);
        startActivity(i);

    }
    public void openFavorites(View v){
        Intent i = new Intent(getApplicationContext(),Favorites.class);
        startActivity(i);

    }
    public void openItemSearch(View v){
        Intent i = new Intent(getApplicationContext(),ItemSearch.class);
        startActivity(i);

    }
    public void openLookUpPlayer(View v){
        Intent i = new Intent(getApplicationContext(),LookUpPlayer.class);
        startActivity(i);

    }
    public void openOnlineCurrently(View v){
        Intent i = new Intent(getApplicationContext(),OnlineCurrently.class);
        startActivity(i);

    }
    public void openPlayerSkills(View v){
        Intent i = new Intent(getApplicationContext(),PlayerSkills.class);
        startActivity(i);

    }
    public void openQuests(View v){
        Intent i = new Intent(getApplicationContext(),Quests.class);
        startActivity(i);

    }
    public void openRecentPlayers(View v){
        Intent i = new Intent(getApplicationContext(),RecentPlayer.class);
        startActivity(i);

    }
    public void openSkillDiaries(View v){
        Intent i = new Intent(getApplicationContext(),SkillDiaries.class);
        startActivity(i);

    }
    public void openTopPlayers(View v){
        Intent i = new Intent(getApplicationContext(),TopPlayers.class);
        startActivity(i);

    }
    public void openTutorials(View v){
        Intent i = new Intent(getApplicationContext(),Tutorials.class);
        startActivity(i);

    }

}



