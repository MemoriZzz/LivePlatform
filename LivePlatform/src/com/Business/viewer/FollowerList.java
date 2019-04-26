/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.viewer;

import java.util.ArrayList;

/**
 *
 * @author yangyuxuan
 */
public class FollowerList {
    private ArrayList<Viewer> followerList;
    
    public FollowerList(){
        followerList = new ArrayList<>();
    }

    public ArrayList<Viewer> getFollowerList() {
        return followerList;
    }

    public void setFollowerList(ArrayList<Viewer> followerList) {
        this.followerList = followerList;
    }
    
    
}
