/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.iterany.planner;
/*import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;*/

/**
 *
 * @author dell
 */
/*public class Book_Package  extends JFrame implements ActionListener{
   Choice cpackage;
    JTextField t_persons;
    JLabel co_id,l_num_gender,l__num_gender,l__num_g,une;
    JButton cp,bp,back;
    String p2;
    Book_Package(String p2)
    {
        this.p2=p2;
        setBounds(176,68,900,600);
        setLayout(null);
        getContentPane().setBackground(Color.YELLOW);
        JLabel  abk= new JLabel(" BOOK PACKAGE");
        abk.setBounds(100, 10,200,30);
        abk.setFont(new Font("Tahoma",Font.BOLD,20));
        add(abk);
        JLabel p8=new JLabel ("username");
        p8.setBounds(60,40,120,60);
        p8.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(p8);
        une=new JLabel ();
        une.setBounds(270,60,260,25);
        une.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(une);
        
        JLabel lb_id=new JLabel ("Select Package");
        lb_id.setBounds(60,170,140,25);
        lb_id.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(lb_id);
        
        cpackage= new Choice();
        cpackage.add(" GOLD PACKAGE");
        cpackage.add(" SILVER PACKAGE");
        cpackage.add(" BRONZE PACKAGE");
        cpackage.setBounds(250,170,180,25);
        add(cpackage);
        
        JLabel lbl_number=new JLabel ("Total Persons");
        lbl_number.setBounds(60,250,143,25);
        add(lbl_number);
        
        t_persons= new JTextField("1");
        t_persons.setBounds(250,250,170,25);
        add(t_persons);
         JLabel ig=new JLabel ("id");
        ig.setBounds(60,110,80,25);
        ig.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(ig);
        co_id=new JLabel ();
        co_id.setBounds(270,110,260,25);
        co_id.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(co_id);
     
        
         JLabel l_number=new JLabel ("Number");
        l_number.setBounds(60,320,80,25);
        add(l_number);
        l_num_gender=new JLabel ();
        l_num_gender.setBounds(270,320,260,25);
        add(l_num_gender);
        JLabel ph_number=new JLabel ("Phone");
        ph_number.setBounds(60,380,80,25);
        add(ph_number);
         l__num_gender=new JLabel();
        l__num_gender.setBounds(270,380,260,25);
        add(l__num_gender);
        JLabel ph_numb=new JLabel ("Total Price");
        ph_numb.setBounds(60,440,80,25);
        add(ph_numb);
        l__num_g=new JLabel();
        l__num_g.setBounds(270,440,260,25);
        add(l__num_g);
             try{
            conn gt=new conn();
            String query="select * from ctm where un='"+p2+"'";
            ResultSet ab= gt.jk.executeQuery(query);
            
           
            while(ab.next())
            {
                une.setText(ab.getString("un"));
                co_id.setText(ab.getString("id"));
                l_num_gender.setText(ab.getString("number"));
                
                l__num_gender.setText(ab.getString("phone"));
              
            }
        }catch(Exception e)
        {
            
        }
           cp=new JButton(" Check Price ");
          cp.setBackground(Color.YELLOW);
          cp.setForeground(Color.RED);
          cp.setBounds(270,460,130,25);
          cp.addActionListener(this);
          add(cp);
     
        bp=new JButton(" Book Pckage");
        bp.setBackground(Color.YELLOW);
        bp.setForeground(Color.RED);
        bp.setBounds(478,460,130,25);
        bp.addActionListener(this);
        add(bp);
       
          back=new JButton(" Back ");
          back.setBackground(Color.YELLOW);
          back.setForeground(Color.RED);
          back.setBounds(650,460,138,25);
          back.addActionListener(this);
          add(back);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()== cp)
        {
           String pack=cpackage.getSelectedItem();
           int cost=0;
           if(pack.equals(" GOLD PACKAGE"))
           {
               cost+=25000;
               
           }else if(pack.equals(" SILVER PACKAGE"))
           {
                cost+=42000;
           }else 
           {
               cost+=56000;
           }
           int persons=Integer.parseInt(t_persons.getText());
           cost *=persons;
           l__num_g.setText("Rs"+cost);
        } else if(ae.getSource()== bp)
        {
            try{
                conn c=new conn();
                c.jk.executeUpdate("insert into bz values('"+une.getText()+"','"+cpackage.getSelectedItem()+"','"+t_persons.getText()+"','"+co_id.getText()+"','"+l_num_gender.getText()+"'+'"+l__num_gender.getText()+"','"+l__num_g.getText()+"')");
                JOptionPane.showMessageDialog(null,"booked package Successfully");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        } else
        {
            setVisible(false);
        }
    }

public static void main(String[] args)
{
  
   new Book_Package("hgch");
}
}*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Book_Package extends JFrame implements ActionListener {
    Choice cpackage;
    JTextField t_persons;
    JLabel co_id, l_num_gender, l__num_gender, l__num_g, une;
    JButton cp, bp, back;
    String p2;

    Book_Package(String p2) {
        this.p2 = p2;
        setBounds(176, 68, 900, 600);
        setLayout(null);
        getContentPane().setBackground(Color.YELLOW);
        JLabel abk = new JLabel(" BOOK PACKAGE");
        abk.setBounds(100, 10, 200, 30);
        abk.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(abk);
        JLabel p8 = new JLabel("username");
        p8.setBounds(60, 40, 120, 60);
        p8.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(p8);
        une = new JLabel();
        une.setBounds(270, 60, 260, 25);
        une.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(une);

        JLabel lb_id = new JLabel("Select Package");
        lb_id.setBounds(60, 170, 140, 25);
        lb_id.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lb_id);

        cpackage = new Choice();
        cpackage.add(" GOLD PACKAGE");
        cpackage.add(" SILVER PACKAGE");
        cpackage.add(" BRONZE PACKAGE");
        cpackage.setBounds(250, 170, 180, 25);
        add(cpackage);

        JLabel lbl_number = new JLabel("Total Persons");
        lbl_number.setBounds(60, 250, 143, 25);
        add(lbl_number);

        t_persons = new JTextField("1");
        t_persons.setBounds(250, 250, 170, 25);
        add(t_persons);
        JLabel ig = new JLabel("id");
        ig.setBounds(60, 110, 80, 25);
        ig.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(ig);
        co_id = new JLabel();
        co_id.setBounds(270, 110, 260, 25);
        co_id.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(co_id);

        JLabel l_number = new JLabel("Number");
        l_number.setBounds(60, 320, 80, 25);
        add(l_number);
        l_num_gender = new JLabel();
        l_num_gender.setBounds(270, 320, 260, 25);
        add(l_num_gender);
        JLabel ph_number = new JLabel("Phone");
        ph_number.setBounds(60, 380, 80, 25);
        add(ph_number);
        l__num_gender = new JLabel();
        l__num_gender.setBounds(270, 380, 260, 25);
        add(l__num_gender);
        JLabel ph_numb = new JLabel("Total Price");
        ph_numb.setBounds(60, 440, 80, 25);
        add(ph_numb);
        l__num_g = new JLabel();
        l__num_g.setBounds(270, 440, 260, 25);
        add(l__num_g);
        try {
            conn gt = new conn();
            String query = "select * from ctm where un='" + p2 + "'";
            ResultSet ab = gt.jk.executeQuery(query);


            while (ab.next()) {
                une.setText(ab.getString("un"));
                co_id.setText(ab.getString("id"));
                l_num_gender.setText(ab.getString("number"));

                l__num_gender.setText(ab.getString("phone"));

            }
        } catch (Exception e) {

        }
        cp = new JButton(" Check Price ");
        cp.setBackground(Color.YELLOW);
        cp.setForeground(Color.RED);
        cp.setBounds(270, 460, 130, 25);
        cp.addActionListener(this);
        add(cp);

        bp = new JButton(" Book Package");
        bp.setBackground(Color.YELLOW);
        bp.setForeground(Color.RED);
        bp.setBounds(478, 460, 130, 25);
        bp.addActionListener(this);
        add(bp);

        back = new JButton(" Back ");
        back.setBackground(Color.YELLOW);
        back.setForeground(Color.RED);
        back.setBounds(650, 460, 138, 25);
        back.addActionListener(this);
        add(back);
        ImageIcon i9=new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
     Image i5=i9.getImage().getScaledInstance(367,300,Image.SCALE_DEFAULT);
     ImageIcon i10=new ImageIcon(i5);
     JLabel i45=new JLabel(i10);
     i45.setBounds(461,79,367,300);
     add(i45);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == cp) {
            String pack = cpackage.getSelectedItem();
            int cost = 0;
            if (pack.equals(" GOLD PACKAGE")) {
                cost += 25000;

            } else if (pack.equals(" SILVER PACKAGE")) {
                cost += 42000;
            } else {
                cost += 56000;
            }
            int persons = Integer.parseInt(t_persons.getText());
            cost *= persons;
            l__num_g.setText("Rs" + cost);
        } else if (ae.getSource() == bp) {
            try {
                conn e= new conn();
                e.jk.executeUpdate("insert into bz values('" + une.getText() + "','" + cpackage.getSelectedItem() + "','" + t_persons.getText() + "','" + co_id.getText() + "','" + l_num_gender.getText() + "','" + l__num_gender.getText() + "','" + l__num_g.getText() + "')");
                JOptionPane.showMessageDialog(null, "booked package Successfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {

        new Book_Package("hgch");
    }
}
