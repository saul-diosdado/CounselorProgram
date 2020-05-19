package dialog;

import java.awt.Component;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Gmail login dialog for changing the program's email classes login credentials.
 * @author Saul Diosdado
 */
public class LoginDialog extends javax.swing.JDialog {

    private JTextField senderField;
    
    /**
     * Creates the parent dialog class.
     * @param parent the parent component.
     * @param modal the modality of the dialog.
     */
    public LoginDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    /**
     * Creates the parent dialog class and sets the sender field.
     * @param parent the parent component.
     * @param modal the modality of the dialog.
     * @param senderField the field to display the sender address.
     */
    public LoginDialog(java.awt.Frame parent, boolean modal, JTextField senderField) {
        super(parent, modal);
        initComponents();
        this.senderField = senderField;
    }
    
    /**
     * Sets the field for which the return type of this class will be
     * written to.
     * @param senderField the field to be written to.
     */
    public void setReturnField(JTextField senderField) {
        this.senderField = senderField;
    }
    
    /**
     * Displaying the dialog and updating the relative location of the dialog.
     * @param parent the component to be relative to.
     */
    public void display(Component parent) {
        this.setLocationRelativeTo(parent);
        this.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        gmailLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        showBox = new javax.swing.JCheckBox();
        emailField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        emailLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        emailLabel.setText("Email");

        passwordLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        passwordLabel.setText("Password");

        gmailLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        gmailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gmailLabel.setText("Gmail Login");

        passwordField.setEchoChar('•');
        passwordField.setFocusAccelerator('\'');

        showBox.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        showBox.setText("Show password");
        showBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                showBoxItemStateChanged(evt);
            }
        });

        loginButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(showBox)
                        .addGap(0, 191, Short.MAX_VALUE))
                    .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLabel)
                            .addComponent(emailLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailField)
                            .addComponent(passwordField))))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(gmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginButton)
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

    private void showBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_showBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            passwordField.setEchoChar((char) 0);
        } else {
             passwordField.setEchoChar('•');
        }
    }//GEN-LAST:event_showBoxItemStateChanged

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        try {
            String emailAddress = emailField.getText();
            StringBuilder password = new StringBuilder();
            char[] passwordArray = passwordField.getPassword();
            
            for (int i = 0; i < passwordArray.length; i++) {
                password.append(passwordArray[i]);
            }
            
            if (password.toString().isEmpty() || emailAddress.isEmpty()) {
                throw new Exception("Empty fields.");
            }
            
            if (senderField != null) {
                senderField.setText(emailAddress);
            }
            
            this.dispose();
        } catch (Exception e) {
            errorMessage(e.getMessage());
        }
    }//GEN-LAST:event_loginButtonActionPerformed
    
    private void errorMessage(String message) {
        JOptionPane.showMessageDialog(this, "Error - " + message, "Error Dialog", JOptionPane.ERROR_MESSAGE, null);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel gmailLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JCheckBox showBox;
    // End of variables declaration//GEN-END:variables
}
