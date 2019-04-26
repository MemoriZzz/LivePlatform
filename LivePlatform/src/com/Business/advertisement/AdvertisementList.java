/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.advertisement;

import java.util.ArrayList;


/**
 *
 * @author yangyuxuan
 */
public class AdvertisementList {
    
    private ArrayList<Advertisement> Adertisements;
    
    public AdvertisementList(){
        Adertisements = new ArrayList<>();
    }

    public ArrayList<Advertisement> getAdertisements() {
        return Adertisements;
    }

    public void setAdertisements(ArrayList<Advertisement> Adertisements) {
        this.Adertisements = Adertisements;
    }
    
//    public Advertisement addAd(){
//        Advertisement ad = new Advertisement();
//        Adertisements.add(ad);
//        return ad;
//    }
}
