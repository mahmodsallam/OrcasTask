package com.mahmoudsallam.myapplication.teamDetails.ui;

import android.util.Log;

import com.mahmoudsallam.myapplication.base.retrofit.RetrofitInstance;
import com.mahmoudsallam.myapplication.teamDetails.data.api.TeamDetailsApi;
import com.mahmoudsallam.myapplication.teamDetails.data.model.TeamDetailsPojo;

import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class TeamDetailsPresenter implements TeamDetailsMvpPresenter {
    TeamDetailsMvpView teamDetailsMvpView;
    TeamDetailsApi teamDetailsApi;

    public TeamDetailsPresenter(TeamDetailsMvpView teamDetailsMvpView) {
        this.teamDetailsMvpView = teamDetailsMvpView;
        teamDetailsApi = RetrofitInstance.getInstance().create(TeamDetailsApi.class);
    }

    @Override
    public void getTeamDetails(String id) {
        teamDetailsApi.getTeamDetails(id).observeOn(Schedulers.newThread())
                .subscribeOn(Schedulers.io()).subscribe(new Consumer<TeamDetailsPojo>() {
            @Override
            public void accept(TeamDetailsPojo teamDetailsPojo) throws Exception {
                teamDetailsMvpView.displayTeamDetails(teamDetailsPojo);
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
                Log.d("ERROR", throwable.getMessage());
            }
        });

    }
}
