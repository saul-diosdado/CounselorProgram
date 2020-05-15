package main;

import forms.EmailForm;
import forms.ScholarshipForm;
import forms.SeniorForm;
import forms.StudentForm;
import project.Student;
import project.Scholarship;
import project.Email;
import view.CreateView;
import view.ChecklistView;
import view.ScholarshipView;
import view.StudentView;
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
import javax.swing.JScrollPane;

/**
 *
 * @author Saul Diosdado
 */
public class Main extends javax.swing.JFrame {
    
    private StudentForm studentForm;
    private ScholarshipForm scholarshipForm;
    private EmailForm emailForm;
    
    private ChecklistView checklistView;
    private CreateView createView;
    private StudentView studentView;
    
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
        initCustomComponents();
        this.setLocationRelativeTo(null);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTabbedPane = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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

    public void initCustomComponents() {
        studentForm = new StudentForm();
        scholarshipForm = new ScholarshipForm();
        emailForm = new EmailForm(this);
        checklistView = new ChecklistView();
        studentView = new StudentView();
        
        studentForm.setChecklistView(checklistView);
        studentForm.setStudentView(studentView);
        
        checklistView.setParet(this);
        
        createView = new CreateView(studentForm, scholarshipForm);
        JScrollPane pane = new JScrollPane();
        pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        pane.setViewportView(new SeniorForm());
        
        mainTabbedPane.add(studentView, "Student Database");
        mainTabbedPane.add(new ScholarshipView(), "Scholarship Filter");
        mainTabbedPane.add(createView, "Create");
        mainTabbedPane.add(checklistView, "Checklist");
        mainTabbedPane.add(emailForm, "Email");
        mainTabbedPane.add(pane, "Form");
    }
    
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
    private javax.swing.JTabbedPane mainTabbedPane;
    // End of variables declaration//GEN-END:variables
}
