package dialog;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import main.Main;
import project.Student;
import view.StudentButton;

/**
 * Dialog used as a GUI interface to search through the student database.
 * @author Saul Diosdado
 */
public class SearchDialog extends javax.swing.JDialog {
    
    public static final int SEARCH_EMAIL   = 0;
    public static final int SEARCH_PHONE   = 1;
    public static final int SEARCH_STUDENT = 2;
    
    private int returnValue = -1;
    private ArrayList<StudentButton> studentButtons = new ArrayList<StudentButton>();
    
    private JTextField returnField;
    private JFrame parent;
    
    /**
     * Creates the parent class.
     * @param parent the parent component.
     * @param modal the modality of the dialog.
     */
    public SearchDialog(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    /**
     * Creates the parent class and sets the return value of the dialog.
     * @param parent the parent component.
     * @param modal the modality of the dialog.
     * @param returnValue the type of return returned by this dialog.
     */
    public SearchDialog(JFrame parent, boolean modal, int returnValue) {
        super(parent, modal);
        initComponents();
        this.returnValue = returnValue;
    }
    
    /**
     * Sets the field for which the return type of this class will be
     * written to.
     * @param returnField the field to be written to.
     */
    public void setReturnField(JTextField returnField) {
        this.returnField = returnField;
    }
    
    /**
     * Sets the type of return returned by this program to be written in
     * the return field.
     * @param returnValue the type of return.
     */
    public void setReturnValue(int returnValue) {
        this.returnValue = returnValue;
    }
    
    /**
     * Displaying the dialog and updating the relative location of the dialog.
     * @param parent the component to be relative to.
     */
    public void display(Component parent) {
        this.reset();
        
        if (returnValue == SearchDialog.SEARCH_EMAIL) {
            this.configureEmail();
        }
        
        this.setLocationRelativeTo(parent);
        this.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        holdPanel = new javax.swing.JPanel();
        mainScrollPane = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        searchPanel = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        gradeLabel = new javax.swing.JLabel();
        gradeCombo = new javax.swing.JComboBox<>();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        holdPanel.setMaximumSize(new java.awt.Dimension(320, 250));

        mainScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        mainScrollPane.setMaximumSize(new java.awt.Dimension(320, 250));

        mainPanel.setLayout(new javax.swing.BoxLayout(mainPanel, javax.swing.BoxLayout.Y_AXIS));
        mainScrollPane.setViewportView(mainPanel);

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        firstNameLabel.setText("First Name");

        lastNameLabel.setText("Last Name");

        idLabel.setText("ID #");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        gradeLabel.setText("Grade");

        gradeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "9th", "10th", "11th", "12th" }));

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(firstNameField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gradeLabel)
                            .addComponent(idLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gradeCombo, 0, 70, Short.MAX_VALUE)
                            .addComponent(idField)))
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameLabel)
                            .addComponent(idLabel)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(gradeLabel)
                                .addComponent(gradeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lastNameLabel))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout holdPanelLayout = new javax.swing.GroupLayout(holdPanel);
        holdPanel.setLayout(holdPanelLayout);
        holdPanelLayout.setHorizontalGroup(
            holdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(holdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(holdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, holdPanelLayout.createSequentialGroup()
                        .addComponent(resetButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(okButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton))
                    .addComponent(mainScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        holdPanelLayout.setVerticalGroup(
            holdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, holdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(holdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton)
                    .addComponent(resetButton))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(holdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(holdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        if (returnValue == SEARCH_EMAIL) {
            this.returnEmail();
        } else if (returnValue == SEARCH_PHONE) {
            
        } else if (returnValue == SEARCH_STUDENT) {
            this.returnStudent();
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        try {
            ArrayList<Student> filteredStudents = new ArrayList<Student>();
            ArrayList<Student> removedStudents  = new ArrayList<Student>();

            String firstName = firstNameField.getText().toUpperCase();
            String lastName  = lastNameField.getText().toUpperCase();
            String idNumber  = idField.getText();
            String grade     = gradeCombo.getSelectedItem().toString();
            
            if (firstName.isEmpty() && lastName.isEmpty() && idNumber.isEmpty() && grade.equals("N/A")) {
                throw new Exception("Empty fields.");
            }
            
            // <editor-fold defaultstate="collapsed" desc=" Search filter ">
            for (Student student : Main.studentData) {
                filteredStudents.add(student);
            }
            
            if (!firstName.isEmpty()) {
                for (int i = 0; i < filteredStudents.size(); i++) {
                    if (!filteredStudents.get(i).getFirstName().toUpperCase().equals(firstName)) {
                        removedStudents.add(filteredStudents.get(i));
                    }
                }
                filteredStudents.removeAll(removedStudents);
                removedStudents.clear();
            }
            
            if (!lastName.isEmpty()) {
                for (int i = 0; i < filteredStudents.size(); i++) {
                    if (!filteredStudents.get(i).getLastName().toUpperCase().equals(lastName)) {
                        removedStudents.add(filteredStudents.get(i));
                    }
                }
                filteredStudents.removeAll(removedStudents);
                removedStudents.clear();
            }
            
            if (!idNumber.isEmpty()) {
                for (int i = 0; i < filteredStudents.size(); i++) {
                    if (!filteredStudents.get(i).getID().equals(idNumber)) {
                        removedStudents.add(filteredStudents.get(i));
                    }
                }
                filteredStudents.removeAll(removedStudents);
                removedStudents.clear();
            }
            
            if (!grade.equals("N/A")) {
                for (int i = 0; i < filteredStudents.size(); i++) {
                    if (!filteredStudents.get(i).getGrade().equals(grade)) {
                        removedStudents.add(filteredStudents.get(i));
                    }
                }
                filteredStudents.removeAll(removedStudents);
                removedStudents.clear();
            }
            // </editor-fold>

            if (filteredStudents.isEmpty()) {
                throw new Exception("No results found.");
            }
            
            mainPanel.removeAll();
            studentButtons.removeAll(studentButtons);

            for (int i = 0; i < filteredStudents.size(); i++) {
                studentButtons.add(new StudentButton(parent, filteredStudents.get(i)));
                mainPanel.add(studentButtons.get(i));
            }
            mainPanel.updateUI();
        } catch (Exception e) {
            errorMessage(e.getMessage());
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        this.reset();
    }//GEN-LAST:event_resetButtonActionPerformed
    
    /**
     * Builds a string of emails that have been selected and writes it to
     * the return field.
     */
    private void returnEmail() {
        try {
            StringBuilder selected = new StringBuilder();
            if (!returnField.getText().isEmpty()) {
                selected.append(returnField.getText()).append(" ");
            }

            for (int i = 0; i < studentButtons.size(); i++) {
                if (studentButtons.get(i).isSelectedBox()) {
                    if (studentButtons.get(i).getStudent().getEmail() != null) {
                        selected.append(studentButtons.get(i).getStudent().getEmail()).append(" ");
                        studentButtons.get(i).setSelectedBox(false);
                    }
                }
            }
            returnField.setText(selected.toString());
            
            if (selected.toString().isEmpty()) {
                throw new NullPointerException("No students selected.");
            }
            this.dispose();
        } catch (NullPointerException npe) {
            warningMessage(npe.getMessage());
        }
    }
    
    /**
     * Builds a list of selected students and prompts the user to enter a
     * college to add to all of the selected students.
     */
    private void returnStudent() {
        try {
            ArrayList<Student> selectedStudents = new ArrayList<Student>();

            for (int i = 0; i < studentButtons.size(); i++) {
                if (studentButtons.get(i).isSelectedBox()) {
                    selectedStudents.add(studentButtons.get(i).getStudent());
                    studentButtons.get(i).setSelectedBox(false);
                }
            }

            if (selectedStudents.isEmpty()) {
                throw new Exception("No students selected.");
            }
            
            String college = JOptionPane.showInputDialog(this, "Enter the college name.");
            
            if (college.isEmpty()) {
                throw new Exception("Name cannot be empty.");
            }
            
            for (int i = 0; i < selectedStudents.size(); i++) {
                selectedStudents.get(i).addCollege(college);
            }
            this.dispose();
        } catch (NullPointerException npe) {
            
        } catch (Exception e) {
            errorMessage(e.getMessage());
        }
    }
    
    /**
     * Runs through the list of students and disables the JCheckBox if the
     * email has not yet been set (null).
     */
    private void configureEmail() {
        for (int i = 0; i < studentButtons.size(); i++) {
            if (studentButtons.get(i).getStudent().getEmail() == null) {
                studentButtons.get(i).setEnabledBox(false);
            }
        }
        mainPanel.updateUI();
    }
    
    /**
     * Removes all components and creates new components based on the student
     * database.
     */
    private void reset() {
        mainPanel.removeAll();
        studentButtons.removeAll(studentButtons);
        
        for (int i = Main.studentData.size() - 1; i >= 0; i--) {
            studentButtons.add(new StudentButton(parent, Main.studentData.get(i)));
        }
        
        for (int i = 0; i < studentButtons.size(); i++) {
            mainPanel.add(studentButtons.get(i));
        }
        
        mainPanel.updateUI();
        
        firstNameField.setText("");
        lastNameField.setText("");
        idField.setText("");
        gradeCombo.setSelectedIndex(0);
    }
    
    private void errorMessage(String message) {
        JOptionPane.showMessageDialog(this, "Error - " + message, "Error Dialog", JOptionPane.ERROR_MESSAGE);
    }
    
    private void warningMessage(String message) {
        JOptionPane.showMessageDialog(this, "Warning - " + message, "Warning Dialog", JOptionPane.WARNING_MESSAGE);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JComboBox<String> gradeCombo;
    private javax.swing.JLabel gradeLabel;
    private javax.swing.JPanel holdPanel;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane mainScrollPane;
    private javax.swing.JButton okButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel searchPanel;
    // End of variables declaration//GEN-END:variables
}
