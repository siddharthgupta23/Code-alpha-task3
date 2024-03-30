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
import java.awt.event.*;
import java.sql.*;


public class Book_Hotel extends JFrame implements ActionListener {
    Choice c_j_hotel,t_ac,c_food;
    JTextField t_persons,t_days;
    JLabel co_id, l_num_gender, l__num_gender, l__num_g, une;
    JButton cp, bp, back;
    String p2;

    Book_Hotel(String p2) {
        this.p2 = p2;
        setBounds(176, 68, 900, 600);
        setLayout(null);
        getContentPane().setBackground(Color.YELLOW);
        JLabel abk = new JLabel(" BOOK Hotel");
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

        JLabel lb_id = new JLabel("Select Hotel");
        lb_id.setBounds(60, 110, 140, 25);
        lb_id.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lb_id);

        c_j_hotel = new Choice();
       
        c_j_hotel .setBounds(250, 110, 180, 25);
        add(c_j_hotel);
         try{
      conn e= new conn();
      ResultSet rs=e.jk.executeQuery("Select * from hotel");
      while(rs.next())
      {
          c_j_hotel.add(rs.getString("name"));
      }
      
    }catch(Exception e)
    {
        e.printStackTrace();
    }

        JLabel lbl_number = new JLabel("Total Persons");
        lbl_number.setBounds(60, 150, 143, 25);
        add(lbl_number);

        t_persons = new JTextField("1");
        t_persons.setBounds(250, 150, 170, 25);
        add(t_persons);
         JLabel lbl_days = new JLabel("No. of days");
        lbl_days .setBounds(60, 195, 143, 25);
        add(lbl_days );

        t_days = new JTextField("1");
        t_days.setBounds(250, 190, 170, 25);
        add(t_days);
         JLabel lbl_ac= new JLabel("AC rooms/Non-AC rooms");
        lbl_ac .setBounds(60, 240, 143, 25);
        add(lbl_ac );

        t_ac = new Choice();
        t_ac.add("AC");
        t_ac.add("NON-AC");
        t_ac.setBounds(250, 240, 180, 25);
        add(t_ac);
        JLabel lbl_food= new JLabel("Food_Included");
        lbl_food .setBounds(60, 285, 143, 25);
        add(lbl_food );

        c_food = new Choice();
        c_food.add("Yes");
        c_food.add("No");
        c_food.setBounds(250, 285, 180, 25);
        add(c_food);
        
       
        JLabel ig = new JLabel("id");
        ig.setBounds(60, 330, 80, 25);
        ig.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(ig);
        co_id = new JLabel();
        co_id.setBounds(270, 330, 260, 25);
        co_id.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(co_id);

        JLabel l_number = new JLabel("Number");
        l_number.setBounds(60, 375, 80, 25);
        add(l_number);
        l_num_gender = new JLabel();
        l_num_gender.setBounds(270, 375, 260, 25);
        add(l_num_gender);
        JLabel ph_number = new JLabel("Phone");
        ph_number.setBounds(60, 420, 80, 25);
        add(ph_number);
        l__num_gender = new JLabel();
        l__num_gender.setBounds(270, 420, 260, 25);
        add(l__num_gender);
        JLabel ph_numb = new JLabel("Total Price");
        ph_numb.setBounds(60, 465, 80, 25);
        add(ph_numb);
        l__num_g = new JLabel();
        l__num_g.setBounds(270, 465, 260, 25);
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
        cp.setBounds(270, 510, 130, 25);
        cp.addActionListener(this);
        add(cp);

        bp = new JButton("Book Hotel");
        bp.setBackground(Color.YELLOW);
        bp.setForeground(Color.RED);
        bp.setBounds(478, 510, 130, 25);
        bp.addActionListener(this);
        add(bp);

        back = new JButton(" Back ");
        back.setBackground(Color.YELLOW);
        back.setForeground(Color.RED);
        back.setBounds(650, 510, 138, 25);
        back.addActionListener(this);
        add(back);
        ImageIcon i9=new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
     Image i5=i9.getImage().getScaledInstance(450,375,Image.SCALE_DEFAULT);
     ImageIcon i10=new ImageIcon(i5);
     JLabel i45=new JLabel(i10);
     i45.setBounds(461,79,450,375);
     add(i45);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        
     if (ae.getSource()==cp)
     {
         try{
       
            conn c =new conn();
            ResultSet ab=c.jk.executeQuery("select * from hotel where name='"+c_j_hotel.getSelectedItem()+"'");
            
            while(ab.next())
            {
            int food = Integer.parseInt(ab.getString("food_included"));
            int ac = Integer.parseInt(ab.getString("acroom"));
            int cost = Integer.parseInt(ab.getString("costperson"));
            int persons= Integer.parseInt(t_persons.getText());
            int days=Integer.parseInt(t_days.getText());
            String t_acv=t_ac.getSelectedItem();
            String food_selected=c_food.getSelectedItem();
            if(persons*days>0)
            {
                int total=0;
                total += t_acv.equals("AC")? ac:0;
                 total += food_selected.equals("Yes")? food:0;
                 total +=cost;
                 total =total*persons*days;
                 l__num_g.setText("Rs"+total);
                
            }
            else{
                JOptionPane.showMessageDialog(null," Please enter a valid number");
            }
            }
         }catch(Exception e) 
        {
            e.printStackTrace();
        }
     }
        
        else if (ae.getSource() == bp) {
            try {
                conn e= new conn();
                e.jk.executeUpdate("insert into bh values('" + une.getText() + "','" + c_j_hotel.getSelectedItem() + "','" + t_days.getText() + "','" + t_ac.getSelectedItem() + "','" + c_food.getSelectedItem() + "','" + t_persons.getText() + "','" + co_id.getText() + "','" + l_num_gender.getText() + "','" + l__num_gender.getText() + "','" + l__num_g.getText() + "')");
                JOptionPane.showMessageDialog(null, "Hotel  Booked  Successfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }
    


    public static void main(String[] args) {

        new Book_Hotel("hgch");
    }
}
