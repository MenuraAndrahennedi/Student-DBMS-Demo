/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fc211026_specialLabsheet;

import java.awt.Color;

/**
 *
 * @author menur
 */
public class UpdateGPA extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public UpdateGPA() {
        initComponents();
        updateButton.setVisible(false);
        newGPATextField.setVisible(false);
        newGPALabel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        massegeLabel = new javax.swing.JLabel();
        gobackButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        indexNumLabel = new javax.swing.JLabel();
        fullNameLabel = new javax.swing.JLabel();
        subject01Label = new javax.swing.JLabel();
        subject02Label = new javax.swing.JLabel();
        subject03Label = new javax.swing.JLabel();
        newGPALabel = new javax.swing.JLabel();
        currentGPALabel = new javax.swing.JLabel();
        errorMassegeLabel = new javax.swing.JLabel();
        updateMassegeLabel = new javax.swing.JLabel();
        newGPATextField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        indexNumTextField = new javax.swing.JTextField();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(massegeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 200, -1));

        gobackButton.setBackground(new java.awt.Color(255, 255, 255));
        gobackButton.setForeground(new java.awt.Color(0, 0, 0));
        gobackButton.setText("GO BACK");
        gobackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(gobackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        titleLabel.setBackground(new java.awt.Color(0, 102, 102));
        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("UPDATE STUDENT GPA");
        titleLabel.setOpaque(true);
        getContentPane().add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 40));

        indexNumLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        indexNumLabel.setForeground(new java.awt.Color(255, 255, 255));
        indexNumLabel.setText("INDEX NUMBER ");
        getContentPane().add(indexNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 100, 30));

        fullNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fullNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(fullNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 570, 30));

        subject01Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        subject01Label.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(subject01Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 400, 30));

        subject02Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        subject02Label.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(subject02Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 380, 30));

        subject03Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        subject03Label.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(subject03Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 370, 30));

        newGPALabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        newGPALabel.setForeground(new java.awt.Color(0, 204, 204));
        newGPALabel.setText("NEW GPA");
        getContentPane().add(newGPALabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 60, 30));

        currentGPALabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        currentGPALabel.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(currentGPALabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 240, 30));

        errorMassegeLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        errorMassegeLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorMassegeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(errorMassegeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 710, 100));

        updateMassegeLabel.setForeground(new java.awt.Color(51, 255, 255));
        updateMassegeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(updateMassegeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 250, 20));

        newGPATextField.setBackground(new java.awt.Color(203, 249, 249));
        newGPATextField.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(newGPATextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 130, 30));

        updateButton.setBackground(new java.awt.Color(0, 204, 204));
        updateButton.setForeground(new java.awt.Color(0, 0, 0));
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 90, 30));

        searchButton.setBackground(new java.awt.Color(255, 255, 255));
        searchButton.setForeground(new java.awt.Color(0, 0, 0));
        searchButton.setText("SEARCH");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 110, 30));

        exitButton.setBackground(new java.awt.Color(255, 255, 255));
        exitButton.setForeground(new java.awt.Color(0, 0, 0));
        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, -1, -1));

        indexNumTextField.setBackground(new java.awt.Color(204, 204, 204));
        indexNumTextField.setForeground(new java.awt.Color(0, 0, 0));
        indexNumTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        indexNumTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                indexNumTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                indexNumTextFieldFocusLost(evt);
            }
        });
        getContentPane().add(indexNumTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 140, 30));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fc211026_specialLabsheet/menuBackground1.jpg"))); // NOI18N
        backgroundLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gobackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobackButtonActionPerformed
        setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_gobackButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String[] resultData=DatabaseOperations.retrievetData(indexNumTextField.getText());
        if(resultData[0]==null){
            errorMassegeLabel.setText("Index Number NOT found.");  
            fullNameLabel.setText("");
            subject01Label.setText("");
            subject02Label.setText("");
            subject03Label.setText("");
            currentGPALabel.setText("");
            updateMassegeLabel.setText("");
            updateButton.setVisible(false);
            newGPATextField.setVisible(false);
            newGPALabel.setVisible(false);
        }else{
            errorMassegeLabel.setText(""); 
            fullNameLabel.setText("FULL NAME        :  "+resultData[0]);
            subject01Label.setText("SUBJECT 01        :  "+resultData[1]);
            subject02Label.setText("SUBJECT 02        :  "+resultData[2]);
            subject03Label.setText("SUBJECT 03        :  "+resultData[3]);
            currentGPALabel.setText("CURRENT GPA   :  "+resultData[4]);
            updateMassegeLabel.setText("");
            updateButton.setVisible(true);
            newGPATextField.setText("");
            newGPATextField.setVisible(true);
            newGPALabel.setVisible(true);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        DatabaseOperations.updateData(indexNumTextField.getText(),newGPATextField.getText() );
        updateMassegeLabel.setText("- GPA Updated Successfully -");
    }//GEN-LAST:event_updateButtonActionPerformed

    private void indexNumTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_indexNumTextFieldFocusGained
        if(indexNumTextField.getText().equals("fc######")){
           indexNumTextField.setText("");
           indexNumTextField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_indexNumTextFieldFocusGained

    private void indexNumTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_indexNumTextFieldFocusLost
        if(indexNumTextField.getText().equals("")){
           indexNumTextField.setText("fc######");
           indexNumTextField.setForeground(new Color(140,140,140));
        }
    }//GEN-LAST:event_indexNumTextFieldFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

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
                new UpdateGPA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel currentGPALabel;
    private javax.swing.JLabel errorMassegeLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel fullNameLabel;
    private javax.swing.JButton gobackButton;
    private javax.swing.JLabel indexNumLabel;
    private javax.swing.JTextField indexNumTextField;
    private javax.swing.JLabel massegeLabel;
    private javax.swing.JLabel newGPALabel;
    private javax.swing.JTextField newGPATextField;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel subject01Label;
    private javax.swing.JLabel subject02Label;
    private javax.swing.JLabel subject03Label;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel updateMassegeLabel;
    // End of variables declaration//GEN-END:variables
}
