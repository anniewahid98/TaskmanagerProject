/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskmanager;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.List;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Imran
 */
public class AppFrame extends JFrame {
    private JButton addtask;
    private JButton delete;
    TitleBar title =new TitleBar();
    ButttonPanel btnpanel=new ButttonPanel();
    list list1 = new list();
    public AppFrame(){
        this.setSize(400,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(this.title,BorderLayout.NORTH);
        this.add(this.btnpanel,BorderLayout.SOUTH);
        this.add(this.list1,BorderLayout.CENTER);
         
        addtask= btnpanel.getaddtaskbtn();
        delete=btnpanel.getdelbtn();
        addlistener();
        
    }
    public void addlistener(){
        addtask.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                Task task=new Task();
                list1.add(task);
                list1.indexnum();
                revalidate();
                
                JButton done=task.getdonej();
                done.addMouseListener(new MouseAdapter(){
                      @Override
            public void mousePressed(MouseEvent e){
                task.donestatus();
                  revalidate();
            }
                });
                JButton remove=task.getremovej();
                remove.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                list1.remove(task);
                list1.indexnum();
                revalidate();
                repaint();
            }
                
                
               
            
        } );
                
        
            
   }  
            
    });
        delete.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
            
               Component[] tasklist=list1.getComponents();
                for (int i = 0; i < tasklist.length; i++) {
                    if(tasklist[i] instanceof Task){
                        list1.remove((Task)tasklist[i]);
                    }
                    
                }
                revalidate();
                repaint();
            }
            });
    }
        
 }