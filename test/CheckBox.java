
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;


/**
 *
 * @author Saul Diosdado
 */
public class CheckBox {

    public static void main(String[] args) {
        new CheckBox();
    }
    
    JFrame frame;
    JCheckBox box;
    
    public CheckBox() {
        frame = new JFrame();
        box = new JCheckBox();
        
        frame.add(box);
        
        box.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println(box.isSelected());
            }
        });
        
        frame.setVisible(true);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
