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
public class about extends JFrame implements ActionListener {
    
 about()
 {
    setBounds(400,25,800,657);
    setLayout(null);
    getContentPane().setBackground(Color.PINK);
    JLabel i8=new JLabel("About");
    i8.setBounds(100, 10, 150, 40);
    i8.setForeground(Color.black);
    add(i8);
    String v="Tourism is a dynamic industry that relies on various mechanisms and systems to ensure its smooth operation and growth. Here's a short note highlighting some key features of a tourism mechanism system:\n" +
            "\n" +
            "Reservation and Booking Systems: Tourism mechanisms often include robust reservation and booking systems. These systems allow travelers to book accommodations, transportation, tours, and other services online or through travel agencies. They streamline the booking process, ensuring efficiency and convenience for both tourists and service providers.\n" +
            "\n" +
            "Destination Management Systems: Destination management systems play a crucial role in managing tourist destinations effectively. They involve tools and strategies for sustainable development, preservation of cultural heritage, environmental conservation, and infrastructure planning. These systems aim to enhance the overall tourist experience while minimizing negative impacts on destinations.\n" +
            "\n" +
            "Information and Communication Technology (ICT) Integration: Modern tourism mechanisms heavily rely on information and communication technology. This includes websites, mobile applications, social media platforms, and other digital tools that provide tourists with information, trip planning resources, real-time updates, and interactive experiences.\n" +
            "\n" +
            "Transportation Networks: Efficient transportation networks are essential for tourism mechanisms to function smoothly. These networks include airlines, railways, roads, waterways,";

    TextArea area=new TextArea(v,10,40,Scrollbar.VERTICAL);
    area.setEditable(false);
    area.setBounds(30,76,476,375);
    add(area);
     JButton back = new JButton("back");
        back.setBounds(234, 490, 102, 35);
        back.addActionListener(this);
        add(back);
        setVisible(true);
   
    
    
    
    
    
 }
 public void actionPerformed(ActionEvent ae)
 {
     setVisible(false);
 }
public static void main(String[] args)
{
 new about();
}
}
