package dialog;

import java.awt.Component;
import java.awt.event.ItemEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import project.Scholarship;

/**
 * Dialog interface which allows the user to set the requirements of the scholarship.
 * 
 * @author Saul Diosdado
 */
public class RequirementsDialog extends javax.swing.JDialog {
    
    private final DecimalFormat GPA = new DecimalFormat("0.00");
    
    private double gpaValue = 0.00;
    private Scholarship scholarship;

    /**
     * Builds the dialog.
     * 
     * @param parent the parent form of this dialog
     * @param modal boolean for allowing other windows to be focused
     */
    public RequirementsDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    /**
     * Builds the dialog.
     * 
     * @param parent the parent form of this dialog
     * @param modal boolean for allowing other windows to be focused
     * @param scholarship the scholarship to set the requirements for
     */
    public RequirementsDialog(java.awt.Frame parent, boolean modal, Scholarship scholarship) {
        super(parent, modal);
        initComponents();
        this.scholarship = scholarship;
    }
    
    /**
     * Displaying the dialog and updating the relative location of the dialog.
     * 
     * @param parent the component to be relative to.
     */
    public void display(Component parent) {
        this.setLocationRelativeTo(parent);
        this.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        ethnicityLabel = new javax.swing.JLabel();
        ethnicityBox = new javax.swing.JComboBox<>();
        genderLabel = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        minimumGPAField = new javax.swing.JTextField();
        gpaSlider = new javax.swing.JSlider();
        setRequirementsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Requirements");

        ethnicityLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ethnicityLabel.setText("Ethnicity");

        ethnicityBox.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ethnicityBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "White", "African-American", "Asian", "Native American", "Hispanic", "Latino", "Other" }));

        genderLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        genderLabel.setText("Gender");

        maleRadioButton.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        maleRadioButton.setText("Male");
        maleRadioButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                maleRadioButtonItemStateChanged(evt);
            }
        });

        femaleRadioButton.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        femaleRadioButton.setText("Female");
        femaleRadioButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                femaleRadioButtonItemStateChanged(evt);
            }
        });

        minimumGPAField.setEditable(false);
        minimumGPAField.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        minimumGPAField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        minimumGPAField.setText("Minimum GPA: 0.00");

        gpaSlider.setValue(0);
        gpaSlider.setFocusable(false);
        gpaSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                gpaSliderStateChanged(evt);
            }
        });

        setRequirementsButton.setText("Set Requirements");
        setRequirementsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setRequirementsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(minimumGPAField)
                    .addComponent(gpaSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(setRequirementsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(genderLabel)
                        .addGap(18, 18, 18)
                        .addComponent(maleRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(femaleRadioButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(ethnicityLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ethnicityBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ethnicityLabel)
                    .addComponent(ethnicityBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(maleRadioButton)
                    .addComponent(femaleRadioButton))
                .addGap(18, 18, 18)
                .addComponent(minimumGPAField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gpaSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(setRequirementsButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maleRadioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_maleRadioButtonItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            femaleRadioButton.setSelected(!maleRadioButton.isSelected());
        }
    }//GEN-LAST:event_maleRadioButtonItemStateChanged

    private void femaleRadioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_femaleRadioButtonItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            maleRadioButton.setSelected(!femaleRadioButton.isSelected());
        }
    }//GEN-LAST:event_femaleRadioButtonItemStateChanged

    private void gpaSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_gpaSliderStateChanged
        gpaValue = Double.parseDouble(GPA.format(0.05 * gpaSlider.getValue()));
        minimumGPAField.setText("Minimum GPA: " + gpaValue);
    }//GEN-LAST:event_gpaSliderStateChanged

    private void setRequirementsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setRequirementsButtonActionPerformed
        String ethnicity = ethnicityBox.getSelectedItem().toString();
        String gender = null;
        
        if (maleRadioButton.isSelected()) {
            gender = "Male";
        } else if (femaleRadioButton.isSelected()) {
            gender = "Female";
        } else {
            gender = "N/A";
        }
        
        scholarship.setEthnicity(ethnicity);
        scholarship.setGender(gender);
        scholarship.setGPA(Double.toString(gpaValue));
        scholarship.setRequirements(true);
        
        infoMessage("Requirements set successfully.");
        this.dispose();
    }//GEN-LAST:event_setRequirementsButtonActionPerformed

    private void infoMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Information Dialog", JOptionPane.INFORMATION_MESSAGE);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ethnicityBox;
    private javax.swing.JLabel ethnicityLabel;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JSlider gpaSlider;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextField minimumGPAField;
    private javax.swing.JButton setRequirementsButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
