package com.mahmoudsallam.myapplication.teamDetails.data.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class ActiveCompetitions{
  @SerializedName("area")
  @Expose
  private Area area;
  @SerializedName("lastUpdated")
  @Expose
  private String lastUpdated;
  @SerializedName("code")
  @Expose
  private String code;
  @SerializedName("name")
  @Expose
  private String name;
  @SerializedName("id")
  @Expose
  private Integer id;
  @SerializedName("plan")
  @Expose
  private String plan;
  public void setArea(Area area){
   this.area=area;
  }
  public Area getArea(){
   return area;
  }
  public void setLastUpdated(String lastUpdated){
   this.lastUpdated=lastUpdated;
  }
  public String getLastUpdated(){
   return lastUpdated;
  }
  public void setCode(String code){
   this.code=code;
  }
  public String getCode(){
   return code;
  }
  public void setName(String name){
   this.name=name;
  }
  public String getName(){
   return name;
  }
  public void setId(Integer id){
   this.id=id;
  }
  public Integer getId(){
   return id;
  }
  public void setPlan(String plan){
   this.plan=plan;
  }
  public String getPlan(){
   return plan;
  }
}