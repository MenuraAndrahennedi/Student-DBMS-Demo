/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fc211026_specialLabsheet;

/**
 *
 * @author menur
 */
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrieveData extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public RetrieveData() {
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

        errorMassegeLabel = new javax.swing.JLabel();
        gobackButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        indexNumLabel = new javax.swing.JLabel();
        fullNameLabel = new javax.swing.JLabel();
        subject01Label = new javax.swing.JLabel();
        subject02Label = new javax.swing.JLabel();
        subject03Label = new javax.swing.JLabel();
        currentGPALabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        indexNumTextField = new javax.swing.JTextField();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        errorMassegeLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        errorMassegeLabel.setForeground(new java.awt.Color(255, 0, 51));
        errorMassegeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(errorMassegeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 710, 90));

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
        titleLabel.setText("RETRIEVE STUDENT DATA");
        titleLabel.setOpaque(true);
        getContentPane().add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 40));

        indexNumLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        indexNumLabel.setForeground(new java.awt.Color(255, 255, 255));
        indexNumLabel.setText("INDEX NUMBER ");
        getContentPane().add(indexNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 100, 30));

        fullNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fullNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(fullNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 520, 30));

        subject01Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        subject01Label.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(subject01Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 370, 30));

        subject02Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        subject02Label.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(subject02Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 350, 30));

        subject03Label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        subject03Label.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(subject03Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 370, 30));

        currentGPALabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        currentGPALabel.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(currentGPALabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 350, 30));

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
        getContentPane().add(indexNumTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 140, 30));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fc211026_specialLabsheet/menuBackground1.jpg"))); // NOI18N
        backgroundLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String[] resultData=DatabaseOperations.retrievetData(indexNumTextField.getText());
        if(resultData[0]==null){
            errorMassegeLabel.setText("Index Number NOT found.");  
            fullNameLabel.setText("");
            subject01Label.setText("");
            subject02Label.setText("");
            subject03Label.setText("");
            currentGPALabel.setText("");
        }else{
            errorMassegeLabel.setText(""); 
            fullNameLabel.setText("FULL NAME        :  "+resultData[0]);
            subject01Label.setText("SUBJECT 01        :  "+resultData[1]);
            subject02Label.setText("SUBJECT 02        :  "+resultData[2]);
            subject03Label.setText("SUBJECT 03        :  "+resultData[3]);
            currentGPALabel.setText("CURRENT GPA   :  "+resultData[4]);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void gobackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobackButtonActionPerformed
        setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_gobackButtonActionPerformed

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
                new RetrieveData().setVisible(true);
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
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel subject01Label;
    private javax.swing.JLabel subject02Label;
    private javax.swing.JLabel subject03Label;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}