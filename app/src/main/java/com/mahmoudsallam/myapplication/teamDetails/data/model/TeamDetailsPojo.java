package com.mahmoudsallam.myapplication.teamDetails.data.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
/**
 * Awesome Pojo Generator
 * */
public class TeamDetailsPojo{
  @SerializedName("area")
  @Expose
  private Area area;
  @SerializedName("venue")
  @Expose
  private String venue;
  @SerializedName("website")
  @Expose
  private String website;
  @SerializedName("address")
  @Expose
  private String address;
  @SerializedName("crestUrl")
  @Expose
  private String crestUrl;
  @SerializedName("tla")
  @Expose
  private String tla;
  @SerializedName("founded")
  @Expose
  private Integer founded;
  @SerializedName("lastUpdated")
  @Expose
  private String lastUpdated;
  @SerializedName("clubColors")
  @Expose
  private String clubColors;
  @SerializedName("squad")
  @Expose
  private List<Squad> squad;
  @SerializedName("phone")
  @Expose
  private String phone;
  @SerializedName("name")
  @Expose
  private String name;
  @SerializedName("activeCompetitions")
  @Expose
  private List<ActiveCompetitions> activeCompetitions;
  @SerializedName("id")
  @Expose
  private Integer id;
  @SerializedName("shortName")
  @Expose
  private String shortName;
  @SerializedName("email")
  @Expose
  private String email;
  public void setArea(Area area){
   this.area=area;
  }
  public Area getArea(){
   return area;
  }
  public void setVenue(String venue){
   this.venue=venue;
  }
  public String getVenue(){
   return venue;
  }
  public void setWebsite(String website){
   this.website=website;
  }
  public String getWebsite(){
   return website;
  }
  public void setAddress(String address){
   this.address=address;
  }
  public String getAddress(){
   return address;
  }
  public void setCrestUrl(String crestUrl){
   this.crestUrl=crestUrl;
  }
  public String getCrestUrl(){
   return crestUrl;
  }
  public void setTla(String tla){
   this.tla=tla;
  }
  public String getTla(){
   return tla;
  }
  public void setFounded(Integer founded){
   this.founded=founded;
  }
  public Integer getFounded(){
   return founded;
  }
  public void setLastUpdated(String lastUpdated){
   this.lastUpdated=lastUpdated;
  }
  public String getLastUpdated(){
   return lastUpdated;
  }
  public void setClubColors(String clubColors){
   this.clubColors=clubColors;
  }
  public String getClubColors(){
   return clubColors;
  }
  public void setSquad(List<Squad> squad){
   this.squad=squad;
  }
  public List<Squad> getSquad(){
   return squad;
  }
  public void setPhone(String phone){
   this.phone=phone;
  }
  public String getPhone(){
   return phone;
  }
  public void setName(String name){
   this.name=name;
  }
  public String getName(){
   return name;
  }
  public void setActiveCompetitions(List<ActiveCompetitions> activeCompetitions){
   this.activeCompetitions=activeCompetitions;
  }
  public List<ActiveCompetitions> getActiveCompetitions(){
   return activeCompetitions;
  }
  public void setId(Integer id){
   this.id=id;
  }
  public Integer getId(){
   return id;
  }
  public void setShortName(String shortName){
   this.shortName=shortName;
  }
  public String getShortName(){
   return shortName;
  }
  public void setEmail(String email){
   this.email=email;
  }
  public String getEmail(){
   return email;
  }
}