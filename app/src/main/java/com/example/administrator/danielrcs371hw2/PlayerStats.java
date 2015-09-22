package com.example.administrator.danielrcs371hw2;

import android.widget.ImageView;

/**
 * Created by rothschi18 on 9/19/2015.
 * Class: PlayerStats
 * Purpose: To keep track of the statistics of an individual player object
 */
public class PlayerStats {
    protected int goalsScored;
    protected int foulsCommitted;
    protected int gamesWon;
    protected String firstName;
    protected String lastName;
    protected ImageView playerImage;
    protected String team;

    /**
     * Constructor for PlayerStats,
     * @param goalsScored
     * @param foulsCommitted
     * @param gamesWon
     * @param firstName
     * @param lastName
     * @param playerImage
     */
    public PlayerStats(int goalsScored, int foulsCommitted,
                            int gamesWon, String firstName, String lastName, ImageView playerImage, String team)
    {
        this.goalsScored=goalsScored;
        this.foulsCommitted=foulsCommitted;
        this.gamesWon=gamesWon;
        this.firstName=firstName;
        this.lastName=lastName;
        this.playerImage=playerImage;
        this.team=team;

    }
}
