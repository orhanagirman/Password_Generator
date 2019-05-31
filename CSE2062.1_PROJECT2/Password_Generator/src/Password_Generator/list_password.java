/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Password_Generator;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author orhan
 */
public class list_password extends javax.swing.JFrame {

    /**
     * Creates new form list_password
     */
    public String[] strArray;
    DefaultTableModel dtm=new DefaultTableModel();
    public list_password(String[] strArray ) {
        initComponents();
        setTitle("List Of Password");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("password_image.png")));
        setResizable(false);
        this.strArray=strArray;
    }
      

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        edit_label = new javax.swing.JButton();
        delete_pass = new javax.swing.JButton();
        edit_text = new javax.swing.JTextField();
        save_table = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable);

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        edit_label.setText("Edit");
        edit_label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_labelActionPerformed(evt);
            }
        });

        delete_pass.setText("Delete");
        delete_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_passActionPerformed(evt);
            }
        });

        save_table.setText("Save");
        save_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_tableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(edit_text, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(edit_label, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(save_table, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edit_label, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(edit_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(delete_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(save_table, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTableAncestorAdded
        // TODO add your handling code here:
        
        dtm=(DefaultTableModel)getjTable().getModel();
        String[] strArray2 = null;
        for(int i=0;i<strArray.length;i++){
            if(!strArray[i].equals(null)){
                strArray2=strArray[i].split(" : ");
                Object[] add=strArray2;
                dtm.addRow(add);
           
            }
           
        }


       
        
    }//GEN-LAST:event_jTableAncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
        PasswordGenerator_Main frame=new PasswordGenerator_Main();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void edit_labelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_labelActionPerformed
        // TODO add your handling code here:
        dtm=(DefaultTableModel)getjTable().getModel();
        int selected_row=getjTable().getSelectedRow();
        
        if(selected_row==-1){
            if(getjTable().getRowCount()==0){
                JOptionPane.showMessageDialog(rootPane, "There is no password for editing.");
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "A row must be selected.");
            }   
        }
        else{
            if(!edit_text.getText().equals("")){
                dtm.setValueAt(edit_text.getText(),selected_row,0);
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "New name must be written");
            }
            
        }
        
    }//GEN-LAST:event_edit_labelActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here:
        dtm=(DefaultTableModel)getjTable().getModel();
        int selected_row=getjTable().getSelectedRow();
        
        edit_text.setText(dtm.getValueAt(selected_row, 0).toString());
    }//GEN-LAST:event_jTableMouseClicked

    private void delete_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_passActionPerformed
        // TODO add your handling code here:
        dtm=(DefaultTableModel)getjTable().getModel();
        int selected_row=getjTable().getSelectedRow();
        
        

        if(selected_row==-1){
            if(getjTable().getRowCount()==0){
                JOptionPane.showMessageDialog(rootPane, "There is no password for deleting.");
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "A row must be selected.");
            }   
        }
        else{
            dtm.removeRow(selected_row);
            edit_text.setText("");
            
        }
    }//GEN-LAST:event_delete_passActionPerformed

    private void save_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_tableActionPerformed
        // TODO add your handling code here:
        WriteFile writeFile = new WriteFile();
        writeFile.write(dtm,getjTable());
        JOptionPane.showMessageDialog(rootPane,"Saving is successfully");
    }//GEN-LAST:event_save_tableActionPerformed

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
            java.util.logging.Logger.getLogger(list_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(list_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(list_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(list_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               //new list_password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete_pass;
    private javax.swing.JButton edit_label;
    private javax.swing.JTextField edit_text;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JButton save_table;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jTable
     */
    public javax.swing.JTable getjTable() {
        return jTable;
    }

    /**
     * @param jTable the jTable to set
     */
    public void setjTable(javax.swing.JTable jTable) {
        this.jTable = jTable;
    }
}
