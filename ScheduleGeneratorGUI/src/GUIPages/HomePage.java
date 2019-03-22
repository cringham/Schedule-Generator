
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUIPages;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @authors Chris Rignham, Daniel Zamojda, and Jose Berenguel-Araujo
 */
public class HomePage extends javax.swing.JFrame {
    private String path;
    int width = (Toolkit.getDefaultToolkit().getScreenSize().width / 2) - 269;
    int height = (Toolkit.getDefaultToolkit().getScreenSize().height / 2) - 263;
    /**
     * Creates new form NewJFrame
     */
    public HomePage() {
        initComponents();
        this.setTitle("Schedule Generator");
        this.setLocation(width, height);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        title = new javax.swing.JLabel();
        generateLabel = new javax.swing.JLabel();
        uploadLabel = new javax.swing.JLabel();
        uploadButton = new javax.swing.JButton();
        generateButton = new javax.swing.JButton();
        fileNameLabel = new javax.swing.JLabel();
        generateOldButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setText("CPSC Schedule Generator");

        generateLabel.setText("Generate New Schedule");

        uploadLabel.setText("Upload Existing Schedule");

        uploadButton.setText("Upload New");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        generateButton.setText("Generate New");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        fileNameLabel.setMaximumSize(new java.awt.Dimension(159, 16));
        fileNameLabel.setMinimumSize(new java.awt.Dimension(159, 16));
        fileNameLabel.setPreferredSize(new java.awt.Dimension(159, 16));
        fileNameLabel.setSize(new java.awt.Dimension(159, 16));

        generateOldButton.setText("Generate");
        generateOldButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        generateOldButton.setEnabled(false);
        generateOldButton.setMaximumSize(new java.awt.Dimension(119, 29));
        generateOldButton.setMinimumSize(new java.awt.Dimension(119, 29));
        generateOldButton.setPreferredSize(new java.awt.Dimension(119, 29));
        generateOldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateOldButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(generateLabel)
                    .addComponent(generateButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fileNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uploadButton)
                    .addComponent(uploadLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(generateOldButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateLabel)
                    .addComponent(uploadLabel))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uploadButton)
                    .addComponent(generateButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fileNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(generateOldButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );

        uploadButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        generateButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        fileNameLabel.getAccessibleContext().setAccessibleName("fileNameLabel");
        generateOldButton.getAccessibleContext().setAccessibleName("");
        generateOldButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        final File f = chooser.getSelectedFile();
        path = f.getAbsolutePath();
        String[] pathSplit = path.split("/");
        String file = pathSplit[pathSplit.length-1]; 
        if(path.compareToIgnoreCase("") != 0 && file.substring(file.length()-3).compareToIgnoreCase("csv") == 0){
            fileNameLabel.setText("Filename: "+file);
            generateOldButton.setEnabled(true);
        }else{
            generateOldButton.setEnabled(false);
            fileNameLabel.setText("Invalid File Type");
        }
    }//GEN-LAST:event_uploadButtonActionPerformed

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        // TODO add your handling code here:
        
        Map<String, String> env = System.getenv();
        System.out.print(env);
        //System.out.println("world");
        
        String s = "";
     
        try{
           String python = ""; 
           if (env.get("USER").equals("cranium")){
               python = "/Users/cranium/anaconda3/bin/python";
           }
           else{
               python = "python";
           }
           Process p = Runtime.getRuntime().exec(python + " env.py");
           BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
           
           String environment = new String(in.readLine());
           System.out.println("value is : "+environment);
           
           
           ProcessBuilder pb = new ProcessBuilder(python, "scraper.py");
           //ProcessBuilder pb = new ProcessBuilder("pythonscraper.py");

           Process ps = pb.start();
           BufferedReader stdError = new BufferedReader(new 
           InputStreamReader(ps.getErrorStream()));
            
            // read any errors from the attempted command
           System.out.println("Here is the standard error of the command (if any):\n");
           while ((s = stdError.readLine()) != null) {
               System.out.println(s);
           }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_generateButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void generateOldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateOldButtonActionPerformed
        // TODO add your handling code here:
        SchedulePage x = new SchedulePage(path);
        x.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_generateOldButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fileNameLabel;
    private javax.swing.JButton generateButton;
    private javax.swing.JLabel generateLabel;
    private javax.swing.JButton generateOldButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel title;
    private javax.swing.JButton uploadButton;
    private javax.swing.JLabel uploadLabel;
    // End of variables declaration//GEN-END:variables
}
