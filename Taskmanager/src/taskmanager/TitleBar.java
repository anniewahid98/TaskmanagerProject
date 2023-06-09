
package taskmanager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitleBar extends JPanel {
    JLabel TitleText= new JLabel("To-do List");
    public TitleBar (){
        this.setPreferredSize(new Dimension(400,80));
        this.setBackground(new Color (90,143,123));
       TitleText.setPreferredSize(new Dimension(200,80));
       TitleText.setFont(new Font("Sans-serif",Font.BOLD,18));
       TitleText.setHorizontalAlignment(JLabel.CENTER);
       this.add(this.TitleText);
    }
    
}
