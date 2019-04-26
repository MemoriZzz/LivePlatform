/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.Ecosys;

import com.Business.employee.Employee;
import com.Business.role.SystemAdminRole;
import com.Business.sponsor.Sponsor;
import com.Business.streamer.Streamer;
import com.Business.user.User;
import com.Business.viewer.Viewer;

/**
 *
 * @author rachelwang
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        Employee employee = new Employee();
        //int id, String userName, String password, Employee emplyee, Sponsor sponsor, Streamer streamer, Role role, Organization organization, Enterprise enterprise
        User u = system.getUserList().createUser(0,"admin", "admin", employee, null, null,new SystemAdminRole(),null,null);
        
        return system;

        
    }
    
}
