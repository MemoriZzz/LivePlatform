/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.user;

import com.Business.advertisement.AdvertisementList;
import com.Business.employee.Employee;
import com.Business.enterprise.Enterprise;
import com.Business.organization.Organization;
import com.Business.role.Role;
import com.Business.sponsor.Sponsor;
import com.Business.streamer.Streamer;
import com.Business.viewer.Viewer;

/**
 *
 * @author yangyuxuan
 */
public class User {
    private int id;
    private String userName;
    private String password;
    private Role role;
    private Employee employee;
    private Sponsor sponsor;
    private Streamer streamer;
    private Enterprise enterprise;
    private Organization organization;
    private AdvertisementList advertisementList; 
    
    public User(Role role){
        this.role = role;
        this.advertisementList = new AdvertisementList();
        
    }
    
    public User(int id, String userName, String password, Employee employee, Sponsor sponsor, Streamer streamer, Role role, Organization organization, Enterprise enterprise){
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.employee = employee;
        this.streamer =streamer;
        this.sponsor = sponsor;
        this.organization = organization;
        this.enterprise = enterprise;
        
        this.advertisementList = new AdvertisementList();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }



    public Streamer getStreamer() {
        return streamer;
    }

    public void setStreamer(Streamer streamer) {
        this.streamer = streamer;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public AdvertisementList getAdvertisementList() {
        return advertisementList;
    }

    public void setAdvertisementList(AdvertisementList advertisementList) {
        this.advertisementList = advertisementList;
    }
    
    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

    @Override
    public String toString(){
        return userName;
    }


}

