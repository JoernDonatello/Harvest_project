
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

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

    
    private int helperID;
    private String prename, surname, gender;

    static HelperManager myHelperManager = new HelperManager();
    static ArrayList<HelperManager> myHelpers = new ArrayList<>();
    
    
    public HelperManager() {
        initComponents();
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

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        HelperList = new javax.swing.JList<>();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jWarningHelper = new javax.swing.JLabel();
        cbFilter = new javax.swing.JComboBox<>();

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

        jScrollPane1.setViewportView(HelperList);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jWarningHelper, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(jButton5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbFilter, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(26, 26, 26)
                        .addComponent(cbFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jButton5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jWarningHelper, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      jWarningHelper.setText("");
        if (HelperList.getModel().getSize()==0) {
            jWarningHelper.setText("Bruder legt doch erstmal ein Helper an?!");
        }else 
        {
        try {
            int selectedIndex = HelperList.getSelectedIndex();
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
        if (HelperList.getModel().getSize()==0) {
            jWarningHelper.setText("Bruder legt doch erstmal ein Helper an?!");
        }else
        {
        try {
            int selectedIndex = HelperList.getSelectedIndex();
            DefaultListModel model = (DefaultListModel)HelperList.getModel();
            if (selectedIndex != -1) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Sicher das du löschen willst?","Warning",dialogButton);
                if (dialogResult==0) {
                    model.remove(selectedIndex);
                    myHelpers.remove(selectedIndex);
                }
            }else{
            jWarningHelper.setText("Erst auswählen dann löschen!");
            }
        } catch (Exception e) {
            jWarningHelper.setText("Helper anlegen bevor löschen?!");
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
            DefaultListModel fdm = new DefaultListModel();
            for (HelperManager i : myHelpers) {
        switch(select)
        {
            case "male":
            if (i.getGender()=="male") {
            fdm.addElement(i.getHelperID()+". " + i.getPrename()+ ", " + i.getSurname()+ ", " + i.getGender());
            }
            break;
            case "female":
            if (i.getGender()=="female") {
            fdm.addElement(i.getHelperID()+". " + i.getPrename()+ ", " + i.getSurname()+ ", " + i.getGender());
            }
            break;
            case "divers":
            if (i.getGender()=="divers") {
            fdm.addElement(i.getHelperID()+". " + i.getPrename()+ ", " + i.getSurname()+ ", " + i.getGender());
            }
            break;
            case "all":
            fdm.addElement(i.getHelperID()+". " + i.getPrename()+ ", " + i.getSurname()+ ", " + i.getGender());
            break;
        } 
    }
    HelperList.setModel(fdm);
    } catch (Exception e) {
    }
    }//GEN-LAST:event_showFilter
public static void hinzufugen()
{
    try {
         DefaultListModel dlm = new DefaultListModel();
    for (HelperManager i : myHelpers) {
        dlm.addElement(i.getHelperID()+". " + i.getPrename()+ ", " + i.getSurname()+ ", " + i.getGender());
       
    }
         HelperList.setModel(dlm);
    
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
    public static javax.swing.JList<String> HelperList;
    private javax.swing.JComboBox<String> cbFilter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jWarningHelper;
    // End of variables declaration//GEN-END:variables
}
