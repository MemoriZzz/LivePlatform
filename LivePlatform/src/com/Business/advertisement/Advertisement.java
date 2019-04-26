/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.advertisement;

import com.Business.enterprise.Enterprise;
import com.Business.form.Form;
import com.Business.streamer.Streamer;
import com.Business.user.User;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author yangyuxuan
 */
public class Advertisement {
    private long id;
    //private String title;
    private String status;
    //private String content;
    //private String adComment;
    //private String pfComment;
    private Date submitDate;
    private User sponsor;
    private User streamer;
    private User platformAdmin;
    private User advertisementAdmin;
    private Form form;
    private Enterprise enterprise;
    private Enterprise advertisementEnterprise;
    private Enterprise platformEnterprise;
    private ArrayList<User> applyList;

    public ArrayList<User> getApplyList() {
        return applyList;
    }

    public void setApplyList() {
          this.applyList = new ArrayList<>();
    }
    
    public Advertisement(User sponsor, Enterprise enterprise){
        this.sponsor= sponsor;
        this.enterprise = enterprise;
        this.form= new Form();
      
        //to-do
    }

    public Enterprise getAdvertisementEnterprise() {
        return advertisementEnterprise;
    }

    public void setAdvertisementEnterprise(Enterprise advertisementEnterprise) {
        this.advertisementEnterprise = advertisementEnterprise;
    }

    public Enterprise getPlatformEnterprise() {
        return platformEnterprise;
    }

    public void setPlatformEnterprise(Enterprise platformEnterprise) {
        this.platformEnterprise = platformEnterprise;
    }

    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    public User getSponsor() {
        return sponsor;
    }

    public void setSponsor(User sponsor) {
        this.sponsor = sponsor;
    }

    public User getStreamer() {
        return streamer;
    }

    public void setStreamer(User streamer) {
        this.streamer = streamer;
    }

    public User getPlatformAdmin() {
        return platformAdmin;
    }

    public void setPlatformAdmin(User platformAdmin) {
        this.platformAdmin = platformAdmin;
    }

    public User getAdvertisementAdmin() {
        return advertisementAdmin;
    }

    public void setAdvertisementAdmin(User advertisementAdmin) {
        this.advertisementAdmin = advertisementAdmin;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }
    
    

//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public String getAdComment() {
//        return adComment;
//    }
//
//    public void setAdComment(String adComment) {
//        this.adComment = adComment;
//    }
//
//    public String getPfComment() {
//        return pfComment;
//    }
//
//    public void setPfComment(String pfComment) {
//        this.pfComment = pfComment;
//    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    @Override
    public String toString(){
        return String.valueOf(id);
    }
    
    
    
}
