/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.iterany.planner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
/**
 *
 * @author dell
 */
public class Loading  extends JFrame implements Runnable {
    Thread t;
   JProgressBar dgh;
   String p2;
    public void run()
    {
        try
        {
            for(int i=5;i<=110;i++)
            {
                int maximum=dgh.getMaximum();
                int val=dgh.getValue();
                if(val<maximum)
                {
                    dgh.setValue(dgh.getValue()+1);
                    
                }
                else
                {
                    setVisible(false);
                    new Dashboard(p2);
                }
                Thread.sleep(50);
                
            }
        }catch(Exception e)
        {
           e.printStackTrace(); 
        }
    }
    
    Loading(String p2)
    {
        this.p2=p2;
        t=new Thread(this);
                
       setBounds(200,100,1200,700);
       getContentPane().setBackground(Color.gray);
       setLayout(null);
      
       JLabel bgn=new JLabel (" Travel Iterany Planner");
       bgn.setBounds(80,60,800,100);
       bgn.setForeground(Color.PINK);
       bgn.setFont(new Font("Raleway",Font.BOLD,55));
       add(bgn);
       
      dgh= new JProgressBar();
       dgh.setBounds(280,180,400,40);
       dgh.setStringPainted(true);
       add(dgh);
        JLabel loading=new JLabel (" Loading program -please  wait for few seconds ");
       loading.setBounds(80,220,1200,80);
        loading.setForeground(Color.PINK);
       loading.setFont(new Font("tahoma",Font.ITALIC,25));
       add(loading);
       JLabel p6=new JLabel (" welcome "+p2);
       p6.setBounds(40,600,400,70); 
       p6.setForeground(Color.green);
       p6.setFont(new Font("tahoma",Font.ITALIC,55));
       add(p6);
       t.start();
       setVisible(true);
       
    }
    public  static void main(String[] args)
    {
        new Loading("");
    }

}

