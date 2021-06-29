/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulemanagement;


import javax.swing.JPanel;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author shanu
 */
public class studentport extends javax.swing.JFrame {
   private String email;
      public void setEmail(String email){
         this.email = email;
     }
      
      //declaring classes ////
      Homeportal portal = new Homeportal();
      DBoperations operation = new DBoperations();
      ShowTable table = new ShowTable();
      //End of delcaring classes ///
      
    CardLayout cardLayout;
    public studentport() {
        initComponents();
        
        GeneralDesgin.comboDesign(combo_module);
        
        cardLayout = new CardLayout();
        CardHolder.setLayout(cardLayout);
        CardHolder.add("home",home);
        CardHolder.add("profile",profile);
        CardHolder.add("schedule",schedule);
        
        table.show_user(table_user);
        
        GeneralDesgin.design(table_user, scrollpane);
        
    }
    
    
    
     public void goHome(){
         
        cardLayout.show(CardHolder, "home");
    }
      public void goProfile(){
        cardLayout.show(CardHolder, "profile");
    }
    
    public void goSchedule(){
       cardLayout.show(CardHolder, "schedule");
    }
    
   public void profile_check( String user){
    try {
       
   String sql = "SELECT * FROM student_details WHERE Email = '"+user+"' ";
   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registeration_details","krishan","root");
   Statement s = con.prepareCall(sql);
   ResultSet rs = s.executeQuery(sql);
   if(rs.next()){
       String firstname = rs.getString(2);
       String lastname = rs.getString(3);
       String National = rs.getString(4);
       String Email = rs.getString(5);
       String module = rs.getString(7);
       
       firstname_txt.setText(firstname);
       lastname_txt.setText(lastname);
       national_txt.setText(National);
       email_txt.setText(Email);
       module_txt.setText(module);
       
       
   }
   
   
}
  catch(Exception ex){
    JOptionPane.showMessageDialog(null, ex);
}
    }
    
      
      
    
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        home_btn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        profile_btn = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        schedule_btn = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        logout_btn = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CardHolder = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        profile = new javax.swing.JPanel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel23 = new javax.swing.JLabel();
        jlabel1 = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        jlabel2 = new javax.swing.JLabel();
        jlabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlabel5 = new javax.swing.JLabel();
        jlabel4 = new javax.swing.JLabel();
        current_pass = new javax.swing.JPasswordField();
        jlabel6 = new javax.swing.JLabel();
        new_pass = new javax.swing.JPasswordField();
        change_password_btn = new keeptoo.KGradientPanel();
        jLabel32 = new javax.swing.JLabel();
        firstname_txt = new javax.swing.JLabel();
        email_txt = new javax.swing.JLabel();
        lastname_txt = new javax.swing.JLabel();
        module_txt = new javax.swing.JLabel();
        jlabel7 = new javax.swing.JLabel();
        national_txt = new javax.swing.JLabel();
        schedule = new javax.swing.JPanel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        jLabel24 = new javax.swing.JLabel();
        scrollpane = new javax.swing.JScrollPane();
        table_user = new javax.swing.JTable();
        combo_module = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(1220, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(54, 37, 90));
        jPanel2.setPreferredSize(new java.awt.Dimension(291, 435));

        home_btn.setBackground(new java.awt.Color(54, 37, 90));
        home_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_btnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                home_btnMousePressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\shanu\\Desktop\\images\\icons8-home-24.png")); // NOI18N

        jLabel5.setBackground(new java.awt.Color(54, 37, 90));
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Home");

