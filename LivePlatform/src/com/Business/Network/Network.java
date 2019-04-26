/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Network;

import com.Business.Ecosys.EcoSystem;
import static com.Business.Ecosys.EcoSystem.system;
import com.Business.enterprise.EnterpriseList;
import java.util.ArrayList;

/**
 *
 * @author yangyuxuan
 */
public class Network {
    public static Network network;
    private String networkName;
    private EnterpriseList enterpriseList;
    
//     public static Network getInstance(){
//        if(network == null){
//            network = new Network();
//        }
//        return system;    
//    }
    public Network(String name){
        this.networkName = name;
        this.enterpriseList = new EnterpriseList();
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public EnterpriseList getEnterpriseList() {
        //return new EnterpriseList();//
        return enterpriseList;
    }

    public void setEnterpriseList(EnterpriseList enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    @Override
    public String toString(){
        return networkName;
    }
    
}
