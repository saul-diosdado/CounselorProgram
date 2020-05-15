package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import main.Main;
import project.Scholarship;
import project.Student;

/**
 *
 * @author Saul Diosdado
 */
public class ScholarshipView extends javax.swing.JPanel {
    
    private Scholarship scholarship;
    private ScholarshipEditView scholarEdit = new ScholarshipEditView();

    public ScholarshipView() {
        initComponents();
        editPanel.add(scholarEdit);
        editPanel.updateUI();
        
        for (int i = 0; i < Main.scholarData.size(); i++) {
            scholarshipCombo.addItem(Main.scholarData.get(i).getName());
        }
        
        for (int i = Main.studentData.size() - 1; i >= 0; i--) {
            studentPanel.add(new CardButton(Main.studentData.get(i)));
        }
        studentPanel.updateUI();
        resultsLabel.setText("Qualifying Students: " + Main.studentData.size());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filterPanel = new javax.swing.JPanel();
        studentScrollPane = new javax.swing.JScrollPane();
        studentPanel = new javax.swing.JPanel();
        resultsLabel = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        scholarshipCombo = new javax.swing.JComboBox<>();
        refreshButton = new javax.swing.JButton();
        filterButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        editPanel = new javax.swing.JPanel();
        resetButton = new javax.swing.JButton();

        studentPanel.setLayout(new javax.swing.BoxLayout(studentPanel, javax.swing.BoxLayout.Y_AXIS));
        studentScrollPane.setViewportView(studentPanel);

        resultsLabel.setText("Qualifying Students: 0");

        javax.swing.GroupLayout filterPanelLayout = new javax.swing.GroupLayout(filterPanel);
        filterPanel.setLayout(filterPanelLayout);
        filterPanelLayout.setHorizontalGroup(
            filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(filterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addContainerGap())
        );
        filterPanelLayout.setVerticalGroup(
            filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentScrollPane)
                .addContainerGap())
        );

        scholarshipCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scholarshipComboActionPerformed(evt);
            }
        });

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        filterButton.setText("Filter");
        filterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Scholarship Filter");

        editPanel.setLayout(new java.awt.GridLayout(1, 0));

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scholarshipCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addComponent(refreshButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                .addContainerGap())
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scholarshipCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshButton)
                    .addComponent(filterButton)
                    .addComponent(resetButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        scholarshipCombo.removeAllItems();
        for (int i = 0; i < Main.scholarData.size(); i++) {
            scholarshipCombo.addItem(Main.scholarData.get(i).getName());
        }
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void filterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterButtonActionPerformed
        try {
            if (scholarship == null) {
                throw new Exception("Select a scholarship.");
            }
            if (!scholarship.hasRequirements()) {
                throw new Exception("The selected scholarship has no requirements.");
            }
            
            ArrayList<Student> filteredStudents = new ArrayList<Student>();
            ArrayList<Student> removedStudents = new ArrayList<Student>();

            for (int i = 0; i < Main.studentData.size(); i++) {
                filteredStudents.add(Main.studentData.get(i));
            }
            
            if (!scholarship.getEthnicity().equals("N/A")) {
                for (int i = 0; i < filteredStudents.size(); i++) {
                    if (!filteredStudents.get(i).getEthnicity().equals(scholarship.getEthnicity())) {
                        removedStudents.add(filteredStudents.get(i));
                    }
                }
                filteredStudents.removeAll(removedStudents);
                removedStudents.clear();
            }
            
            if (!scholarship.getGender().equals("N/A")) {
                for (int i = 0; i < filteredStudents.size(); i++) {
                    if (!filteredStudents.get(i).getGender().equals(scholarship.getGender())) {
                        removedStudents.add(filteredStudents.get(i));
                    }
                }
                filteredStudents.removeAll(removedStudents);
                removedStudents.clear();
            }
            
            if (scholarship.getGPA() != "0.00") {
                double gpa = Double.parseDouble(scholarship.getGPA());
                for (int i = 0; i < filteredStudents.size(); i++) {
                    if (gpa > Double.parseDouble(filteredStudents.get(i).getGPA())) {
                        removedStudents.add(filteredStudents.get(i));
                    }
                }
                filteredStudents.removeAll(removedStudents);
                removedStudents.clear();
            }
            
            studentPanel.removeAll();
            for (int i = 0; i < filteredStudents.size(); i++) {
                studentPanel.add(new CardButton(filteredStudents.get(i)));
            }
            
            studentPanel.updateUI();
            resultsLabel.setText("Qualifying Students: " + filteredStudents.size());
        } catch(NullPointerException npe) {
            npe.printStackTrace();
        } catch (Exception e) {
            infoMessage(e.getMessage());
        }
    }//GEN-LAST:event_filterButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        studentPanel.removeAll();
        for (int i = Main.studentData.size() - 1; i >= 0; i--) {
            studentPanel.add(new CardButton(Main.studentData.get(i)));
        }
        studentPanel.updateUI();
        scholarshipCombo.setSelectedIndex(-1);
        resultsLabel.setText("Qualifying Students: " + Main.studentData.size());
        scholarEdit.reset();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void scholarshipComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scholarshipComboActionPerformed
        try {
            String name = scholarshipCombo.getSelectedItem().toString();
            for (int i = 0; i < Main.scholarData.size(); i++) {
                if (Main.scholarData.get(i).getName().equals(name)) {
                    scholarship = Main.scholarData.get(i);
                    scholarEdit.setScholarship(scholarship);
                    break;
                }
            }
        } catch (NullPointerException npe) {
            
        }
    }//GEN-LAST:event_scholarshipComboActionPerformed

    private void infoMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Information Dialog", JOptionPane.INFORMATION_MESSAGE);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel editPanel;
    private javax.swing.JButton filterButton;
    private javax.swing.JPanel filterPanel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel resultsLabel;
    private javax.swing.JComboBox<String> scholarshipCombo;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel studentPanel;
    private javax.swing.JScrollPane studentScrollPane;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
