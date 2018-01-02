/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import javax.swing.*;
public class Main { 
    public static void main(String[] args) {
       try {
           Class.forName("java.sql.DriverManager");
       }
       catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage());
       }
       String url,db,pas;
       url="jdbc:mysql://localhost/psdb";
       db="root";
       pas="";
       new LoginGUI(url,db).setVisible(true);
       
}
}