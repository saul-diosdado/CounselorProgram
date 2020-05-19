package view;

import project.Scholarship;

/**
 *
 * @author Saul Diosdado
 */
public class ScholarshipEditView extends javax.swing.JPanel {

    private Scholarship scholarship;
    
    public ScholarshipEditView() {
        initComponents();
    }
    
    public void setScholarship(Scholarship scholarship) {
        this.scholarship = scholarship;
        this.update();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        gpaLabel.setText("Minimum GPA");

        gpaField.setEditable(false);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sponsorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sponsorField)
                    .addComponent(rewardLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rewardField)
                    .addComponent(notesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notesPane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameField)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ethnicityLabel)
                            .addComponent(genderLabel)
                            .addComponent(gpaLabel))
                        .addGap(14, 14, 14)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genderCombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gpaField)
                            .addComponent(ethnicityCombo, 0, 148, Short.MAX_VALUE)))
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(sponsorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sponsorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rewardLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rewardField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ethnicityLabel)
                    .addComponent(ethnicityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gpaLabel)
                    .addComponent(gpaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notesPane, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ethnicityCombo;
    private javax.swing.JLabel ethnicityLabel;
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
    private javax.swing.JTextField rewardField;
    private javax.swing.JLabel rewardLabel;
    private javax.swing.JTextField sponsorField;
    private javax.swing.JLabel sponsorLabel;
    // End of variables declaration//GEN-END:variables
}
