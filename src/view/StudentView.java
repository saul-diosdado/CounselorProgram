package view;

import java.awt.Component;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import main.Main;
import project.Student;

/**
 *
 * @author Saul Diosdado
 */
public class StudentView extends javax.swing.JPanel {
    
    private String gender;
    
    public StudentView() {
        initComponents();
        
        for (int i = Main.studentData.size() - 1; i >= 0; i--) {
            studentPanel.add(new CardButton(Main.studentData.get(i), this));
        }
        studentPanel.updateUI();
        resultsLabel.setText("Showing " + Main.studentData.size() + " Results.");
    }
    
    public void update() {
        this.resetButton.doClick();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filterPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        applyFilterButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        basicFilterPanel = new javax.swing.JPanel();
        lastNameLabel = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        femaleRadioButton = new javax.swing.JRadioButton();
        firstNameLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        gradeLabel = new javax.swing.JLabel();
        gradeCombo = new javax.swing.JComboBox<>();
        ethnicityCombo = new javax.swing.JComboBox<>();
        ethnicityLabel = new javax.swing.JLabel();
        gpaLabel = new javax.swing.JLabel();
        gpaSpinner = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        advancedFilterRadioButton = new javax.swing.JRadioButton();
        advancedFilterPanel = new javax.swing.JPanel();
        showEmailBox = new javax.swing.JCheckBox();
        showNoEmailBox = new javax.swing.JCheckBox();
        showPhoneBox = new javax.swing.JCheckBox();
        showNoPhoneBox = new javax.swing.JCheckBox();
        advancedSeparator = new javax.swing.JSeparator();
        showCollegeBox = new javax.swing.JCheckBox();
        showNoCollegeBox = new javax.swing.JCheckBox();
        filteredPanel = new javax.swing.JPanel();
        studentScrollPane = new javax.swing.JScrollPane();
        studentPanel = new javax.swing.JPanel();
        resultsLabel = new javax.swing.JLabel();

        titleLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Student Filter");

        applyFilterButton.setText("Search");
        applyFilterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyFilterButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        lastNameLabel.setText("Last Name");

        maleRadioButton.setText("Male");
        maleRadioButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                maleRadioButtonItemStateChanged(evt);
            }
        });

        femaleRadioButton.setText("Female");
        femaleRadioButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                femaleRadioButtonItemStateChanged(evt);
            }
        });

        firstNameLabel.setText("First Name");

        idLabel.setText("ID Number");

        gradeLabel.setText("Grade");

        gradeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "9th", "10th", "11th", "12th" }));

        ethnicityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "White", "African-American", "Asian", "Native American", "Hispanic", "Latino", "Other" }));

        ethnicityLabel.setText("Ethnicity");

        gpaLabel.setText("GPA");

        gpaSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 10.0d, 0.05d));

        jLabel1.setText("Gender");

        javax.swing.GroupLayout basicFilterPanelLayout = new javax.swing.GroupLayout(basicFilterPanel);
        basicFilterPanel.setLayout(basicFilterPanelLayout);
        basicFilterPanelLayout.setHorizontalGroup(
            basicFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basicFilterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(basicFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basicFilterPanelLayout.createSequentialGroup()
                        .addComponent(gradeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gradeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ethnicityLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ethnicityCombo, 0, 1, Short.MAX_VALUE))
                    .addGroup(basicFilterPanelLayout.createSequentialGroup()
                        .addGroup(basicFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(basicFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(firstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(idLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(basicFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basicFilterPanelLayout.createSequentialGroup()
                                .addComponent(idField)
                                .addGap(12, 12, 12)
                                .addComponent(gpaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gpaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lastNameField)
                            .addComponent(firstNameField)))
                    .addGroup(basicFilterPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(maleRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(femaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        basicFilterPanelLayout.setVerticalGroup(
            basicFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basicFilterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(basicFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(basicFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(basicFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gpaLabel)
                    .addComponent(gpaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(basicFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradeLabel)
                    .addComponent(gradeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ethnicityLabel)
                    .addComponent(ethnicityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(basicFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maleRadioButton)
                    .addComponent(femaleRadioButton)
                    .addComponent(jLabel1)))
        );

        advancedFilterRadioButton.setText("Apply Advanced Filter");
        advancedFilterRadioButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                advancedFilterRadioButtonItemStateChanged(evt);
            }
        });

        advancedFilterPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        showEmailBox.setText("Show students with a valid email address.");
        showEmailBox.setEnabled(false);
        showEmailBox.setName(""); // NOI18N
        showEmailBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                showEmailBoxItemStateChanged(evt);
            }
        });

        showNoEmailBox.setText("Show students with no valid email address.");
        showNoEmailBox.setEnabled(false);
        showNoEmailBox.setName(""); // NOI18N
        showNoEmailBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                showNoEmailBoxItemStateChanged(evt);
            }
        });

        showPhoneBox.setText("Show students with a phone number.");
        showPhoneBox.setEnabled(false);
        showPhoneBox.setName(""); // NOI18N
        showPhoneBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                showPhoneBoxItemStateChanged(evt);
            }
        });

        showNoPhoneBox.setText("Show students with no phone number.");
        showNoPhoneBox.setEnabled(false);
        showNoPhoneBox.setName(""); // NOI18N
        showNoPhoneBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                showNoPhoneBoxItemStateChanged(evt);
            }
        });

        showCollegeBox.setText("Show students with a college.");
        showCollegeBox.setEnabled(false);
        showCollegeBox.setName(""); // NOI18N
        showCollegeBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                showCollegeBoxItemStateChanged(evt);
            }
        });

        showNoCollegeBox.setText("Show students with no colleges.");
        showNoCollegeBox.setEnabled(false);
        showNoCollegeBox.setName(""); // NOI18N
        showNoCollegeBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                showNoCollegeBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout advancedFilterPanelLayout = new javax.swing.GroupLayout(advancedFilterPanel);
        advancedFilterPanel.setLayout(advancedFilterPanelLayout);
        advancedFilterPanelLayout.setHorizontalGroup(
            advancedFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(advancedFilterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(advancedFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showNoCollegeBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(advancedSeparator)
                    .addComponent(showCollegeBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showNoPhoneBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showPhoneBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showNoEmailBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showEmailBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        advancedFilterPanelLayout.setVerticalGroup(
            advancedFilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(advancedFilterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showEmailBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showNoEmailBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showPhoneBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showNoPhoneBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(advancedSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showCollegeBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showNoCollegeBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout filterPanelLayout = new javax.swing.GroupLayout(filterPanel);
        filterPanel.setLayout(filterPanelLayout);
        filterPanelLayout.setHorizontalGroup(
            filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, filterPanelLayout.createSequentialGroup()
                        .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(applyFilterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(basicFilterPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(filterPanelLayout.createSequentialGroup()
                        .addComponent(advancedFilterRadioButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(advancedFilterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        filterPanelLayout.setVerticalGroup(
            filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(basicFilterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(advancedFilterRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(advancedFilterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(applyFilterButton)
                    .addComponent(resetButton))
                .addContainerGap())
        );

        studentPanel.setLayout(new javax.swing.BoxLayout(studentPanel, javax.swing.BoxLayout.Y_AXIS));
        studentScrollPane.setViewportView(studentPanel);

        resultsLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        resultsLabel.setText("Showing 0 Results.");

        javax.swing.GroupLayout filteredPanelLayout = new javax.swing.GroupLayout(filteredPanel);
        filteredPanel.setLayout(filteredPanelLayout);
        filteredPanelLayout.setHorizontalGroup(
            filteredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
            .addGroup(filteredPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        filteredPanelLayout.setVerticalGroup(
            filteredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, filteredPanelLayout.createSequentialGroup()
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(filteredPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filteredPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void maleRadioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_maleRadioButtonItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            femaleRadioButton.setSelected(false);
            gender = "Male";
        }
    }//GEN-LAST:event_maleRadioButtonItemStateChanged

    private void femaleRadioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_femaleRadioButtonItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            maleRadioButton.setSelected(false);
            gender = "Female";
        }
    }//GEN-LAST:event_femaleRadioButtonItemStateChanged

    private void advancedFilterRadioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_advancedFilterRadioButtonItemStateChanged
        Component[] advancedComp = advancedFilterPanel.getComponents();
        boolean state = advancedFilterRadioButton.isSelected();
        for (Component component : advancedComp) {
            component.setEnabled(state);
        }
    }//GEN-LAST:event_advancedFilterRadioButtonItemStateChanged

    private void showEmailBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_showEmailBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            showNoEmailBox.setSelected(false);
        }
    }//GEN-LAST:event_showEmailBoxItemStateChanged

    private void showNoEmailBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_showNoEmailBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            showEmailBox.setSelected(false);
        }
    }//GEN-LAST:event_showNoEmailBoxItemStateChanged

    private void showPhoneBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_showPhoneBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            showNoPhoneBox.setSelected(false);
        }
    }//GEN-LAST:event_showPhoneBoxItemStateChanged

    private void showNoPhoneBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_showNoPhoneBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            showPhoneBox.setSelected(false);
        }
    }//GEN-LAST:event_showNoPhoneBoxItemStateChanged

    private void showCollegeBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_showCollegeBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            showNoCollegeBox.setSelected(false);
        }
    }//GEN-LAST:event_showCollegeBoxItemStateChanged

    private void showNoCollegeBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_showNoCollegeBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            showCollegeBox.setSelected(false);
        }
    }//GEN-LAST:event_showNoCollegeBoxItemStateChanged

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        firstNameField.setText("");
        lastNameField.setText("");
        idField.setText("");
        gradeCombo.setSelectedIndex(0);
        gpaSpinner.setValue(0);
        ethnicityCombo.setSelectedIndex(0);
        maleRadioButton.setSelected(false);
        femaleRadioButton.setSelected(false);
        advancedFilterRadioButton.setSelected(false);
        
        for (int i = 0; i < advancedFilterPanel.getComponentCount(); i++) {
            try {
                JCheckBox box = (JCheckBox) advancedFilterPanel.getComponent(i);
                box.setSelected(false);
            } catch (ClassCastException cce) {
                
            }
        }
        
        studentPanel.removeAll();
        for (int i = Main.studentData.size() - 1; i >= 0; i--) {
            studentPanel.add(new CardButton(Main.studentData.get(i), this));
        }
        studentPanel.updateUI();
        resultsLabel.setText("Showing " + Main.studentData.size() + " Results.");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void applyFilterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyFilterButtonActionPerformed
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Student> removedStudents = new ArrayList<Student>();
        
        for (Student student : Main.studentData) {
            students.add(student);
        }
        
        if (!firstNameField.getText().isEmpty()) {
            for (int i = 0; i < students.size(); i++) {
                if (!students.get(i).getFirstName().equals(firstNameField.getText())) {
                    removedStudents.add(students.get(i));
                }
            }
            students.removeAll(removedStudents);
            removedStudents.clear();
        }
        
        if (!lastNameField.getText().isEmpty()) {
            for (int i = 0; i < students.size(); i++) {
                if (!students.get(i).getLastName().equals(firstNameField.getText())) {
                    removedStudents.add(students.get(i));
                }
            }
            students.removeAll(removedStudents);
            removedStudents.clear();
        }
        
        if (!idField.getText().isEmpty()) {
            String idNumber = idField.getText();
            for (int i = 0; i < students.size(); i++) {
                if (!students.get(i).getID().equals(idNumber)) {
                    removedStudents.add(students.get(i));
                }
            }
            students.removeAll(removedStudents);
            removedStudents.clear();
        }
        
        if (maleRadioButton.isSelected() || femaleRadioButton.isSelected()) {
            for (int i = 0; i < students.size(); i++) {
                try {
                    if (!students.get(i).getGender().equals(gender)) {
                        removedStudents.add(students.get(i));
                    }
                } catch (NullPointerException npe) {
                    removedStudents.add(students.get(i));
                }
            }
            students.removeAll(removedStudents);
            removedStudents.clear();
        }
        
        if (gradeCombo.getSelectedIndex() != 0) {
            for (int i = 0; i < students.size(); i++) {
                try {
                    if (!students.get(i).getGrade().equals(gradeCombo.getSelectedItem())) {
                        removedStudents.add(students.get(i));
                    }
                } catch (NullPointerException npe) {
                    removedStudents.add(students.get(i));
                }
            }
            students.removeAll(removedStudents);
            removedStudents.clear();
        }
        
        if (!gpaSpinner.getValue().equals(0)) {
            Double gpaMin = Double.parseDouble(gpaSpinner.getValue().toString());
            for (int i = 0; i < students.size(); i++) {
                try {
                    if (Double.parseDouble(students.get(i).getGPA()) < gpaMin) {
                        removedStudents.add(students.get(i));
                    }
                } catch (NullPointerException npe) {
                    removedStudents.add(students.get(i));
                }
            }
            students.removeAll(removedStudents);
            removedStudents.clear();
        }
        
        if (ethnicityCombo.getSelectedIndex() != 0) {
            for (int i = 0; i < students.size(); i++) {
                try {
                    if (!students.get(i).getEthnicity().equals(ethnicityCombo.getSelectedItem())) {
                        removedStudents.add(students.get(i));
                    }
                } catch (NullPointerException npe) {
                    removedStudents.add(students.get(i));
                }
            }
            students.removeAll(removedStudents);
            removedStudents.clear();
        }
        
        if (advancedFilterRadioButton.isSelected()) {
            if (showEmailBox.isSelected()) {
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getEmail() == null) {
                        removedStudents.add(students.get(i));
                    }
                }
            } else if (showNoEmailBox.isSelected()) {
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getEmail() != null) {
                        removedStudents.add(students.get(i));
                    }
                }
            }
            students.removeAll(removedStudents);
            removedStudents.clear();
            
            if (showPhoneBox.isSelected()) {
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getPhoneNumber() == null) {
                        removedStudents.add(students.get(i));
                    }
                }
            } else if (showNoPhoneBox.isSelected()) {
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getPhoneNumber() != null) {
                        removedStudents.add(students.get(i));
                    }
                }
            }
            students.removeAll(removedStudents);
            removedStudents.clear();
            
            if (showCollegeBox.isSelected()) {
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getCollegeSize() == 0) {
                        removedStudents.add(students.get(i));
                    }
                }
            } else if (showNoCollegeBox.isSelected()) {
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getCollegeSize() != 0) {
                        removedStudents.add(students.get(i));
                    }
                }
            }
            students.removeAll(removedStudents);
            removedStudents.clear();
        }
        
        studentPanel.removeAll();
        for (Student student : students) {
            studentPanel.add(new CardButton(student, this));
        }
        studentPanel.updateUI();
        
        resultsLabel.setText("Showing " + students.size() + " Results.");
        if (students.isEmpty()) {
            errorMessage("No results found.");
        }
    }//GEN-LAST:event_applyFilterButtonActionPerformed

    private void infoMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Information Dialog", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void errorMessage(String message) {
        JOptionPane.showMessageDialog(this, "Error - " + message, "Error Dialog", JOptionPane.ERROR_MESSAGE);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel advancedFilterPanel;
    private javax.swing.JRadioButton advancedFilterRadioButton;
    private javax.swing.JSeparator advancedSeparator;
    private javax.swing.JButton applyFilterButton;
    private javax.swing.JPanel basicFilterPanel;
    private javax.swing.JComboBox<String> ethnicityCombo;
    private javax.swing.JLabel ethnicityLabel;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JPanel filterPanel;
    private javax.swing.JPanel filteredPanel;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel gpaLabel;
    private javax.swing.JSpinner gpaSpinner;
    private javax.swing.JComboBox<String> gradeCombo;
    private javax.swing.JLabel gradeLabel;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel resultsLabel;
    private javax.swing.JCheckBox showCollegeBox;
    private javax.swing.JCheckBox showEmailBox;
    private javax.swing.JCheckBox showNoCollegeBox;
    private javax.swing.JCheckBox showNoEmailBox;
    private javax.swing.JCheckBox showNoPhoneBox;
    private javax.swing.JCheckBox showPhoneBox;
    private javax.swing.JPanel studentPanel;
    private javax.swing.JScrollPane studentScrollPane;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
