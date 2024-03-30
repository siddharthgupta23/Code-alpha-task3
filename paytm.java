/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.iterany.planner;


 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class paytm extends JFrame implements ActionListener {

    paytm() {
        setBounds(500, 100, 600,400);
        JEditorPane av = new JEditorPane();
        av.setEditable(false);
        try {
            av.setPage("https://business.paytm.com/payment-link");
        } catch (Exception e) {
            av.setContentType("text/html");
            av.setText("<html>could not load</html>");
        }
        JScrollPane tf = new JScrollPane(av);
        getContentPane().add(tf);
        JButton back = new JButton("back");
        back.setBounds(400, 20, 80, 40);
        back.addActionListener(this);
        av.add(back); // Add the button to the content pane directly
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Payement();
    }

    public static void main(String[] args) {
        new paytm();
    }
}
