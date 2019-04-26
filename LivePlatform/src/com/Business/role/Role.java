/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.role;

import com.Business.Ecosys.EcoSystem;
import com.Business.database.DB4OUtil;
import com.Business.enterprise.Enterprise;
import com.Business.organization.Organization;
import com.Business.user.User;
import javax.swing.JPanel;

/**
 *
 * @author yangyuxuan
 */
public abstract class Role {
    public RoleType roleType;
    
    public Role(RoleType roleType){
        this.roleType = roleType;
    }
    
    public enum RoleType{
        systemAdmin("System Admin Role"),
        platformAdmin("Platform Admin Role"),
        advertisementAdmin("Advertisement Admin Role"),
        accountManager("Account Manager Role"),
        streamer("Streamer Role"),
        sponsor("Sponsor Role"),
        viewer("viewer Role");
        private String value;
        private RoleType(String value){
            this.value= value;
        }
        public String getValue(){
            return value;
        }
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
    
    public abstract JPanel createWorkArea(
    JPanel rightPAnel,
    DB4OUtil db4o,
    User user, 
    Organization organization, 
    Enterprise enterprise, 
    EcoSystem business);
        
    
    @Override
    public String toString(){
        return this.getRoleType().getValue();
    }
    
}