        javax.swing.GroupLayout home_btnLayout = new javax.swing.GroupLayout(home_btn);
        home_btn.setLayout(home_btnLayout);
        home_btnLayout.setHorizontalGroup(
            home_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(home_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        home_btnLayout.setVerticalGroup(
            home_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(home_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(home_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        profile_btn.setBackground(new java.awt.Color(54, 37, 90));
        profile_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profile_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profile_btnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                profile_btnMousePressed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\shanu\\Desktop\\images\\icons8-user-24.png")); // NOI18N
        jLabel6.setName(""); // NOI18N

        jLabel7.setBackground(new java.awt.Color(54, 37, 90));
        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Profile");

        javax.swing.GroupLayout profile_btnLayout = new javax.swing.GroupLayout(profile_btn);
        profile_btn.setLayout(profile_btnLayout);
        profile_btnLayout.setHorizontalGroup(
            profile_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profile_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        profile_btnLayout.setVerticalGroup(
            profile_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profile_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profile_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        schedule_btn.setBackground(new java.awt.Color(54, 37, 90));
        schedule_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                schedule_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                schedule_btnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                schedule_btnMousePressed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\shanu\\Desktop\\images\\icons8-schedule-24.png")); // NOI18N
        jLabel10.setName(""); // NOI18N

        jLabel11.setBackground(new java.awt.Color(54, 37, 90));
        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Schedule");

        javax.swing.GroupLayout schedule_btnLayout = new javax.swing.GroupLayout(schedule_btn);
        schedule_btn.setLayout(schedule_btnLayout);
        schedule_btnLayout.setHorizontalGroup(
            schedule_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(schedule_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        schedule_btnLayout.setVerticalGroup(
            schedule_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(schedule_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(schedule_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        logout_btn.setBackground(new java.awt.Color(54, 37, 90));
        logout_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logout_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logout_btnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logout_btnMousePressed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\shanu\\Desktop\\images\\icons8-logout-rounded-left-24.png")); // NOI18N
        jLabel12.setName(""); // NOI18N

        jLabel13.setBackground(new java.awt.Color(54, 37, 90));
        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Logout");

        javax.swing.GroupLayout logout_btnLayout = new javax.swing.GroupLayout(logout_btn);
        logout_btn.setLayout(logout_btnLayout);
        logout_btnLayout.setHorizontalGroup(
            logout_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logout_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        logout_btnLayout.setVerticalGroup(
            logout_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logout_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logout_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profile_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(home_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(schedule_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(home_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(profile_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(schedule_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CardHolder.setBackground(new java.awt.Color(255, 255, 255));
        CardHolder.setLayout(new java.awt.CardLayout());

        home.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel3.setkEndColor(new java.awt.Color(228, 229, 230));
        kGradientPanel3.setkStartColor(new java.awt.Color(248, 228, 231));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Schedule Assistant");

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(204, 204, 204))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel22)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setText("lecturers are appointed for the day along with the hall.");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel2.setText("SMS (Schedule Management System) will show you ");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel3.setText("lectures appointed by your respected lecturers.");
        jLabel3.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel8.setText("Students can check the schedule tab to see what ");
        jLabel8.setToolTipText("");

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(homeLayout.createSequentialGroup()
                        .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(9, 9, 9)))
                .addGap(24, 24, 24))
            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                    .addGap(37, 37, 37)))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(jLabel3)
                .addGap(94, 94, 94)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(209, Short.MAX_VALUE))
            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homeLayout.createSequentialGroup()
                    .addGap(224, 224, 224)
                    .addComponent(jLabel2)
                    .addContainerGap(401, Short.MAX_VALUE)))
        );

        CardHolder.add(home, "card2");

        profile.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel4.setkEndColor(new java.awt.Color(228, 229, 230));
        kGradientPanel4.setkStartColor(new java.awt.Color(248, 228, 231));

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Your Profile");

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(301, 301, 301))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel23)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jlabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jlabel1.setText("Last Name :");

        jlabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jlabel.setText("First Name :");
        jlabel.setToolTipText("");

        jlabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jlabel2.setText("Email      :");

        jlabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jlabel3.setText("Module   :");

        jSeparator1.setBackground(new java.awt.Color(12, 91, 160));

        jlabel5.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jlabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel5.setText("Change Password ?");

        jlabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jlabel4.setText("Current Password :");

        current_pass.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        current_pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        current_pass.setName("password_txt"); // NOI18N

        jlabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jlabel6.setText(" New Password     :");

        new_pass.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        new_pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        new_pass.setName("password_txt"); // NOI18N

        change_password_btn.setkEndColor(new java.awt.Color(248, 228, 231));
        change_password_btn.setkGradientFocus(350);
        change_password_btn.setkStartColor(new java.awt.Color(54, 37, 90));
        change_password_btn.setkTransparentControls(false);
        change_password_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                change_password_btnMousePressed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("CHANGE");

        javax.swing.GroupLayout change_password_btnLayout = new javax.swing.GroupLayout(change_password_btn);
        change_password_btn.setLayout(change_password_btnLayout);
        change_password_btnLayout.setHorizontalGroup(
            change_password_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(change_password_btnLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(74, 74, 74))
        );
        change_password_btnLayout.setVerticalGroup(
            change_password_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(change_password_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        firstname_txt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        firstname_txt.setText("test");
        firstname_txt.setToolTipText("");

        email_txt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        email_txt.setText("test");
        email_txt.setToolTipText("");

        lastname_txt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lastname_txt.setText("test");
        lastname_txt.setToolTipText("");

        module_txt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        module_txt.setText("test");
        module_txt.setToolTipText("");

        jlabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jlabel7.setText("National     :");

        national_txt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        national_txt.setText("test");
        national_txt.setToolTipText("");

        javax.swing.GroupLayout profileLayout = new javax.swing.GroupLayout(profile);
        profile.setLayout(profileLayout);
        profileLayout.setHorizontalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(profileLayout.createSequentialGroup()
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profileLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(jlabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profileLayout.createSequentialGroup()
                                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(profileLayout.createSequentialGroup()
                                        .addComponent(firstname_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(86, 86, 86))
                                    .addGroup(profileLayout.createSequentialGroup()
                                        .addComponent(lastname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(profileLayout.createSequentialGroup()
                                        .addComponent(jlabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(module_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(105, 105, 105))
                                    .addGroup(profileLayout.createSequentialGroup()
                                        .addComponent(jlabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(email_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(profileLayout.createSequentialGroup()
                                .addComponent(national_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addGap(391, 391, 391))))
                    .addGroup(profileLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileLayout.createSequentialGroup()
                                .addComponent(jlabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(new_pass))
                            .addGroup(profileLayout.createSequentialGroup()
                                .addComponent(jlabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(current_pass))
                            .addGroup(profileLayout.createSequentialGroup()
                                .addGap(228, 228, 228)
                                .addComponent(change_password_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(95, 95, 95)))
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
            .addGroup(profileLayout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jlabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(270, 270, 270))
        );
        profileLayout.setVerticalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel)
                    .addComponent(jlabel3)
                    .addComponent(firstname_txt)
                    .addComponent(module_txt))
                .addGap(49, 49, 49)
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel1)
                    .addComponent(jlabel2)
                    .addComponent(email_txt)
                    .addComponent(lastname_txt))
                .addGap(36, 36, 36)
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel7)
                    .addComponent(national_txt))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlabel5)
                .addGap(50, 50, 50)
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel4)
                    .addComponent(current_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel6)
                    .addComponent(new_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(change_password_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        CardHolder.add(profile, "card3");

        schedule.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel5.setkEndColor(new java.awt.Color(228, 229, 230));
        kGradientPanel5.setkStartColor(new java.awt.Color(248, 228, 231));

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Your Schedule");

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel5Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(31, 31, 31))
        );

        scrollpane.setBackground(new java.awt.Color(0, 0, 0));
        scrollpane.setBorder(null);

        table_user.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        table_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Module", "Date", "Time", "Hall", "Batch"
            }
        ));
        table_user.setFocusable(false);
        table_user.setGridColor(new java.awt.Color(255, 255, 255));
        table_user.setIntercellSpacing(new java.awt.Dimension(0, 0));
        table_user.setRowHeight(25);
        table_user.setSelectionBackground(new java.awt.Color(153, 153, 255));
        table_user.setShowVerticalLines(false);
        table_user.getTableHeader().setReorderingAllowed(false);
        scrollpane.setViewportView(table_user);
        if (table_user.getColumnModel().getColumnCount() > 0) {
            table_user.getColumnModel().getColumn(0).setPreferredWidth(15);
            table_user.getColumnModel().getColumn(2).setPreferredWidth(15);
            table_user.getColumnModel().getColumn(5).setPreferredWidth(15);
            table_user.getColumnModel().getColumn(6).setPreferredWidth(15);
        }

        combo_module.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        combo_module.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SE", "CS", "BE", "DE", "CN", "IN" }));
        combo_module.setBorder(null);
        combo_module.setFocusable(false);
        combo_module.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_moduleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout scheduleLayout = new javax.swing.GroupLayout(schedule);
        schedule.setLayout(scheduleLayout);
        scheduleLayout.setHorizontalGroup(
            scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(scheduleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scheduleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(combo_module, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );
        scheduleLayout.setVerticalGroup(
            scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scheduleLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(combo_module, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        CardHolder.add(schedule, "card4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(CardHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
            .addComponent(CardHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void home_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btnMouseEntered
       
        setColor(home_btn);
    }//GEN-LAST:event_home_btnMouseEntered

    private void home_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btnMouseExited
        
        resetColor(home_btn);
    }//GEN-LAST:event_home_btnMouseExited

    private void home_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btnMousePressed
     
        goHome();

    }//GEN-LAST:event_home_btnMousePressed

    private void profile_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profile_btnMouseEntered
        
        setColor(profile_btn);
       
    }//GEN-LAST:event_profile_btnMouseEntered

    private void profile_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profile_btnMouseExited
  
        resetColor(profile_btn);
    }//GEN-LAST:event_profile_btnMouseExited

    private void profile_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profile_btnMousePressed
    
        goProfile();
        

    }//GEN-LAST:event_profile_btnMousePressed

    private void schedule_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schedule_btnMouseEntered
       e:
        setColor(schedule_btn);
    }//GEN-LAST:event_schedule_btnMouseEntered

    private void schedule_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schedule_btnMouseExited
      
        resetColor(schedule_btn);
    }//GEN-LAST:event_schedule_btnMouseExited

    private void schedule_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schedule_btnMousePressed
        
        goSchedule();

    }//GEN-LAST:event_schedule_btnMousePressed

    private void change_password_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_change_password_btnMousePressed
       
        String currentpass  = String.valueOf(current_pass.getPassword());
        String newpass= String.valueOf(new_pass.getPassword()); 
        String oldpass = "select * from student_details where Password = '"+currentpass+"' AND Email = '"+email+"'";
        String tablename =  "Update student_details set Password = ? where Password = ? AND Email = '"+email+"'";
        operation.update_pass(tablename, currentpass, newpass, oldpass); //update password
        clearFields(); //clear fields after 

    }//GEN-LAST:event_change_password_btnMousePressed

    private void logout_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_btnMouseEntered
        setColor(logout_btn);
    }//GEN-LAST:event_logout_btnMouseEntered

    private void logout_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_btnMouseExited
        
        resetColor(logout_btn);
    }//GEN-LAST:event_logout_btnMouseExited

    private void logout_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_btnMousePressed
       if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
     this.dispose();
           portal.setVisible(true);
}
            
    }//GEN-LAST:event_logout_btnMousePressed

