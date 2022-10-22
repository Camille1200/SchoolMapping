/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schoolmapping;

import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dinoalix
 */
public class UserForm extends javax.swing.JFrame {

    /**
     * Creates new form UserForm
     */
    private String loggedUser;

    public String getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(String loggedUser) {
        this.loggedUser = loggedUser;
    }
    public UserForm() {
        initComponents();
        setLocationRelativeTo(null);
        loadData();
        this.lblAdminID.setVisible(false);
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

        jPanel1 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        txtAdminName = new javax.swing.JTextField();
        txtAdminHandle = new javax.swing.JTextField();
        txtAdminPassword = new javax.swing.JTextField();
        txtAdminConfirmPassword = new javax.swing.JTextField();
        btnAddAdmin = new javax.swing.JButton();
        btnUpdateAdmin = new javax.swing.JButton();
        lblAdminID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsers);

        txtAdminName.setToolTipText("Admin Name");

        txtAdminHandle.setToolTipText("Admin Handle");

        txtAdminPassword.setToolTipText("Admin Handle");

        txtAdminConfirmPassword.setToolTipText("Admin Handle");

        btnAddAdmin.setText("Add Admin");
        btnAddAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAdminActionPerformed(evt);
            }
        });

        btnUpdateAdmin.setText("Update Admin");
        btnUpdateAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAdminActionPerformed(evt);
            }
        });

        lblAdminID.setText("adminID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAdminName)
                                    .addComponent(txtAdminHandle)
                                    .addComponent(txtAdminPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAdminConfirmPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAddAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUpdateAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(lblAdminID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnClose)
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblAdminID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAdminHandle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAdminConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdateAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnAddAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAdminActionPerformed
        // TODO add your handling code here:
        try
        {
            if(this.txtAdminPassword.getText().equals(this.txtAdminConfirmPassword.getText()) && !this.txtAdminConfirmPassword.getText().equals(""))
            {
               _db.addAdmin(this.txtAdminName.getText(), this.txtAdminHandle.getText(), this.txtAdminPassword.getText(),this.getLoggedUser());  
               loadData();
               this.txtAdminName.setText(null);
               this.txtAdminConfirmPassword.setText(null);
               this.txtAdminHandle.setText(null);
               this.txtAdminPassword.setText(null);
               JOptionPane.showMessageDialog(null,"Success: Admin Added!");
            }else{
                JOptionPane.showMessageDialog(null,"Error: Password does not match");
            }

        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Error: "+ex.getMessage());
        }
    }//GEN-LAST:event_btnAddAdminActionPerformed

    private void btnUpdateAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAdminActionPerformed
        // TODO add your handling code here:
        try
        {
            if(this.txtAdminPassword.getText().equals(this.txtAdminConfirmPassword.getText()))
            {
               //_db.addAdmin(this.txtAdminName.getText(), this.txtAdminHandle.getText(), this.txtAdminPassword.getText(),this.getLoggedUser());  
               _db.updateAdmin(this.txtAdminPassword.getText(), this.txtAdminName.getText(), this.txtAdminHandle.getText(), this.getLoggedUser(), Integer.parseInt(lblAdminID.getText()));
               this.txtAdminName.setText(null);
               this.txtAdminConfirmPassword.setText(null);
               this.txtAdminHandle.setText(null);
               this.txtAdminPassword.setText(null);
               loadData();
               JOptionPane.showMessageDialog(null,"Success: Admin Updated!");
            }else{
                JOptionPane.showMessageDialog(null,"Error: Password does not match");
            }

        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Error: "+ex.getMessage());
        }
    }//GEN-LAST:event_btnUpdateAdminActionPerformed

    private void tblUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsersMouseClicked
        // TODO add your handling code here:
        try
        {
            int row =  this.tblUsers.getSelectedRow();
             int column = this.tblUsers.getSelectedColumn();
             int valueInCell = (int)this.tblUsers.getValueAt(row, 0);
             this.txtAdminName.setText((String) this.tblUsers.getValueAt(row, 1));
             this.txtAdminHandle.setText((String) this.tblUsers.getValueAt(row, 2));
             lblAdminID.setText(String.valueOf(valueInCell));
           
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_tblUsersMouseClicked

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
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserForm().setVisible(true);
            }
        });
    }
    
    public void loadData()
    {
        try
        {
             Class.forName("com.mysql.cj.jdbc.Driver");  
             _db.connection = DriverManager.getConnection(_db.url, _db.userName, _db.passWord);
            DefaultTableModel model = new DefaultTableModel(new String[]{"Admin ID","Admin Name", "Admin Handle","Date Added","Date Updated"}, 0);
            _db.query = "SELECT * from superadmin";
            _db.statement = _db.connection.prepareStatement(_db.query);
            _db.resultSet = _db.statement.executeQuery();
            while(_db.resultSet.next())
            {
                int admin_id  = _db.resultSet.getInt("admin_id");
                String admin_name =_db.resultSet.getString("admin_name");
                String admin_handle = _db.resultSet.getString("admin_handle");
                String dateCreated = _db.resultSet.getString("datecreated");
                String dateUpdated = _db.resultSet.getString("dateupdated");
                model.addRow(new Object[]{admin_id, admin_name, admin_handle, dateCreated, dateUpdated});
    
            }
            tblUsers.setModel(model);
            _db.connection.close();
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAdmin;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnUpdateAdmin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdminID;
    private javax.swing.JTable tblUsers;
    private javax.swing.JTextField txtAdminConfirmPassword;
    private javax.swing.JTextField txtAdminHandle;
    private javax.swing.JTextField txtAdminName;
    private javax.swing.JTextField txtAdminPassword;
    // End of variables declaration//GEN-END:variables
}
