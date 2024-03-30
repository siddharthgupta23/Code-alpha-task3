/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.iterany.planner;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
/**
 *
 * @author dell
 */
public class login extends JFrame implements ActionListener {
    JButton in,f,n;
      JTextField u1,u2;
      
   
    login()
    {
        setSize(1100,600);
        setLocation(100,85);
        
        setLayout(null);
        getContentPane().setBackground(Color.PINK);
        
       
        JPanel pl =new JPanel();
        pl.setBackground(Color.GREEN);
        
        pl.setBounds(0,0,600,600);
        pl.setLayout(null);
        
        add(pl);
        ImageIcon i5= new ImageIcon (ClassLoader.getSystemResource("icons/login.jpg"));
        Image i8=i5.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i8);
        JLabel image=new JLabel (i6);
        image.setBounds(100,175,200,200);
        pl.add(image);
       
         JPanel p5=new JPanel();
         p5.setLayout(null);
         p5.setBounds(600,30,500,600);
         add(p5);
          JLabel p2=new JLabel("Username");
         p2.setBounds(80,38,86,88);
         p2.setFont(new Font("SAN_SARIF",Font.PLAIN,17));
         p5.add(p2);
        u1 =new JTextField();
         u1.setBounds(80,110,200,20);
         u1.setBorder(BorderFactory.createEmptyBorder());
         
         p5.add(u1);
          JLabel p6=new JLabel("Password");
         p6.setBounds(80,120,86,88);
         p6.setFont(new Font("SAN_SARIF",Font.PLAIN,17));
         p5.add(p6);
          u2 =new JTextField();
         u2.setBounds(80,200,200,20);
         u2.setBorder(BorderFactory.createEmptyBorder());
                   p5.add(u2);
         in =new JButton ("login");
         in.setBounds(120,250,120,30);
         in.setForeground(Color.BLUE);
         in.addActionListener(this);
         p5.add(in);
         n =new JButton ("Sign up");
         n.setBounds(120,320,120,30);
         n.setForeground(Color.BLUE);
         n.setBorder( new LineBorder(new Color(133,193,233)));
         n.addActionListener(this);
         p5.add(n);
           f =new JButton ("forgot password");
         f.setBounds(120,390,170,30);
          f.setBorder( new LineBorder(new Color(133,193,233)));
          
         f.setForeground(Color.BLUE);
          f.setBorder( new LineBorder(new Color(133,193,233)));
         f.addActionListener(this);
      
         p5.add(f);
            
         /*panel4.setBackground(Color.PINK);
         panel4.setBounds(480,390,120,30);
         p5.add(panel4);*/

                 
                 
  
         
           setVisible(true);
    }
    public  void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() ==in)
            
        {
            try
            {
            String p2=u1.getText();
            String p6=u2.getText();
            String query ="select * from account where  un='"+p2+"' AND a ='"+p6+"'";
                conn e= new conn();
                
            ResultSet rs=e.jk.executeQuery(query);
            if(rs.next())
            {
                setVisible(false);
                new Loading(p2);
                
            }else
            {
                JOptionPane.showMessageDialog(null,"incorrect username or password ");
                       }
            
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        else if(ae.getSource() ==n)
        {
            new n();
        }else
        {
            setVisible(false);
            new forgotpassword();
        }
    }
    public static void main(String [] args)
    {
        new login();
        
    }
    
}
