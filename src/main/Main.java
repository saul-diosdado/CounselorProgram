package main;

import project.Student;
import project.Scholarship;
import project.Email;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Saul Diosdado
 */
public class Main extends javax.swing.JFrame {
    
    public static ArrayList<Student> studentData = new ArrayList<Student>();
    public static ArrayList<Scholarship> scholarData = new ArrayList<Scholarship>();
    public static Email email = new Email();
    
    private final File STUDENTS_FILE = new File("studentdata.txt");
    private final File SCHOLAR_FILE = new File("scholardata.txt");
    private final File SAMPLE_FILE = new File("samplestudents.txt");
    
    private final boolean SAMPLE = true;
    
    public Main() {
        if (SAMPLE) {
            startSampleDatabase();
        } else {
            startDatabase();
        }
        
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTabbedPane = new javax.swing.JTabbedPane();
        studentViewPanel = new view.StudentView();
        scholarshipFilterPanel = new view.ScholarshipView();
        createViewSplitPanel = new javax.swing.JSplitPane();
        scholarshipFormPanel = new forms.ScholarshipForm();
        studentFormPanel = new forms.StudentForm();
        seniorForm = new forms.SeniorForm();
        emailFormPanel = new forms.EmailForm();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(765, 600));
        setPreferredSize(new java.awt.Dimension(765, 600));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        mainTabbedPane.addTab("Student Search", studentViewPanel);
        mainTabbedPane.addTab("Scholarship Search", scholarshipFilterPanel);

        createViewSplitPanel.setDividerLocation(createViewSplitPanel.getWidth() / 2);
        createViewSplitPanel.setDividerSize(1);
        createViewSplitPanel.setRightComponent(scholarshipFormPanel);
        createViewSplitPanel.setLeftComponent(studentFormPanel);

        mainTabbedPane.addTab("Create Student/Scholarship", createViewSplitPanel);
        mainTabbedPane.addTab("Senior Form", seniorForm);
        mainTabbedPane.addTab("Email", emailFormPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainTabbedPane.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void startSampleDatabase() {
        Scanner scan = null;
        try {
            scan = new Scanner(SAMPLE_FILE);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while (scan.hasNextLine()) {
            Scanner lineScan = new Scanner(scan.nextLine());
            Student student = new Student(lineScan.next(), lineScan.next());
            student.setID(lineScan.next());
            student.setGender(lineScan.next());
            student.setGPA(lineScan.next());
            student.setEmail(lineScan.next());
            student.setGrade(lineScan.next());
            student.setEthnicity(lineScan.next());
            
            while (lineScan.hasNext()) {
                student.addCollege(lineScan.next());
            }
            
            studentData.add(student);
        }
    }

    private void startDatabase() {
        FileInputStream fileIS;
        ObjectInputStream objectIS = null;
        
        // Start student database.
        try {
            fileIS = new FileInputStream(STUDENTS_FILE);
            objectIS = new ObjectInputStream(fileIS);
            studentData = (ArrayList<Student>) objectIS.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "Database file not found.", ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Start scholarship database.
        try {
            fileIS = new FileInputStream(SCHOLAR_FILE);
            objectIS = new ObjectInputStream(fileIS);
            scholarData = (ArrayList<Scholarship>) objectIS.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "Scholarship file not found.", ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void closeDatabase() {
        FileOutputStream fileOS;
        ObjectOutputStream objectOS = null;
        
        try {
            fileOS = new FileOutputStream(STUDENTS_FILE);
            objectOS = new ObjectOutputStream(fileOS);
            objectOS.writeObject(studentData);
            objectOS.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            fileOS = new FileOutputStream(SCHOLAR_FILE);
            objectOS = new ObjectOutputStream(fileOS);
            objectOS.writeObject(scholarData);
            objectOS.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (!SAMPLE) {
            closeDatabase();
        }
    }//GEN-LAST:event_formWindowClosing

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        createViewSplitPanel.setDividerLocation(createViewSplitPanel.getWidth() / 2);
        createViewSplitPanel.updateUI();
    }//GEN-LAST:event_formComponentResized

    public static void main(String args[]) {
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane createViewSplitPanel;
    private forms.EmailForm emailFormPanel;
    private javax.swing.JTabbedPane mainTabbedPane;
    private view.ScholarshipView scholarshipFilterPanel;
    private forms.ScholarshipForm scholarshipFormPanel;
    private forms.SeniorForm seniorForm;
    private forms.StudentForm studentFormPanel;
    private view.StudentView studentViewPanel;
    // End of variables declaration//GEN-END:variables
}
