/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schoolmapping;

import java.awt.Image;
import java.sql.DriverManager;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author dinoalix
 */
public class FormMainMap extends javax.swing.JFrame {

    /**
     * Creates new form frmMainMap
     */
    public FormMainMap() {
        initComponents();
       
        setLocationRelativeTo(null);
        
        //setUndecorated(true);
        //this.txtMapHolder.setIcon(new ImageIcon(getClass().getResource("imgRepository/Admission.png")));
        loadData();
    }
    DBUtils _db = new DBUtils();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdmin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbPlace = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        txtMapHolder = new javax.swing.JLabel();
        btnSearchPlace = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Map");

        btnAdmin.setText("ADMIN");
        btnAdmin.setName("btnAdmin\n"); // NOI18N
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        jLabel1.setText("Search Place:");

        cmbPlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPlaceActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Main Map"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMapHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMapHolder, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnSearchPlace.setText("Search");
        btnSearchPlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPlaceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbPlace, 0, 153, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearchPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 330, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchPlace))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
            AdminLoginForm _admin = new AdminLoginForm();
            _admin.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void cmbPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPlaceActionPerformed
        // TODO add your handling code here:
        //loadMapPointer(this.cmbPlace.getSelectedItem().toString());
        //JOptionPane.showMessageDialog(null, this.cmbPlace.getSelectedItem().toString());
    }//GEN-LAST:event_cmbPlaceActionPerformed

    private void btnSearchPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPlaceActionPerformed
        // TODO add your handling code here:
        loadMapPointer(this.cmbPlace.getSelectedItem().toString());
    }//GEN-LAST:event_btnSearchPlaceActionPerformed

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
            java.util.logging.Logger.getLogger(FormMainMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMainMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMainMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMainMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMainMap().setVisible(true);
               
            }
        });
        
        
        
    }
    
    private void loadMapPointer(String placeName)
    {
      try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            _db.connection = DriverManager.getConnection(_db.url, _db.userName, _db.passWord);
            _db.query = "SELECT * from place WHERE place_name = ?;";
            _db.statement = _db.connection.prepareStatement(_db.query);
            _db.statement.setString(1, placeName);
            _db.resultSet = _db.statement.executeQuery();
            
            while(_db.resultSet.next())
            {
                String place_url = _db.resultSet.getString("place_url");
                //ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("imgRepository/" +  place_url)).getImage().getScaledInstance(720, 720, Image.SCALE_DEFAULT));
                //this.txtMapHolder.setIcon(imageIcon);
                this.txtMapHolder.setIcon(new ImageIcon(getClass().getResource("imgRepository/" +  place_url)));
            }
            //JOptionPane.showMessageDialog(null, place_url);
            
            _db.connection.close();
            System.out.println("Map selected loaded!");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
        }    
    }
    
    
    public void loadData()
    {
         try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            _db.connection = DriverManager.getConnection(_db.url, _db.userName, _db.passWord);
            _db.query = "SELECT * from place;";
            _db.statement = _db.connection.prepareStatement(_db.query);
            _db.resultSet = _db.statement.executeQuery();
            
            while(_db.resultSet.next())
            {
                String place = _db.resultSet.getString("place_name");
                cmbPlace.addItem(place);
            }
            _db.connection.close();
            System.out.println("Data Loaded!");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnSearchPlace;
    private javax.swing.JComboBox<String> cmbPlace;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtMapHolder;
    // End of variables declaration//GEN-END:variables
}
