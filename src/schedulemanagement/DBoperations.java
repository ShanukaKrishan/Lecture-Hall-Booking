/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulemanagement;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;





//inhertiance is used
public class DBoperations extends DbConnect{
    
    
    
    
    Error_panel errorPanel = new Error_panel();
    private String Fname, Lname, Tablename, National, Email, Password, Combovalue,Hall, Module, Time, Date, Query, Batch;
    private JTable lecture_booking_table , lecture_deleting_table, table;
   
 // polymorphism overloading
    public DBoperations()
    {
    }
    public DBoperations(String Tablename, String Fname, String Lname, String National, String Email, String Password, String Combovalue, JTable table){
         this.Fname = Fname;
         this.Lname = Lname;
         this.Tablename = Tablename;
         this. National = National;
         this. Email = Email;
         this.Password = Password;
         this.Combovalue = Combovalue;
         this.table = table;
    }
      public DBoperations(String Tablename, String Fname, String Lname, String National, String Email, String Password, String Combovalue){
         this.Fname = Fname;
         this.Lname = Lname;
         this.Tablename = Tablename;
         this. National = National;
         this. Email = Email;
         this.Password = Password;
         this.Combovalue = Combovalue;
         
    }
    
    
    public DBoperations(String name, String combovalue, String strDate, String query, String time , String hall , String batch,JTable book, JTable delete){
       this.Fname = name;
       this.Date = strDate;
       this.Combovalue = combovalue;
       this.Query = query;
       this.Time = time;
       this.Hall = hall;
       this.lecture_booking_table = book;
       this.lecture_deleting_table = delete;
       this.Batch = batch;
       
    }
    
    
    public  void registeration(){
        
        String CONN_STRING = "jdbc:mysql://localhost:3306/registeration_details";
        try{
            String query = "INSERT INTO `"+Tablename+"`(`FirstName`, `LastName`, `National`, `Email`, `Password`, `Module`) VALUES (?,?,?,?,?,?)";
            connection = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            pst = connection.prepareStatement(query);
            pst.setString(1, Fname);
            pst.setString(2, Lname);
            pst.setString(3, National);
            pst.setString(4, Email);
            pst.setString(5, Password);
            pst.setString(6, Combovalue);
            pst.executeUpdate();
             
           
            DefaultTableModel model = (DefaultTableModel)table.getModel();
             
            model.setRowCount(0);
            ShowTable show = new ShowTable();
            show.show_user_student(table);
            JOptionPane.showMessageDialog(null,"Registered successfully");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }   
    }
    
     public  void register_lecture(){
         Validator checkValid = new Validator();
        String CONN_STRING = "jdbc:mysql://localhost:3306/registeration_details";
        
        try{ 
            String query = "INSERT INTO `"+Tablename+"`(`FirstName`, `LastName`, `National`, `Email`, `Password`, `Module`) VALUES (?,?,?,?,?,?)";
            connection = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            pst = connection.prepareStatement(query);
            pst.setString(1, Fname);
            pst.setString(2, Lname);
            pst.setString(3, National);
            pst.setString(4, Email);
            pst.setString(5, Password);
            pst.setString(6, Combovalue);
             pst.executeUpdate();
             

            JOptionPane.showMessageDialog(null,"Registered successfully");
            }
        
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }   
    }
    
    
    public void booking(){
        String CONN_STRING = "jdbc:mysql://localhost:3306/student_registeration";
      try{
           connection = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            pst = connection.prepareStatement(Query);
            pst.setString(1, Fname);
            pst.setString(2, Combovalue);
            pst.setString(3, Time);
            pst.setString(4, Date);
            pst.setString(5, Hall);
            pst.setString(6, Batch);
            //String sql = "INSERT INTO schedule (Date) VALUES ('"+sqldate+"')";
           
           pst.executeUpdate();
           
           DefaultTableModel model = (DefaultTableModel)lecture_booking_table.getModel();
           model.setRowCount(0);
           ShowTable show = new ShowTable();
           show.show_user(lecture_booking_table);
           show.show_user(lecture_deleting_table);
           
           
           
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    public void delete(int id, String conn, String query, JTable lecture_booking_table, JTable lecture_deleting_table)
    {
              try {
            
            connection = DriverManager.getConnection(conn ,USERNAME,PASSWORD); 
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.executeUpdate();
             DefaultTableModel model = (DefaultTableModel)lecture_booking_table.getModel();
           DefaultTableModel model1 = (DefaultTableModel)lecture_deleting_table.getModel();
           model.setRowCount(0);
           model1.setRowCount(0);
           ShowTable show = new ShowTable();
           show.show_user(lecture_booking_table);
           show.show_user(lecture_deleting_table);
    }
         
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void delete_lecture_schedule(int id, String conn, String query,JTable table){
        
        try {
            
            connection = DriverManager.getConnection(conn ,USERNAME,PASSWORD); 
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.executeUpdate();
    }
         
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        ShowTable show = new ShowTable();
        show.show_user(table);
    }
    
    public void delete_from_student_details(int id, String conn, String query, JTable table){
        
        
        try {
            
            connection = DriverManager.getConnection(conn ,USERNAME,PASSWORD); 
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.executeUpdate();
    }
         
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
         
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        ShowTable show = new ShowTable();
        show.show_user_student(table);
    }
    
    public void update_pass(String query, String currentpass, String newpass, String oldpass){
        try {
            connection = DriverManager.getConnection(sq, USERNAME,PASSWORD);
           
            PreparedStatement preparedStmt = connection.prepareStatement(query);
           
           
            rs = preparedStmt.executeQuery(oldpass);
            if(rs.next()){
            preparedStmt.setString(1,newpass);
           preparedStmt.setString(2,currentpass);
          
           int check = preparedStmt.executeUpdate();
           if(check >0){
                JOptionPane.showMessageDialog(null, "Password Changed");
           }
           else {
                JOptionPane.showMessageDialog(null, "not updated");
           }
            }
            else {
                 JOptionPane.showMessageDialog(null, "Wrong pass");
            }
           
          
           
           
           
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void getEmail(String email){
        
        String sql = "select 1 from (select Email as email from lecture_details union all select email from student_details ) a where email = '"+email+"' ";
        
        try{
            connection = DriverManager.getConnection(sq, USERNAME,PASSWORD);
            PreparedStatement preparedStmt = connection.prepareStatement(sql);
           
           
            rs = preparedStmt.executeQuery();
            if(rs.next()){
               
                JOptionPane.showMessageDialog(null, "Email Sent");
               

            }
            else {
                 JOptionPane.showMessageDialog(null, "No such email ");
            } 
         }
          catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
