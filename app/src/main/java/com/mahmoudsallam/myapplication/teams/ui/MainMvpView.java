package com.mahmoudsallam.myapplication.teams.ui;

import com.mahmoudsallam.myapplication.teams.data.model.Teams;

import java.util.List;

public interface MainMvpView {

    void updateUiWithTeams(List<Teams> teamsList);
}
