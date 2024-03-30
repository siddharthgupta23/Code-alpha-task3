/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.iterany.planner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author dell
 */
public class Payement extends JFrame  implements ActionListener {
    JButton pay,back;
 Payement()
 {
     setBounds(500,200,700,500);
     setLayout(null);
     ImageIcon i2=new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
     Image i3= i2.getImage().getScaledInstance(700,500, Image.SCALE_DEFAULT);
     ImageIcon i4= new ImageIcon(i3);
     JLabel image =new JLabel(i4);
     image.setBounds(0,0,700,500);
     add(image);
     pay=new JButton("pay");
     pay.setBounds(390,0,80,40);
     pay.addActionListener(this);
     add(pay);
     back=new JButton("Back");
     back.setBounds(400,0,80,40);
     back.addActionListener(this);
     add(back);
     setVisible(true);
     
 }
 public void actionPerformed(ActionEvent ae)
 {
     if (ae.getSource()== pay)
     {
         setVisible(false);
         new paytm();
     }
     else{
         setVisible(false);
     }
 }
public static  void main(String[] args)
{
new Payement();
}
}