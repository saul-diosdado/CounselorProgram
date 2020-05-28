package dialog;

import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import main.Main;
import project.Student;

/**
 * Dialog used to display a student's information.
 * @author Saul Diosdado
 */
public class StudentEditDialog extends javax.swing.JDialog {
    
    private final Font DEFAULT_FONT = new Font("Dialog", Font.ITALIC, 14);
    
    private Student student;
    private ArrayList<JCheckBox> collegeBoxes = new ArrayList<JCheckBox>();

    public StudentEditDialog(java.awt.Frame parent, boolean modal, Student student) {
        super(parent, modal);
        this.student = student;
        initComponents();
        this.updateCollegePanel();
    }
    
    /**
     * Displaying the dialog and updating the relative location of the dialog.
     * @param parent the component to be relative to.
     */
    public void display(Component parent) {
        this.setLocationRelativeTo(parent);
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        holdPanel = new javax.swing.JPanel();
        mainFrame = new javax.swing.JPanel();
        studentInformationPanel = new javax.swing.JPanel();
        studentTitleLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        genderBox = new javax.swing.JComboBox<>();
        genderLabel = new javax.swing.JLabel();
        gradeLabel = new javax.swing.JLabel();
        gradeCombo = new javax.swing.JComboBox<>();
        panelSeparator = new javax.swing.JSeparator();
        optionalPanel = new javax.swing.JPanel();
        phoneLabel = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        gpaLabel = new javax.swing.JLabel();
        gpaField = new javax.swing.JTextField();
        ethnicityLabel = new javax.swing.JLabel();
        ethnicityCombo = new javax.swing.JComboBox();
        notesLabel = new javax.swing.JLabel();
        notesAreaScrollPane = new javax.swing.JScrollPane();
        notesArea = new javax.swing.JTextArea();
        doneButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        applyButton = new javax.swing.JButton();
        sidePanel = new javax.swing.JPanel();
        collegePanel = new javax.swing.JPanel();
        collegeLabel = new javax.swing.JLabel();
        removeCollegeButton = new javax.swing.JButton();
        collegeScrollPanel = new javax.swing.JScrollPane();
        collegeNamePanel = new javax.swing.JPanel();
        addCollegeButton = new javax.swing.JButton();
        mainSeparator = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        studentTitleLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        studentTitleLabel.setText("Student Information");

        firstNameLabel.setText("First *");

        firstNameField.setText(student.getFirstName());

        lastNameField.setText(student.getLastName());

        lastNameLabel.setText("Last *");

        idLabel.setText("ID #");

        idField.setText(student.getID());

        genderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Male", "Female" }));
        if (student.getGender() == null) {
            genderBox.setSelectedItem("N/A");
        } else {
            genderBox.setSelectedItem(student.getGender());
        }

        genderLabel.setText("Gender");

        gradeLabel.setText("Grade");

        gradeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "9th", "10th", "11th", "12th" }));
        gradeCombo.setSelectedItem(student.getGrade());

        javax.swing.GroupLayout studentInformationPanelLayout = new javax.swing.GroupLayout(studentInformationPanel);
        studentInformationPanel.setLayout(studentInformationPanelLayout);
        studentInformationPanelLayout.setHorizontalGroup(
            studentInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentInformationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(studentInformationPanelLayout.createSequentialGroup()
                        .addGroup(studentInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(studentInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(genderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(studentInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(studentInformationPanelLayout.createSequentialGroup()
                                .addComponent(genderBox, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gradeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gradeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(studentInformationPanelLayout.createSequentialGroup()
                                .addComponent(firstNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(idLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lastNameField))))
                .addContainerGap())
        );
        studentInformationPanelLayout.setVerticalGroup(
            studentInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentInformationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameLabel)
                    .addComponent(idLabel)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(genderBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradeLabel)
                    .addComponent(gradeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        phoneLabel.setText("Phone");
        phoneLabel.setMaximumSize(new java.awt.Dimension(38, 16));
        phoneLabel.setMinimumSize(new java.awt.Dimension(38, 16));
        phoneLabel.setPreferredSize(new java.awt.Dimension(38, 16));

        phoneField.setText(student.getFormattedNumber());

        emailLabel.setText("Email");

        emailField.setText(student.getEmail());

        gpaLabel.setText("GPA");

        gpaField.setText(student.getGPA());

        ethnicityLabel.setText("Ethnicity");

        ethnicityCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N/A", "White", "African-American", "Asian", "Native American", "Hispanic", "Latino", "Other" }));
        ethnicityCombo.setEnabled(true);
        if (student.getEthnicity() == null) {
            ethnicityCombo.setSelectedItem("N/A");
        } else {
            ethnicityCombo.setSelectedItem(student.getEthnicity());
        }

        notesLabel.setText("Notes");

        notesArea.setColumns(20);
        notesArea.setRows(5);
        notesArea.setText(student.getNotes());
        notesAreaScrollPane.setViewportView(notesArea);

        doneButton.setText("Done");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 51, 51));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        applyButton.setText("Apply");
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionalPanelLayout = new javax.swing.GroupLayout(optionalPanel);
        optionalPanel.setLayout(optionalPanelLayout);
        optionalPanelLayout.setHorizontalGroup(
            optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionalPanelLayout.createSequentialGroup()
                .addGroup(optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(optionalPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(ethnicityLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ethnicityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(optionalPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(notesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(optionalPanelLayout.createSequentialGroup()
                                .addGroup(optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(phoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(optionalPanelLayout.createSequentialGroup()
                                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(gpaLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(gpaField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                    .addComponent(emailField)))))
                    .addGroup(optionalPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(notesAreaScrollPane)
                            .addGroup(optionalPanelLayout.createSequentialGroup()
                                .addComponent(deleteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(applyButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(doneButton)))))
                .addContainerGap())
        );
        optionalPanelLayout.setVerticalGroup(
            optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gpaLabel)
                    .addComponent(gpaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ethnicityLabel)
                    .addComponent(ethnicityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notesAreaScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doneButton)
                    .addComponent(deleteButton)
                    .addComponent(applyButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout mainFrameLayout = new javax.swing.GroupLayout(mainFrame);
        mainFrame.setLayout(mainFrameLayout);
        mainFrameLayout.setHorizontalGroup(
            mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(studentInformationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSeparator)
                    .addComponent(optionalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainFrameLayout.setVerticalGroup(
            mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentInformationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        collegeLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        collegeLabel.setText("Colleges");

        removeCollegeButton.setText("Remove");
        removeCollegeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCollegeButtonActionPerformed(evt);
            }
        });

        collegeScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        collegeNamePanel.setLayout(new javax.swing.BoxLayout(collegeNamePanel, javax.swing.BoxLayout.Y_AXIS));
        collegeScrollPanel.setViewportView(collegeNamePanel);

        addCollegeButton.setText("Add");
        addCollegeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCollegeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout collegePanelLayout = new javax.swing.GroupLayout(collegePanel);
        collegePanel.setLayout(collegePanelLayout);
        collegePanelLayout.setHorizontalGroup(
            collegePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(collegePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(collegePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collegeScrollPanel)
                    .addComponent(collegeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, collegePanelLayout.createSequentialGroup()
                        .addComponent(removeCollegeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addCollegeButton)))
                .addContainerGap())
        );
        collegePanelLayout.setVerticalGroup(
            collegePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(collegePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collegeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(collegeScrollPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(collegePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeCollegeButton)
                    .addComponent(addCollegeButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collegePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collegePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout holdPanelLayout = new javax.swing.GroupLayout(holdPanel);
        holdPanel.setLayout(holdPanelLayout);
        holdPanelLayout.setHorizontalGroup(
            holdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(holdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(mainSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        holdPanelLayout.setVerticalGroup(
            holdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(holdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(holdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainSeparator))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(holdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(holdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "Confrim delete?\nThis action cannot be reversed.", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (option == JOptionPane.YES_OPTION) {
            Main.studentData.remove(student);
            this.dispose();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed
        try {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String idNumber = idField.getText();
            
            // First and last name must be filled out.
            if (firstName.isEmpty() || lastName.isEmpty()) {
                throw new Exception("Required fields are empty.");
            }
            
            // Test the last name for non-alphabetic characters.
            if (!firstName.matches("^[a-zA-Z'-]+") || !lastName.matches("^[a-zA-Z'-]+")) {
                throw new Exception("Name can only contain alphabetic characters or special characters.");
            }
              
            // Chcek if the user has selected a gender.
            student.setGender(genderBox.getSelectedItem().toString());
            
            // Set the grade level.
            student.setGrade(gradeCombo.getSelectedItem().toString());
            
            // Check if the ID field has been filled and if the ID is duplicate.
            if (idNumber.isEmpty()) {
                student.setID(null);
            } else if (idNumber.matches("\\d+")) {
                for (int i = 0; i < Main.studentData.size(); i++) {
                    if (Main.studentData.get(i).getID() == null) {
                        break;
                    } else if (Main.studentData.get(i).getID().equals(idNumber)) {
                        if (!student.getID().equals(idNumber)) {
                            throw new Exception("ID number already exists in the studentData.");
                        }
                    }
                }
                student.setID(idNumber);
            } else {
                throw new Exception("Invalid ID number, digits only.");
            }
            
            String phoneNumber = phoneField.getText();
            String gpa = gpaField.getText();
            
            // Checks phone number for 10-digits only, then formats the number.
            if (!phoneNumber.equals(student.getFormattedNumber())) {
                if (phoneNumber.matches("\\d{10}")) {
                    student.setPhoneNumber(phoneNumber);
                } else if (phoneNumber.isEmpty()) {
                    student.setPhoneNumber(null);
                } else {
                    throw new Exception("10-digits only for phone numbers.\nNo special characters.");
                }
            }
            
            // Checks GPA for digits only and 3 floating digits.
            if (gpa.isEmpty()) {
                student.setGPA(null);
            } else if (gpa.matches("\\d\\.\\d{1,3}")) { // @TODO: Fix regex.
                student.setGPA(gpa);
            } else {
                throw new Exception("Invalid GPA. 1-3 decimal digits only.");
            }
            
            String email = emailField.getText();
            String ethnicity = (String) ethnicityCombo.getSelectedItem();
            String notes = notesArea.getText();
            
            // Checks email for alpha-numeric characters, one @, and more alpha-numeric characters.
            if (email.isEmpty()) {
                student.setEmail(null);
            } else if (email.matches("[\\w.+-]+@{1}[\\w.+-]+")) {
                student.setEmail(email);
            } else {
                throw new Exception("Invalid email address.");
            }
            
            // Check ethnicity combo box.
            student.setEthnicity(ethnicity);
            
            // Checks notes field. As long as it is not empty, set notes for student.
            if (notes.isEmpty()) {
                student.setNotes(null);
            } else {
                student.setNotes(notes);
            }
            
            infoMessage("Changes made successfully.");
        } catch (Exception e) {
            errorMessage(e.getMessage());
        }
    }//GEN-LAST:event_applyButtonActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_doneButtonActionPerformed

    private void removeCollegeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCollegeButtonActionPerformed
        for (int i = 0; i < collegeBoxes.size(); i++) {
            if (collegeBoxes.get(i).isSelected()) {
                student.removeCollege(collegeBoxes.get(i).getText());
            }
        }
        this.updateCollegePanel();
    }//GEN-LAST:event_removeCollegeButtonActionPerformed

    private void addCollegeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCollegeButtonActionPerformed
        try {
            String collegeName = JOptionPane.showInputDialog(this, "Enter the college name.");
            
            if (collegeName.isEmpty()) {
                throw new Exception("Name cannot be empty.");
            }
            
            student.addCollege(collegeName);
            this.updateCollegePanel();
        } catch (NullPointerException npe) {
            
        } catch (Exception e) {
            errorMessage(e.getMessage());
        }
    }//GEN-LAST:event_addCollegeButtonActionPerformed

    private void updateCollegePanel() {
        collegeNamePanel.removeAll();
        collegeBoxes.clear();
        for (int i = 0; i < student.getCollegeSize(); i++) {
            collegeBoxes.add(new JCheckBox(student.getCollege(i)));
            collegeBoxes.get(i).setFont(DEFAULT_FONT);
            collegeNamePanel.add(collegeBoxes.get(i));
        }
        collegeNamePanel.updateUI();
    }
    
    private void infoMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Information Dialog", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void errorMessage(String message) {
        JOptionPane.showMessageDialog(this, "Error - " + message, "Error Dialog", JOptionPane.ERROR_MESSAGE);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCollegeButton;
    private javax.swing.JButton applyButton;
    private javax.swing.JLabel collegeLabel;
    private javax.swing.JPanel collegeNamePanel;
    private javax.swing.JPanel collegePanel;
    private javax.swing.JScrollPane collegeScrollPanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton doneButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JComboBox ethnicityCombo;
    private javax.swing.JLabel ethnicityLabel;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JComboBox<String> genderBox;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField gpaField;
    private javax.swing.JLabel gpaLabel;
    private javax.swing.JComboBox<String> gradeCombo;
    private javax.swing.JLabel gradeLabel;
    private javax.swing.JPanel holdPanel;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JPanel mainFrame;
    private javax.swing.JSeparator mainSeparator;
    private javax.swing.JTextArea notesArea;
    private javax.swing.JScrollPane notesAreaScrollPane;
    private javax.swing.JLabel notesLabel;
    private javax.swing.JPanel optionalPanel;
    private javax.swing.JSeparator panelSeparator;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JButton removeCollegeButton;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel studentInformationPanel;
    private javax.swing.JLabel studentTitleLabel;
    // End of variables declaration//GEN-END:variables
}
