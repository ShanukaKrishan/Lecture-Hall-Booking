
package schedulemanagement;
import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author shanu
 */
public class CheckValue {
    String CONN_STRING = "jdbc:mysql://localhost:3306/registeration_details";
    
    public boolean check(String email, String SQL) {
        try {
           
            Connection con = DriverManager.getConnection(CONN_STRING, "krishan", "root");
             Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            if(rs.next())
            {
                 
                 return true;   
                 
            }
             else {
                
                return false;
            }

            
            
        } catch (SQLException ex) {
            
            
        }
        return false;
    }
    
    public boolean checkNat(String nat, String SQL){
        try {
           
            Connection con = DriverManager.getConnection(CONN_STRING, "krishan", "root");
             Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery(SQL);
            
            if(rs.next())
            {    Validator valid = new Validator();
                 valid.label("National Already Exists");
                 return true;
              
            }
             else {
                
                return false;
            }

            
            
        } catch (SQLException ex) {
            
            
        }
        return false;
    }
    
    
  
    
    
    public boolean checkLectureSchedule(String query){
        CONN_STRING = "jdbc:mysql://localhost:3306/student_registeration";
        try {
           
            Connection con = DriverManager.getConnection(CONN_STRING, "krishan", "root");
             Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery(query);
            
            if(rs.next())
            {    
                 Validator valid = new Validator();
                 valid.label("Lecture Already Exists");
                 return true;
              
            }
             else {
                
                return false;
            }

            
            
        } catch (SQLException ex) {
            
            
        }
        return false;
    }
    
       

}
