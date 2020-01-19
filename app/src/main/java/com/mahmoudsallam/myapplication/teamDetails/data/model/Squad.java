package com.mahmoudsallam.myapplication.teamDetails.data.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class Squad{
  @SerializedName("role")
  @Expose
  private String role;
  @SerializedName("nationality")
  @Expose
  private String nationality;
  @SerializedName("countryOfBirth")
  @Expose
  private String countryOfBirth;
  @SerializedName("shirtNumber")
  @Expose
  private Integer shirtNumber;
  @SerializedName("name")
  @Expose
  private String name;
  @SerializedName("dateOfBirth")
  @Expose
  private String dateOfBirth;
  @SerializedName("id")
  @Expose
  private Integer id;
  @SerializedName("position")
  @Expose
  private String position;
  public void setRole(String role){
   this.role=role;
  }
  public String getRole(){
   return role;
  }
  public void setNationality(String nationality){
   this.nationality=nationality;
  }
  public String getNationality(){
   return nationality;
  }
  public void setCountryOfBirth(String countryOfBirth){
   this.countryOfBirth=countryOfBirth;
  }
  public String getCountryOfBirth(){
   return countryOfBirth;
  }
  public void setShirtNumber(Integer shirtNumber){
   this.shirtNumber=shirtNumber;
  }
  public Integer getShirtNumber(){
   return shirtNumber;
  }
  public void setName(String name){
   this.name=name;
  }
  public String getName(){
   return name;
  }
  public void setDateOfBirth(String dateOfBirth){
   this.dateOfBirth=dateOfBirth;
  }
  public String getDateOfBirth(){
   return dateOfBirth;
  }
  public void setId(Integer id){
   this.id=id;
  }
  public Integer getId(){
   return id;
  }
  public void setPosition(String position){
   this.position=position;
  }
  public String getPosition(){
   return position;
  }
}