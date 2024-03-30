/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.iterany.planner;
import javax.swing.*;
import java.awt.*;

public class CheckPackage  extends JFrame{
    CheckPackage ()
    {
    setBounds(275,94,900,600);
    
    JTabbedPane tab= new JTabbedPane();
    
   
    
     String[]Package1={"Gold Package","10 days and 11 nights","AIRPORT RESISTANCE","One day city tour " ,"Daily Buffet","Welcome Drinks for arrival","Full DAY 4 Island Cruise","English Speaking Mentor"," Book Now ","Summer Special","PRICE:58000","package1.jpg"};
     String[]Package2={"Silver Package","6 days and 7 nights","Toll free and Entrance free Tickets " ,"Welcome Drinks on arrival "," Night Safari","Cruise Dinner","Full DAY 3 Island Cruise","Mentoring Guide"," Book Now ","Winter Special","PRICE:49000","package2.jpg"};
     String[]Package3={"Bronze Package","4 days and 5 nights","Riding and other games   " ,"Meet and greet at Airport","BBO Dinner "," Night Safari","Cruise Dinner","Full DAY 3 Island Cruise"," Book Now ","Monsoon Special","PRICE:42000","package3.jpg"};
     
     JPanel g8=createPackage(Package1);
     tab.addTab("Package1",null,g8);
     JPanel g9=createPackage(Package2);
     tab.addTab("Package2",null,g9);
      JPanel g10=createPackage(Package3);
     tab.addTab("Package3",null,g10);
     add(tab);
     
 
    setVisible(true);
    
}
    public JPanel createPackage(String[] pack)
    {
        JPanel g8= new JPanel();
    g8.setLayout(null);
    g8.setBackground(Color.DARK_GRAY);
     JLabel hjn=new JLabel(pack[0]);
     hjn.setBounds(60,25,300,30);
     hjn.setForeground(Color.pink);
     hjn.setFont(new Font("Tahoma",Font.BOLD,26));
     g8.add(hjn);
      JLabel hbg=new JLabel(pack[1]);
     hbg.setBounds(45,70,300,30);
     hbg.setForeground(Color.blue);
     hbg.setFont(new Font("Tahoma",Font.BOLD,26));
     g8.add(hbg);
     JLabel hk=new JLabel(pack[2]);
     hk.setBounds(45,135,468,30);
     hk.setForeground(Color.yellow);
     hk.setFont(new Font("Tahoma",Font.BOLD,26));
     g8.add(hk);
     JLabel ghn=new JLabel(pack[3]);
     ghn.setBounds(45,178,400,30);
     ghn.setForeground(Color.blue);
     ghn.setFont(new Font("Tahoma",Font.BOLD,26));
     g8.add(ghn);
     JLabel gh=new JLabel(pack[4]);
     gh.setBounds(45,245,300,30);
     gh.setForeground(Color.cyan);
     gh.setFont(new Font("Tahoma",Font.BOLD,26));
     g8.add(gh);
    JLabel ghk=new JLabel(pack[5]);
     ghk.setBounds(45,289,400,30);
     ghk.setForeground(Color.lightGray);
     ghk.setFont(new Font("Tahoma",Font.BOLD,26));
     g8.add(ghk);
    JLabel ghl=new JLabel(pack[6]);
     ghl.setBounds(45,342,400,30);
     ghl.setForeground(Color.white);
     ghl.setFont(new Font("Tahoma",Font.BOLD,26));
     g8.add(ghl);
     JLabel ghhjk=new JLabel(pack[7]);
     ghhjk.setBounds(45,376,400,30);
     ghhjk.setForeground(Color.magenta);
     ghhjk.setFont(new Font("Tahoma",Font.BOLD,26));
     g8.add(ghhjk);
     JLabel glkj=new JLabel(pack[8]);
     glkj.setBounds(67,423,300,30);
     glkj.setForeground(Color.DARK_GRAY);
     glkj.setFont(new Font("Tahoma",Font.BOLD,38));
     g8.add(glkj);
     JLabel pkjk=new JLabel(pack[9]);
     pkjk.setBounds(67,478,428,40);
     pkjk.setForeground(Color.CYAN);
     pkjk.setFont(new Font("Tahoma",Font.BOLD,38));
     g8.add(pkjk);
     JLabel ghbn=new JLabel(pack[10]);
     ghbn.setBounds(568,478,300,30);
     ghbn.setForeground(Color.CYAN);
     ghbn.setFont(new Font("Tahoma",Font.BOLD,38));
     g8.add(ghbn);
     ImageIcon i9=new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[11]));
     Image i5=i9.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
     ImageIcon i10=new ImageIcon(i5);
     JLabel i45=new JLabel(i10);
     i45.setBounds(502,79,413,300);
     g8.add(i45);
     return g8;
        
    }
public static void main(String[] args)
{
   new CheckPackage ();
}
}
