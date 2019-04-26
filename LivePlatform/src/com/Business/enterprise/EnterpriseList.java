/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.enterprise;

import com.Business.Network.Network;
import java.util.ArrayList;

/**
 *
 * @author yangyuxuan
 */
public class EnterpriseList {
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseList() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
   //     if(enterpriseList==null) return new ArrayList<Enterprise>();
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
     public  void removeNetwork(Enterprise e) {
        enterpriseList.remove(e);
    }
      public Enterprise createAdAddEnterprise(String name,String type){
          Enterprise e =null;
          e = new Enterprise(name,type);
          enterpriseList.add(e);
          return e;
      }
    
    
    
}
