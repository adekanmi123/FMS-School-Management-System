/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superadmin;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import selects.QueryClassDetails;

/**
 *
 * @author franq
 */
public class EditTransport extends javax.swing.JFrame {

    /**
     * Creates new form NewTransport
     */
    
    private int selected,selelectorselected;
    private int totalnumclasses;
    private static String termname;
    private static int termid;
    private static String year;
    private ArrayList<String> details;
    private static Action enterAction;
    private static int selectedclassid;
    private static int transportid;
    private static boolean saved;
    private ArrayList<String> transportinfo;
   
    
    public EditTransport() {
        initComponents();
        selected = 1;
        saved = false;
        year = selects.QueryMainDetails.getCurrentYear();
        
        //get names of all classes
         QueryClassDetails.getClassNames();
         cmbclassname1.setModel(new DefaultComboBoxModel(QueryClassDetails.listofnames.toArray(new String[QueryClassDetails.listofnames.size()])));
         //totalnumclasses = QueryClassDetails.listofnames.size();
         cmbclassnameselector.setModel(new DefaultComboBoxModel(QueryClassDetails.listofnames.toArray(new String[QueryClassDetails.listofnames.size()])));
         
         
         //some action listeners
            enterAction = new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
               loadtransport();
                 }
            };
            
            cmbclassnameselector.addActionListener(enterAction);

       
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
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfpickpointname = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btncancel = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        cmbclassname1 = new javax.swing.JComboBox();
        btncontinue = new javax.swing.JButton();
        lblconfirm = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jrterm1 = new javax.swing.JRadioButton();
        jrterm2 = new javax.swing.JRadioButton();
        jrterm3 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        cmbclassnameselector = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        cmbtransport = new javax.swing.JComboBox();
        btncancel1 = new javax.swing.JButton();
        btnok = new javax.swing.JButton();
        jtffee = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Transport Details");
        setIconImage(selects.QueryMainDetails.setIcon());
        setResizable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 240));
        jLabel6.setText("Enter The Tranport Fee Details");

        jLabel8.setForeground(new java.awt.Color(0, 0, 240));
        jLabel8.setText("Pick Point Name");

        tfpickpointname.setEnabled(false);
        tfpickpointname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpickpointnameActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(0, 0, 240));
        jLabel9.setText("Class");

        jLabel10.setForeground(new java.awt.Color(0, 0, 240));
        jLabel10.setText("Fee");

        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        cmbclassname1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbclassname1.setEnabled(false);
        cmbclassname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbclassname1ActionPerformed(evt);
            }
        });

        btncontinue.setText("Continue");
        btncontinue.setEnabled(false);
        btncontinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinueActionPerformed(evt);
            }
        });

        lblconfirm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblconfirm.setForeground(new java.awt.Color(153, 0, 0));

        jLabel11.setForeground(new java.awt.Color(0, 0, 240));
        jLabel11.setText("Term");

        jrterm1.setText("Term 1");
        jrterm1.setEnabled(false);
        jrterm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrterm1ActionPerformed(evt);
            }
        });

        jrterm2.setText("Term 2");
        jrterm2.setEnabled(false);
        jrterm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrterm2ActionPerformed(evt);
            }
        });

        jrterm3.setText("Term 3");
        jrterm3.setEnabled(false);
        jrterm3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrterm3ActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(0, 0, 240));
        jLabel12.setText("Class Name");

        jButton6.setText("Edit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        cmbclassnameselector.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbclassnameselector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbclassnameselectorActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(0, 0, 240));
        jLabel13.setText("Residence Details");

        cmbtransport.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbtransport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbtransportActionPerformed(evt);
            }
        });

        btncancel1.setText("Cancel");
        btncancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btncancel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(38, 38, 38)
                        .addComponent(cmbclassnameselector, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel13)
                        .addGap(53, 53, 53)
                        .addComponent(cmbtransport, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cmbclassnameselector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(cmbtransport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(btncancel1))
                .addContainerGap())
        );

        btnok.setText("Ok");
        btnok.setEnabled(false);
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        jtffee.setEnabled(false);
        jtffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtffeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(531, 531, 531)
                                .addComponent(lblconfirm))
                            .addComponent(btncancel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel9)))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfpickpointname)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbclassname1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(btnok)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnsave)
                                        .addGap(159, 159, 159)
                                        .addComponent(btncontinue))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(51, 51, 51)
                                        .addComponent(jtffee, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrterm1)
                                .addGap(206, 206, 206)
                                .addComponent(jrterm2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrterm3)))))
                .addGap(79, 79, 79))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lblconfirm)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tfpickpointname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jrterm1)
                            .addComponent(jrterm2)
                            .addComponent(jrterm3))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(cmbclassname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jtffee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancel)
                    .addComponent(btncontinue)
                    .addComponent(btnsave)
                    .addComponent(btnok))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
         this.dispose();
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        String pickpointname,classreq,fee;
        int staffid;
        pickpointname = tfpickpointname.getText().toUpperCase();
        classreq = cmbclassname1.getSelectedItem().toString();
        fee = jtffee.getText();
        
        
       if("".equals(pickpointname))
       {
           JOptionPane.showMessageDialog(null,
                        "Please Enter Pickpoint Name to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
       }
       //enter the other check details here
       else if(cmbclassname1.getSelectedIndex()==0)
       {
           JOptionPane.showMessageDialog(null,
                        "Please Select a Class Name to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
       }
        else if("".equals(jtffee.getText()))
        {
            JOptionPane.showMessageDialog(null,
                "Please Enter Fee Ammount to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
       else
       {
           
           int staffidID = QueryClassDetails.listofnames.indexOf(classreq);
           staffid = Integer.parseInt(QueryClassDetails.listofids.get(staffidID).toString());
            try {
                termid = selects.QueryTermDetails.getTermID(termname, year);
                
                //sqlinserts.NewTransport.createNewTransport(termid,staffid,pickpointname.toUpperCase(),Double.parseDouble(fee));
                sqlupdates.TransportDetails.updatePickPoint(termid, staffid, pickpointname.toUpperCase(), Double.parseDouble(fee), transportid);
                lblconfirm.setText("Saved");
                btncontinue.setEnabled(true);
                btnok.setEnabled(true);
                saved = true;
               
            } catch (SQLException ex) {
                Logger.getLogger(EditTransport.class.getName()).log(Level.SEVERE, null, ex);
                 if(ex.getErrorCode() == 1062)
                {
                JOptionPane.showMessageDialog(null, "The Transport Details You are Trying to Create Have Already Been Saved Before. \n" +
                        "Press Ok to continue", "Warning "+ex.getErrorCode(), JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                JOptionPane.showMessageDialog(null, "Some unexpected error occured \n" +
                        "Please contact the system administrator", "Error ", JOptionPane.ERROR_MESSAGE);
                 this.hide();
                }
               
            }
       }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void cmbclassname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbclassname1ActionPerformed
        // TODO add your handling code here:
        selected = cmbclassname1.getSelectedIndex();
    }//GEN-LAST:event_cmbclassname1ActionPerformed

    private void btncontinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinueActionPerformed
        // TODO add your handling code here:
        if(saved==true)
        {
            disableContent();
            cmbclassnameselector.setSelectedIndex(0);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please Save Details to Continue \n" +
                        "", "Warning ", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btncontinueActionPerformed

    private void jrterm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrterm1ActionPerformed
        // TODO add your handling code here:
        if(jrterm1.isSelected() == true)
        {
            jrterm2.setSelected(false);
            jrterm3.setSelected(false);
            termname = "FIRST TERM";
        }
    }//GEN-LAST:event_jrterm1ActionPerformed

    private void jrterm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrterm2ActionPerformed
        // TODO add your handling code here:
        if(jrterm2.isSelected() == true)
        {
            jrterm1.setSelected(false);
            jrterm3.setSelected(false);
            termname = "SECOND TERM";
        }
    }//GEN-LAST:event_jrterm2ActionPerformed

    private void jrterm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrterm3ActionPerformed
        // TODO add your handling code here:
        if(jrterm3.isSelected() == true)
        {
            jrterm2.setSelected(false);
            jrterm1.setSelected(false);
            termname = "THIRD TERM";
        }
    }//GEN-LAST:event_jrterm3ActionPerformed

    private void tfpickpointnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpickpointnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfpickpointnameActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(cmbtransport.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(null,
                        "Please Select Pick Point to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
             btncancel.setEnabled(false);
             int selc = cmbtransport.getSelectedIndex();
             transportid = Integer.parseInt(selects.QueryTransportDetails.listofids.get(selc).toString());
             
             //load info
             transportinfo = selects.QueryTransportDetails.getTranportInfo(transportid);
             String pickname,termidstr,fee,classidstr;
             pickname = transportinfo.get(0);
             termidstr = transportinfo.get(1);
             fee = transportinfo.get(2);
             classidstr = transportinfo.get(3);
             
             //intialize the form with content from the database
             String termnm = selects.QueryTermDetails.getTermName(Integer.parseInt(termidstr));
            if("FIRST TERM".equals(termnm))
            jrterm1.setSelected(true);
            else if("SECOND TERM".equals(termnm))
            jrterm2.setSelected(true);
            else if("THIRD TERM".equals(termnm))
            jrterm3.setSelected(true);
            
            tfpickpointname.setText(pickname);
            jtffee.setText(fee);
            
            //select class
            int clsid = Integer.parseInt(classidstr);
            int selid = QueryClassDetails.listofids.indexOf(clsid);
            cmbclassname1.setSelectedIndex(selid);
            
            
        }
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void cmbclassnameselectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbclassnameselectorActionPerformed
        // TODO add your handling code here:
       loadtransport();
    }//GEN-LAST:event_cmbclassnameselectorActionPerformed

    private void loadtransport()
    {
         selelectorselected = cmbclassnameselector.getSelectedIndex();
        //get class id from this
        selectedclassid =  Integer.parseInt(selects.QueryClassDetails.listofids.get(selelectorselected).toString());
        details = selects.QueryTransportDetails.getTranportDetails(selectedclassid);
        cmbtransport.setModel(new DefaultComboBoxModel(details.toArray(new String[details.size()])));
    }
    
    private void cmbtransportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbtransportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbtransportActionPerformed

    private void btncancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancel1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btncancel1ActionPerformed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        if(saved==true)
        {
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please Save Details to Continue \n" +
                        "", "Warning ", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnokActionPerformed

    private void jtffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtffeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtffeeActionPerformed

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
            java.util.logging.Logger.getLogger(EditTransport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditTransport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditTransport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditTransport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditTransport().setVisible(true);
            }
        });
    }
    private void enableContent()
    {
        tfpickpointname.setEnabled(true);
        jrterm1.setEnabled(true);
        jrterm2.setEnabled(true);
        jrterm3.setEnabled(true);
        cmbclassname1.setEnabled(true);
        jtffee.setEnabled(true);
        btncancel.setEnabled(true);
        btnsave.setEnabled(true);
        
    }
    
    private void disableContent()
    {
        tfpickpointname.setEnabled(false);
        jrterm1.setEnabled(false);
        jrterm2.setEnabled(false);
        jrterm3.setEnabled(false);
        cmbclassname1.setEnabled(false);
        jtffee.setEnabled(false);
        btncancel.setEnabled(false);
        btnsave.setEnabled(false);
        btnok.setEnabled(false);
        btncontinue.setEnabled(false);
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btncancel1;
    private javax.swing.JButton btncontinue;
    private javax.swing.JButton btnok;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox cmbclassname1;
    private javax.swing.JComboBox cmbclassnameselector;
    private javax.swing.JComboBox cmbtransport;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jrterm1;
    private javax.swing.JRadioButton jrterm2;
    private javax.swing.JRadioButton jrterm3;
    private java.awt.TextField jtffee;
    private javax.swing.JLabel lblconfirm;
    private javax.swing.JFormattedTextField tfpickpointname;
    // End of variables declaration//GEN-END:variables
}