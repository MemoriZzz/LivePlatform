/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Ecosys;

import com.Business.Network.Network;
import com.Business.Network.NetworkDirectory;
import com.Business.organization.Organization;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author yangyuxuan
 */
public class EcoSystem extends Organization{
    public static EcoSystem system;
    private String name;
    private Date time;
    private NetworkDirectory networkList;

    public static EcoSystem getInstance(){
        if(system == null){
            system = new EcoSystem();
        }
        return system;    
    }
    
    public EcoSystem() {
        super(null,null);
        
        this.networkList = new NetworkDirectory();
        this.time = new Date();
        System.out.println(time);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public NetworkDirectory getNetworkList() {
        return networkList;
    }

    public void setNetworkList(NetworkDirectory networkList) {
        this.networkList = networkList;
    }
    
    
    

    
}
