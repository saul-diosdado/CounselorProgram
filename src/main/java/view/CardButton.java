package view;

import dialog.StudentDialog;
import dialog.StudentEditDialog;
import javax.swing.BorderFactory;
import javax.swing.border.BevelBorder;
import main.Main;
import project.Student;

/**
 *
 * @author Saul Diosdado
 */
public class CardButton extends javax.swing.JPanel {

    private Student student;
    private StudentView studentView;
    
    /**
     * Creates a card button with the information of the given student.
     * Also serves as a button.
     * @param student the student information to be displayed.
     */
    public CardButton(Student student, StudentView studentView) {
        this.student = student;
        this.studentView = studentView;
        initComponents();
    }
    
    public CardButton(Student student) {
        this.student = student;
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        horizontalSeparator = new javax.swing.JSeparator();
        verticalSeparator = new javax.swing.JSeparator();
        emailLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        gpaLabel = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nameLabel.setText(student.getName());

        idLabel.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        idLabel.setText("ID#: " + student.getID());

        verticalSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        emailLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        emailLabel.setText("Email: " + student.getEmail());

        phoneLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        phoneLabel.setText("Phone: " + student.getFormattedNumber());

        gpaLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        gpaLabel.setText("GPA: " + student.getGPA());

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(horizontalSeparator)
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verticalSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(phoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gpaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verticalSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(emailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gpaLabel))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(horizontalSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        if (studentView != null) {
            int startSize = Main.studentData.size();

            this.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
            new StudentEditDialog(null, true, student).display(this.getTopLevelAncestor());
            this.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

            if (Main.studentData.size() != startSize) {
                studentView.update();
            } else {
                this.update();
            }
        } else {
            this.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
            new StudentDialog(null, true, student).display(this.getTopLevelAncestor());
            this.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        }
    }//GEN-LAST:event_formMousePressed

    private void update() {
        nameLabel.setText(student.getName());
        idLabel.setText("ID#: " + student.getID());
        emailLabel.setText("Email: " + student.getEmail());
        phoneLabel.setText("Phone: " + student.getFormattedNumber());
        gpaLabel.setText("GPA: " + student.getGPA());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel gpaLabel;
    private javax.swing.JSeparator horizontalSeparator;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JSeparator verticalSeparator;
    // End of variables declaration//GEN-END:variables
}
