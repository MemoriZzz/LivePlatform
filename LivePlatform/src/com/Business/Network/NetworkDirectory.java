/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Network;

import java.util.ArrayList;

/**
 *
 * @author yangyuxuan
 */
public class NetworkDirectory {
    private ArrayList<Network> networkList;

    public NetworkDirectory() {
        networkList = new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
     public  void removeNetwork(Network n) {
        networkList.remove(n);
    }
    
    
}
