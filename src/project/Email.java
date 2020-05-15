package project;

import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Email class for sending emails to individuals or a group of recipients via
 * gmail host.
 * @author Saul Diosdado
 */
public class Email implements java.io.Serializable {
    
    private final Properties PROP = System.getProperties();
    private final String HOST = "smtp.gmail.com";
 
    private String username;
    private String password;
    
    /**
     * Single constructor to create Email class with the serialized userFile
     * as parameter.
     */
    public Email() {}
    
    /**
     * Constructor used to define the username and password if there is no
     * serialized userFile.
     * @param username gmail username of the user
     * @param password gmail password of the user
     */
    public Email(String username, String password) {
        this.username = encode(username);
        this.password = encode(password);
    }
    
    /**
     * Sending email method used to sent an email from already defined gmail
     * user. Method sends the same email to a list of recipients.
     * @param recipients list of recipients to be sent to
     * @param subject subject line of the email
     * @param body body of the email
     * @throws AddressException when any email address is not correct
     * @throws MessagingException thrown when any problems are presented with
     *         body message or subject line.
     */
    public void sendEmail(ArrayList<String> recipients, String subject, String body) throws AddressException, MessagingException {
        PROP.put("mail.smtp.starttls.enable", "true");
        PROP.put("mail.smtp.host", HOST);
        PROP.put("mail.smtp.user", decode(username));
        PROP.put("mail.smtp.password", decode(password));
        PROP.put("mail.smtp.port", "587");
        PROP.put("mail.smtp.auth", "true");
        
        Session session = Session.getDefaultInstance(PROP);
        MimeMessage message = new MimeMessage(session);
        
        message.setFrom(new InternetAddress(decode(username)));
        InternetAddress[] toAddress = new InternetAddress[recipients.size()];
        
        // Putting the addresses from the array
        for (int i = 0; i < recipients.size(); i++) {
            toAddress[i] = new InternetAddress(recipients.get(i));
        }
        
        for (InternetAddress toAddresses : toAddress) {
            message.addRecipient(Message.RecipientType.TO, toAddresses);
        }
        
        message.setSubject(subject);
        message.setText(body);
        
        Transport transport = session.getTransport("smtp");
        transport.connect(HOST, decode(username), decode(password));
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }
    
    /**
     * Changing the user's email.
     * @param username the gmail username of the user.
     * @param password the gmail password of the user.
     */
    public void setUser(String username, String password) {
        this.username = encode(username);
        this.password = encode(password);
    }
    
    /**
     * Returns the username of the user.
     * @return the username 
     */
    public String getUser() {
        return decode(username);
    }
    
    public boolean hasUser() {
        if (username == null || password == null) {
            return false;
        } else {
            return !(username.isEmpty() && password.isEmpty());
        }
    }
    
    /**
     * Encodes input using a multi-step algorithm.
     * @param input the text to be encoded
     * @return encoded text
     */
    private String encode(String input) {
        int enCount = input.length();
        
        char[] userArray = input.toCharArray();
        
        StringBuilder encodedField = new StringBuilder();
        
        for (int i = 0; i < enCount; i++) {
            int asciiValue = (int) userArray[i];
            
            if (asciiValue + algorithm(enCount) <= 128) {
                asciiValue = asciiValue + algorithm(enCount);
            } else {
                int exceededValue = asciiValue + algorithm(enCount);
                asciiValue = exceededValue - 128;
            }
            
            String binaryString = Integer.toBinaryString(asciiValue);
            encodedField.append(binaryString).append(" ");
        }
        
        return encodedField.toString();
    }
    
    /**
     * Decodes encoded text using reverse algorithm.
     * @param input the text to be decoded
     * @return the decoded text
     */
    private String decode(String input) {
        int enCount = 0;
        
        Scanner lengthScanner = new Scanner(input);
        while (lengthScanner.hasNext()) {
            enCount++;
            lengthScanner.next();
        }
        lengthScanner.close();
        
        Scanner fieldScanner = new Scanner(input);
        StringBuilder decodedField = new StringBuilder();
        for (int i = 0; i < enCount; i++) {
            String binaryString = fieldScanner.next();
            int decimalValue = Integer.parseInt(binaryString, 2);
            int asciiValue = decimalValue - algorithm(enCount);
            
            if (asciiValue < 0) {
                asciiValue = 128 - Math.abs(asciiValue);
            }
            
            decodedField.append(Character.toString((char) asciiValue));
        }
        fieldScanner.close();
        
        return decodedField.toString();
    }
    
    /**
     * The algorithm which determines how much the value of a char will
     * be raised by given the number of characters.
     * @param count the number of characters in the string.
     * @return the value of which a character will be raised by.
     */
    private int algorithm(int count) {
        return (int) (Math.E * (((count - 8) * 6.5) / Math.PI));
    }
    
}
