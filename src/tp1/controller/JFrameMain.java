/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package tp1.controller;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.table.DefaultTableModel;
import tp1.javabeans.ClientTTC;
import tp1.model.ClientTTCModel;

/**
 *
 * @author brahim
 */
public class JFrameMain extends javax.swing.JFrame {
    
    List<ClientTTC> clients = new ArrayList<>();

    int selectedIndex;
    /**
     * Creates new form JFrameMain
     */
    public JFrameMain() {
        initComponents();
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tp1PU");
            EntityManager em = emf.createEntityManager();
            ClientTTCModel clientTTCModel = new ClientTTCModel(em);
            clients = clientTTCModel.getClients();
        } catch(Exception e) {
            System.out.println(e);
        }
        displayData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new java.awt.Button();
        jButtonAddClientTTC = new javax.swing.JButton();
        jButtonUpdateClientTTC = new javax.swing.JButton();
        jButtonDeleteClientTTC = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableClients = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button1.setLabel("button1");

        jButtonAddClientTTC.setText("Ajouter");
        jButtonAddClientTTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddClientTTCActionPerformed(evt);
            }
        });

        jButtonUpdateClientTTC.setText("Modifier");
        jButtonUpdateClientTTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateClientTTCActionPerformed(evt);
            }
        });

        jButtonDeleteClientTTC.setText("Supprimer");
        jButtonDeleteClientTTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteClientTTCActionPerformed(evt);
            }
        });

        jButtonExit.setText("Quitter");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jTableClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableClients);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAddClientTTC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonUpdateClientTTC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDeleteClientTTC))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDeleteClientTTC)
                    .addComponent(jButtonUpdateClientTTC)
                    .addComponent(jButtonAddClientTTC))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExit)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonAddClientTTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddClientTTCActionPerformed
        // TODO add your handling code here:
        JFrameAddClientTTC jFrameAddClientTTC = new JFrameAddClientTTC(this);
        jFrameAddClientTTC.setVisible(true);
    }//GEN-LAST:event_jButtonAddClientTTCActionPerformed

    private void jButtonDeleteClientTTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteClientTTCActionPerformed
        // TODO add your handling code here:
        selectedIndex = jTableClients.getSelectedRow();
        if(selectedIndex != -1) {
            clients.remove(selectedIndex);
            displayData();
        }
    }//GEN-LAST:event_jButtonDeleteClientTTCActionPerformed

    private void jButtonUpdateClientTTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateClientTTCActionPerformed
        // TODO add your handling code here:
        selectedIndex = jTableClients.getSelectedRow();
        JFrameUpdateClientTTC jFrameUpdateClientTTC = new JFrameUpdateClientTTC(this);
        jFrameUpdateClientTTC.setVisible(true);
    }//GEN-LAST:event_jButtonUpdateClientTTCActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMain().setVisible(true);
            }
        });
    }

    public void displayData() {
        DefaultTableModel listModel = new DefaultTableModel();
        
        listModel.addColumn("Nom");
        listModel.addColumn("Prénom");
        listModel.addColumn("Pseudonyme");
        listModel.addColumn("Email");
        listModel.addColumn("Téléphone");
        listModel.addColumn("Adresse");
        listModel.addColumn("Role");
        
        for(ClientTTC client : clients) {
            listModel.addRow(new Object[] {
                client.getLastName(),
                client.getFirstName(),
                client.getPenName(), client.getEmail(),
                client.getEmail(),
                client.getAddress().getStreet() + " " + client.getAddress().getCodeMail() + " " + client.getAddress().getCity() + " " + client.getAddress().getCountry(),
                client.getRole().getLabel() + " " + client.getRole().getLevel()
            });
        }
        
        jTableClients.setModel(listModel);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JButton jButtonAddClientTTC;
    private javax.swing.JButton jButtonDeleteClientTTC;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonUpdateClientTTC;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableClients;
    // End of variables declaration//GEN-END:variables

}
