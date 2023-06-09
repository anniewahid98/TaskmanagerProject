/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskmanager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Imran
 */
public class Task extends JPanel{
    private JLabel index;
    private JTextField taskname;
    private JButton done;
    private JButton remove;
    public Task(){
        GridLayout layouttask=new GridLayout(1,4);
        layouttask.setHgap(5);
        this.setPreferredSize(new Dimension(400,20));
        this.setBackground(new Color(255,234,17));
        this.setLayout(layouttask);
        
        index= new JLabel("");
        index.setPreferredSize(new Dimension(10,20));
        index.setHorizontalAlignment(JLabel.LEFT);
        index.setBackground(new Color(255,234,17));
        this.add(this.index);
        
        
        taskname= new JTextField("Enter task");
        taskname.setPreferredSize(new Dimension(10,20));
        taskname.setBorder(BorderFactory.createEmptyBorder());
        taskname.setBackground(new Color(255,234,17));
        this.add(taskname);
        
        
        done=new JButton("Done");
        done.setPreferredSize(new Dimension(10,20));
        this.add(done);
        
        remove=new JButton("Remove");
        remove.setPreferredSize(new Dimension(10,20));
        this.add(this.remove);
    }
    public void writeindexj1(int n){
        this.index.setText(String.valueOf(n));
        this.revalidate();
    }
    public JButton getdonej(){
        return this.done;
    }
     public JButton getremovej(){
        return this.remove;
    }
      public void donestatus(){
         this.taskname.setBackground(Color.green);
         this.index.setBackground(Color.green);
          this.remove.setBackground(Color.green);
           this.done.setBackground(Color.green);
            this.setBackground(Color.green);
            revalidate();
    }
}
