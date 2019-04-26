/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.streamer;

import com.Business.viewer.FollowerList;
import com.Business.viewer.Viewer;

/**
 *
 * @author yangyuxuan
 */
public class Streamer extends Viewer{
    
    public Streamer(){
        
    }
    private int popularity;
    
    private FollowerList followerList;

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public FollowerList getFollowerList() {
        return followerList;
    }

    public void setFollowerList(FollowerList followerList) {
        this.followerList = followerList;
    }
    
    
    
}
