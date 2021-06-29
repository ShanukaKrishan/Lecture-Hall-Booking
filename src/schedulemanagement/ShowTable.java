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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shanu
 */
public class ShowTable extends DbConnect {
    
                   
//this array function gets called from show_user to get values from database
    public ArrayList<User> userList(){
        ArrayList<User> userList = new ArrayList<>();
        try {
            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_registeration",USERNAME,PASSWORD); 
            String query1 = "SELECT * FROM lecture_schedule";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query1);
            User user;
            while(rs.next()){
                user = new User(rs.getInt("ID") ,rs.getString("Name"), rs.getString("Date"), rs.getString("Module"), rs.getString("Time"), rs.getString("Hall"), rs.getString("Batch"));
                userList.add(user);
            }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return userList;
    }
    
    
    //this function is used to show data on the respective tables
    public void show_user(JTable table){
        ArrayList<User> list = userList();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Object[] row = new Object[7];
        for(int i=0 ; i<list.size();i++){
            row[0] = list.get(i).getID();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getModule();
            row[3] = list.get(i).getDate();
            row[4] = list.get(i).getTime();
            row[5] = list.get(i).getHall();
            row[6] = list.get(i).getBatch();
            model.addRow(row);
             
            
        }}
    
    
    
    
    

    //since theres two tables theres two  pairs
    public ArrayList<student_user> student_user(){
        ArrayList<student_user> studentList = new ArrayList<>();
        try {
            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/registeration_details","krishan","root"); 
            String query1 = "SELECT * FROM student_details";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query1);
            student_user user;
            while(rs.next()){
            user = new student_user(rs.getInt("ID") ,rs.getString("FirstName"), rs.getString("LastName"), rs.getString("Module"), rs.getString("National"), rs.getString("Email"));
            studentList.add(user);
            }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return studentList;
    }
     
     
      public void show_user_student(JTable table){
        ArrayList<student_user> list = student_user();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        Object[] row = new Object[6];
        for(int i=0 ; i<list.size();i++){
            row[0] = list.get(i).getID();
            row[1] = list.get(i).getFname();
            row[2] = list.get(i).getLname();
            row[3] = list.get(i).getDegree();
            row[4] = list.get(i).getNational();
            row[5] = list.get(i).getEmail();
                    model.addRow(row);
           
            
        }}
    
}
