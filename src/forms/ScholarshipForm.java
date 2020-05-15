package forms;

import dialog.RequirementsDialog;
import javax.swing.JOptionPane;
import static main.Main.scholarData;
import project.Scholarship;

/**
 * Form used to create a new scholarship which will be added to the scholarship
 * database.
 * @author Saul Diosdado
 */
public class ScholarshipForm extends javax.swing.JPanel {

    private Scholarship scholarship = new Scholarship();
    
    public ScholarshipForm() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainFrame = new javax.swing.JPanel();
        scholarshipLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        valueLabel = new javax.swing.JLabel();
        valueField = new javax.swing.JTextField();
        sponsorLabel = new javax.swing.JLabel();
        sponsorField = new javax.swing.JTextField();
        monetaryBox = new javax.swing.JCheckBox();
        rewardLabel = new javax.swing.JLabel();
        rewardField = new javax.swing.JTextField();
        notesLabel = new javax.swing.JLabel();
        notesPane = new javax.swing.JScrollPane();
        notesArea = new javax.swing.JTextArea();
        requirmentsButton = new javax.swing.JButton();
        createButton = new javax.swing.JButton();

        scholarshipLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        scholarshipLabel.setText("Scholarship Information");

        nameLabel.setLabelFor(nameField);
        nameLabel.setText("Name");

        valueLabel.setText("Value");

        sponsorLabel.setText("Sponsor");

        monetaryBox.setText("Non-monetary value");
        monetaryBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                monetaryBoxItemStateChanged(evt);
            }
        });

        rewardLabel.setText("Reward");

        rewardField.setEnabled(false);

        notesLabel.setText("Notes");

        notesArea.setColumns(20);
        notesArea.setRows(5);
        notesPane.setViewportView(notesArea);

        requirmentsButton.setText("Set Requirements");
        requirmentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requirmentsButtonActionPerformed(evt);
            }
        });

        createButton.setText("Create Scholarship");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainFrameLayout = new javax.swing.GroupLayout(mainFrame);
        mainFrame.setLayout(mainFrameLayout);
        mainFrameLayout.setHorizontalGroup(
            mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sponsorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scholarshipLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sponsorField)
                    .addGroup(mainFrameLayout.createSequentialGroup()
                        .addComponent(monetaryBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valueField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rewardLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rewardField)
                    .addComponent(notesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notesPane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameField)
                    .addGroup(mainFrameLayout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mainFrameLayout.createSequentialGroup()
                        .addComponent(requirmentsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        mainFrameLayout.setVerticalGroup(
            mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scholarshipLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(sponsorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sponsorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monetaryBox)
                    .addComponent(valueLabel)
                    .addComponent(valueField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rewardLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rewardField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(notesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notesPane, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requirmentsButton)
                    .addComponent(createButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void monetaryBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_monetaryBoxItemStateChanged
        rewardField.setEnabled(monetaryBox.isSelected());
        valueField.setEnabled(!monetaryBox.isSelected());
    }//GEN-LAST:event_monetaryBoxItemStateChanged

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        try {
            String name = nameField.getText();
            
            if (name.isEmpty()) {
                throw new Exception("Name is required.");
            }
            
            scholarship.setName(name);
            
            String value = valueField.getText();
            String sponsor = sponsorField.getText();
            
            if (!value.isEmpty()) {
                if (!value.matches("[0-9]+")) {
                    throw new Exception("Value is invalid.");
                } else {
                    scholarship.setValue(value);
                }
            }
            
            if (!sponsor.isEmpty()) {
                scholarship.setSponsor(sponsor);
            }
            
            boolean monetaryValue = monetaryBox.isSelected();
            String reward = rewardField.getText();
            
            scholarship.setMonetary(monetaryValue);
            
            if (monetaryValue) {
                if (!reward.isEmpty()) {
                    scholarship.setValue(reward);
                }
            }
            
            String notes = notesArea.getText();
            
            if (!notes.isEmpty()) {
                scholarship.setNotes(notes);
            }
            
            scholarData.add(scholarship);
            infoMessage("Scholarship created successfully.");
            clearAll();
        } catch (Exception e) {
            errorMessage(e.getMessage());
        }
    }//GEN-LAST:event_createButtonActionPerformed

    private void requirmentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requirmentsButtonActionPerformed
        new RequirementsDialog(null, true, scholarship).display(this.getTopLevelAncestor());
    }//GEN-LAST:event_requirmentsButtonActionPerformed

    private void infoMessage(String message) {
        JOptionPane.showMessageDialog(this.getTopLevelAncestor(), message, "Information Dialog", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void errorMessage(String message) {
        JOptionPane.showMessageDialog(this.getTopLevelAncestor(), "Error - " + message, "Error Dialog", JOptionPane.ERROR_MESSAGE);
    }
    
    private void clearAll() {
        nameField.setText("");
        valueField.setText("");
        sponsorField.setText("");
        monetaryBox.setSelected(false);
        rewardField.setText("");
        notesArea.setText("");
        scholarship = new Scholarship();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createButton;
    private javax.swing.JPanel mainFrame;
    private javax.swing.JCheckBox monetaryBox;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextArea notesArea;
    private javax.swing.JLabel notesLabel;
    private javax.swing.JScrollPane notesPane;
    private javax.swing.JButton requirmentsButton;
    private javax.swing.JTextField rewardField;
    private javax.swing.JLabel rewardLabel;
    private javax.swing.JLabel scholarshipLabel;
    private javax.swing.JTextField sponsorField;
    private javax.swing.JLabel sponsorLabel;
    private javax.swing.JTextField valueField;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
