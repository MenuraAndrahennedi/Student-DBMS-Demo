/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fc211026_specialLabsheet;

/**
 *
 * @author menur
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
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
        jTextArea1 = new javax.swing.JTextArea();
        insertdataButton = new javax.swing.JButton();
        retrievedataButton = new javax.swing.JButton();
        updateGPAButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        insertdataButton.setBackground(new java.awt.Color(204, 204, 204));
        insertdataButton.setForeground(new java.awt.Color(0, 0, 0));
        insertdataButton.setText("INSERT DATA");
        insertdataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertdataButtonActionPerformed(evt);
            }
        });
        getContentPane().add(insertdataButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 250, 30));

        retrievedataButton.setBackground(new java.awt.Color(204, 204, 204));
        retrievedataButton.setForeground(new java.awt.Color(0, 0, 0));
        retrievedataButton.setText("RETRIEVE DATA");
        retrievedataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrievedataButtonActionPerformed(evt);
            }
        });
        getContentPane().add(retrievedataButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 250, 30));

        updateGPAButton.setBackground(new java.awt.Color(204, 204, 204));
        updateGPAButton.setForeground(new java.awt.Color(0, 0, 0));
        updateGPAButton.setText("UPDATE GPA");
        updateGPAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateGPAButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateGPAButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 250, 30));

        exitButton.setBackground(new java.awt.Color(255, 255, 255));
        exitButton.setForeground(new java.awt.Color(0, 0, 0));
        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, -1, -1));

        titleLabel.setBackground(new java.awt.Color(0, 102, 102));
        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("STUDENT DATABASE MANAGEMT SYSTEM");
        titleLabel.setOpaque(true);
        getContentPane().add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 630, 80));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fc211026_specialLabsheet/menuBackground.jpg"))); // NOI18N
        backgroundLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateGPAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateGPAButtonActionPerformed
        setVisible(false);
        new UpdateGPA().setVisible(true);
    }//GEN-LAST:event_updateGPAButtonActionPerformed

    private void insertdataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertdataButtonActionPerformed
        setVisible(false);
        new InsertData().setVisible(true);
    }//GEN-LAST:event_insertdataButtonActionPerformed

    private void retrievedataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrievedataButtonActionPerformed
        setVisible(false);
        new RetrieveData().setVisible(true);
    }//GEN-LAST:event_retrievedataButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException  {
        CreateDatabase.createNewDatabase("studentDetails.db");
        CreateTable.createNewTable();
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton insertdataButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton retrievedataButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateGPAButton;
    // End of variables declaration//GEN-END:variables
}
