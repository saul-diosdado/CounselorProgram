package forms;

import dialog.LoginDialog;
import dialog.SearchDialog;
import project.Email;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.AuthenticationFailedException;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import main.Main;

/**
 * Email form used as a GUI for sending emails via Gmail. This class will use
 * the user that is logged in as the default sender. Also contains a serialized
 * file with the user's login credentials.
 * @see Email
 * @author Saul Diosdado
 */
public class EmailForm extends javax.swing.JPanel {
    
    private JFrame parent;
    private SearchDialog searchDialog;
    private ImageIcon loadingIcon = new ImageIcon(getClass().getResource("/icons/Loading.gif"));
    
    /**
     * Basic constructor.
     * @param parent the parent component.
     */
    public EmailForm() {
        initComponents();
        
        searchDialog = new SearchDialog(this.parent, false);
        searchDialog.setReturnField(recipientsField);
        searchDialog.setReturnValue(SearchDialog.SEARCH_EMAIL);
        
        if (Main.email.hasUser()) {
            senderField.setText(Main.email.getUser());
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainFrame = new javax.swing.JPanel();
        scrollBodyPane = new javax.swing.JScrollPane();
        bodyArea = new javax.swing.JTextArea();
        subjectLabel = new javax.swing.JLabel();
        recipientsField = new javax.swing.JTextField();
        panelSeparator = new javax.swing.JSeparator();
        titleLabel = new javax.swing.JLabel();
        bodyLabel = new javax.swing.JLabel();
        subjectField = new javax.swing.JTextField();
        recipientsLabel = new javax.swing.JLabel();
        senderField = new javax.swing.JTextField();
        senderLabel = new javax.swing.JLabel();
        sendButton = new javax.swing.JButton();
        addRecipientsButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();

        bodyArea.setLineWrap(true);
        bodyArea.setAutoscrolls(false);
        bodyArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bodyAreaKeyPressed(evt);
            }
        });
        scrollBodyPane.setViewportView(bodyArea);

        subjectLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        subjectLabel.setText("Subject");

        titleLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titleLabel.setText("Email");

        bodyLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        bodyLabel.setText("Body");

        recipientsLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        recipientsLabel.setText("Recipients");

        senderField.setEnabled(false);

        senderLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        senderLabel.setText("Sender");

        sendButton.setText("Send");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        addRecipientsButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        addRecipientsButton.setText("+");
        addRecipientsButton.setFocusable(false);
        addRecipientsButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addRecipientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecipientsButtonActionPerformed(evt);
            }
        });

        loginButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Mail.png"))); // NOI18N
        loginButton.setFocusable(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainFrameLayout = new javax.swing.GroupLayout(mainFrame);
        mainFrame.setLayout(mainFrameLayout);
        mainFrameLayout.setHorizontalGroup(
            mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainFrameLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelSeparator)
                    .addGroup(mainFrameLayout.createSequentialGroup()
                        .addComponent(bodyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(360, 360, 360))
                    .addGroup(mainFrameLayout.createSequentialGroup()
                        .addComponent(recipientsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(328, 328, 328))
                    .addGroup(mainFrameLayout.createSequentialGroup()
                        .addComponent(senderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(347, 347, 347))
                    .addGroup(mainFrameLayout.createSequentialGroup()
                        .addComponent(subjectLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(346, 346, 346))
                    .addComponent(scrollBodyPane)
                    .addComponent(subjectField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainFrameLayout.createSequentialGroup()
                        .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(senderField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(recipientsField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addRecipientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainFrameLayout.setVerticalGroup(
            mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senderLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recipientsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addRecipientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(recipientsField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subjectLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subjectField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollBodyPane, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sendButton)
                .addContainerGap())
        );

        mainFrameLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {loginButton, recipientsField, senderField});

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

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        JOptionPane pane = new JOptionPane("Sending...", JOptionPane.INFORMATION_MESSAGE, JOptionPane.PLAIN_MESSAGE, loadingIcon);
        final JDialog LOADING_DIALOG = pane.createDialog(this, "Dialog");
        
        new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                try {
                    if (emptyFields()) {
                        throw new Exception("Empty fields.");
                    }
                    
                    Thread.sleep(1500);
                    
                    ArrayList<String> recipients = new ArrayList<String>();
                    Scanner emailScan = new Scanner(recipientsField.getText());
                    while (emailScan.hasNext()) {
                        recipients.add(emailScan.next());
                    }
                    emailScan.close();

                    String subject = subjectField.getText();
                    String body = bodyArea.getText();
                    Main.email.sendEmail(recipients, subject, body);
                    
                    infoMessage("Email sent successfully.");
                    clearAll();
                } catch (AuthenticationFailedException afe) {
                    errorMessage("Sender credintial authentication failed.");
                } catch (AddressException ae) {
                    errorMessage("Invalid sender address.");
                } catch (MessagingException ex) {
                    Logger.getLogger(EmailForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
                return null;
            }
            
            protected void done() {
                LOADING_DIALOG.dispose();
            };
        }.execute();

        LOADING_DIALOG.setVisible(true);
    }//GEN-LAST:event_sendButtonActionPerformed
    
    private void addRecipientsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecipientsButtonActionPerformed
        searchDialog.display(this);
    }//GEN-LAST:event_addRecipientsButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        new LoginDialog(this.parent, true, senderField).display(this.parent);
    }//GEN-LAST:event_loginButtonActionPerformed

    private void bodyAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bodyAreaKeyPressed
        if (evt.isControlDown() && evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            sendButton.doClick();
        }
    }//GEN-LAST:event_bodyAreaKeyPressed

    private boolean emptyFields() {
        return senderField.getText().isEmpty() || recipientsField.getText().isEmpty() || bodyArea.getText().isEmpty();
    }
    
    private void infoMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Information Message", JOptionPane.INFORMATION_MESSAGE, null);
    }
    
    private void errorMessage(String message) {
        JOptionPane.showMessageDialog(this, "Error - " + message, "Error Dialog", JOptionPane.ERROR_MESSAGE, null);
    }
    
    private void clearAll() {
        recipientsField.setText("");
        subjectField.setText("");
        bodyArea.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRecipientsButton;
    private javax.swing.JTextArea bodyArea;
    private javax.swing.JLabel bodyLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel mainFrame;
    private javax.swing.JSeparator panelSeparator;
    private javax.swing.JTextField recipientsField;
    private javax.swing.JLabel recipientsLabel;
    private javax.swing.JScrollPane scrollBodyPane;
    private javax.swing.JButton sendButton;
    private javax.swing.JTextField senderField;
    private javax.swing.JLabel senderLabel;
    private javax.swing.JTextField subjectField;
    private javax.swing.JLabel subjectLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
