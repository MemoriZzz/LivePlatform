/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.sponsor;

import com.Business.advertisement.AdvertisementList;

/**
 *
 * @author yangyuxuan
 */
public class Sponsor {
    private String name;
    private AdvertisementList advertisements;
    
    public Sponsor(){
        advertisements = new AdvertisementList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AdvertisementList getAdvertisements() {
        return advertisements;
    }

    public void setAdvertisements(AdvertisementList advertisements) {
        this.advertisements = advertisements;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
