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
public class Dashboard  extends JFrame implements ActionListener{
    String p2;
    JButton addpd,viewpd,uppd,cp,vp,vh,bd,vbh,ds,cal,not,about,abj,dpd;
    JButton pay;
    Dashboard(String p2)
    {
        this.p2=p2;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.RED);
        p1.setBounds(0,0,1600,65);
        add(p1);
        ImageIcon i6= new ImageIcon(ClassLoader.getSystemResource("icons/dasboard.jpg"));
        Image i9=i6.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i10 =new ImageIcon(i9);
        JLabel icon =new JLabel(i10);
        icon.setBounds(5,0,80,80);
        p1.add(icon);
        JLabel heading =new JLabel("Dashboard");
        heading.setBounds(80,10,300,64);
        heading.setForeground(Color.gray);
        heading.setFont(new Font("tahoma",Font.BOLD,55));
        p1.add(heading);
        JPanel p8= new JPanel();
         p8.setBounds(0,65,320,900);
        p8.setLayout(null);
        p8.setBackground(Color.RED);
        add(p8);
         addpd=new JButton("Personal Details");
        addpd.setBounds(0,0,320,55);
        addpd.setBackground(Color.red);
        addpd.setBackground(Color.PINK);
        addpd.setFont(new Font("Tahoma",Font.PLAIN,28));
        addpd.addActionListener(this);
        addpd.setMargin(new Insets(0,0,0,30));
        p8.add(addpd);
        
         uppd=new JButton ("Update Personal Details");
        uppd.setBounds(0,55,320,45);
        uppd.setBackground(Color.red);
        uppd.setBackground(Color.PINK);
        uppd.setFont(new Font("Tahoma",Font.PLAIN,18));
        uppd.setMargin(new Insets(0,0,0,20));
        uppd.addActionListener(this);
        p8.add(uppd);
        viewpd=new JButton ("View Personal Details");
        viewpd.setBounds(0,100,320,45);
        viewpd.setBackground(Color.red);
        viewpd.setBackground(Color.PINK);
        viewpd.setFont(new Font("Tahoma",Font.PLAIN,18));
        viewpd.setMargin(new Insets(0,0,0,35));
        viewpd.addActionListener(this);
        p8.add(viewpd);
          dpd=new JButton ("Delete Personal Details ");
        dpd.setBounds(0,145,320,45);
        dpd.setBackground(Color.red);
        dpd.setBackground(Color.PINK);
        dpd.setFont(new Font("Tahoma",Font.PLAIN,18));
        dpd.setMargin(new Insets(0,0,0,35));
        dpd.addActionListener(this);
        p8.add(dpd);
        cp=new JButton ("Check Packages");
        cp.setBounds(0,190,320,45);
        cp.setBackground(Color.red);
        cp.setBackground(Color.PINK);
        cp.setFont(new Font("Tahoma",Font.PLAIN,18));
        cp.addActionListener(this);
        cp.setMargin(new Insets(0,0,0,35));
        p8.add(cp);
           vp=new JButton (" Book Package");
        vp.setBounds(0,235,320,45);
        vp.setBackground(Color.red);
        vp.setBackground(Color.PINK);
        vp.setFont(new Font("Tahoma",Font.PLAIN,18));
        vp.addActionListener(this);
       vp.setMargin(new Insets(0,0,0,35));
        p8.add(vp);
        vh=new JButton (" View Packages  ");
        vh.setBounds(0,280,320,45);
        vh.setBackground(Color.red);
        vh.setBackground(Color.PINK);
        vh.setFont(new Font("Tahoma",Font.PLAIN,18));
        vh.setMargin(new Insets(0,0,0,35));
        vh.addActionListener(this);
        p8.add(vh);
        
