package view;

/**
 *
 * @author diosdados
 */
public class ChecklistItemView extends javax.swing.JPanel {
    
    private String[] columnNames = new String[] {"1", "2", "3", "4"};

    /**
     * Creates the column header on the checklist view.
     */
    public ChecklistItemView() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemPanel = new javax.swing.JPanel();
        itemOne = new javax.swing.JLabel();
        itemTwo = new javax.swing.JLabel();
        itemThree = new javax.swing.JLabel();
        itemFour = new javax.swing.JLabel();

        itemPanel.setLayout(new java.awt.GridLayout(1, 0));

        itemOne.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        itemOne.setText(columnNames[0]);
        itemPanel.add(itemOne);

        itemTwo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        itemTwo.setText(columnNames[1]);
        itemPanel.add(itemTwo);

        itemThree.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        itemThree.setText(columnNames[2]);
        itemPanel.add(itemThree);

        itemFour.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        itemFour.setText(columnNames[3]);
        itemPanel.add(itemFour);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 79, Short.MAX_VALUE)
                .addComponent(itemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel itemFour;
    private javax.swing.JLabel itemOne;
    private javax.swing.JPanel itemPanel;
    private javax.swing.JLabel itemThree;
    private javax.swing.JLabel itemTwo;
    // End of variables declaration//GEN-END:variables
}
