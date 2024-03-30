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
public class Personal_Details extends JFrame implements ActionListener{
    JLabel une,l_name;
    JComboBox co_id;
    JTextField t_number,t_country,t_address,t_phone,t_email;
    JRadioButton r_male,r_female;
    JButton add,back;
    Personal_Details(String p2)
    {
        setBounds(350,130,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.red);
        JLabel p8=new JLabel("username");
        p8.setBounds(30,60,180,40);
        add(p8);
        une=new JLabel();
        une.setBounds(220,60,180,40);
        add(une);
        JLabel ig=new JLabel("ID");
        ig.setBounds(30,90,180,40);
        add(ig);
        co_id=new JComboBox(new String[] {"passport","Adhar_card","Pan_card","Ration_card"});
        co_id.setBounds(220,90,180,40);
        co_id.setBackground(Color.WHITE);
        add(co_id);
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
        r_male=new JRadioButton("MALE");
        r_male.setBounds(220,220,70,25);
        r_male.setBackground(Color.green);
        add(r_male);
        r_female=new JRadioButton("FEMALE");
        r_female.setBounds(320,220,70,25);
        r_female.setBackground(Color.green);
        add(r_female);
        ButtonGroup bh=new ButtonGroup();
         bh.add(r_male);
         bh.add(r_female);
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
        
        add=new JButton("add");
        add.setBackground(Color.WHITE);
        add.setForeground(Color.PINK);
        add.setBounds(70,430,100,25);
        add.addActionListener(this);
        add(add);
        back=new JButton("back");
        back.setBackground(Color.WHITE);
        back.setForeground(Color.PINK);
        back.setBounds(270,430,100,25);
        back.addActionListener(this);
        add(back);
        ImageIcon i5=new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image i6=i5.getImage().getScaledInstance(275,300,Image.SCALE_DEFAULT);
        ImageIcon i7=new ImageIcon(i6);
        JLabel image=new JLabel(i7);
        image.setBounds(500, 40, 275, 300);
        add(image);
        try {
          conn e=new conn();  
         ResultSet ab= e.jk.executeQuery("select * from account where un='"+p2+"' ");
         while(ab.next())
         {
             une.setText(ab.getString("un"));
             l_name.setText(ab.getString("n"));
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
            String id=(String)co_id.getSelectedItem();
            String number=t_number.getText();
            String name=l_name.getText();
            String gender=null;
            if(r_male.isSelected())
            {
                gender="Male";
            }else
            {
              gender="Female" ;
            }
            String country=t_country.getText();
            String address=t_address.getText();
            String phone=t_phone.getText();
            String email=t_email.getText();
            try{
                conn e=new conn();
                 String query= "insert into ctm values('"+un+"','"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
                 e.jk.executeUpdate(query);
                 JOptionPane.showMessageDialog(null,"Customers Details added successfully");
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
         new Personal_Details("hgch");
    }
}