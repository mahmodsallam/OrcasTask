package com.mahmoudsallam.myapplication.teams.ui;

import android.util.Log;

import com.mahmoudsallam.myapplication.teams.data.model.TeamsPojo;
import com.mahmoudsallam.myapplication.base.retrofit.RetrofitInstance;
import com.mahmoudsallam.myapplication.teams.data.api.TeamsApi;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;


public class MainPresenter implements MainMvpPresenter {
    MainMvpView mainView;
    TeamsApi teamsApi;

    public MainPresenter(MainMvpView mainView) {
        this.mainView = mainView;
        teamsApi = RetrofitInstance.getInstance().create(TeamsApi.class);
    }


    @Override
    public void getTeams() {
        Observable<TeamsPojo> result = teamsApi.getTeams();
        result.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<TeamsPojo>() {
                    @Override
                    public void accept(TeamsPojo teamsPojo) throws Exception {
                        mainView.updateUiWithTeams(teamsPojo.getTeams());
                    }


                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        Log.d("ERROR" , throwable.getMessage()) ;
                    }
                });
    }
}
