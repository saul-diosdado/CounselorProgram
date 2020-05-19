package dialog;

import java.awt.Component;
import project.Student;

/**
 * Dialog used to display a student's information.
 * @author Saul Diosdado
 */
public class StudentDialog extends javax.swing.JDialog {
    
    private Student student;

    /**
     * Creates the student dialog and fills the information based on the given
     * student.
     * @param parent the parent component.
     * @param modal the modality of the dialog.
     * @param student the student for which to display information.
     */
    public StudentDialog(java.awt.Frame parent, boolean modal, Student student) {
        super(parent, modal);
        this.student = student;
        initComponents();
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
        gradeLevel = new javax.swing.JLabel();
        gradeBox = new javax.swing.JComboBox<>();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        studentTitleLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        studentTitleLabel.setText("Student Information");

        firstNameLabel.setText("First *");

        firstNameField.setEditable(false);
        firstNameField.setText(student.getFirstName());

        lastNameField.setEditable(false);
        lastNameField.setText(student.getLastName());

        lastNameLabel.setText("Last *");

        idLabel.setText("ID #");

        idField.setEditable(false);
        idField.setText(student.getID());

        genderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Male", "Female" }));
        genderBox.setEnabled(false);
        if (student.getGender() == null) {
            genderBox.setSelectedItem("N/A");
        } else {
            genderBox.setSelectedItem(student.getGender());
        }

        genderLabel.setText("Gender");

        gradeLevel.setText("Grade");

        gradeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "9th", "10th", "11th", "12th" }));
        gradeBox.setEnabled(false);
        gradeBox.setSelectedItem(student.getGrade());

        javax.swing.GroupLayout studentInformationPanelLayout = new javax.swing.GroupLayout(studentInformationPanel);
        studentInformationPanel.setLayout(studentInformationPanelLayout);
        studentInformationPanelLayout.setHorizontalGroup(
            studentInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentInformationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentInformationPanelLayout.createSequentialGroup()
                        .addComponent(genderLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(genderBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(gradeLevel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gradeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studentInformationPanelLayout.createSequentialGroup()
                        .addGroup(studentInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameLabel)
                            .addComponent(lastNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(studentInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(studentInformationPanelLayout.createSequentialGroup()
                                .addComponent(firstNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(idLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lastNameField)))
                    .addComponent(studentTitleLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(gradeLevel)
                    .addComponent(gradeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        phoneLabel.setText("Phone");

        phoneField.setEditable(false);
        phoneField.setText(student.getFormattedNumber());

        emailLabel.setText("Email");

        emailField.setEditable(false);
        emailField.setText(student.getEmail());

        gpaLabel.setText("GPA");

        gpaField.setEditable(false);
        gpaField.setText(student.getGPA());

        ethnicityLabel.setText("Ethnicity");

        ethnicityCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N/A", "White", "African-American", "Asian", "Native American", "Hispanic", "Latino", "Other" }));
        ethnicityCombo.setEnabled(false);
        if (student.getEthnicity() == null) {
            ethnicityCombo.setSelectedItem("N/A");
        } else {
            ethnicityCombo.setSelectedItem(student.getEthnicity());
        }

        notesLabel.setText("Notes");

        notesArea.setEditable(false);
        notesArea.setColumns(20);
        notesArea.setRows(5);
        notesArea.setText(student.getNotes());
        notesAreaScrollPane.setViewportView(notesArea);

        javax.swing.GroupLayout optionalPanelLayout = new javax.swing.GroupLayout(optionalPanel);
        optionalPanel.setLayout(optionalPanelLayout);
        optionalPanelLayout.setHorizontalGroup(
            optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionalPanelLayout.createSequentialGroup()
                .addGroup(optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(optionalPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(notesAreaScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(notesLabel)
                            .addGroup(optionalPanelLayout.createSequentialGroup()
                                .addGroup(optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneLabel)
                                    .addComponent(emailLabel))
                                .addGap(18, 18, 18)
                                .addGroup(optionalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(optionalPanelLayout.createSequentialGroup()
                                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(gpaLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(gpaField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))))
                    .addGroup(optionalPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(ethnicityLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ethnicityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(notesAreaScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
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
                    .addComponent(optionalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSeparator))
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
                .addComponent(optionalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout holdPanelLayout = new javax.swing.GroupLayout(holdPanel);
        holdPanel.setLayout(holdPanelLayout);
        holdPanelLayout.setHorizontalGroup(
            holdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(holdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        holdPanelLayout.setVerticalGroup(
            holdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(holdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(holdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(holdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JComboBox<String> gradeBox;
    private javax.swing.JLabel gradeLevel;
    private javax.swing.JPanel holdPanel;
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
