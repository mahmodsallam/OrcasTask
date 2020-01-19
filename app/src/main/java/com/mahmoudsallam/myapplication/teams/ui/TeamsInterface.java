package com.mahmoudsallam.myapplication.teams.ui;

import com.mahmoudsallam.myapplication.teams.data.local.TeamEntity;

public interface TeamsInterface {
    void openTeamWebsite(String websiteURL);

    void openTeamDetails(String id);

    void saveTeamLocally(TeamEntity entity);
    void deleteTeamLocally(TeamEntity entity);

}
