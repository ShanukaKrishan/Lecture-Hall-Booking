/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulemanagement;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author shanu
 */
public class Validator  extends Error_panel{
   
     Error_panel panel = new Error_panel();
     UIManager UI=new UIManager();
    
    public boolean Validate(String fname, String lname, String email, String pwd, String national){
    String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
    Pattern emailPat = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
    Matcher match = emailPat.matcher(email);
    int lenght = 10;
    
      if(fname.isEmpty() || fname.length() > 10 || !Pattern.matches("[a-zA-Z]+", fname)  ){
          
          label("Invalid First Name");
          return false;
      }
      
      
      
      if(lname.isEmpty() || lname.length() > 10 || !Pattern.matches("[a-zA-Z]+", lname))
              {
                   label("Invalid Last Name");
          return false;
              
         }
      
        if(checkNational(national))
      {
          return false;
      }
      

      if(validEmail(email)){
           
           return false;
      }
      
      if(validPassword(pwd)){
          return true;
      }

         return false;      
     
}
    //used to have a custom JOptionPane
      void label (String msg){
          JDialog jd;
    JOptionPane pane;
    UI.put("OptionPane.background",Color.white);
      pane = new JOptionPane(panel, 
                JOptionPane.PLAIN_MESSAGE ,JOptionPane.DEFAULT_OPTION);
        getComponents(pane);
         panel.label.setText(msg);
        pane.setBackground(Color.white);
        jd = pane.createDialog(this, "Message");
        jd.setVisible(true);
    }
      private void getComponents(Container c){

    Component[] m = c.getComponents();

    for(int i = 0; i < m.length; i++){

        if(m[i].getClass().getName() == "javax.swing.JPanel")
            m[i].setBackground(Color.white);

        if(c.getClass().isInstance(m[i]))
            getComponents((Container)m[i]);
    }
}
      
      //to check if the email is valid
      public boolean validEmail (String email) {
    String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
    Pattern emailPat = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
    Matcher match = emailPat.matcher(email);
    
    if(!match.matches()){
           label("Enter A Valid Email");
           return true;
      }
    return false;
      }
      
      
      
      
      //to check if the password is valid
      public boolean validPassword(String password) {
          if(password.length() > 7)
          {
              if(checkPass(password))
              {
                  return true;
              }
             
             
          }
           label("Password Must Contain 1 Uppercase, 1 Numberic ");
           return false;
      }
      
      
      public static boolean checkPass(String password){
          boolean hasNum = false; boolean hasCap= false; boolean hasLow = false; char c;
          
          for(int i = 0; i < password.length(); i++){
              c = password.charAt(i);
              if(Character.isDigit(c)){
                  hasNum = true;
              }
              else if(Character.isUpperCase(c))
              {
                  hasCap = true;
              }
              else if (Character.isLowerCase(c))
              {
                  hasLow = true;
              }
              if(hasNum && hasCap && hasLow )
              {
                  return true;
              }
          }
          return false;
      }
      
      public boolean checkNational(String nat){
          Pattern pattern = Pattern.compile("^\\d{10}$");
          Matcher m = pattern.matcher(nat);
          if(!m.matches()){
              label("Enter A Valid National ID");
              return true;
              
          }
          return false;
      }
     
      
      
}

