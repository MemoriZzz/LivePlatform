/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.user;

import com.Business.employee.Employee;
import com.Business.enterprise.Enterprise;
import com.Business.organization.Organization;
import com.Business.role.Role;
import com.Business.sponsor.Sponsor;
import com.Business.streamer.Streamer;
import com.Business.viewer.Viewer;
import java.util.ArrayList;

/**
 *
 * @author yangyuxuan
 */
public class UserList {
    private ArrayList<User> userList;
    
    public UserList(){
        userList = new ArrayList<>();
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public User authenticateUser(String username, String password){ //用户登陆
        for (User u : userList)
            if (u.getUserName().equals(username) && u.getPassword().equals(password)){
                return u;
            }
        return null;
    }
   
    public User createUser(int id, String userName, String password, Employee employee,Sponsor sponsor, Streamer streamer, Role role, Organization organization, Enterprise enterprise){
        
        User user = new User(id,userName,password,employee, sponsor,streamer,role,organization,enterprise);
        userList.add(user);
        return user;
    }
    
}
