/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulemanagement;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author shanu
 */
public class DbConnect {
    protected Connection connection = null;
    protected final String USERNAME = "krishan";
    protected final String PASSWORD = "root";
    protected PreparedStatement pst =null;
    protected ResultSet rs = null;
    protected String sq = "jdbc:mysql://localhost:3306/registeration_details";
    
    
    
  
    //function is used to check if the user name and password matches with the database and then open the respective portal
    public void check (String sql, String user, String pwd , JFrame port, JFrame current){
        
        
         try {
           connection = DriverManager.getConnection(sq,USERNAME,PASSWORD);
           pst = connection.prepareStatement(sql);
           pst.setString(1, user);
           pst.setString(2,pwd );
           rs = pst.executeQuery();
           if(rs.next()){
               
               
               
  
               port.setVisible(true);
               current.dispose();
              
               
           }
           else {
               JOptionPane.showMessageDialog(null, "Wrong Password Or Username");
           }
       }
       catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex);
       }
        
        
    }
    
   
}
