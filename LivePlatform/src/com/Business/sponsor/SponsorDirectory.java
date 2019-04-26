/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.sponsor;

import java.util.ArrayList;

/**
 *
 * @author yangyuxuan
 */
public class SponsorDirectory {
    private ArrayList<Sponsor> SponsorList;
    
    public SponsorDirectory(){
        SponsorList = new ArrayList<>();
    }

    public ArrayList<Sponsor> getSponsorList() {
        return SponsorList;
    }

    public void setSponsorList(ArrayList<Sponsor> SponsorList) {
        this.SponsorList = SponsorList;
    }
    
    public Sponsor addSponsor(){
        Sponsor sp = new Sponsor();
        SponsorList.add(sp);
        return sp;
    }
}
