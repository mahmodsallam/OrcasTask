package com.mahmoudsallam.myapplication.teams.data.local;

import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import io.reactivex.annotations.NonNull;

@Entity(tableName = "Team")
public class TeamEntity {
    @PrimaryKey
    private int  id;
    private String websiteURL;
    private String teamColor;
    private String teamVenue;
    private String teamPlayer;

    public TeamEntity(int  id, String websiteURL, String teamColor, String teamVenue, String teamPlayer) {
        this.id = id;
        this.websiteURL = websiteURL;
        this.teamColor = teamColor;
        this.teamVenue = teamVenue;
        this.teamPlayer = teamPlayer;
    }

    public int  getId() {
        return id;
    }

    public void setId(int  id) {
        this.id = id;
    }

    public String getWebsiteURL() {
        return websiteURL;
    }

    public void setWebsiteURL(String websiteURL) {
        this.websiteURL = websiteURL;
    }

    public String getTeamColor() {
        return teamColor;
    }

    public void setTeamColor(String teamColor) {
        this.teamColor = teamColor;
    }

    public String getTeamVenue() {
        return teamVenue;
    }

    public void setTeamVenue(String teamVenue) {
        this.teamVenue = teamVenue;
    }

    public String getTeamPlayer() {
        return teamPlayer;
    }

    public void setTeamPlayer(String teamPlayer) {
        this.teamPlayer = teamPlayer;
    }
}