    private void combo_moduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_moduleActionPerformed
  
  //this comboBox is used to filter data according to the mdoule       
        DefaultTableModel table = (DefaultTableModel) table_user.getModel();
        String search = (String) combo_module.getSelectedItem();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        table_user.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));

    }//GEN-LAST:event_combo_moduleActionPerformed
     private void  clearFields(){
        current_pass.setText(null);
        new_pass.setText(null);
    } 
    
     
    public void setColor(JPanel panel)
    {
        panel.setBackground(new java.awt.Color(85,65,118));
    }
    
     public void resetColor(JPanel panel)
    {
        panel.setBackground(new java.awt.Color(54,37,90));
    }
     
     
    
    
   
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardHolder;
    private keeptoo.KGradientPanel change_password_btn;
    private javax.swing.JComboBox<String> combo_module;
    private javax.swing.JPasswordField current_pass;
    protected javax.swing.JLabel email_txt;
    protected javax.swing.JLabel firstname_txt;
    private javax.swing.JPanel home;
    private javax.swing.JPanel home_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    protected javax.swing.JLabel jlabel;
    public javax.swing.JLabel jlabel1;
    public javax.swing.JLabel jlabel2;
    public javax.swing.JLabel jlabel3;
    public javax.swing.JLabel jlabel4;
    public javax.swing.JLabel jlabel5;
    public javax.swing.JLabel jlabel6;
    public javax.swing.JLabel jlabel7;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    protected javax.swing.JLabel lastname_txt;
    private javax.swing.JPanel logout_btn;
    protected javax.swing.JLabel module_txt;
    protected javax.swing.JLabel national_txt;
    private javax.swing.JPasswordField new_pass;
    private javax.swing.JPanel profile;
    private javax.swing.JPanel profile_btn;
    private javax.swing.JPanel schedule;
    private javax.swing.JPanel schedule_btn;
    private javax.swing.JScrollPane scrollpane;
    private javax.swing.JTable table_user;
    // End of variables declaration//GEN-END:variables
}
