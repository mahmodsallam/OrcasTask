package com.mahmoudsallam.myapplication.teamDetails.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.mahmoudsallam.myapplication.R;
import com.mahmoudsallam.myapplication.teamDetails.data.model.TeamDetailsPojo;

public class TeamDetailsFragment extends Fragment implements TeamDetailsMvpView {

    TeamDetailsPresenter mPresenter;

    public static TeamDetailsFragment newInstance() {
        Bundle args = new Bundle();
        TeamDetailsFragment fragment = new TeamDetailsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.team_detail_fragment, container, false);
        mPresenter = new TeamDetailsPresenter(this);
        String teamID = this.getArguments().getString("TEAM_ID");
        mPresenter.getTeamDetails(teamID);
        return view;
    }


    @Override
    public void displayTeamDetails(TeamDetailsPojo teamDetails) {

    }
}
