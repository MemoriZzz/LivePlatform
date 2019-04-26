/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.form;

import java.io.File;

/**
 *
 * @author yangyuxuan
 */
public class Form {
    private String title;
    private String content;
    private String platformComment;
    private String advertisementComment;
    private double funds;
    private File photo;  //the type of file(image)

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPlatformComment() {
        return platformComment;
    }

    public void setPlatformComment(String platformComment) {
        this.platformComment = platformComment;
    }

    public String getAdvertisementComment() {
        return advertisementComment;
    }

    public void setAdvertisementComment(String advertisementComment) {
        this.advertisementComment = advertisementComment;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }


    
    
}
