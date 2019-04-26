/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.enterprise;

import com.Business.organization.Organization;
import com.Business.organization.OrganizationDirectory;
import com.Business.streamer.Streamer;
import com.Business.user.User;
import java.util.ArrayList;

/**
 *
 * @author yangyuxuan
 */
public class Enterprise extends Organization{
    private String enterpriseName;
    private String enterpriseType;
    private OrganizationDirectory organizationList;
    private ArrayList<User> streamerapplyadslist;

    public ArrayList<User> getStreamerapplyadslist() {
        return streamerapplyadslist;
    }

    public void setStreamerapplyadslist() {
        this.streamerapplyadslist = new ArrayList<>();
    }
    
    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    
    public Enterprise(String name,String type){
        super(name,null);
        this.enterpriseName = name;
        this.enterpriseType = type;
    }
 
        
//       LivePlatform("Live-Platform"),
//       AdvertisementCompany("");
       
    
    
    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public OrganizationDirectory getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(OrganizationDirectory organizationList) {
        this.organizationList = organizationList;
    }

    @Override
    public String toString(){
        return enterpriseName;
    }
    
}
