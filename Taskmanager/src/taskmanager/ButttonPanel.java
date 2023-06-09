
package taskmanager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class ButttonPanel extends JPanel{
    private JButton addtask;
    private JButton delete;
    Border emptyborder=BorderFactory.createEmptyBorder();
    
    public ButttonPanel(){
        this.setPreferredSize(new Dimension(400,80));
         this.setBackground(new Color (129,202,207));
         
         addtask=new JButton("Add task");
         
         addtask.setBorder(emptyborder);
         addtask.setFont(new Font("Sans-serif",Font.PLAIN,20));
         this.add(addtask);
         this.add(Box.createHorizontalStrut(20));
         delete= new JButton("Delete task");
         delete.setBorder(emptyborder);
         delete.setFont(new Font("Sans-serif",Font.PLAIN,20));
         this.add(delete);
        
    }
    public JButton getaddtaskbtn(){
        return addtask;
        
    }
    public JButton getdelbtn(){
        return delete;
        
    }
    
}
