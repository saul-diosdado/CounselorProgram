package forms;

import project.Student;
import javax.swing.JOptionPane;
import main.Main;
import view.ChecklistView;
import view.StudentView;

/**
 * Form for creating a new student which will be added to the student database.
 * @author Saul Diosdado
 */
public class StudentForm extends javax.swing.JPanel {
    
    private ChecklistView checklistView;
    private StudentView studentView;
    
    public StudentForm() {
        initComponents();
    }
    
    /**
     * Sets the checklist view.
     * @param checklistView the checklist view to be updated.
     */
    public void setChecklistView(ChecklistView checklistView) {
        this.checklistView = checklistView;
    }
    
    /**
     * Sets the student view.
     * @param studentView the student view to be updated.
     */
    public void setStudentView(StudentView studentView) {
        this.studentView = studentView;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        createStudentButton = new javax.swing.JButton();

        studentTitleLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        studentTitleLabel.setText("Student Information");

        firstNameLabel.setLabelFor(firstNameField);
        firstNameLabel.setText("First *");

        lastNameLabel.setLabelFor(lastNameField);
        lastNameLabel.setText("Last *");

        idLabel.setText("ID #");

        genderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Male", "Female" }));

        genderLabel.setText("Gender");

        gradeLabel.setText("Grade");

        gradeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "9th", "10th", "11th", "12th" }));

        javax.swing.GroupLayout studentInformationPanelLayout = new javax.swing.GroupLayout(studentInformationPanel);
        studentInformationPanel.setLayout(studentInformationPanelLayout);
        studentInformationPanelLayout.setHorizontalGroup(
            studentInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentInformationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentInformationPanelLayout.createSequentialGroup()
                        .addComponent(genderLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(genderBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gradeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gradeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(studentInformationPanelLayout.createSequentialGroup()
                        .addGroup(studentInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(studentInformationPanelLayout.createSequentialGroup()
                                .addGroup(studentInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameLabel)
                                    .addComponent(lastNameLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(studentInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(studentInformationPanelLayout.createSequentialGroup()
                                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(idLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(studentTitleLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        studentInformationPanelLayout.setVerticalGroup(
            studentInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentInformationPanelLayout.createSequentialGroup()
                .addComponent(studentTitleLabel)
                .addGap(18, 18, 18)
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

        phoneLabel.setLabelFor(phoneField);
        phoneLabel.setText("Phone");

        emailLabel.setLabelFor(emailField);
        emailLabel.setText("Email");

        gpaLabel.setText("GPA");

        ethnicityLabel.setText("Ethnicity");

        ethnicityCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N/A", "White", "African-American", "Asian", "Native American", "Hispanic", "Latino", "Other" }));

        notesLabel.setText("Notes");

        notesArea.setColumns(20);
        notesArea.setRows(5);
        notesAreaScrollPane.setViewportView(notesArea);

        createStudentButton.setText("Create Student");
        createStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createStudentButtonActionPerformed(evt);
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
                        .addGroup(optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(notesAreaScrollPane)
                            .addComponent(notesLabel)
                            .addGroup(optionalPanelLayout.createSequentialGroup()
                                .addGroup(optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneLabel)
                                    .addComponent(emailLabel))
                                .addGap(18, 18, 18)
                                .addGroup(optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(optionalPanelLayout.createSequentialGroup()
                                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(gpaLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(gpaField))
                                    .addGroup(optionalPanelLayout.createSequentialGroup()
                                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(createStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        optionalPanelLayout.setVerticalGroup(
            optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
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
                .addComponent(notesAreaScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createStudentButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainFrameLayout = new javax.swing.GroupLayout(mainFrame);
        mainFrame.setLayout(mainFrameLayout);
        mainFrameLayout.setHorizontalGroup(
            mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentInformationPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(optionalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createStudentButtonActionPerformed
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
              
            Student student = new Student(firstName, lastName);
            
            // Sets the student's gender.
            student.setGender(genderBox.getSelectedItem().toString());
            
            // Sets the grade level.
            student.setGrade(gradeCombo.getSelectedItem().toString());
            
            // Check if the ID field has been filled and if the ID is duplicate.
            if (!idNumber.isEmpty()) {
                if (idNumber.matches("\\d+")) {
                    for (int i = 0; i < Main.studentData.size(); i++) {
                        if (Main.studentData.get(i).getID() == null) {
                            break;
                        } else if (Main.studentData.get(i).getID().equals(idNumber)) {
                            throw new Exception("ID number already exists in the studentData.");
                        }
                    }
                    student.setID(idNumber);
                } else {
                    throw new Exception("Invalid ID number, digits only.");
                }
            }
            
            String phoneNumber = phoneField.getText();
            String gpa = gpaField.getText();
            
            // Checks phone number for 10-digits only, then formats the number.
            if (!phoneNumber.isEmpty()) {
                if (phoneNumber.matches("\\d{10}")) {
                    student.setPhoneNumber(phoneNumber);
                } else {
                    throw new Exception("10-digits only for phone numbers.\nNo special characters.");
                }
            }
            
            // Checks GPA for digits only and 3 floating digits.
            if (!gpa.isEmpty()) {
                if (gpa.matches("\\d\\.\\d{1,3}")) { // @TODO: Fix regex.
                    student.setGPA(gpa);
                } else {
                    throw new Exception("Invalid GPA. 1-3 decimal digits only.");
                }
            }
            
            String email = emailField.getText();
            String ethnicity = (String) ethnicityCombo.getSelectedItem();
            String notes = notesArea.getText();
            
            // Checks email for alpha-numeric characters, one @, and more alpha-numeric characters.
            if (!email.isEmpty()) {
                if (email.matches("[\\w.+-]+@{1}[\\w.+-]+")) {
                    student.setEmail(email);
                } else {
                    throw new Exception("Invalid email address.");
                }
            }
            
            // Set the ethnicity.
            student.setEthnicity(ethnicity);
            
            // Checks notes field. As long as it is not empty, set notes for student.
            if (!notes.isEmpty()) {
                student.setNotes(notes);
            }
            
            Main.studentData.add(student);
            
            checklistView.update();
            studentView.update();
            
            infoMessage("Student creation successful.");
            clearAll();
        } catch (Exception e) {
            errorMessage(e.getMessage());
        }
    }//GEN-LAST:event_createStudentButtonActionPerformed
    
    private void infoMessage(String message) {
        JOptionPane.showMessageDialog(this.getTopLevelAncestor(), message, "Information Dialog", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void errorMessage(String message) {
        JOptionPane.showMessageDialog(this.getTopLevelAncestor(), "Error - " + message, "Error Dialog", JOptionPane.ERROR_MESSAGE);
    }
    
    private void clearAll() {
        firstNameField.setText("");
        lastNameField.setText("");
        idField.setText("");
        gradeCombo.setSelectedIndex(0);
        genderBox.setSelectedIndex(0);
        phoneField.setText("");
        gpaField.setText("");
        emailField.setText("");
        ethnicityCombo.setSelectedIndex(0);
        notesArea.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createStudentButton;
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
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JPanel mainFrame;
    private javax.swing.JTextArea notesArea;
    private javax.swing.JScrollPane notesAreaScrollPane;
    private javax.swing.JLabel notesLabel;
    private javax.swing.JPanel optionalPanel;
    private javax.swing.JSeparator panelSeparator;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JPanel studentInformationPanel;
    private javax.swing.JLabel studentTitleLabel;
    // End of variables declaration//GEN-END:variables
}
