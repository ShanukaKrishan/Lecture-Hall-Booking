/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulemanagement;

/**
 *
 * @author shanu
 */
public class student_user {
    
    
    private String Fname,Lname , Degree ,National, Email;
    private int ID;
    private String password,user;
    
    
    public student_user( int ID, String Fname, String Lname, String Degree, String National, String Email){
         this.ID = ID;
        this.Fname = Fname;
        this.Lname = Lname;
        this.Degree = Degree;
        this.National = National;
        this.Email = Email;
                
        
                
    }
    
    public student_user(){
        
    }
    
 
    public student_user(String password, String user){
        this.password = password;
        this.user = user;
    }
    public int getID(){
        return ID;
    }
   public String getFname(){
       return Fname;
   }
   public String getLname(){
       return Lname;
   }
    public String getDegree(){
       return Degree;
   }
    public String getNational(){
        return National;
    }
    public String getPassword(){
        return password;
    }
    public String getUser(){
        return user;
    }
      public void setName(String name){
        this.Fname = name;
    }
      public String getEmail(){
          return Email;
      }
    
    
}
