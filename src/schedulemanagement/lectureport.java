/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulemanagement;


import java.awt.Color;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author shanu
 */
public class lectureport extends javax.swing.JFrame {
    
    String email;
    public void setEmail(String email){
        this.email = email;
    }
    
    
    Validator checkL = new Validator();
   DBoperations operation = new DBoperations();
    java.util.Date date;
    java.sql.Date sqldate;
    Homeportal portal = new Homeportal();
    ShowTable table = new ShowTable();

    CardLayout cardLayout;
    public lectureport() {
        initComponents();
        
        
        table.show_user(lecture_booking_table);
        table.show_user(lecture_deleting_table);
        
        
       
        cardLayout = new CardLayout();
        CardHolder.setLayout(cardLayout);
        CardHolder.add("home",home);
        CardHolder.add("profile",profile);
        CardHolder.add("schedule",schedule);
        CardHolder.add("update",update);
        
        GeneralDesgin.design(lecture_booking_table, scrollpane);
        GeneralDesgin.design(lecture_deleting_table, scrollpane1);
       
      GeneralDesgin.comboDesign(combo_hall);
      GeneralDesgin.comboDesign(combo_time);
      GeneralDesgin.comboDesign(combo_batch);
      GeneralDesgin.comboDesign(combo_module);     
    }
   
    
     