        bd=new JButton (" View Hotels");
        bd.setBounds(0,325,320,45);
        bd.setBackground(Color.red);
        bd.setBackground(Color.PINK);
        bd.setFont(new Font("Tahoma",Font.PLAIN,18));
        bd.setMargin(new Insets(0,0,0,35));
        bd.addActionListener(this);
        p8.add(bd);
            vbh=new JButton ("   Booked Hotels  ");
        vbh.setBounds(0,370,320,45);
       vbh.setBackground(Color.red);
        vbh.setBackground(Color.PINK);
        vbh.setFont(new Font("Tahoma",Font.PLAIN,18));
        vbh.setMargin(new Insets(0,0,0,35));
        vbh.addActionListener(this);
        p8.add(vbh);
          ds=new JButton ("  Viewed Booked Hotels ");
        ds.setBounds(0,415,320,45);
       ds.setBackground(Color.red);
        ds.setBackground(Color.PINK);
        ds.setFont(new Font("Tahoma",Font.PLAIN,18));
        ds.setMargin(new Insets(0,0,0,110));
        ds.addActionListener(this);
        p8.add(ds);
           pay=new JButton ("  destinations  ");
        pay.setBounds(0,460,320,45);
       pay.setBackground(Color.red);
        pay.setBackground(Color.PINK);
        pay.setFont(new Font("Tahoma",Font.PLAIN,18));
        pay.addActionListener(this);
        pay.setMargin(new Insets(0,0,0,110));
        p8.add(pay);
          cal=new JButton (" payments ");
        cal.setBounds(0,505,320,45);
       cal.setBackground(Color.red);
        cal.setBackground(Color.PINK);
        cal.setFont(new Font("Tahoma",Font.PLAIN,18));
        cal.addActionListener(this);
        cal.setMargin(new Insets(0,0,0,110));
        p8.add(cal);
         not=new JButton (" calculator");
        not.setBounds(0,550,320,40);
       not.setBackground(Color.red);
        not.setBackground(Color.PINK);
        not.setFont(new Font("Tahoma",Font.PLAIN,18));
         not.addActionListener(this);
        not.setMargin(new Insets(0,0,0,125));
        p8.add(not);
       about=new JButton (" notepad ");
        about.setBounds(0,590,320,20);
       about.setBackground(Color.red);
        about.setBackground(Color.PINK);
        about.setFont(new Font("Tahoma",Font.PLAIN,18));
        about.setMargin(new Insets(0,0,0,125));
        about.addActionListener(this);
        p8.add(about);
       abj=new JButton (" about ");
        abj.setBounds(0,610,320,25);
       abj.setBackground(Color.red);
        abj.setBackground(Color.PINK);
        abj.setFont(new Font("Tahoma",Font.PLAIN,18));
        abj.addActionListener(this);
        abj.setMargin(new Insets(0,0,0,125));
        p8.add(abj);
         ImageIcon i8 =new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
         Image i22=i8.getImage().getScaledInstance(1048,740,Image.SCALE_DEFAULT);
         ImageIcon i16= new ImageIcon(i22);
         JLabel image =new JLabel (i16);
         image.setBounds(320,60,1048,740);
         add(image);
         JLabel ab =new JLabel (" TRAVEL ITERANY PLANNER");
         ab.setBounds(80,40,1000,70);
         ab.setForeground(Color.YELLOW);
         ab.setFont(new Font("times new Roman",Font.PLAIN,40));
         image.add(ab);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
       if(ae.getSource() ==addpd)
       {
           new Personal_Details(p2);
       }else if((ae.getSource() ==viewpd))
       {
           new View_Personal_Details(p2);
       }else if((ae.getSource()==uppd))
           
       {
           new update_Customer(p2);
       }else if((ae.getSource()==cp))
       {
           new CheckPackage();
       }else if(ae.getSource()==vp)
       {
             new Book_Package(p2);
       } else if(ae.getSource()==vh)
       {
           new view_Package(p2);
       } else if(ae.getSource()==bd)
       {
           new Check_Hotels();
           
       }else if(ae.getSource()== pay)
       {
           new Destinations();
       }else if(ae.getSource()==vbh)
       {
           new Book_Hotel(p2);
       }else if(ae.getSource()==ds)
       {
           new View_Booked_Hotel(p2);
       }
       else if(ae.getSource()==cal)
       {
           new Payement();
       }
       else if(ae.getSource()==not)
       {
         try{
           Runtime.getRuntime().exec("calc.exe");
         }catch(Exception e)       
         {
           e.printStackTrace();  
         }
       }
       else if(ae.getSource()==about)
       {
         try{
           Runtime.getRuntime().exec("notepad.exe");
         }catch(Exception e)       
         {
           e.printStackTrace();  
         }
       }
        else if(ae.getSource()==abj)
       {
        new about();
       }
        else if (ae.getSource() == dpd) {
            new Delete_Details(p2);
        }
    }
    public static void main(String[] args)
            
    {
        new Dashboard("");
    }
    
}
