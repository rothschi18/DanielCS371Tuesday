package com.example.administrator.danielrcs371hw2;

import android.media.Image;
import android.widget.ImageView;

import java.util.HashMap;

/**
 * Created by rothschi18 on 9/19/2015.
 */
public class TeamRoster {
    protected HashMap<String, PlayerStats> teamPlayers;
    protected String teamName;
    protected ImageView teamImage;

    public TeamRoster(String teamName, ImageView teamImage)
    {
        this.teamName=teamName;
        this.teamImage = teamImage;
        teamPlayers = new HashMap<String, PlayerStats>();
    }

    public void addPlayer(PlayerStats player)
    {
        String key = player.firstName +"**" + player.lastName;

        if(teamPlayers.containsKey(key))
        {
            return;
        }

        teamPlayers.put(key, player);

    }

    public String getTeamName()
    {
        return teamName;
    }
}
