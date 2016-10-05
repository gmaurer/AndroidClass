package classproject.runescape;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

/*public class MainActivity extends AppCompatActivity   {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

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

}*/
public class MainActivity extends FragmentActivity implements
        ActionBar.TabListener {

    private ViewPager viewPager;
    private TabsPagerAdapter mAdapter;
    private ActionBar actionBar;
    // Tab titles
    private String[] tabs = {"Top Rated", "Games", "Movies"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initilization
        viewPager = (ViewPager) findViewById(R.id.pager);
        actionBar = getActionBar();
        mAdapter = new TabsPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(mAdapter);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // Adding Tabs
        for (String tab_name : tabs) {
            actionBar.addTab(actionBar.newTab().setText(tab_name)
                    .setTabListener(this));
        }
    }
}



