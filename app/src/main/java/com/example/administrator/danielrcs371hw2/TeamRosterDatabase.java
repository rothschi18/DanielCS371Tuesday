package com.example.administrator.danielrcs371hw2;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import java.util.HashMap;
import java.util.LinkedHashMap;


/**
 * Created by rothschi18 on 9/19/2015.
 */
public class TeamRosterDatabase {
    private HashMap<String, TeamRoster> rosterDatabase;
    //I have set a limit on the total teams that can be made
    private int totalTeams;
    public Button[] teamList;
    private int maxTeams = 12;
    private Activity mainActivity;
    //I want to preserve the order that teams are shown on the main page

    public LinkedHashMap<TeamRoster, Button> mainTeamButtons;

    //pass in a view so methods in this function can manipulate it
    public TeamRosterDatabase(Activity Main)
    {
        mainActivity = Main;
        //totalTeams = countTeams();
        rosterDatabase = new HashMap<String, TeamRoster>();
        mainTeamButtons = new LinkedHashMap<TeamRoster, Button>();
        //Need to build up an array of all the buttons that will be the list of teams
        teamList = new Button[maxTeams];
        teamList[0] = (Button)mainActivity.findViewById(R.id.team1);
        teamList[1] = (Button)mainActivity.findViewById(R.id.team2);
        teamList[2] = (Button)mainActivity.findViewById(R.id.team3);
        teamList[3] = (Button)mainActivity.findViewById(R.id.team4);
        teamList[4] = (Button)mainActivity.findViewById(R.id.team5);
        teamList[5] = (Button)mainActivity.findViewById(R.id.team6);
        teamList[6] = (Button)mainActivity.findViewById(R.id.team7);
        teamList[7] = (Button)mainActivity.findViewById(R.id.team8);
        teamList[8] = (Button)mainActivity.findViewById(R.id.team9);
        teamList[9] = (Button)mainActivity.findViewById(R.id.team10);
        teamList[10] = (Button)mainActivity.findViewById(R.id.team11);




    }

    public void addTeam(TeamRoster newTeam)
    {
        String key = newTeam.teamName;
        if(totalTeams>11)
            return;
        if(rosterDatabase.containsKey(key))
        {
            return;
        }

        rosterDatabase.put(key, newTeam);
    }

    public void deleteTeam(String key)
    {

        if(rosterDatabase.containsKey(key))
        {
            rosterDatabase.remove(key);
        }

    }


    public int countTeams()
    {
        return rosterDatabase.size();
    }
    //Displays the teams in the Main Activity
    public void viewTeams()
    {
        int counter = 0;

        for(String key: rosterDatabase.keySet())
        {
            teamList[counter].setText(rosterDatabase.get(key).teamName);
            counter++;
        }

    }
    //Initializes the Linked Hash Map of buttons and teams on main page
    public void setMainTeamButtons()
    {
        int counter = 0;
        for(String key: rosterDatabase.keySet())
        {

            mainTeamButtons.put(rosterDatabase.get(key), teamList[counter]);
            counter++;

        }

    }

    public void declareTeams()
    {


        ImageView view1 = new ImageView(mainActivity);
        view1.setImageResource(R.mipmap.player1);
        PlayerStats player1 = new PlayerStats(0, 0, 0, "One", "One", view1, "TeamOne");

        ImageView view2 = new ImageView(mainActivity);
        view2.setImageResource(R.mipmap.player2);
        PlayerStats player2 = new PlayerStats(0, 0, 0, "two", "One", view2, "TeamOne");

        ImageView view3 = new ImageView(mainActivity);
        view3.setImageResource(R.mipmap.player3);
        PlayerStats player3 = new PlayerStats(0, 0, 0, "three", "One", view3, "TeamOne");

        ImageView view4 = new ImageView(mainActivity);
        view4.setImageResource(R.mipmap.player4);
        PlayerStats player4 = new PlayerStats(0, 0, 0, "four", "One", view4, "Team4");

        ImageView view5 = new ImageView(mainActivity);
        view5.setImageResource(R.mipmap.player5);
        PlayerStats player5 = new PlayerStats(0, 0, 0, "five", "One", view5, "Team5");

        ImageView view6 = new ImageView(mainActivity);
        view6.setImageResource(R.mipmap.player6);
        PlayerStats player6 = new PlayerStats(0, 0, 0, "six", "One", view6, "Team6");

        ImageView view7 = new ImageView(mainActivity);
        view7.setImageResource(R.mipmap.player7);
        PlayerStats player7 = new PlayerStats(0, 0, 0, "seven", "One", view7, "Team7");

        ImageView view8 = new ImageView(mainActivity);
        view8.setImageResource(R.mipmap.player8);
        PlayerStats player8 = new PlayerStats(0, 0, 0, "eight", "One", view8, "Team8");

        ImageView view9 = new ImageView(mainActivity);
        view9.setImageResource(R.mipmap.player9);
        PlayerStats player9 = new PlayerStats(0, 0, 0, "nine", "One", view9, "Team9");



        TeamRoster team2 = new TeamRoster("TeamTwo", view2);
        team2.addPlayer(player4);
        team2.addPlayer(player5);
        team2.addPlayer(player6);

        TeamRoster team1 = new TeamRoster("TeamOne", view1);
        team1.addPlayer(player1);
        team1.addPlayer(player2);
        team1.addPlayer(player3);

        ImageView blankView = new ImageView(mainActivity);
        blankView.setImageResource(R.mipmap.blankteam);
        TeamRoster blankTeam = new TeamRoster("Blank", blankView);

        rosterDatabase.put(team1.getTeamName(), team1);
        rosterDatabase.put(team2.getTeamName(), team2);
        rosterDatabase.put(blankTeam.getTeamName(), blankTeam);




    }

    public TeamRoster getTeamRoster(View view)
    {

        this.setMainTeamButtons();

        for(TeamRoster teams : mainTeamButtons.keySet())
        {
            if(mainTeamButtons.get(teams).getId() == view.getId())
            {
                //for debugging purposes
                Log.i("Team Name", teams.getTeamName());
            }

        }

        return null;
    }
}
