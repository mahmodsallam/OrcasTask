package com.mahmoudsallam.myapplication.teamDetails.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.mahmoudsallam.myapplication.R;
import com.mahmoudsallam.myapplication.teamDetails.data.model.TeamDetailsPojo;

public class TeamDetailsFragment extends Fragment implements TeamDetailsMvpView {

    TeamDetailsPresenter mPresenter;
    TextView playersText;


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
        playersText = view.findViewById(R.id.playersText);
        mPresenter = new TeamDetailsPresenter(this);
        String id = this.getArguments().get("TEAM_ID").toString();
        mPresenter.getTeamDetails(id);
        return view;
    }

    @Override
    public void displayTeamDetails(TeamDetailsPojo teamDetails) {
        int length = teamDetails.getSquad().size();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(teamDetails.getSquad().get(i).getName()+"\n");
        }
        playersText.setText(builder);
    }
}



