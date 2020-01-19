package com.mahmoudsallam.myapplication.teams.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import com.mahmoudsallam.myapplication.R;
import com.mahmoudsallam.myapplication.teamDetails.ui.TeamDetailsFragment;
import com.mahmoudsallam.myapplication.teams.data.local.TeamEntity;
import com.mahmoudsallam.myapplication.teams.data.local.TeamsDatabase;
import com.mahmoudsallam.myapplication.teams.data.model.Teams;

import java.util.List;

public class TeamsFragment extends Fragment implements MainMvpView, TeamsInterface {

    private TeamsDatabase database;
    private MainPresenter mPresenter;
    private RecyclerView albumsRecyclerView;
    private TeamsAdapter albumsAdapter;

    public static TeamsFragment newInstance() {
        Bundle args = new Bundle();
        TeamsFragment fragment = new TeamsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.teams_fragment, container, false);
        mPresenter = new MainPresenter(this);
        albumsRecyclerView = view.findViewById(R.id.todoRecyclerView);
        mPresenter.getTeams();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        database = Room.databaseBuilder(getActivity().getApplicationContext(),
                TeamsDatabase.class, "TeamsDatabase").allowMainThreadQueries()
                .fallbackToDestructiveMigration().build();
    }

    @Override
    public void updateUiWithTeams(List<Teams> teamsList) {
        albumsAdapter = new TeamsAdapter(teamsList, getActivity(), this);
        albumsRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        albumsRecyclerView.setItemAnimator(new DefaultItemAnimator());
        albumsRecyclerView.setAdapter(albumsAdapter);
    }

    @Override
    public void openTeamWebsite(String websiteURL) {
        if (websiteURL != null) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(websiteURL));
            startActivity(intent);

        }

    }

    @Override
    public void openTeamDetails(String id) {
        displayTeamDetails(id);
    }

    @Override
    public void saveTeamLocally(TeamEntity entity) {
        database.teamDao().insert(entity);
    }

    @Override
    public void deleteTeamLocally(TeamEntity entity) {
        database.teamDao().delete(entity);
    }

    public void displayTeamDetails(String id) {
        Bundle bundle = new Bundle();
        bundle.putString("TEAM_ID", id);
        TeamDetailsFragment fragment = TeamDetailsFragment.newInstance();
        fragment.setArguments(bundle);

        getActivity().getSupportFragmentManager().beginTransaction()
                .add(R.id.fragmentContainer, fragment)
                .addToBackStack("TeamDetails")
                .commit();
    }

}
