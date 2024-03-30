/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.iterany.planner;
import javax.swing.*;
import java.awt.*;

import java.sql.*;
import java.awt.event.*;
/**
 *
 * @author dell
 */
public class Destinations extends JFrame implements Runnable {
    Thread t1;
    JLabel caption;
    JLabel b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    JLabel[] lbt =new JLabel[]{b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12};
    public void run()
    {
        String[] text= new String[]{"JW Marriot Hotel","Madarian Orientation Hotel","Four seasons Hotel","Raddison Blue Hotel","Green Huts","mariene Blue Hotel ","Classio Hotel ","Green Hotel","vishram","Breeze Blow Hotel","Mountain_View Hotel"};
        try{
            for(int i=0;i<=11;i++)
            {
                lbt[i].setVisible(true);
                /*caption.setText(text[i]);*/
                Thread.sleep(2700);
                lbt[i].setVisible(false);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
Destinations ()
{
    
    setBounds(456,125,500,400);
    caption=new  JLabel();
    caption.setBounds(50,300,1000,70);
    caption.setFont(new Font("Tahoma",Font.PLAIN,35));
    caption.setForeground(Color.PINK);
    add(caption);
 ImageIcon i1=null,i2=null,i3=null,i4=null,i5=null,i6=null,i7=null,i8=null,i9=null,i10=null,i11=null,i12=null;
 ImageIcon[] image =new ImageIcon[]{ i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12};
 Image h1=null,h2=null,h3=null,h4=null,h5=null,h6=null,h7=null,h8=null,h9=null,h10=null,h11=null,h12=null;
 Image[] himage =new Image[]{ h1,h2,h3,h4,h5,h6,h7,h8,h9,h10,h11,h12};
 ImageIcon k1=null,k2=null,k3=null,k4=null,k5=null,k6=null,k7=null,k8=null,k9=null,k10=null,k11=null,k12=null;
 ImageIcon[] kimage =new ImageIcon[]{ k1,k2,k3,k4,k5,k6,k7,k8,k9,k10,k11,k12};
for (int i=0;i<=11;i++)
    {
 
  image [i]=new  ImageIcon(ClassLoader.getSystemResource("icons/dest"+(i+1)+".jpg"));
 himage[i]=image[i].getImage().getScaledInstance(500,400, Image.SCALE_DEFAULT);
 kimage[i]=new ImageIcon(himage[i]);
 lbt[i]= new JLabel(kimage[i]);
  lbt[i].setBounds(0, 0,500, 400);
 add( lbt[i]);
    }
 setVisible(true);
 t1=new Thread(this);
 t1.start();

}
public  static void main (String[] args)
{
 new Destinations();
}
}

