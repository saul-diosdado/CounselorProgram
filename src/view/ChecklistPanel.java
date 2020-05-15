package view;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

/**
 * Checklist student panel. Will be used to keep track of students that have
 * been accepted to a college and what the counselor still needs to do. Will be
 * will be updated when the a new college is added to the student.
 * @author Saul Diosdado
 */
public class ChecklistPanel extends JPanel {
    
    private final String DEFAULT_FONT_NAME = "Dialog"; 
    
    private String college;
    
    /**
     * Creates a checklist panel for each college.
     * @param college the name of the college.
     */
    public ChecklistPanel(String college) {
        this.college = college;
        initComponents();
    }
    
    public void initComponents() {
        checkBox = new JCheckBox[4];
        schoolLabel = new JLabel();
        checkPanel = new JPanel();
        
        for (int i = 0; i < 4; i++) {
            checkBox[i] = new JCheckBox();
            checkBox[i].setFocusable(true);
            checkBox[i].setHorizontalAlignment(SwingConstants.CENTER);
        }
        
        this.setLayout(new GridLayout(1, 2, 30, 30));
        this.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        
        schoolLabel.setText(college);
        schoolLabel.setFont(new Font(DEFAULT_FONT_NAME, Font.ITALIC, 14));
        schoolLabel.setHorizontalAlignment(JLabel.CENTER);
        
        checkPanel.setLayout(new GridLayout(1, checkBox.length, 10, 10));
        
        this.add(schoolLabel);
        this.add(checkPanel);
        
        for (JCheckBox box : checkBox) {
            checkPanel.add(box);
        }
        
        this.setVisible(true);
    }
    
    // Checklist panel components
    private JCheckBox[] checkBox;
    private JLabel schoolLabel;
    private JPanel checkPanel;

}
