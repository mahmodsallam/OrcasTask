package com.mahmoudsallam.myapplication.teamDetails.ui;

import com.mahmoudsallam.myapplication.teamDetails.data.api.TeamDetailsApi;
import com.mahmoudsallam.myapplication.teamDetails.data.model.TeamDetailsPojo;
import com.mahmoudsallam.myapplication.teams.data.model.TeamsPojo;

public interface TeamDetailsMvpView {
    void displayTeamDetails(TeamDetailsPojo teamDetails);
}
