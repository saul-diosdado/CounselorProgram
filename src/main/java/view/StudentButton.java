package view;

import dialog.StudentDialog;
import javax.swing.JFrame;
import project.Student;

/**
 * A simple button panel for displaying each student in the multiple email
 * selection pop up.
 * 
 * @author Saul Diosdado
 */ 
public class StudentButton extends javax.swing.JPanel {

    private Student student;
    private JFrame parent;
    
    /**
     * When given the Student class, initializes the button with the student's
     * last name, first name and a label containing the student's ID number.
     * 
     * @param parent the parent component.
     * @param student the student for the created button.
     */
    public StudentButton(JFrame parent, Student student) {
        this.student = student;
        this.parent = parent;
        initComponents();
    }
    
    /**
     * Checks the selected state of the JCheckBox.
     * 
     * @return true if the box is selected, false otherwise.
     */
    public boolean isSelectedBox() {
        return studentBox.isSelected();
    }
    
    /**
     * Sets the selected state of the JCheckBox.
     * @param selected the state of the box to be set.
     */
    public void setSelectedBox(boolean selected) {
        studentBox.setSelected(selected);
    }
    
    /**
     * To enable/disable the JCheckBox.
     * @param enabled the enabled state of the box.
     */
    public void setEnabledBox(boolean enabled) {
        studentBox.setEnabled(enabled);
    }
    
    /**
     * Returns the student of the button.
     * @return a student.
     */
    public Student getStudent() {
        return student;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        studentID = new javax.swing.JLabel();
        studentBox = new javax.swing.JCheckBox();
        studentButton = new javax.swing.JButton();

        studentID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        studentID.setText(student.getID());

        studentButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        studentButton.setText(student.getFirstName() + " " + student.getLastName());
        studentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentBox)
                .addGap(18, 18, 18)
                .addComponent(studentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentID, javax.swing.GroupLayout.PREFERRED_SIZE, 55, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(studentButton)
                        .addComponent(studentID))
                    .addComponent(studentBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void studentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentButtonActionPerformed
        new StudentDialog(parent, true, student).display(this.getTopLevelAncestor().getParent());
    }//GEN-LAST:event_studentButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainPanel;
    private javax.swing.JCheckBox studentBox;
    private javax.swing.JButton studentButton;
    private javax.swing.JLabel studentID;
    // End of variables declaration//GEN-END:variables
}
