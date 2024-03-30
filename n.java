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
public class n extends JFrame implements ActionListener{
    JButton d,g; 
    JTextField  f,w,L,i;
    Choice s;
   n()
   {
      setBounds(350,200,1000,500);
      getContentPane().setBackground(Color.pink);
      setLayout (null);
      
      JPanel p1=new JPanel();
      p1.setBackground(Color.RED);
      p1.setBounds(0,0,500,600);
      p1.setLayout(null);
     add(p1);
     JLabel p2=new JLabel("Username");
     p2.setFont(new Font("tohama",Font.BOLD,14));
     p2.setBounds(40,50,100,20);
     p1.add(p2);
     f= new JTextField();
      f.setBounds(190,50,100,20);
    f.setBorder(BorderFactory.createEmptyBorder());
    p1.add(f);
      JLabel p4=new JLabel("Name");
     p4.setFont(new Font("tohama",Font.BOLD,14));
     p4.setBounds(40,120,100,20);
     p1.add(p4);
      w= new JTextField();
      w.setBounds(190,120,100,20);
    w.setBorder(BorderFactory.createEmptyBorder());
    p1.add(w);
     JLabel p5=new JLabel("Password");
     p5.setFont(new Font("tohama",Font.BOLD,14));
     p5.setBounds(40,190,100,20);
     p1.add(p5);
      L= new JTextField();
      L.setBounds(190,190,100,20);
    L.setBorder(BorderFactory.createEmptyBorder());
    p1.add(L);
      JLabel p6=new JLabel("Security Question");
     p6.setFont(new Font("tohama",Font.BOLD,14));
     p6.setBounds(40,190,140,120);
     p1.add(p6);
      s=new Choice();
     s.add(" favourite story");
     s.add("favourite  super hero");
     s.add(" your  favourite game");
     s.setBounds(190,240,190,70);
     p1.add(s);
         JLabel p7=new JLabel("answer");
     p7.setFont(new Font("tohama",Font.BOLD,14));
     p7.setBounds(40,280,100,20);
     p1.add(p7);
       i= new JTextField();
      i.setBounds(190,280,100,20);
    i.setBorder(BorderFactory.createEmptyBorder());
    p1.add(i);
  d=new JButton("create");
 d.setBackground(Color.orange);
 d.setForeground(Color.gray);
 d.setFont(new Font("arial",Font.BOLD,14));
d.setBounds(80,320,100,30);
d.addActionListener(this);
p1.add(d);
 g=new JButton("back");
 g.setBackground(Color.orange);
 g.setForeground(Color.gray);
 g.setFont(new Font("arial",Font.BOLD,14));
g.setBounds(320,320,100,30);
g.addActionListener(this);
p1.add(g);
 ImageIcon i5= new ImageIcon (ClassLoader.getSystemResource("icons/signup.jpeg"));
        Image i8=i5.getImage().getScaledInstance(350,350,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i8);
        JLabel image=new JLabel (i6);
        image.setBounds(600,100,350,350);
        add(image);

     
     
     
    
     
      setVisible(true);
      
   }
   public void actionPerformed (ActionEvent ae)
   {
       if(ae.getSource() == d)
         
       {
         String un=f.getText();  
         String n=w.getText();
         String a=L.getText();
         String q=s.getSelectedItem();
         String an=i.getText();
         String query="insert into account values('"+un+"','"+n+"','"+a+"','"+q+"','"+an+"')";
         try
         {
             
             conn e =new conn();
             e.jk.executeUpdate(query);
             JOptionPane.showMessageDialog(null,"Account has been created succeessfullty");
             setVisible(false);
             new login();
         }catch(Exception e)
         {
             e.printStackTrace();
         }
       }else if (ae.getSource() == g)
       {
           setVisible(false);
           new login();
           
       }
   }
   public static void main(String[] args)
   {
       new n();
}
}