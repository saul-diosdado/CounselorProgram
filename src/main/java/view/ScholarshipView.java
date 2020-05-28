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

    public ScholarshipView() {
        initComponents();
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

        sidePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        selectScholarshipPanel = new javax.swing.JPanel();
        resetButton = new javax.swing.JButton();
        filterButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        scholarshipCombo = new javax.swing.JComboBox<>();
        mainPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        sponsorLabel = new javax.swing.JLabel();
        sponsorField = new javax.swing.JTextField();
        rewardLabel = new javax.swing.JLabel();
        rewardField = new javax.swing.JTextField();
        notesLabel = new javax.swing.JLabel();
        notesPane = new javax.swing.JScrollPane();
        notesArea = new javax.swing.JTextArea();
        ethnicityLabel = new javax.swing.JLabel();
        ethnicityCombo = new javax.swing.JComboBox<>();
        genderLabel = new javax.swing.JLabel();
        genderCombo = new javax.swing.JComboBox<>();
        gpaLabel = new javax.swing.JLabel();
        gpaField = new javax.swing.JTextField();
        filterPanel = new javax.swing.JPanel();
        studentScrollPane = new javax.swing.JScrollPane();
        studentPanel = new javax.swing.JPanel();
        resultsLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(0, 0));

        sidePanel.setMaximumSize(new java.awt.Dimension(300, 32767));
        sidePanel.setMinimumSize(new java.awt.Dimension(300, 0));
        sidePanel.setPreferredSize(new java.awt.Dimension(300, 468));

        titleLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Scholarship Filter");

        selectScholarshipPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        filterButton.setText("Filter");
        filterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterButtonActionPerformed(evt);
            }
        });

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        scholarshipCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scholarshipComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectScholarshipPanelLayout = new javax.swing.GroupLayout(selectScholarshipPanel);
        selectScholarshipPanel.setLayout(selectScholarshipPanelLayout);
        selectScholarshipPanelLayout.setHorizontalGroup(
            selectScholarshipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectScholarshipPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(selectScholarshipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scholarshipCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(selectScholarshipPanelLayout.createSequentialGroup()
                        .addComponent(refreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        selectScholarshipPanelLayout.setVerticalGroup(
            selectScholarshipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectScholarshipPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scholarshipCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(selectScholarshipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshButton)
                    .addComponent(filterButton)
                    .addComponent(resetButton))
                .addContainerGap())
        );

        mainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nameLabel.setText("Name");

        nameField.setEditable(false);

        sponsorLabel.setText("Sponsor");

        sponsorField.setEditable(false);

        rewardLabel.setText("Reward");

        rewardField.setEditable(false);
        rewardField.setEnabled(false);

        notesLabel.setText("Notes");

        notesArea.setEditable(false);
        notesArea.setColumns(20);
        notesArea.setLineWrap(true);
        notesArea.setRows(5);
        notesArea.setWrapStyleWord(true);
        notesPane.setViewportView(notesArea);

        ethnicityLabel.setText("Ethnicity");

        ethnicityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "White", "African-American", "Asian", "Native American", "Hispanic", "Latino", "Other" }));
        ethnicityCombo.setEnabled(false);

        genderLabel.setText("Gender");

        genderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Male", "Female" }));
        genderCombo.setEnabled(false);

        gpaLabel.setText("Min GPA");

        gpaField.setEditable(false);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notesPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(genderLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ethnicityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(gpaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ethnicityCombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(genderCombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gpaField, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(sponsorLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(rewardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sponsorField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameField)
                            .addComponent(rewardField, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sponsorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sponsorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rewardLabel)
                    .addComponent(rewardField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ethnicityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ethnicityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gpaLabel)
                    .addComponent(gpaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(notesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notesPane, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectScholarshipPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectScholarshipPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        filterPanel.setPreferredSize(new java.awt.Dimension(360, 50));

        studentPanel.setLayout(new javax.swing.BoxLayout(studentPanel, javax.swing.BoxLayout.Y_AXIS));
        studentScrollPane.setViewportView(studentPanel);

        resultsLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        resultsLabel.setText("Qualifying Students: 0");

        javax.swing.GroupLayout filterPanelLayout = new javax.swing.GroupLayout(filterPanel);
        filterPanel.setLayout(filterPanelLayout);
        filterPanelLayout.setHorizontalGroup(
            filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(filterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(filterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addComponent(filterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
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
            
            String reqEthnicity = scholarship.getEthnicity();
            String reqGender = scholarship.getGender();
            String reqGPA = scholarship.getGPA();
            
            if (!reqEthnicity.equals("N/A")) {
                for (int i = filteredStudents.size() - 1; i > 0; i--) {
                    if (filteredStudents.get(i).getEthnicity().equals(reqEthnicity)) {
                        filteredStudents.remove(i);
                    }
                }
            }
            
            
            
            if (!scholarship.getGender().equals("N/A")) {
                for (int i = filteredStudents.size() - 1; i > 0; i--) {
                    if (!filteredStudents.get(i).getGender().equals(reqGender)) {
                        filteredStudents.remove(i);
                    }
                }
            }
            
            if (scholarship.getGPA() != "0.00") {
                double gpa = Double.parseDouble(reqGPA);
                for (int i = filteredStudents.size() - 1; i > 0; i--) {
                    if (gpa > Double.parseDouble(filteredStudents.get(i).getGPA())) {
                        filteredStudents.remove(i);
                    }
                }
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
        scholarship = null;
        resultsLabel.setText("Qualifying Students: " + Main.studentData.size());
        reset();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void scholarshipComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scholarshipComboActionPerformed
        try {
            String name = scholarshipCombo.getSelectedItem().toString();
            for (int i = 0; i < Main.scholarData.size(); i++) {
                if (Main.scholarData.get(i).getName().equals(name)) {
                    scholarship = Main.scholarData.get(i);
                    update();
                    break;
                }
            }
        } catch (NullPointerException npe) {
            
        }
    }//GEN-LAST:event_scholarshipComboActionPerformed

    public void reset() {
        nameField.setText("");
        sponsorField.setText("");
        rewardField.setText("");
        ethnicityCombo.setSelectedIndex(0);
        genderCombo.setSelectedIndex(0);
        gpaField.setText("");
        notesArea.setText("");
        this.updateUI();
    }
    
    private void update() {
        nameField.setText(scholarship.getName());
        sponsorField.setText(scholarship.getSponsor());
        rewardField.setText(scholarship.getValue());
        
        if (scholarship.hasRequirements()) {
            ethnicityCombo.setSelectedItem(scholarship.getEthnicity());
            genderCombo.setSelectedItem(scholarship.getGender());
            gpaField.setText(scholarship.getGPA());
        }
        
        notesArea.setText(scholarship.getNotes());
    }
    
    private void infoMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Information Dialog", JOptionPane.INFORMATION_MESSAGE);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ethnicityCombo;
    private javax.swing.JLabel ethnicityLabel;
    private javax.swing.JButton filterButton;
    private javax.swing.JPanel filterPanel;
    private javax.swing.JComboBox<String> genderCombo;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField gpaField;
    private javax.swing.JLabel gpaLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextArea notesArea;
    private javax.swing.JLabel notesLabel;
    private javax.swing.JScrollPane notesPane;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel resultsLabel;
    private javax.swing.JTextField rewardField;
    private javax.swing.JLabel rewardLabel;
    private javax.swing.JComboBox<String> scholarshipCombo;
    private javax.swing.JPanel selectScholarshipPanel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JTextField sponsorField;
    private javax.swing.JLabel sponsorLabel;
    private javax.swing.JPanel studentPanel;
    private javax.swing.JScrollPane studentScrollPane;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
