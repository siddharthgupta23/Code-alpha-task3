/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.iterany.planner;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

/**
 *
 * @author dell
 */
public class update_Customer  extends JFrame implements ActionListener{

    JLabel une,l_name;
 
    JTextField t_number,t_country,t_address,t_phone,t_email,  t_idgh,t_gender;
   JRadioButton r_male;
    JButton add,back;
 update_Customer (String p2)
    {
        setBounds(200,100,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.red);
        JLabel bcd=new JLabel("UPDATE CUSTOMER DETAILS");
        bcd.setBounds(50,0,300,25);
        add(bcd);
        JLabel p8=new JLabel("username");
        p8.setBounds(30,60,180,40);
        add(p8);
        une=new JLabel();
        une.setBounds(220,60,180,40);
        add(une);
        JLabel ig=new JLabel("ID");
        ig.setBounds(30,90,180,40);
        add(ig);
       t_idgh =new JTextField();
        t_idgh.setBounds(220,140,150,25);
        add(t_idgh);
        JLabel num=new JLabel("Number");
        num.setBounds(30,130,180,40);
        add(num);
        t_number =new JTextField();
        t_number.setBounds(220,140,150,25);
        add(t_number);
         JLabel p4=new JLabel("Name");
        p4.setBounds(30,170,180,40);
        add(p4);
        
        l_name=new JLabel();
        l_name.setBounds(220,170,150,25);
        add(l_name);
         JLabel gender=new JLabel("Gender");
        gender.setBounds(30,220,180,40);
        add(gender);
        
        t_gender =new JTextField();
        t_gender.setBounds(220,220,150,25);
        add(t_gender);
      
        JLabel p14=new JLabel("country");
        p14.setBounds(30,260,180,40);
        add(p14);
        t_country =new JTextField();
        t_country.setBounds(220,260,150,25);
        add(t_country);
        JLabel t__address=new JLabel("address");
        t__address.setBounds(30,290,180,40);
        add(t__address);
        t_address =new JTextField();
        t_address.setBounds(220,290,150,25);
        add(t_address);
       JLabel t__phone=new JLabel("phone");
        t__phone.setBounds(30,330,180,40);
        add(t__phone);
        t_phone =new JTextField();
        t_phone.setBounds(220,330,150,25);
        add(t_phone);
        JLabel t__email=new JLabel("email");
        t__email.setBounds(30,370,180,40);
        add(t__email);
        t_email =new JTextField();
        t_email.setBounds(220,370,150,25);
        add( t_email);
        
        add=new JButton("Update");
        add.setBackground(Color.WHITE);
        add.setForeground(Color.blue);
        add.setBounds(70,430,100,25);
        add.addActionListener(this);
        add(add);
        back=new JButton("back");
        back.setBackground(Color.WHITE);
        back.setForeground(Color.blue);
        back.setBounds(270,430,100,25);
        back.addActionListener(this);
        add(back);
        ImageIcon i5=new ImageIcon(ClassLoader.getSystemResource("icons/update.jpg"));
        Image i6=i5.getImage().getScaledInstance(275,300,Image.SCALE_DEFAULT);
        ImageIcon i7=new ImageIcon(i6);
        JLabel image=new JLabel(i7);
        image.setBounds(500, 40, 275, 300);
        add(image);
        try {
          conn e=new conn();  
         ResultSet ab= e.jk.executeQuery("select * from ctm where un='" +p2+"' ");
         while(ab.next())
         {
             une.setText(ab.getString("un"));
             l_name.setText(ab.getString("name"));
             t_idgh.setText(ab.getString("id"));
             t_number.setText(ab.getString("number"));
             t_gender.setText(ab.getString("gender"));
             t_country.setText(ab.getString("country"));
             t_address.setText(ab.getString("address"));
             t_phone.setText(ab.getString("phone"));
             t_email.setText(ab.getString("email"));
             
         }
        }catch(Exception e)
        {
          e.printStackTrace();  
        }
        setVisible(true);
        
        
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()== add)
        {
            String un=une.getText();
            String id=t_idgh.getText();
            String number=t_number.getText();
            String name=l_name.getText();
            String gender=t_gender.getText();
            
            String country=t_country.getText();
            String address=t_address.getText();
            String phone=t_phone.getText();
            String email=t_email.getText();
            try{
                conn e=new conn();
                 String query= "update  ctm set un='"+un+"',id= '"+id+"',number='"+number+"',name='"+name+"',gender='"+gender+"',country='"+country+"',address='"+address+"',phone='"+phone+"',email='"+email+"'";
                 e.jk.executeUpdate(query);
                 JOptionPane.showMessageDialog(null,"Customers Details updated successfully");
                 setVisible(false);
            }  
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }else
        {
            setVisible(false);
    } 
    }
    
    public static void main(String[] args)
    {
      new  update_Customer("hgch");
    }
}  

