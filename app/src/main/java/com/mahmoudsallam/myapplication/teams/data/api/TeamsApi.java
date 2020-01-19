package com.mahmoudsallam.myapplication.teams.data.api;

import com.mahmoudsallam.myapplication.teams.data.model.TeamsPojo;
import com.mahmoudsallam.myapplication.utils.Constants;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface TeamsApi {

    @Headers("X-Auth-Token:" + Constants.API_TOKEN)
    @GET("competitions/2001/teams")
    Observable<TeamsPojo> getTeams();
}
