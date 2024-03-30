/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.iterany.planner;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author dell
 */
public abstract class   ti extends JFrame  implements Runnable{
    Thread thread;
    ti()
    {
   //     setSize(1000,800);
    //    setLocation(200,20);
      
        
       
        ImageIcon obj= new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
           Image d=obj.getImage().getScaledInstance(1000,800,Image.SCALE_DEFAULT);
            ImageIcon e= new ImageIcon(d);
     
       JLabel image =new JLabel(e);
        
        add(image);
        
       setVisible(true);
        thread =new Thread(this);  
        thread.start();
      
    }
   
  
    public void run()
    {
        try{
           Thread.sleep(7000); 
           setVisible(false);
        }catch(Exception e)
        {
            
        }
    }
    public static void main(String[] args)
    {
        ti frame =new ti() {};
        int x=1;
        for(int i=1; i<=4500; x+=15,i+=24)
        {
          frame.setLocation(750-(x+i)/2,400-(i/2));
          frame.setSize(x+i,i);
          try
          {
              Thread.sleep(80);
          }
          catch(Exception e){}
          
          
        }
    }
}
