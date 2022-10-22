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
public class PlacesForm extends javax.swing.JFrame {

    /**
     * Creates new form PlacesForm
     */
    public PlacesForm() {
        initComponents();
        setLocationRelativeTo(null);
        loadData();
        this.lblPlaceID.setVisible(false);
    }
    DBUtils _db = new DBUtils();
    private String loggedUser;

    public String getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(String loggedUser) {
        this.loggedUser = loggedUser;
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
        lblPlaceID = new javax.swing.JLabel();
        txtPlaceName = new javax.swing.JTextField();
        txtPlaceURL = new javax.swing.JTextField();
        btnAddPlace = new javax.swing.JButton();
        btnUpdatePlace = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPlaces = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Places Form");

        lblPlaceID.setText("lblPlaceID");

        txtPlaceName.setToolTipText("Place Name");

        txtPlaceURL.setToolTipText("Place URL");

        btnAddPlace.setText("Add Place");
        btnAddPlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPlaceActionPerformed(evt);
            }
        });

        btnUpdatePlace.setText("Update Place");
        btnUpdatePlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePlaceActionPerformed(evt);
            }
        });

        tblPlaces.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPlaces.setToolTipText("");
        tblPlaces.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPlacesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPlaces);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPlaceURL, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(txtPlaceName)
                    .addComponent(btnAddPlace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdatePlace, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblPlaceID)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPlaceID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPlaceName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPlaceURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdatePlace, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPlaceActionPerformed
        // TODO add your handling code here:
        try{
            _db.addPlace(this.txtPlaceName.getText(), this.txtPlaceURL.getText(), this.getLoggedUser());
            txtPlaceName.setText(null);
            txtPlaceURL.setText(null);
            JOptionPane.showMessageDialog(null,"Place Added!");
            loadData();
        }catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null,"Error: " +ex.getMessage());
        }
    }//GEN-LAST:event_btnAddPlaceActionPerformed

    private void tblPlacesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPlacesMouseClicked
        // TODO add your handling code here:
         try
        {
            int row =  this.tblPlaces.getSelectedRow();
             int column = this.tblPlaces.getSelectedColumn();
             int valueInCell = (int)this.tblPlaces.getValueAt(row, 0);
             this.txtPlaceName.setText((String) this.tblPlaces.getValueAt(row, 1));
             this.txtPlaceURL.setText((String) this.tblPlaces.getValueAt(row, 2));
             lblPlaceID.setText(String.valueOf(valueInCell));
           
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_tblPlacesMouseClicked

    private void btnUpdatePlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePlaceActionPerformed
        // TODO add your handling code here:
        
         try{
            _db.updatePlace(txtPlaceName.getText(), txtPlaceURL.getText(), this.getLoggedUser(), Integer.parseInt(this.lblPlaceID.getText()));
            txtPlaceName.setText(null);
            txtPlaceURL.setText(null);
            JOptionPane.showMessageDialog(null,"Place Updated!");
            loadData();
        }catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null,"Error: " +ex.getMessage());
        }
    }//GEN-LAST:event_btnUpdatePlaceActionPerformed

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
            java.util.logging.Logger.getLogger(PlacesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlacesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlacesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlacesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlacesForm().setVisible(true);
            }
        });
    }
    
    public void loadData()
    {
        try
        {
             Class.forName("com.mysql.cj.jdbc.Driver");  
             _db.connection = DriverManager.getConnection(_db.url, _db.userName, _db.passWord);
            DefaultTableModel model = new DefaultTableModel(new String[]{"Place ID","Place Name", "Place URL","Date Added","Date Updated"}, 0);
            _db.query = "SELECT * from place";
            _db.statement = _db.connection.prepareStatement(_db.query);
            _db.resultSet = _db.statement.executeQuery();
            while(_db.resultSet.next())
            {
                int place_id  = _db.resultSet.getInt("place_id");
                String place_name =_db.resultSet.getString("place_name");
                String place_url = _db.resultSet.getString("place_url");
                String dateCreated = _db.resultSet.getString("datecreated");
                String dateUpdated = _db.resultSet.getString("dateupdated");
                model.addRow(new Object[]{place_id, place_name, place_url, dateCreated, dateUpdated});
    
            }
            this.tblPlaces.setModel(model);
            _db.connection.close();
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPlace;
    private javax.swing.JButton btnUpdatePlace;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPlaceID;
    private javax.swing.JTable tblPlaces;
    private javax.swing.JTextField txtPlaceName;
    private javax.swing.JTextField txtPlaceURL;
    // End of variables declaration//GEN-END:variables
}
