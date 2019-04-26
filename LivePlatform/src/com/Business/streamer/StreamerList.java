/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.streamer;

import java.util.ArrayList;

/**
 *
 * @author yangyuxuan
 */
public class StreamerList {
    private ArrayList<Streamer> streamerList;
    
    public StreamerList(){
        streamerList = new ArrayList<>();
    }

    public ArrayList<Streamer> getStreamerList() {
        return streamerList;
    }

    public void setStreamerList(ArrayList<Streamer> streamerList) {
        this.streamerList = streamerList;
    }
    
    
}
