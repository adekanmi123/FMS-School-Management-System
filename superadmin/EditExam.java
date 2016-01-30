/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superadmin;

import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import selects.QueryExamDetails;
import selects.QueryTermDetails;

/**
 *
 * @author franq
 */
public class EditExam extends javax.swing.JFrame {

    /**
     * Creates new form NewExam
     */
    private Action finishEnterAction;
    private static int examid;
    public EditExam() {
            ArrayList<String> exams = QueryExamDetails.getExamDetails();
            initComponents();
            
            cmbexams.setModel(new DefaultComboBoxModel(exams.toArray(new String[exams.size()])));
            
            finishEnterAction = new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
                examid = Integer.parseInt(QueryExamDetails.ids.get(QueryExamDetails.names.indexOf(cmbexams.getSelectedItem().toString())).toString());
                
                //enable the other elements of the table
                
                cmbexamtype.setEnabled(true);
                tfexamname.setEnabled(true);
                tfyear.setEnabled(true);
                cmbterm.setEnabled(true);
                tfstartdate.setEnabled(true);
                btncancel.setEnabled(true);
                btnsave.setEnabled(true);
                try {
                    ArrayList<String> details = selects.QueryExamDetails.getExamdetails(examid);
                    tfexamname.setText(details.get(0));
                    cmbexamtype.setSelectedItem(details.get(1));
                    tfstartdate.setText(details.get(2));
                    int termid = Integer.parseInt(details.get(3));
                    cmbterm.setSelectedItem(QueryTermDetails.getTermName(termid));
                    tfyear.setText(details.get(4));
                    
                } catch (SQLException ex) {
                    Logger.getLogger(EditExam.class.getName()).log(Level.SEVERE, null, ex);
                     JOptionPane.showMessageDialog(null,
                "Some unexpected error occured\n"+
                "Was not able to load class Exam details\n"+
                "Please contact the systems administrator for assistance","Error Message",JOptionPane.ERROR_MESSAGE);
                }
                
                
                        
            }
        };
            
            cmbexams.addActionListener(finishEnterAction);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfexamname = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbexamtype = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbterm = new javax.swing.JComboBox();
        btnsave = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        tfstartdate = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        tfyear = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        cmbexams = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Exam");
        setIconImage(selects.QueryMainDetails.setIcon());
        setResizable(false);

        jLabel8.setForeground(new java.awt.Color(0, 0, 240));
        jLabel8.setText("Exam Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 240));
        jLabel6.setText("Edit Exam Details");

        tfexamname.setEnabled(false);

        jLabel9.setForeground(new java.awt.Color(0, 0, 240));
        jLabel9.setText("Exam Type");

        cmbexamtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT", "OPENER EXAM", "MIDTERM EXAM", "END TERM EXAM", "OTHER EXAM" }));
        cmbexamtype.setEnabled(false);

        jLabel10.setForeground(new java.awt.Color(0, 0, 240));
        jLabel10.setText("Start Date");

        jLabel11.setForeground(new java.awt.Color(0, 0, 240));
        jLabel11.setText("Term");

        cmbterm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT", "FIRST TERM", "SECOND TERM", "THIRD TERM" }));
        cmbterm.setEnabled(false);

        btnsave.setText("Save");
        btnsave.setEnabled(false);
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btncancel.setText("Cancel");
        btncancel.setEnabled(false);
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        tfstartdate.setEnabled(false);

        jLabel12.setForeground(new java.awt.Color(0, 0, 240));
        jLabel12.setText("Year");

        tfyear.setEnabled(false);

        jLabel13.setForeground(new java.awt.Color(0, 0, 240));
        jLabel13.setText("Selet Exam");

        cmbexams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbexamsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(263, 263, 263))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfyear, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfexamname, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfstartdate, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(103, 103, 103)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(70, 70, 70)
                                        .addComponent(cmbexamtype, 0, 193, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(99, 99, 99)
                                        .addComponent(cmbterm, 0, 193, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbexams, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btncancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsave)
                        .addGap(36, 36, 36)))
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(cmbexams, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfexamname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(cmbexamtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tfyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cmbterm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfstartdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancel)
                    .addComponent(btnsave))
                .addGap(48, 48, 48))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        String examname,examtype,startdate,year,termname;
        int term;
       
        
        
        
        
        term = cmbterm.getSelectedIndex();
        
        
        if("".equals(tfexamname.getText().toUpperCase()))
        {
            JOptionPane.showMessageDialog(null,
                        "Please Enter Exam Name to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if("SELECT".equals(cmbexamtype.getSelectedItem().toString().toUpperCase()))
        {
            JOptionPane.showMessageDialog(null,
                        "Please Select The Exam Type to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if("".equals(tfyear.getText()))
        {
            JOptionPane.showMessageDialog(null,
                        "Please Enter Year to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if(term == 0)
        {
            JOptionPane.showMessageDialog(null,
                        "Please Select Term Name to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if("".equals(tfstartdate.getText()))
        {
            JOptionPane.showMessageDialog(null,
                        "Please Enter Start Date to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        
        else
        {
            startdate = tfstartdate.getText();
            examname = tfexamname.getText().toUpperCase();
            examtype = cmbexamtype.getSelectedItem().toString().toUpperCase();
            year = tfyear.getText();
            termname = cmbterm.getSelectedItem().toString().toUpperCase();
            int termid = selects.QueryTermDetails.getTermID(termname, year);
            try {
                
                 sqlupdates.ExamInfo.updateExam(examname, examtype, startdate, termid, year, examid);
                 JOptionPane.showMessageDialog(null, "Exam Details have been Updated \n" +
                        "Press Ok to Continue", "Success", JOptionPane.INFORMATION_MESSAGE); 
            } catch (SQLException ex) {
                Logger.getLogger(EditExam.class.getName()).log(Level.SEVERE, null, ex);
                 if(ex.getErrorCode() == 1062)
                {
                JOptionPane.showMessageDialog(null, "The Exam Details You are Trying to Create Have Already Been Updated Before. \n" +
                        "Press Ok to continue", "Warning "+ex.getErrorCode(), JOptionPane.WARNING_MESSAGE);
                this.hide();
                }
                 if(ex.getErrorCode() == 1265)
                {
                JOptionPane.showMessageDialog(null, "The Year is too Long. Please Correct it to Continue \n" +
                        "Press Ok to continue", "Warning "+ex.getErrorCode(), JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                JOptionPane.showMessageDialog(null, "Some unexpected error occured \n Term Details not Updated" +
                        "Please contact the system administrator", "Error " + ex.getErrorCode(), JOptionPane.ERROR_MESSAGE);
                this.hide();
                }
                
            }
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncancelActionPerformed

    private void cmbexamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbexamsActionPerformed
        // TODO add your handling code here:
        try {
            
            cmbexams.addActionListener(finishEnterAction);
        } catch (Exception ex) {
            Logger.getLogger(EditExam.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,
                "Some unexpected error occured\n"+
                "Was not able to load Exam Details\n"+
                "Please Contact System Admin for Assistance","Error Message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmbexamsActionPerformed

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
            java.util.logging.Logger.getLogger(EditExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditExam().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnsave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbexams;
    private javax.swing.JComboBox cmbexamtype;
    private javax.swing.JComboBox cmbterm;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField tfexamname;
    private javax.swing.JFormattedTextField tfstartdate;
    private javax.swing.JFormattedTextField tfyear;
    // End of variables declaration//GEN-END:variables
}