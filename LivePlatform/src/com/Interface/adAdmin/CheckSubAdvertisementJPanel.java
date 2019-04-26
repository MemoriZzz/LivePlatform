/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interface.adAdmin;

import com.Business.Ecosys.EcoSystem;
import com.Business.advertisement.Advertisement;
import com.Business.advertisement.AdvertisementList;
import com.Business.database.DB4OUtil;
import com.Business.enterprise.Enterprise;
import com.Business.user.User;
import java.awt.CardLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yangyuxuan
 */
public class CheckSubAdvertisementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CheckAdertisementsJPanel
     */
    private DB4OUtil db4o;
    private JPanel rightPanel;
    private User user;
    private Enterprise enterprise;
    private EcoSystem ecosystem;
    public CheckSubAdvertisementJPanel(JPanel rightPanel, DB4OUtil db4o, User user, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.rightPanel = rightPanel;
        this.enterprise = enterprise;
        this.user = user;
        this.db4o = db4o;
        this.ecosystem = ecosystem;
        populateTable();
    }
    
    public void populateTable(){
        int rowCount = submittedADTbl.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel)submittedADTbl.getModel();
        
        for(int i = rowCount - 1; i >=0; i--) {
            dtm.removeRow(i);
        }
        
        for(Advertisement ad : user.getAdvertisementList().getAdertisements()){
            if(ad.getStatus().equals("adAdmin checking") || ad.getStatus().equals("Reject by adAdmin")||ad.getStatus().equals("Advertisement Updated")){
            Object row[] = new Object[dtm.getColumnCount()];
            
            row[0] = ad;
            row[1] = ad.getForm().getTitle();
            row[2] = ad.getStatus();
            //row[3] = p.getEnterpriseList().getEnterpriseList().size();
            dtm.addRow(row);
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

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        submittedADTbl = new javax.swing.JTable();
        viewAdDetailBtn = new javax.swing.JToggleButton();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        submittedADTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Title", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(submittedADTbl);

        viewAdDetailBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        viewAdDetailBtn.setText("VIew Details");
        viewAdDetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAdDetailBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        backBtn.setText(" <<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 0, 24)); // NOI18N
        jLabel1.setText("Check Submitted Advertisements");

        jButton2.setText("hit me!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewAdDetailBtn)))
                .addGap(222, 222, 222))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewAdDetailBtn)
                    .addComponent(backBtn))
                .addContainerGap(234, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewAdDetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAdDetailBtnActionPerformed
        try {
            // TODO add your handling code here:
            int selectedRow = submittedADTbl.getSelectedRow();
            
            if(selectedRow < 0){
                JOptionPane.showMessageDialog(null, "Please select a row before you check the detail");
            }
            Advertisement ad = (Advertisement)submittedADTbl.getValueAt(selectedRow, 0);
            ViewAdvertisementDetailJPanel jPanel = new ViewAdvertisementDetailJPanel(rightPanel, db4o, user, ad, ecosystem);
            rightPanel.add("ViewAdvertisementDetailJPanel",jPanel);
            CardLayout layout = (CardLayout)rightPanel.getLayout();
            layout.next(rightPanel);
        } catch (IOException ex) {
            Logger.getLogger(CheckSubAdvertisementJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_viewAdDetailBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         populateTable();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable submittedADTbl;
    private javax.swing.JToggleButton viewAdDetailBtn;
    // End of variables declaration//GEN-END:variables
}