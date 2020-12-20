
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jörn
 */
public class HelperManager extends javax.swing.JFrame {

    DefaultTableModel model;
    private int helperID;
    private String prename, surname, gender;

    static HelperManager myHelperManager = new HelperManager();
    static ArrayList<HelperManager> myHelpers = new ArrayList<>();
    
    
    public HelperManager() {
        initComponents();
        model = (DefaultTableModel) jTable.getModel();
        hinzufugen();
    }
    public HelperManager(int id, String prename, String surname, String gender) {
        this.helperID = id;
        this.prename = prename;
        this.surname = surname;
        this.gender = gender;
    }
    
    public int getHelperID() {
        return helperID;
    }

    public void setHelperID(int helperID) {
        this.helperID = helperID;
    }

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jWarningHelper = new javax.swing.JLabel();
        cbFilter = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jWarning1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("create a new helper");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createHelper(evt);
            }
        });

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteHelper(evt);
            }
        });

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jWarningHelper.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jWarningHelper.setForeground(new java.awt.Color(255, 51, 51));

        cbFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "all", "male", "female", "divers" }));
        cbFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showFilter(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HelperID", "Surname", "Prename", "gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jTable.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTableInputMethodTextChanged(evt);
            }
        });
        jScrollPane4.setViewportView(jTable);

        jWarning1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jWarningHelper, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbFilter, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jWarning1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(jWarning1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(26, 26, 26)
                        .addComponent(cbFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(287, 287, 287)
                        .addComponent(jButton5)
                        .addGap(185, 185, 185)
                        .addComponent(jWarningHelper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      jWarningHelper.setText("");
       if (jTable.getModel().getRowCount()==0) {
            jWarning1.setText("Bruder legt doch erstmal ein Helper an?!");
        }else 
           
        {
        try {
            int selectedIndex = jTable.getSelectedRow();
            if (selectedIndex != -1) {
            this.setVisible(false);
            UpdateHelper createwindow = new UpdateHelper();
            createwindow.setVisible(true);
            UpdateHelper.setHelper(selectedIndex);
            }else{
            jWarningHelper.setText("Erst auswählen dann updaten!");
            }
        } catch (Exception e) {
            jWarningHelper.setText("Bruder legt doch erstmal ein Helper an?!");
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void deleteHelper(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteHelper
        jWarningHelper.setText("");
       
        if (jTable.getModel().getRowCount()==0) {
            jWarning1.setText("Bruder legt doch erstmal ein Helper an?!");
        }else
        {
        try {
            int selectedIndex = jTable.getSelectedRow();
            if (selectedIndex != -1) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Sicher das du löschen willst?","Warning",dialogButton);
                if (dialogResult==0) {
                    model.removeRow(selectedIndex);
                    myHelpers.remove(selectedIndex);
                }
            }else{
            jWarning1.setText("Erst auswählen dann löschen!");
            }
        } catch (Exception e) {
            jWarning1.setText("Helper anlegen bevor löschen?!");
        }
        }
        
        
    }//GEN-LAST:event_deleteHelper

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        BasicData home = new BasicData();
        home.setVisible(true);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void createHelper(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createHelper
        this.setVisible(false);
        CreateHelper createwindow = new CreateHelper();
        createwindow.setVisible(true);
    }//GEN-LAST:event_createHelper

    private void showFilter(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showFilter
        String select = cbFilter.getSelectedItem().toString();
        try {
            model.setRowCount(0);
           
            for (HelperManager i : myHelpers) {
        switch(select)
        {
            case "male":
            if (i.getGender()=="male") {
            model.insertRow(model.getRowCount(), new Object[]{i.getHelperID(),i.getPrename(),i.getSurname(),i.getGender()});
            }
            break;
            case "female":
            if (i.getGender()=="female") {
            model.insertRow(model.getRowCount(), new Object[]{i.getHelperID(),i.getPrename(),i.getSurname(),i.getGender()});
            }
            break;
            case "divers":
            if (i.getGender()=="divers") {
            model.insertRow(model.getRowCount(), new Object[]{i.getHelperID(),i.getPrename(),i.getSurname(),i.getGender()});
            }
            break;
            case "all":
            model.insertRow(model.getRowCount(), new Object[]{i.getHelperID(),i.getPrename(),i.getSurname(),i.getGender()});
            break;
        } 
    }
    
    } catch (Exception e) {
    }
    }//GEN-LAST:event_showFilter

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        if(evt.getClickCount() == 2 && !evt.isConsumed())
     {
        jWarning1.setText("");
        if (jTable.getModel().getRowCount()==0) {
            jWarning1.setText("Bruder legt doch erstmal ein Helper an?!");
        }else
        {
            try {
                int selectedIndex = jTable.getSelectedRow();
                if (selectedIndex != -1) {
                    this.setVisible(false);
                    UpdateHelper createwindow = new UpdateHelper();
                    createwindow.setVisible(true);
                    UpdateHelper.setHelper(selectedIndex);
                }else{
                    jWarning1.setText("Erst auswählen dann updaten!");
                }
            } catch (Exception e) {
                jWarning1.setText("Bruder legt doch erstmal ein Helper an?!");
            }
        }
     }
    }//GEN-LAST:event_jTableMouseClicked

    private void jTableInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTableInputMethodTextChanged
       jWarning1.setText("es wurde geändert");
    }//GEN-LAST:event_jTableInputMethodTextChanged

   
    
    public void hinzufugen()
{
   
    
    try {
         
    for (HelperManager i : myHelpers) {
        model.insertRow(model.getRowCount(), new Object[]{i.getHelperID(),i.getPrename(),i.getSurname(),i.getGender()});
        
    }
        
    } catch (Exception e) {
    }



    
   
}
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelperManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbFilter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jWarning1;
    private javax.swing.JLabel jWarningHelper;
    // End of variables declaration//GEN-END:variables
}
