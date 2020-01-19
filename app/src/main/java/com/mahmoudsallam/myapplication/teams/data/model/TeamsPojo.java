package com.mahmoudsallam.myapplication.teams.data.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
/**
 * Awesome Pojo Generator
 * */
public class TeamsPojo{
  @SerializedName("teams")
  @Expose
  private List<Teams> teams;
  @SerializedName("count")
  @Expose
  private Integer count;
  @SerializedName("season")
  @Expose
  private Season season;
  @SerializedName("competition")
  @Expose
  private Competition competition;
  @SerializedName("filters")
  @Expose
  private Filters filters;
  public void setTeams(List<Teams> teams){
   this.teams=teams;
  }
  public List<Teams> getTeams(){
   return teams;
  }
  public void setCount(Integer count){
   this.count=count;
  }
  public Integer getCount(){
   return count;
  }
  public void setSeason(Season season){
   this.season=season;
  }
  public Season getSeason(){
   return season;
  }
  public void setCompetition(Competition competition){
   this.competition=competition;
  }
  public Competition getCompetition(){
   return competition;
  }
  public void setFilters(Filters filters){
   this.filters=filters;
  }
  public Filters getFilters(){
   return filters;
  }
}