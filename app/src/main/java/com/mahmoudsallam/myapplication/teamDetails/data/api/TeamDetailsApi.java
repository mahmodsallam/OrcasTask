package com.mahmoudsallam.myapplication.teamDetails.data.api;

import com.mahmoudsallam.myapplication.teamDetails.data.model.TeamDetailsPojo;
import com.mahmoudsallam.myapplication.utils.Constants;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface TeamDetailsApi {
    @Headers("X-Auth-Token:" + Constants.API_TOKEN)
    @GET("teams/{id}")
    Observable<TeamDetailsPojo> getTeamDetails(@Path("id") String id);
}
