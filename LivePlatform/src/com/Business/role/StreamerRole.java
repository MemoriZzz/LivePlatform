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
import com.Interface.sponser.SponsorWorkAreaJPanel;
import com.Interface.streamer.StreamerWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author rachelwang
 */
public class StreamerRole extends Role{
    public StreamerRole(){
        super(RoleType.streamer);
    }
    
    @Override
    public JPanel createWorkArea(JPanel rightPanel,DB4OUtil db4o, User user, Organization organizaiton, Enterprise enterprise, EcoSystem business){
    return new StreamerWorkArea(rightPanel, db4o, user,business);
    }   
}
