/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.viewer;

import com.Business.streamer.FollowList;

/**
 *
 * @author yangyuxuan
 */
public class Viewer {
    
    public Viewer(){
        
    }
    private String name;
    private String gender;
    private int phone;
    
    private FollowList followList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public FollowList getFollowList() {
        return followList;
    }

    public void setFollowList(FollowList followList) {
        this.followList = followList;
    }
    

}
