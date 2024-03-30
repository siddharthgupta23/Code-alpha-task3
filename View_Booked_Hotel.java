/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.iterany.planner;

/**
 *
 * @author dell
 */

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
/**
 *
 * @author dell
 */
public class View_Booked_Hotel extends JFrame implements ActionListener {
    JButton  back;
    
    View_Booked_Hotel(String p2)
    {
        setBounds(270,84,765,700);
        getContentPane().setBackground(Color.WHITE);
         JLabel p4=new JLabel ("Id");
        p4.setBounds(60,185,80,25);
        add(p4);
         JLabel l_id=new JLabel ();
         l_id.setBounds(270,185,260,25);
        add( l_id);
        setLayout(null);
        JLabel Text= new JLabel(" view Booked Hotel"); 
        Text.setFont(new Font("Tahoma",Font.BOLD,18));
        Text.setBounds(70,10,325,35);
        add(Text);
        JLabel p8=new JLabel ("username");
        p8.setBounds(60,40,120,60);
        add(p8);
        JLabel une=new JLabel ();
        une.setBounds(270,60,260,25);
        add(une);
        JLabel ig=new JLabel ("Hotel Name");
        ig.setBounds(60,95,80,25);
        add(ig);
        JLabel lp=new JLabel ();
        lp.setBounds(270,95,260,25);
        add(lp);
        
        JLabel tp=new JLabel ("Total Persons");
        tp.setBounds(60,220,80,25);
        add(tp);
        JLabel t_number=new JLabel ();
        t_number.setBounds(270,220,260,25);
        add(t_number);
        JLabel t_days=new JLabel ("Total Days");
        t_days.setBounds(60,265,80,25);
        add(t_days);
        JLabel t_dayss=new JLabel ();
        t_dayss.setBounds(270,265,260,25);
        add(t_dayss);
        JLabel t_ace=new JLabel ("AC/Non-AC");
        t_ace.setBounds(60,310,80,25);
        add(t_ace);
        JLabel t_accee=new JLabel ();
        t_accee.setBounds(270,310,260,25);
        add(t_accee);
        JLabel f_i=new JLabel ("Food Included");
        f_i.setBounds(60,355,80,25);
        add(f_i);
        JLabel t_f=new JLabel ();
        t_f.setBounds(270,355,260,25);
        add(t_f);
      
       
         JLabel gender=new JLabel ("Number");
        gender.setBounds(60,400,80,25);
        add(gender);
        JLabel numb=new JLabel ();
        numb.setBounds(270,400,260,25);
        add(numb);
        JLabel p14=new JLabel ("Phone");
        p14.setBounds(60,455,80,25);
        add(p14);
        JLabel t___phone =new JLabel ();
        t___phone.setBounds(270,455,150,25);
        add(t___phone);
         JLabel t__price=new JLabel ("Total Cost");
        t__price.setBounds(60,500,80,25);
        add(t__price);
        JLabel t_address =new JLabel ();
        t_address.setBounds(270,500,130,25);
        add(t_address);
       
        back = new JButton("Back");
        back.setBackground(Color.blue);
        back.setForeground(Color.green);
        back.setBounds(212,545,130,25);
        back.addActionListener(this);
        add(back);
        ImageIcon i8=new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i9=i8.getImage().getScaledInstance(300, 400,Image.SCALE_DEFAULT);
        ImageIcon i10=new ImageIcon(i9);
        JLabel image=new JLabel(i10);
        image.setBounds(412,35,300, 400);
        add(image);
        
        
        setVisible(true);
        try{
            conn gt=new conn();
            String query="select * from bh where un='"+p2+"'";
            ResultSet ab= gt.jk.executeQuery(query);
            
           
            while(ab.next())
            {
                une.setText(ab.getString("un"));
                l_id.setText(ab.getString("id"));
                 numb.setText(ab.getString("Number"));
                lp.setText(ab.getString("name"));
                 t___phone.setText(ab.getString("Phone"));
                t_number.setText(ab.getString("Persons"));
                t_address.setText(ab.getString("Price"));
                t_f.setText(ab.getString("food"));
                t_accee.setText(ab.getString("ac"));
                t_dayss.setText(ab.getString("days"));
            }
        }catch(Exception e)
        {
            
        }
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
    }
    public static void main(String[] args)
    {
        new View_Booked_Hotel("hgch");
    }
}
