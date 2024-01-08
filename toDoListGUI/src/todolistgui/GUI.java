package todolistgui;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author adamp
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        getContentPane().setBackground(new Color(250, 250, 210));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        inputJTextField = new javax.swing.JTextField();
        saveJBtn = new javax.swing.JButton();
        displayJBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(100, 40, 233));
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(100, 100, 100));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("TO DO LIST");

        inputJTextField.setBackground(new java.awt.Color(250, 250, 250));

        saveJBtn.setBackground(new java.awt.Color(100, 100, 100));
        saveJBtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        saveJBtn.setText("Save entry");
        saveJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJBtnActionPerformed(evt);
            }
        });

        displayJBtn.setBackground(new java.awt.Color(100, 100, 100));
        displayJBtn.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        displayJBtn.setText("Display list");
        displayJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayJBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(inputJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(displayJBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(saveJBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saveJBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(displayJBtn)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJBtnActionPerformed

        File outFile;
        FileWriter fw;
        BufferedWriter bw;

        String listEntry = inputJTextField.getText();

        try {
            outFile = new File("ToDoList.txt");
            fw = new FileWriter(outFile, true);
            bw = new BufferedWriter(fw);
            bw.write(listEntry);
            bw.newLine();
            bw.close();
            JOptionPane.showMessageDialog(null, "List entry added!");
        } catch (IOException e) {
            System.out.println("Error in entering to list" + e);
        }
    }//GEN-LAST:event_saveJBtnActionPerformed

    private void displayJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayJBtnActionPerformed
        
        String listEntry;
        File inFile;
        FileReader fr;
        BufferedReader br;
        

        try{
               inFile = new File("ToDoList.txt");
               fr = new FileReader(inFile);
               br = new BufferedReader(fr);
              
               listEntry = br.readLine();
               while(listEntry != null){    
                 JOptionPane.showMessageDialog(null, "Your latest list entry is : " + listEntry);
                 listEntry = br.readLine();
               }
               JOptionPane.showMessageDialog(null, "There are no more entries");
        }catch(IOException e){
            System.out.print(e);
        }
        

    }//GEN-LAST:event_displayJBtnActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton displayJBtn;
    private javax.swing.JTextField inputJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton saveJBtn;
    // End of variables declaration//GEN-END:variables
}
