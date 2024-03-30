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
public class Delete_Details extends JFrame implements ActionListener {
    JButton  back;
     String p2;
    Delete_Details(String p2)
    {
        this.p2=p2;
        setBounds(250,25,900,700);
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        JLabel p8=new JLabel ("username");
        p8.setBounds(60,40,120,60);
        add(p8);
        JLabel une=new JLabel ();
        une.setBounds(270,40,260,25);
        add(une);
        JLabel ig=new JLabel ("id");
        ig.setBounds(60,110,80,25);
        add(ig);
        JLabel co_id=new JLabel ();
        co_id.setBounds(270,110,260,25);
        add(co_id);
        JLabel num=new JLabel ("Number");
        num.setBounds(60,170,80,25);
        add(num);
        JLabel t_number=new JLabel ();
        t_number.setBounds(270,170,260,25);
        add(t_number);
        JLabel p4=new JLabel ("Name");
        p4.setBounds(60,250,80,25);
        add(p4);
        JLabel l_name=new JLabel ();
         l_name.setBounds(270,250,260,25);
        add( l_name);
         JLabel gender=new JLabel ("Gender");
        gender.setBounds(60,320,80,25);
        add(gender);
        JLabel l_gender=new JLabel ();
        l_gender.setBounds(270,320,260,25);
        add(l_gender);
        JLabel p14=new JLabel ("country");
        p14.setBounds(400,50,80,25);
        add(p14);
        JLabel t_country =new JLabel ();
        t_country.setBounds(520,50,150,25);
        add(t_country);
         JLabel t__address=new JLabel ("address");
        t__address.setBounds(400,110,80,25);
        add(t__address);
        JLabel t_address =new JLabel ();
        t_address.setBounds(520,110,130,25);
        add(t_address);
        JLabel t__phone=new JLabel ("Phone");
        t__phone.setBounds(400,170,80,25);
        add(t__phone);
        JLabel t_phone =new JLabel ();
         t_phone .setBounds(520,170,130,25);
        add(t_phone);
        JLabel t__email=new JLabel ("Email");
        t__email.setBounds(400,250,80,25);
        add(t__email);
        JLabel t_email =new JLabel ();
         t_email .setBounds(520,250,130,25);
        add(t_email);
        back = new JButton("Delete");
        back.setBackground(Color.ORANGE);
        back.setForeground(Color.PINK);
        back.setBounds(350,370,130,25);
        back.addActionListener(this);
        add(back);
        ImageIcon i8=new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i9=i8.getImage().getScaledInstance(600, 200,Image.SCALE_DEFAULT);
        ImageIcon i10=new ImageIcon(i9);
        JLabel image=new JLabel(i10);
        image.setBounds(20,430,450, 275);
        add(image);
        
        ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i12=i11.getImage().getScaledInstance(600, 200,Image.SCALE_DEFAULT);
        ImageIcon i13=new ImageIcon(i12);
        JLabel image2=new JLabel(i13);
        image2.setBounds(470,430,450, 275);
        add(image2);
        setVisible(true);
        try{
            conn gt=new conn();
            String query="select * from ctm where un='"+p2+"'";
            ResultSet ab= gt.jk.executeQuery(query);
            
           
            while(ab.next())
            {
                une.setText(ab.getString("un"));
                co_id.setText(ab.getString("id"));
                t_number.setText(ab.getString("number"));
                l_name.setText(ab.getString("name"));
                l_gender.setText(ab.getString("gender"));
                t_country.setText(ab.getString("country"));
                t_address.setText(ab.getString("address"));
                t_phone.setText(ab.getString("phone"));
                t_email.setText(ab.getString("email"));
            }
        }catch(Exception e)
        {
            
        }
        
    }
    public void actionPerformed(ActionEvent ae)
    {
     try{
         conn e=new conn();
         e.jk.executeUpdate("delete  from  account where un ='"+p2+"'");
         e.jk.executeUpdate("delete  from  ctm where un ='"+p2+"'");
         e.jk.executeUpdate("delete  from  bz where un ='"+p2+"'");
          e.jk.executeUpdate("delete  from  hotel where un ='"+p2+"'");
            e.jk.executeUpdate("delete  from  bh where un ='"+p2+"'");
            JOptionPane.showMessageDialog(null,"DATA DELOETED UCCESSFULLY");
            System.exit(0);
            
     }catch(Exception e)
     {
         e.printStackTrace();
     }
    }
    public static void main(String[] args)
    {
  new Delete_Details("hgch");
    }
}

