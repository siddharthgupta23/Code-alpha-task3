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
/*public class forgotpassword  extends JFrame {
    JTextField f;
   
    forgotpassword()
    {
        setBounds(150,45,1200,590);
        getContentPane().setBackground(Color.RED);
        setLayout(null);
        ImageIcon  i7=new ImageIcon (ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i8=i7.getImage().getScaledInstance(275, 275, Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel image  =new JLabel (i9);
        image.setBounds(700,90,275,275);
        add(image);
         JPanel p1 =new JPanel();
        p1.setBounds(80,37,600,800);
        add(p1);
        JLabel p2=new JLabel("username ");
        p2.setFont(new Font("Times New Roman",Font.BOLD,18));
        p2.setBounds(40,20,100,25);
        p1.add(p2);
        
        f=new JTextField();
        f.setBounds(220,20,150,25);
        f.setBorder(BorderFactory.createEmptyBorder());
        p1.add (f);
       /* t=new JButton("search");
        t.setBackground(Color.pink);
        t.setForeground(Color.blue);
        t.setBounds(600,37,200,60);
        p1.add(t);
        
          JLabel p4=new JLabel("Name ");
               p4.setBounds(40,97,150,40);
        p4.setFont(new Font("Times New Roman",Font.ITALIC,18));
        p1.add(p4);
        
        w=new JTextField();
        w.setBounds(180,97,150,40);
        w.setBorder(BorderFactory.createEmptyBorder());
        p1.add (w);
         JLabel p6=new JLabel("Security question you have given  ");
          p6.setBounds(40,145,150,40);
        p6.setFont(new Font("Times New Roman",Font.ITALIC,18));
        p1.add(p6);
        
        s=new JTextField();
        s.setBounds(180,145,150,40);
        s.setBorder(BorderFactory.createEmptyBorder());
        p1.add (s);
        
        
        
        
        
       
        
        setVisible(true);
        
        
        
    }
    public static void main(String[] args)
    {
        new forgotpassword();
    }
}*/


public class forgotpassword extends JFrame implements ActionListener {
    JTextField f,w,s,i,L;
    JButton t,answer_retrieve,g;

   forgotpassword()  {
        setBounds(170, 45, 1200, 590);
        getContentPane().setBackground(Color.RED);
        setLayout(null); // Avoid using null layout. Consider using layout managers for better component positioning.

         ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
         Image i8 = i7.getImage().getScaledInstance(275, 275, Image.SCALE_DEFAULT);
         ImageIcon i9 = new ImageIcon(i8);
         JLabel image = new JLabel(i9);
        image.setBounds(700, 90, 275, 275);
        add(image);

        JPanel p1 = new JPanel();
        p1.setBounds(80, 37, 600, 800);
        p1.setBackground(Color.pink); 
        p1.setLayout(null); 
        add(p1);

        JLabel p2 = new JLabel("Username:");
        p2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
        p2.setBounds(80, 20, 100, 35);
        p1.add(p2);

        f = new JTextField();
        f.setBounds(200, 20, 170, 35); 
         f.setBorder(BorderFactory.createEmptyBorder());
        p1.add(f);
        t=new JButton("search");
        t.setBackground(Color.orange);
        t.setForeground(Color.blue);
        t.setBounds(400,20,200,35);
        t.addActionListener(this);

        p1.add(t);
          JLabel p4=new JLabel("Name ");
               p4.setBounds(80,70,170,35);
        p4.setFont(new Font("Times New Roman",Font.ITALIC,18));
        p1.add(p4);
        
        w=new JTextField();
        w.setBounds(200,70,170,35);
        w.setBorder(BorderFactory.createEmptyBorder());
        p1.add (w);
         JLabel p6=new JLabel("Given Security question ");
          p6.setBounds(20,135,270,35);
        p6.setFont(new Font("Times New Roman",Font.ITALIC,18));
        p1.add(p6);
        
        s=new JTextField();
        s.setBounds(200,135,170,35);
        s.setBorder(BorderFactory.createEmptyBorder());
        p1.add (s);
            JLabel p7=new JLabel("answer");
     p7.setFont(new Font("Times new Roman",Font.ITALIC,18));
     p7.setBounds(80,187,100,35);
     p1.add(p7);
       i= new JTextField();
      i.setBounds(200,187,170,35);
    i.setBorder(BorderFactory.createEmptyBorder());
    p1.add(i);
     answer_retrieve=new JButton("answer_retrieve");
        answer_retrieve.setBackground(Color.green);
       answer_retrieve.setForeground(Color.yellow);
       answer_retrieve.setBounds(400,187,200,35);
        answer_retrieve.addActionListener(this);
        p1.add(answer_retrieve);
         JLabel p5=new JLabel("Password");
     p5.setFont(new Font("Times new Roman ",Font.ITALIC,18));
     p5.setBounds(80,247,170,35);
     
     p1.add(p5);
      L= new JTextField();
      L.setBounds(200,247,170,35);
    L.setBorder(BorderFactory.createEmptyBorder());
    p1.add(L);
     g=new JButton("back");
 g.setBackground(Color.orange);
 g.setForeground(Color.gray);
 g.setFont(new Font("arial",Font.ITALIC,18));

g.setBounds(150,322,170,35);
 g.addActionListener(this);
       p1.add(g); 
        

        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
public void actionPerformed (ActionEvent ae) 
{
    if(ae.getSource()== t)
    {
        try
        {
        String query ="select * from account where un ='"+f.getText()+"'";
        conn e=new conn();
       ResultSet rs= e.jk.executeQuery(query);
       while(rs.next())
               {
                  w.setText( rs.getString("n"));
                   s.setText(rs.getString("security"));
                   
                   
               }
                
    }catch(Exception e)
    {
        e.printStackTrace();
            
            }
    }
    else if(ae.getSource() == answer_retrieve)
    {
        try
        {
        String query ="select * from account where an ='"+i.getText()+"'AND un ='"+f.getText()+"'";
        conn e=new conn();
       ResultSet rs= e.jk.executeQuery(query);
       while(rs.next())
               {
                  L.setText( rs.getString("a"));
                  
                   
                   
               }
                
    }catch(Exception e)
    {
        e.printStackTrace();
            
            }
        
    }
    else 
    {
        setVisible(false);
        new login();
        
        
    }
}
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new forgotpassword());
    }
}

