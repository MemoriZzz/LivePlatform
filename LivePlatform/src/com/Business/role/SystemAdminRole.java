/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business.role;

import javax.swing.JPanel;
import com.Business.Ecosys.EcoSystem;
import com.Business.database.DB4OUtil;
import com.Business.enterprise.Enterprise;
import com.Business.organization.Organization;
import com.Business.user.User;
import javax.swing.JPanel;
import com.project.Interface.MainJFrame;
//import com.interface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import com.Interface.admin.AdminWorkArea;
import com.Interface.streamer.StreamerWorkArea;

/**
 *
 * @author rachelwang
 */
public class SystemAdminRole extends Role{
    public SystemAdminRole(){
        super(RoleType.systemAdmin);
    }
    
       @Override
    public JPanel createWorkArea(JPanel rightPanel,DB4OUtil db4o, User user, Organization organizaiton, Enterprise enterprise, EcoSystem business){
    return new AdminWorkArea(db4o, rightPanel, business);
    }
}
