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
import com.Interface.pfAdmin.PfAdminWorkArea;
import com.Interface.sponser.SponsorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author rachelwang
 */
public class SponsorRole extends Role{
    public SponsorRole(){
        super(RoleType.sponsor);
    }
    
    @Override
    public JPanel createWorkArea(JPanel rightPanel,DB4OUtil db4o, User user, Organization organizaiton, Enterprise enterprise, EcoSystem ecosystem){
        return new SponsorWorkAreaJPanel(rightPanel, db4o, user, ecosystem, enterprise);
    }
}
