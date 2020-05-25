package forms;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.Base64;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.gmail.Gmail;
import com.google.api.services.gmail.GmailScopes;
import com.google.api.services.gmail.model.Message;

import dialog.SearchDialog;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.SwingWorker;

/**
 * Email form used as a GUI for sending emails via Gmail. This class will use
 * the user that is logged in as the default sender. Also contains a serialized
 * file with the user's login credentials.
 * Many of the methods implemented here are directly from the Google Gmail API
 * documentation.
 * @author Saul Diosdado
 */
public class EmailForm extends javax.swing.JPanel {
    
    private static final String APPLICATION_NAME = "Counselor Program";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final String TOKENS_DIRECTORY_PATH = "tokens";

    private static final List<String> SCOPES = Collections.singletonList(GmailScopes.GMAIL_COMPOSE);
    private static final String CREDENTIALS_FILE_PATH = "/credentials.json";
    private Gmail service;
    
    private JFrame parent;
    private SearchDialog searchDialog;
    private final ImageIcon LOADING_ICON = new ImageIcon(getClass().getResource("/Loading.gif"));
    
    /**
     * Basic constructor.
     * @param parent the parent component.
     */
    public EmailForm() {
        initComponents();
        
        searchDialog = new SearchDialog(this.parent, false);
        searchDialog.setReturnField(recipientsField);
        searchDialog.setReturnValue(SearchDialog.SEARCH_EMAIL);
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
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mail.png"))); // NOI18N
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
        // Create a loading dialog while sending the email in the background.
        JOptionPane loadingPaneDialog = new JOptionPane("Sending...", JOptionPane.INFORMATION_MESSAGE, JOptionPane.PLAIN_MESSAGE, LOADING_ICON);
        final JDialog LOADING_DIALOG = loadingPaneDialog.createDialog(this, "Dialog");
        
        new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                try {
                    if (emptyFields()) {
                        throw new Exception("Required fields are empty!");
                    }

                    // Construct the list of recipient emails.
                    ArrayList<String> to = new ArrayList<String>();
                    Scanner recipientsScanner = new Scanner(recipientsField.getText());
                    while (recipientsScanner.hasNext()) {
                        to.add(recipientsScanner.next());
                    }
                    recipientsScanner.close();
                    
                    // Gather other email information from the form.
                    String from = service.users().getProfile("me").execute().getEmailAddress();
                    String subject = subjectField.getText();
                    String bodyText = bodyArea.getText();

                    // Create and send the constructed email.
                    MimeMessage email = createEmail(to, from, subject, bodyText);
                    sendMessage(service, "me", email);

                    // Notify user of successfull send and clear the form.
                    infoMessage("Email sent successfully!");
                    clearAllFields();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                } catch (MessagingException me) {
                    me.printStackTrace();
                } catch (Exception e) {
                    errorMessage(e.getMessage());
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
        // Create a loading dialog while awaiting authorization in the background.
        JOptionPane loadingPaneDialog = new JOptionPane("Awaiting authentication...", JOptionPane.INFORMATION_MESSAGE, JOptionPane.PLAIN_MESSAGE, LOADING_ICON);
        final JDialog LOADING_DIALOG = loadingPaneDialog.createDialog(this, "Dialog");
        
        new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                try {
                    // Build a new authorized API client service.
                    final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
                    service = new Gmail.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
                            .setApplicationName(APPLICATION_NAME)
                            .build();
                    // Set the sender field to the email address that was just logged into.
                    senderField.setText(service.users().getProfile("me").execute().getEmailAddress());
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                    errorMessage("User authentication failed!");
                } catch (GeneralSecurityException gse) {
                    gse.printStackTrace();
                    errorMessage("User authentication failed!");
                }
                return null;
            }
            
            protected void done() {
                LOADING_DIALOG.dispose();
            };
        }.execute();

        LOADING_DIALOG.setVisible(true);
    }//GEN-LAST:event_loginButtonActionPerformed

    private void bodyAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bodyAreaKeyPressed
        if (evt.isControlDown() && evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            sendButton.doClick();
        }
    }//GEN-LAST:event_bodyAreaKeyPressed

    /**
     * Creates an authorized Credential object.
     * @param HTTP_TRANSPORT The network HTTP Transport.
     * @return An authorized Credential object.
     * @throws IOException If the credentials.json file cannot be found.
     */
    private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException {
        // Load client secrets.
        InputStream in = EmailForm.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
        if (in == null) {
            throw new FileNotFoundException("Resource not found: " + CREDENTIALS_FILE_PATH);
        }
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        // Build flow and trigger user authorization request.
        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
                .setAccessType("online")
                .build();
        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(-1).build();
        return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
    }
    
    /**
     * Create a MimeMessage using the parameters provided.
     * @param to list of email addresses of the receivers
     * @param from email address of the sender, the mailbox account
     * @param subject subject of the email
     * @param bodyText body text of the email
     * @return the MimeMessage to be used to send email
     * @throws MessagingException
     */
    public static MimeMessage createEmail(ArrayList<String> to, String from, String subject, String bodyText) throws MessagingException {
        Properties props = new Properties();
        Session session = Session.getDefaultInstance(props, null);

        MimeMessage email = new MimeMessage(session);

        email.setFrom(new InternetAddress(from));
        for (String recipientEmail : to) {
            email.addRecipient(javax.mail.Message.RecipientType.TO,
                    new InternetAddress(recipientEmail));
        }
        email.setSubject(subject);
        email.setText(bodyText);
        return email;
    }
    
    /**
     * Create a message from an email.
     * @param emailContent Email to be set to raw of message
     * @return a message containing a base64url encoded email
     * @throws IOException
     * @throws MessagingException
     */
    public static Message createMessageWithEmail(MimeMessage emailContent) throws MessagingException, IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        emailContent.writeTo(buffer);
        byte[] bytes = buffer.toByteArray();
        String encodedEmail = Base64.encodeBase64URLSafeString(bytes);
        Message message = new Message();
        message.setRaw(encodedEmail);
        return message;
    }

    /**
     * Send an email from the user's mailbox to its recipient.
     * @param service Authorized Gmail API instance.
     * @param userId User's email address. The special value "me"
     * can be used to indicate the authenticated user.
     * @param emailContent Email to be sent.
     * @return The sent message
     * @throws MessagingException
     * @throws IOException
     */
    public static Message sendMessage(Gmail service, String userId, MimeMessage emailContent) throws MessagingException, IOException {
        Message message = createMessageWithEmail(emailContent);
        message = service.users().messages().send(userId, message).execute();
        return message;
    }
    
    private boolean emptyFields() {
        return senderField.getText().isEmpty() || recipientsField.getText().isEmpty() || bodyArea.getText().isEmpty();
    }
    
    private void infoMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Information Message", JOptionPane.INFORMATION_MESSAGE, null);
    }
    
    private void errorMessage(String message) {
        JOptionPane.showMessageDialog(this, "Error - " + message, "Error Dialog", JOptionPane.ERROR_MESSAGE, null);
    }
    
    private void clearAllFields() {
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
