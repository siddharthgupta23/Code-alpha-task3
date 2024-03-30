package travel.iterany.planner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;

/**
 *
 * @author dell
 */
public class conn {
    Connection e;
    Statement jk;
    conn()
    {
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        e=DriverManager.getConnection("jdbc:mysql:///travel_iterany_planner","root","123456789");
        jk=e.createStatement();
        
    }catch(Exception e)
            {
                e.printStackTrace();
            }
    
}
    public static void main(String[] args)
    {
        new conn();
    }
}