  public void profile_check( String pwd, String user){
     //function is used to display the repective details of users in the profile page using the pwd and user to check from database
      
    try {
       
   String sql = "SELECT * FROM lecture_details WHERE Password = '"+pwd+"' AND  Email = '"+user+"' ";
    
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
       module_txt1.setText(module);
        
   }
   
   
}
  catch(Exception ex){
    JOptionPane.showMessageDialog(null, ex);
}
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
    public void goUpdate(){
         cardLayout.show(CardHolder, "update");
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        CardHolder = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        profile = new javax.swing.JPanel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel23 = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        firstname_txt = new javax.swing.JLabel();
        jlabel1 = new javax.swing.JLabel();
        lastname_txt = new javax.swing.JLabel();
        jlabel7 = new javax.swing.JLabel();
        national_txt = new javax.swing.JLabel();
        jlabel2 = new javax.swing.JLabel();
        email_txt = new javax.swing.JLabel();
        jlabel3 = new javax.swing.JLabel();
        module_txt1 = new javax.swing.JLabel();
        jlabel5 = new javax.swing.JLabel();
        jlabel4 = new javax.swing.JLabel();
        current_pass = new javax.swing.JPasswordField();
        jlabel6 = new javax.swing.JLabel();
        new_pass = new javax.swing.JPasswordField();
        kGradientPanel15 = new keeptoo.KGradientPanel();
        jLabel37 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        schedule = new javax.swing.JPanel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        jLabel24 = new javax.swing.JLabel();
        scrollpane = new javax.swing.JScrollPane();
        lecture_booking_table = new javax.swing.JTable();
        name_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        combo_module = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        date_txt = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        kGradientPanel11 = new keeptoo.KGradientPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        combo_time = new javax.swing.JComboBox<>();
        combo_hall = new javax.swing.JComboBox<>();
        combo_batch = new javax.swing.JComboBox<>();
        update = new javax.swing.JPanel();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        jLabel25 = new javax.swing.JLabel();
        scrollpane1 = new javax.swing.JScrollPane();
        lecture_deleting_table = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        ID_txt = new javax.swing.JTextField();
        delete_btn = new keeptoo.KGradientPanel();
        jLabel33 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1070, 726));
        setMinimumSize(new java.awt.Dimension(950, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(54, 37, 90));
        jPanel2.setPreferredSize(new java.awt.Dimension(291, 435));

        jPanel7.setBackground(new java.awt.Color(54, 37, 90));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel7MousePressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\shanu\\Desktop\\images\\icons8-home-24.png")); // NOI18N

        jLabel5.setBackground(new java.awt.Color(54, 37, 90));
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Home");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(54, 37, 90));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel8MousePressed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\shanu\\Desktop\\images\\icons8-user-24.png")); // NOI18N
        jLabel6.setName(""); // NOI18N

        jLabel7.setBackground(new java.awt.Color(54, 37, 90));
        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Profile");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(54, 37, 90));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel9MousePressed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\shanu\\Desktop\\images\\icons8-schedule-24.png")); // NOI18N
        jLabel10.setName(""); // NOI18N

        jLabel11.setBackground(new java.awt.Color(54, 37, 90));
        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Book Lecture");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addGap(81, 81, 81))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(54, 37, 90));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel10MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel10MousePressed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\shanu\\Desktop\\images\\icons8-delete-view-24 (1).png")); // NOI18N
        jLabel12.setName(""); // NOI18N

        jLabel13.setBackground(new java.awt.Color(54, 37, 90));
        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Delete Lecture");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        logout.setBackground(new java.awt.Color(54, 37, 90));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutMousePressed(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\shanu\\Desktop\\images\\icons8-logout-rounded-left-24.png")); // NOI18N
        jLabel19.setName(""); // NOI18N

        jLabel20.setBackground(new java.awt.Color(54, 37, 90));
        jLabel20.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Logout");

        javax.swing.GroupLayout logoutLayout = new javax.swing.GroupLayout(logout);
        logout.setLayout(logoutLayout);
        logoutLayout.setHorizontalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        logoutLayout.setVerticalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
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
                .addGap(205, 205, 205)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(225, 225, 225))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel22)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel15.setText("    Make sure a lecture is booked one day before.");
        jLabel15.setToolTipText("");

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel16.setText("    slot has been taken.");
        jLabel16.setToolTipText("");

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel17.setText("    Lecturers before booking a lecture check wheather the time ");
        jLabel17.setToolTipText("");

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(349, 349, 349))
            .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homeLayout.createSequentialGroup()
                    .addGap(244, 244, 244)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(447, 447, 447)))
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
                .addGap(264, 264, 264)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(300, 300, 300))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel23)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jlabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jlabel.setText("First Name :");
        jlabel.setToolTipText("");

        firstname_txt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        firstname_txt.setText("test");
        firstname_txt.setToolTipText("");

        jlabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jlabel1.setText("Last Name :");

        lastname_txt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lastname_txt.setText("krishan");
        lastname_txt.setToolTipText("");

        jlabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jlabel7.setText("National     :");

        national_txt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        national_txt.setText("test");
        national_txt.setToolTipText("");

        jlabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jlabel2.setText("Email   :");

        email_txt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        email_txt.setText("shanukakrishan@yahoo.com");
        email_txt.setToolTipText("");

        jlabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jlabel3.setText("Module:");

        module_txt1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        module_txt1.setText("test");
        module_txt1.setToolTipText("");

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

        kGradientPanel15.setkEndColor(new java.awt.Color(248, 228, 231));
        kGradientPanel15.setkGradientFocus(350);
        kGradientPanel15.setkStartColor(new java.awt.Color(54, 37, 90));
        kGradientPanel15.setkTransparentControls(false);
        kGradientPanel15.setPreferredSize(new java.awt.Dimension(221, 50));
        kGradientPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel15MousePressed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("CHANGE");

        javax.swing.GroupLayout kGradientPanel15Layout = new javax.swing.GroupLayout(kGradientPanel15);
        kGradientPanel15.setLayout(kGradientPanel15Layout);
        kGradientPanel15Layout.setHorizontalGroup(
            kGradientPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel15Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(83, 83, 83))
        );
        kGradientPanel15Layout.setVerticalGroup(
            kGradientPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator1.setBackground(new java.awt.Color(12, 91, 160));

        javax.swing.GroupLayout profileLayout = new javax.swing.GroupLayout(profile);
        profile.setLayout(profileLayout);
        profileLayout.setHorizontalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(profileLayout.createSequentialGroup()
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profileLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profileLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(profileLayout.createSequentialGroup()
                                        .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(firstname_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lastname_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(profileLayout.createSequentialGroup()
                                                .addComponent(jlabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(email_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(profileLayout.createSequentialGroup()
                                                .addComponent(jlabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(module_txt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(profileLayout.createSequentialGroup()
                                        .addComponent(national_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                        .addGap(418, 418, 418))))
                            .addGroup(profileLayout.createSequentialGroup()
                                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(current_pass)
                                    .addComponent(new_pass)
                                    .addGroup(profileLayout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(kGradientPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(77, 77, 77)))
                                .addGap(188, 188, 188))
                            .addGroup(profileLayout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(jlabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(287, 287, 287))))
                    .addGroup(profileLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );
        profileLayout.setVerticalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel)
                    .addComponent(jlabel3)
                    .addComponent(firstname_txt)
                    .addComponent(module_txt1))
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
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabel6)
                    .addComponent(new_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(kGradientPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        CardHolder.add(profile, "card3");

        schedule.setBackground(new java.awt.Color(255, 255, 255));
        schedule.setMinimumSize(new java.awt.Dimension(770, 721));

        kGradientPanel5.setkEndColor(new java.awt.Color(228, 229, 230));
        kGradientPanel5.setkStartColor(new java.awt.Color(248, 228, 231));

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Book A Lecture");

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(254, 254, 254))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel5Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(30, 30, 30))
        );

        scrollpane.setBackground(new java.awt.Color(0, 0, 0));
        scrollpane.setBorder(null);

        lecture_booking_table.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lecture_booking_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Module", "Date", "Time", "Hall", "Batch"
            }
        ));
        lecture_booking_table.setFocusable(false);
        lecture_booking_table.setGridColor(new java.awt.Color(255, 255, 255));
        lecture_booking_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        lecture_booking_table.setRowHeight(25);
        lecture_booking_table.setSelectionBackground(new java.awt.Color(153, 153, 255));
        lecture_booking_table.setShowVerticalLines(false);
        lecture_booking_table.getTableHeader().setReorderingAllowed(false);
        scrollpane.setViewportView(lecture_booking_table);
        if (lecture_booking_table.getColumnModel().getColumnCount() > 0) {
            lecture_booking_table.getColumnModel().getColumn(0).setPreferredWidth(15);
            lecture_booking_table.getColumnModel().getColumn(2).setPreferredWidth(15);
            lecture_booking_table.getColumnModel().getColumn(5).setPreferredWidth(15);
            lecture_booking_table.getColumnModel().getColumn(6).setPreferredWidth(15);
        }

        name_txt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        name_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_txtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("Hall");

        combo_module.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        combo_module.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SE", "CS", "BE", "DE", "CN", "IN" }));
        combo_module.setBorder(null);
        combo_module.setFocusable(false);
        combo_module.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_moduleActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("Module");

        date_txt.setBackground(new java.awt.Color(255, 255, 255));
        date_txt.setDateFormatString("d MMM, y");
        date_txt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("Date");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setText("Time");

        kGradientPanel11.setkEndColor(new java.awt.Color(248, 228, 231));
        kGradientPanel11.setkGradientFocus(350);
        kGradientPanel11.setkStartColor(new java.awt.Color(54, 37, 90));
        kGradientPanel11.setkTransparentControls(false);
        kGradientPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel11MousePressed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("BOOK");

        javax.swing.GroupLayout kGradientPanel11Layout = new javax.swing.GroupLayout(kGradientPanel11);
        kGradientPanel11.setLayout(kGradientPanel11Layout);
        kGradientPanel11Layout.setHorizontalGroup(
            kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel11Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addGap(55, 55, 55))
        );
        kGradientPanel11Layout.setVerticalGroup(
            kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel14.setText("Name");

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel18.setText("Batch");

        combo_time.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        combo_time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9am - 11am", "11am -1pm", "1pm - 3pm", "3pm - 5pm", "1pm - 4pm", "9am - 12pm", " " }));
        combo_time.setBorder(null);
        combo_time.setFocusable(false);
        combo_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_timeActionPerformed(evt);
            }
        });

        combo_hall.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        combo_hall.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "009", "008", "002", "003", "001", "005", "006" }));
        combo_hall.setBorder(null);
        combo_hall.setFocusable(false);
        combo_hall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_hallActionPerformed(evt);
            }
        });

        combo_batch.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        combo_batch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "19.1 / 19.2", "18.1", "17.2", "16.2", "20.1", "20.2" }));
        combo_batch.setBorder(null);
        combo_batch.setFocusable(false);
        combo_batch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_batchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout scheduleLayout = new javax.swing.GroupLayout(schedule);
        schedule.setLayout(scheduleLayout);
        scheduleLayout.setHorizontalGroup(
            scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(scheduleLayout.createSequentialGroup()
                .addGroup(scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(scheduleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollpane))
                    .addGroup(scheduleLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_txt)
                            .addComponent(combo_module, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combo_time, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addGroup(scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(scheduleLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(date_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combo_hall, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(combo_batch, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addComponent(kGradientPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        scheduleLayout.setVerticalGroup(
            scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scheduleLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(scheduleLayout.createSequentialGroup()
                        .addGroup(scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(combo_batch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(scheduleLayout.createSequentialGroup()
                                .addComponent(date_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(28, 28, 28)
                                .addComponent(combo_hall, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)))
                        .addGap(2, 2, 2))
                    .addGroup(scheduleLayout.createSequentialGroup()
                        .addGroup(scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(kGradientPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(scheduleLayout.createSequentialGroup()
                                .addGroup(scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(scheduleLayout.createSequentialGroup()
                                        .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGap(2, 2, 2)))
                                .addGroup(scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(scheduleLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(combo_module, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scheduleLayout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel2)))))
                        .addGap(34, 34, 34)
                        .addGroup(scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(combo_time, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(scheduleLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)))
                .addGap(69, 69, 69))
        );

        CardHolder.add(schedule, "card4");

        update.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel6.setkEndColor(new java.awt.Color(228, 229, 230));
        kGradientPanel6.setkStartColor(new java.awt.Color(248, 228, 231));

        jLabel25.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Delete A Lecture");

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(245, 245, 245))
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel25)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        scrollpane1.setBackground(new java.awt.Color(0, 0, 0));
        scrollpane1.setBorder(null);

        lecture_deleting_table.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lecture_deleting_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Module", "Date", "Time", "Hall", "Batch"
            }
        ));
        lecture_deleting_table.setFocusable(false);
        lecture_deleting_table.setGridColor(new java.awt.Color(255, 255, 255));
        lecture_deleting_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        lecture_deleting_table.setRowHeight(25);
        lecture_deleting_table.setSelectionBackground(new java.awt.Color(153, 153, 255));
        lecture_deleting_table.setShowVerticalLines(false);
        lecture_deleting_table.getTableHeader().setReorderingAllowed(false);
        scrollpane1.setViewportView(lecture_deleting_table);
        if (lecture_deleting_table.getColumnModel().getColumnCount() > 0) {
            lecture_deleting_table.getColumnModel().getColumn(0).setPreferredWidth(15);
            lecture_deleting_table.getColumnModel().getColumn(2).setPreferredWidth(15);
            lecture_deleting_table.getColumnModel().getColumn(5).setPreferredWidth(15);
            lecture_deleting_table.getColumnModel().getColumn(6).setPreferredWidth(15);
        }

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel9.setText("ID");

        ID_txt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        delete_btn.setkEndColor(new java.awt.Color(248, 228, 231));
        delete_btn.setkGradientFocus(350);
        delete_btn.setkStartColor(new java.awt.Color(54, 37, 90));
        delete_btn.setkTransparentControls(false);
        delete_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                delete_btnMousePressed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Delete");

        javax.swing.GroupLayout delete_btnLayout = new javax.swing.GroupLayout(delete_btn);
        delete_btn.setLayout(delete_btnLayout);
        delete_btnLayout.setHorizontalGroup(
            delete_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_btnLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54))
        );
        delete_btnLayout.setVerticalGroup(
            delete_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout updateLayout = new javax.swing.GroupLayout(update);
        update.setLayout(updateLayout);
        updateLayout.setHorizontalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(updateLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(updateLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(delete_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(updateLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ID_txt)))
                .addGap(298, 298, 298))
            .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(updateLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scrollpane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        updateLayout.setVerticalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(kGradientPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 465, Short.MAX_VALUE)
                .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(updateLayout.createSequentialGroup()
                    .addGap(163, 163, 163)
                    .addComponent(scrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(191, Short.MAX_VALUE)))
        );

        CardHolder.add(update, "card5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(CardHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
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

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
      
        setColor(jPanel7);
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
       
        resetColor(jPanel7);
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed
 
        goHome();

    }//GEN-LAST:event_jPanel7MousePressed

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
       
        setColor(jPanel8);
        jLabel6.setBackground(Color.red);
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
     
        resetColor(jPanel8);
    }//GEN-LAST:event_jPanel8MouseExited

    private void jPanel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MousePressed
       
        goProfile();

    }//GEN-LAST:event_jPanel8MousePressed

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
        
        setColor(jPanel9);
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
   
        resetColor(jPanel9);
    }//GEN-LAST:event_jPanel9MouseExited

    private void jPanel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MousePressed
       
        goSchedule();

    }//GEN-LAST:event_jPanel9MousePressed

    private void combo_moduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_moduleActionPerformed
        
       
    }//GEN-LAST:event_combo_moduleActionPerformed

    private void kGradientPanel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel11MousePressed
         
        String combovalue = combo_module.getSelectedItem().toString();
        String time = combo_time.getSelectedItem().toString();
        date = date_txt.getDate();
        sqldate = new java.sql.Date(date.getTime());
        String strDate = DateFormat.getDateInstance().format(sqldate);
        String hall = combo_hall.getSelectedItem().toString();
        String name = name_txt.getText();
        String query = "INSERT INTO `lecture_schedule`(`Name`, `Module`, `Time`, `Date` , `Hall` ,`Batch` ) VALUES (?,?,?,?,?,?)";
        String SelectionQuery = "SELECT * FROM lecture_schedule WHERE Module = '"+combovalue+"' AND Time = '"+time+"' AND Hall = '"+hall+"'";
        
        String batch = combo_batch.getSelectedItem().toString();
        CheckValue check = new CheckValue();
        
        
      //checkLectureSchedule in the class ChecValue checks if the SelectionQuery returns true
      //if its true that means the lectureschedule already exists in the database
      //if it returns false then the values gets inserted to the database
        if (check.checkLectureSchedule(SelectionQuery))
                {
                   
                    
                }
        else 
        {
        DBoperations operation = new DBoperations(name, combovalue, strDate, query, time , hall , batch ,lecture_booking_table , lecture_deleting_table);
        operation.booking();
        }
        
    }//GEN-LAST:event_kGradientPanel11MousePressed

    private void jPanel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseEntered
        setColor(jPanel10);
    }//GEN-LAST:event_jPanel10MouseEntered

    private void jPanel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseExited
       resetColor(jPanel10);
    }//GEN-LAST:event_jPanel10MouseExited

    private void jPanel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MousePressed
        
        goUpdate();
    }//GEN-LAST:event_jPanel10MousePressed

    private void delete_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_btnMousePressed
       
        
        int id = Integer.parseInt(ID_txt.getText());
         String con = "jdbc:mysql://localhost:3306/student_registeration";
         String query = "delete from lecture_schedule where ID='"+id+"' ";
        operation.delete(id, con, query, lecture_booking_table, lecture_deleting_table); //operation is an object of DBoperations 
        
      //below code is used to show data in the tables
           DefaultTableModel model = (DefaultTableModel)lecture_booking_table.getModel();
           DefaultTableModel model1 = (DefaultTableModel)lecture_deleting_table.getModel();
           
         //below code is to refresh the database after a value is been deleted
           model.setRowCount(0);
           model1.setRowCount(0);
           table.show_user(lecture_booking_table);
           table.show_user(lecture_deleting_table);
            
    
    }//GEN-LAST:event_delete_btnMousePressed

    private void name_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_txtActionPerformed
        
    }//GEN-LAST:event_name_txtActionPerformed

    private void kGradientPanel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel15MousePressed
        
        String currentpass  = String.valueOf(current_pass.getPassword());
        String newpass= String.valueOf(new_pass.getPassword()); 
        String oldpass = "select * from lecture_details where Password = '"+currentpass+"' AND Email = '"+email+"'";
        String tablename =  "Update lecture_details set Password = ? where Password = ?";
        operation.update_pass(tablename, currentpass, newpass, oldpass);  //updating pass from database operation is a object of DBoperations
        clearFields();
        

    }//GEN-LAST:event_kGradientPanel15MousePressed

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        setColor(logout);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
      
        resetColor(logout);
    }//GEN-LAST:event_logoutMouseExited

    private void logoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMousePressed
        if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        this.dispose();
        portal.setVisible(true);
        }

    }//GEN-LAST:event_logoutMousePressed

    private void combo_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_timeActionPerformed
     
    }//GEN-LAST:event_combo_timeActionPerformed

    private void combo_hallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_hallActionPerformed
       
    }//GEN-LAST:event_combo_hallActionPerformed

    private void combo_batchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_batchActionPerformed
     
    }//GEN-LAST:event_combo_batchActionPerformed
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
               
                new lectureport().setVisible(true);
 
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardHolder;
    private javax.swing.JTextField ID_txt;
    private javax.swing.JComboBox<String> combo_batch;
    private javax.swing.JComboBox<String> combo_hall;
    private javax.swing.JComboBox<String> combo_module;
    private javax.swing.JComboBox<String> combo_time;
    private javax.swing.JPasswordField current_pass;
    private com.toedter.calendar.JDateChooser date_txt;
    private keeptoo.KGradientPanel delete_btn;
    protected javax.swing.JLabel email_txt;
    protected javax.swing.JLabel firstname_txt;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    protected javax.swing.JLabel jlabel;
    public javax.swing.JLabel jlabel1;
    public javax.swing.JLabel jlabel2;
    public javax.swing.JLabel jlabel3;
    public javax.swing.JLabel jlabel4;
    public javax.swing.JLabel jlabel5;
    public javax.swing.JLabel jlabel6;
    public javax.swing.JLabel jlabel7;
    private keeptoo.KGradientPanel kGradientPanel11;
    private keeptoo.KGradientPanel kGradientPanel15;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel6;
    protected javax.swing.JLabel lastname_txt;
    private javax.swing.JTable lecture_booking_table;
    private javax.swing.JTable lecture_deleting_table;
    private javax.swing.JPanel logout;
    protected javax.swing.JLabel module_txt1;
    private javax.swing.JTextField name_txt;
    protected javax.swing.JLabel national_txt;
    private javax.swing.JPasswordField new_pass;
    private javax.swing.JPanel profile;
    private javax.swing.JPanel schedule;
    private javax.swing.JScrollPane scrollpane;
    private javax.swing.JScrollPane scrollpane1;
    private javax.swing.JPanel update;
    // End of variables declaration//GEN-END:variables

    static public class HeaderColor extends DefaultTableCellRenderer{
        public HeaderColor()
        {
            setOpaque(true);
        }
        @Override
         public Component getTableCellRendererComponent(JTable jTable, Object value, boolean selected, boolean focused, int row, int column) {
            super.getTableCellRendererComponent(jTable, value, selected, focused, row, column);
            setBackground(new Color(54,37,90));
            setForeground(Color.WHITE);
             
           
            return this;
        }
    }


}
