package com.myapp.dao;



public class user {
    private String Id ;
    private String username;
    private String password ;
    private String  email;
    private String  gender;
    private String  birthdate;

    public void setId(String Id){
        this.Id = Id ;
    }
    public void setusername(String username){
        this.username = username ;
    }
    public void setPassword(String password){
        this.password = password ;
    }
    public String getId(){
        return this.Id ;
    }
    public String getusername(){
        return this.username ;
    }
    public String getPassword(){
        return this.password ;
    }
    public String getemail(){
        return this.email;
    }
    public String getGender(){
        return this.gender;
    }
    public void setemail(String email){
        this.email = this.email;
    }
    public void setGender(String gender){
        this.gender = gender ;
    }

}
