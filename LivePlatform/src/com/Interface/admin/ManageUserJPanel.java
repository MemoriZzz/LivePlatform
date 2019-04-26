/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interface.admin;

import com.Business.Ecosys.EcoSystem;
import com.Business.Network.Network;
import com.Business.database.DB4OUtil;
import com.Business.enterprise.Enterprise;
import com.Business.user.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yangyuxuan
 */
public class ManageUserJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserJPanel
     */
    private DB4OUtil db4o;
    private JPanel rightPanel;
    private EcoSystem ecosystem;
    public ManageUserJPanel(DB4OUtil db4o, JPanel rightPanel, EcoSystem ecosystem) {
        initComponents();
        this.db4o= db4o;
        this.rightPanel= rightPanel;
        this.ecosystem = ecosystem;
        populate();
    }
    
    public void populate(){
        int rowCount = userTbl.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel)userTbl.getModel();
        for(int i = rowCount -1; i>=0; i--){
            dtm.removeRow(i);
        }
        
        for(User c: ecosystem.getUserList().getUserList()){
            Object row[] = new Object[dtm.getColumnCount()];
            
            row[0] = c.getId();
            row[1] = c.getUserName();
            row[2] = c.getPassword();
            row[3] = c.getRole().getRoleType().getValue();
            
            
            dtm.addRow(row);
        }
        
        for(Network n: ecosystem.getNetworkList().getNetworkList()){
            for(Enterprise e: n.getEnterpriseList().getEnterpriseList()){
                for(User u: e.getUserList().getUserList()){
                    Object row[] = new Object[dtm.getColumnCount()];
            
                        row[0] = u.getId();
                        row[1] = u.getUserName();
                        row[2] = u.getPassword();
                        row[3] = u.getRole().getRoleType().getValue();
                        
                        dtm.addRow(row);
                }
            }
        }
     

    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        userTbl = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        userTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "UserName", "Password", "Role"
            }
        ));
        jScrollPane1.setViewportView(userTbl);

        deleteBtn.setText("Delete User");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jButton1.setText("<<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 0, 18)); // NOI18N
        jLabel1.setText("Manager User");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(269, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteBtn))
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(183, 183, 183))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(deleteBtn))
                .addContainerGap(271, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout  = (CardLayout)rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = userTbl.getSelectedRow();
        if(selectedRow >=0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure?", "Warning", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                //to-do
                db4o.storeSystem(ecosystem);
                populate();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row before delete", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable userTbl;
    // End of variables declaration//GEN-END:variables
}