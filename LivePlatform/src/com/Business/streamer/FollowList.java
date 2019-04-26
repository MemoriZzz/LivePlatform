/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.streamer;

import java.util.ArrayList;

/**
 *
 * @author rachelwang
 */
public class FollowList {
        private ArrayList<Streamer> followList;
    
    public FollowList(){
        followList = new ArrayList<>();
    }

    public ArrayList<Streamer> getFollowList() {
        return followList;
    }

    public void setFollowerrList(ArrayList<Streamer> followList) {
        this.followList = followList;
    }
    
    
}
