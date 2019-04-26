/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.organization;

import com.Business.user.UserList;

/**
 *
 * @author yangyuxuan
 */
public class Organization {
    private String name; 
    private int orgId;
    private UserList userList;
    private Type type;
    
    public enum Type{
        systemAdmin("System Admin Organization"),
        platformAdmin("Platform Admin Organiztion"),
        advertisementAdmin("Advertisement Admin Organizaation"),
        accountManager("Account Manager Organization"),
        stream("Stream Organization"),
        sponsor("Sponsor Organization"),
        viewer("viewer organization");
        private String value;
        private Type(String value){
            this.value= value;
        }
        private String getValue(){
            return value;
        }
    }

    public Organization(String name, Type type) {
        this.name = name;
        this.type = type;
        userList = new UserList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }

    public UserList getUserList() {
        return userList;
    }

    public void setUserList(UserList userList) {
        this.userList = userList;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
    
    
}
