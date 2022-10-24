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
public class MapInstruction extends javax.swing.JFrame {

    /**
     * Creates new form MapInstruction
     */
    public MapInstruction() {
        initComponents();
        setLocationRelativeTo(null);
        loadPlaceID();
        loadData();
        this.lblGuideID.setVisible(false);
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

        btnClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInstructions = new javax.swing.JTable();
        cmbPlaceID = new javax.swing.JComboBox<>();
        txtInstructionNo = new javax.swing.JTextField();
        txtInstruction = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAddInstruction = new javax.swing.JButton();
        btnEditInstruction = new javax.swing.JButton();
        lblGuideID = new javax.swing.JLabel();
        btnCloseForm = new javax.swing.JButton();

        btnClose.setText("CLOSE");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Place Instruction");

        tblInstructions.setModel(new javax.swing.table.DefaultTableModel(
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
        tblInstructions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInstructionsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblInstructions);

        jLabel1.setText("Place ID");

        jLabel2.setText("Instruction No.");

        jLabel3.setText("Instruction(s)");

        btnAddInstruction.setText("Add Instruction");
        btnAddInstruction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddInstructionActionPerformed(evt);
            }
        });

        btnEditInstruction.setText("Edit Instruction");
        btnEditInstruction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditInstructionActionPerformed(evt);
            }
        });

        lblGuideID.setText("Guide ID");

        btnCloseForm.setText("CLOSE");
        btnCloseForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbPlaceID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInstructionNo)
                            .addComponent(txtInstruction)
                            .addComponent(btnAddInstruction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditInstruction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(46, 46, 46)
                                        .addComponent(lblGuideID)))
                                .addGap(0, 68, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCloseForm)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCloseForm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblGuideID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbPlaceID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInstructionNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInstruction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddInstruction, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditInstruction, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnAddInstructionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddInstructionActionPerformed
        // TODO add your handling code here:
        try{
            String item = (String)this.cmbPlaceID.getSelectedItem();
            int selectedItem = Integer.parseInt(item);
            _db.addGuide(selectedItem, Integer.parseInt(this.txtInstructionNo.getText()), this.txtInstruction.getText(), this.getLoggedUser());
           this.txtInstruction.setText(null);
           this.txtInstructionNo.setText(null);
           this.loadData();
           this.loadPlaceID();
           JOptionPane.showMessageDialog(null,"Instruction added!");
           _db.connection.close();
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_btnAddInstructionActionPerformed

    private void tblInstructionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInstructionsMouseClicked
        // TODO add your handling code here:
         try
        {
            int row =  this.tblInstructions.getSelectedRow();
             int column = this.tblInstructions.getSelectedColumn();
             int guideIDValue = (int)this.tblInstructions.getValueAt(row, 0);
             int instructionNoValue = (int)this.tblInstructions.getValueAt(row, 1);
             this.txtInstruction.setText((String) this.tblInstructions.getValueAt(row, 4));
             this.txtInstructionNo.setText(String.valueOf(instructionNoValue));
              this.lblGuideID.setText(String.valueOf(guideIDValue));
           
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_tblInstructionsMouseClicked

    private void btnEditInstructionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditInstructionActionPerformed
        // TODO add your handling code here:
         try{
            String item = (String)this.cmbPlaceID.getSelectedItem();
            int selectedItem = Integer.parseInt(item);
           _db.updateGuide(selectedItem, Integer.parseInt(this.txtInstructionNo.getText()), this.txtInstruction.getText(), this.getLoggedUser(), Integer.parseInt(this.lblGuideID.getText()));
           this.txtInstruction.setText(null);
           this.txtInstructionNo.setText(null);
           this.loadData();
           this.loadPlaceID();
           JOptionPane.showMessageDialog(null,"Instruction updated!");
           _db.connection.close();
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        
    }//GEN-LAST:event_btnEditInstructionActionPerformed

    private void btnCloseFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseFormActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseFormActionPerformed

    private void loadPlaceID()
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
                String placeID = _db.resultSet.getString("place_id");
                this.cmbPlaceID.addItem(placeID);
            }
            _db.connection.close();
            System.out.println("Data Loaded!");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void loadData()
    {
        try
        {
             Class.forName("com.mysql.cj.jdbc.Driver");  
             _db.connection = DriverManager.getConnection(_db.url, _db.userName, _db.passWord);
            DefaultTableModel model = new DefaultTableModel(new String[]{"Guide ID","Place ID", "Place Name","Guide No.","Instruction","Date Created","Date Updated"}, 0);
            _db.query = "SELECT guide.guide_id, place.place_id, place.place_name, guide.instruction_no, guide.instruction, guide.datecreated, guide.dateupdated FROM guide INNER JOIN place on guide.place_id = place.place_id;";
            _db.statement = _db.connection.prepareStatement(_db.query);
            _db.resultSet = _db.statement.executeQuery();
            while(_db.resultSet.next())
            {
                int guide_id = _db.resultSet.getInt("guide_id");
                int place_id  = _db.resultSet.getInt("place_id");
                String place_name = _db.resultSet.getString("place_name");
                int instruction_no = _db.resultSet.getInt("instruction_no");
                String instruction = _db.resultSet.getString("instruction");
                String dateCreated = _db.resultSet.getString("datecreated");
                String dateUpdated = _db.resultSet.getString("dateupdated");
                
                
                model.addRow(new Object[]{guide_id, place_id, place_name, instruction_no, instruction, dateCreated, dateUpdated});
    
            }
            this.tblInstructions.setModel(model);
            _db.connection.close();
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
    }
    
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
            java.util.logging.Logger.getLogger(MapInstruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MapInstruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MapInstruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MapInstruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MapInstruction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddInstruction;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnCloseForm;
    private javax.swing.JButton btnEditInstruction;
    private javax.swing.JComboBox<String> cmbPlaceID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGuideID;
    private javax.swing.JTable tblInstructions;
    private javax.swing.JTextField txtInstruction;
    private javax.swing.JTextField txtInstructionNo;
    // End of variables declaration//GEN-END:variables
}
