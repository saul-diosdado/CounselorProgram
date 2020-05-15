package view;

import dialog.SearchDialog;
import javax.swing.JFrame;
import main.Main;

/**
 * Checklist view form used to hold all of the students in the database's
 * checklist panel.
 * 
 * @see ChecklistPanel
 * @author Saul Diosdado
 */
public class ChecklistView extends javax.swing.JPanel {
    
    private JFrame parent;

    public ChecklistView() {
        initComponents();
        this.start();
    }
    
    public void setParet(JFrame parent) {
        this.parent = parent;
    }
    
    public void start() {
        for (int i = Main.studentData.size() - 1; i >= 0; i--) {
            checklistPanel.add(Main.studentData.get(i).getChecklistPanel());
        }
        
        checklistPanel.updateUI();
    }
    
    public void update() {
        checklistPanel.removeAll();
        
        for (int i = Main.studentData.size() - 1; i >= 0; i--) {
            checklistPanel.add(Main.studentData.get(i).getChecklistPanel());
        }
        
        checklistPanel.updateUI();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checklistScrollPane = new javax.swing.JScrollPane();
        checklistPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        bottomPanel = new javax.swing.JPanel();
        addCollegeButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        checklistPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 222), 10));
        checklistPanel.setLayout(new javax.swing.BoxLayout(checklistPanel, javax.swing.BoxLayout.Y_AXIS));
        checklistScrollPane.setViewportView(checklistPanel);

        add(checklistScrollPane, java.awt.BorderLayout.CENTER);

        topPanel.add(new ChecklistItemView());
        topPanel.setLayout(new java.awt.GridLayout(1, 0));
        add(topPanel, java.awt.BorderLayout.PAGE_START);

        addCollegeButton.setText("Add College");
        addCollegeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCollegeButtonActionPerformed(evt);
            }
        });

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refreshButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(addCollegeButton)
                .addGap(14, 14, 14))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCollegeButton)
                    .addComponent(refreshButton))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        add(bottomPanel, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void addCollegeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCollegeButtonActionPerformed
        new SearchDialog(parent, true, SearchDialog.SEARCH_STUDENT).display(parent);
    }//GEN-LAST:event_addCollegeButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        this.update();
    }//GEN-LAST:event_refreshButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCollegeButton;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JPanel checklistPanel;
    private javax.swing.JScrollPane checklistScrollPane;
    private javax.swing.JButton refreshButton;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
