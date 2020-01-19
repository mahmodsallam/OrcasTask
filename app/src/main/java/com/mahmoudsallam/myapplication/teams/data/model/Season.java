package com.mahmoudsallam.myapplication.teams.data.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class Season{
  @SerializedName("winner")
  @Expose
  private Object winner;
  @SerializedName("currentMatchday")
  @Expose
  private Integer currentMatchday;
  @SerializedName("endDate")
  @Expose
  private String endDate;
  @SerializedName("id")
  @Expose
  private Integer id;
  @SerializedName("startDate")
  @Expose
  private String startDate;
  public void setWinner(Object winner){
   this.winner=winner;
  }
  public Object getWinner(){
   return winner;
  }
  public void setCurrentMatchday(Integer currentMatchday){
   this.currentMatchday=currentMatchday;
  }
  public Integer getCurrentMatchday(){
   return currentMatchday;
  }
  public void setEndDate(String endDate){
   this.endDate=endDate;
  }
  public String getEndDate(){
   return endDate;
  }
  public void setId(Integer id){
   this.id=id;
  }
  public Integer getId(){
   return id;
  }
  public void setStartDate(String startDate){
   this.startDate=startDate;
  }
  public String getStartDate(){
   return startDate;
  }
}