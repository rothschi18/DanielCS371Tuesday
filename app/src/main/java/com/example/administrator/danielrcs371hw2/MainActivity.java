package com.example.administrator.danielrcs371hw2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static com.example.administrator.danielrcs371hw2.R.mipmap.player1;


public class MainActivity extends ActionBarActivity {


    public TeamRosterDatabase TeamData;
    //I want to preserve the order that teams are shown on the main page
    public LinkedHashMap<TeamRoster, Button> mainTeamButtons;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TeamData = new TeamRosterDatabase(this);
        TeamData.setMainTeamButtons();
        TeamData.declareTeams();
        TeamData.viewTeams();

    }

    public void sendButtonID(View view){ TeamRoster team = TeamData.getTeamRoster(view); }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
