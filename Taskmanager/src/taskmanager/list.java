/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskmanager;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author Imran
 */
public class list extends JPanel {
    public list(){
        GridLayout Layout=new GridLayout(10,1);
        Layout.setVgap(5);
        this.setLayout(Layout);
        //this.setBackground(Color.CYAN);
    }
    public  void indexnum() {
        Component[] listcomp=this.getComponents();
        for (int i = 0; i < listcomp.length; i++) {
            if(listcomp[i] instanceof Task){
                ((Task)listcomp[i]).writeindexj1(i+1);//to write index of task
            }
            
        }
        
    }
    
}
