/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulemanagement;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.CardLayout;


import java.util.regex.Matcher;
import java.util.regex.Pattern;



import javax.swing.JOptionPane;
import javax.swing.JTable;


/**
 *
 * @author shanu
 */
public class adminport extends javax.swing.JFrame {
    private String query;
    private String Connection_string;
    private int Id;
    private String pwd;
  ShowTable table = new ShowTable();
  Homeportal portal = new Homeportal();
  Pattern pattern = Pattern.compile("^\\d{10}$");  //regex to check if national is valid, this is used blow in student_registeration button 
  Validator checkValid = new Validator();
  Error_panel errorPanel = new Error_panel();
   

    

    CardLayout cardLayout;
    public adminport() {
        initComponents();
       
        
      
       table.show_user_student(student_table); //table is an object of ShowTable which is used to show data on the tables
       table.show_user(table_user1);
        
        cardLayout = new CardLayout();
        CardHolder.setLayout(cardLayout);
        CardHolder.add("studentlist",studentlist);
        
        CardHolder.add("schedule",schedule);
        CardHolder.add("register",register);
        CardHolder.add("lecture_register",lecture_register);
        
        GeneralDesgin.design(table_user1, scrollpane1); //to design jTable
        GeneralDesgin.design(student_table, scrollpane2);
        
          
        GeneralDesgin.comboDesign(combo); //To design comboboxes
        GeneralDesgin.comboDesign(combo1);
       GeneralDesgin.TableSpace(student_table);
     
        
    }
     
     public void goStudentList(){
        cardLayout.show(CardHolder, "studentlist");
    }
      public void goLecturerList(){
        cardLayout.show(CardHolder, "lecturerlist");
    }
    
    public void goSchedule(){
       cardLayout.show(CardHolder, "schedule");
    }
    public void goRegister(){
        cardLayout.show(CardHolder,"register");
        
    }
    public void goLectureRegister(){
        cardLayout.show(CardHolder,"lecture_register");
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Jpanel_10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        CardHolder = new javax.swing.JPanel();
        studentlist = new javax.swing.JPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel22 = new javax.swing.JLabel();
        scrollpane2 = new javax.swing.JScrollPane();
        student_table = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        ID_txt1 = new javax.swing.JTextField();
        delete_btn1 = new keeptoo.KGradientPanel();
        jLabel35 = new javax.swing.JLabel();
        schedule = new javax.swing.JPanel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        jLabel24 = new javax.swing.JLabel();
        scrollpane1 = new javax.swing.JScrollPane();
        table_user1 = new javax.swing.JTable();
        ID_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        delete_btn = new keeptoo.KGradientPanel();
        jLabel34 = new javax.swing.JLabel();
        register = new javax.swing.JPanel();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        first_name_txt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        last_name_txt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        national_id_txt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        password_txt = new javax.swing.JPasswordField();
        student_registeration = new keeptoo.KGradientPanel();
        jLabel19 = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        lecture_register = new javax.swing.JPanel();
        kGradientPanel8 = new keeptoo.KGradientPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lecture_first_name = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        lecture_last_name = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        lecture_nationalid = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        lecture_email = new javax.swing.JTextField();
        lecture_password = new javax.swing.JPasswordField();
        jLabel29 = new javax.swing.JLabel();
        lecture_registeration = new keeptoo.KGradientPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1070, 726));
        setMinimumSize(new java.awt.Dimension(900, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(54, 37, 90));
        jPanel2.setPreferredSize(new java.awt.Dimension(291, 435));

        jPanel6.setBackground(new java.awt.Color(54, 37, 90));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\shanu\\Desktop\\images\\icons8-student-center-24 (1).png")); // NOI18N

        jLabel3.setBackground(new java.awt.Color(54, 37, 90));
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student List");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\shanu\\Desktop\\images\\icons8-schedule-24.png")); // NOI18N
        jLabel6.setName(""); // NOI18N

        jLabel7.setBackground(new java.awt.Color(54, 37, 90));
        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Lecturer Schedule");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Jpanel_10.setBackground(new java.awt.Color(54, 37, 90));
        Jpanel_10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Jpanel_10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Jpanel_10MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Jpanel_10MousePressed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\shanu\\Desktop\\images\\icons8-student-registration-24 (2).png")); // NOI18N
        jLabel10.setName(""); // NOI18N

        jLabel11.setBackground(new java.awt.Color(54, 37, 90));
        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Register Student");

        javax.swing.GroupLayout Jpanel_10Layout = new javax.swing.GroupLayout(Jpanel_10);
        Jpanel_10.setLayout(Jpanel_10Layout);
        Jpanel_10Layout.setHorizontalGroup(
            Jpanel_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        Jpanel_10Layout.setVerticalGroup(
            Jpanel_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Jpanel_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\shanu\\Desktop\\images\\icons8-training-24 (1).png")); // NOI18N
        jLabel12.setName(""); // NOI18N

        jLabel13.setBackground(new java.awt.Color(54, 37, 90));
        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Register Lecturer");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\shanu\\Desktop\\images\\icons8-logout-rounded-left-24.png")); // NOI18N
        jLabel23.setName(""); // NOI18N

        jLabel36.setBackground(new java.awt.Color(54, 37, 90));
        jLabel36.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Logout");

        javax.swing.GroupLayout logoutLayout = new javax.swing.GroupLayout(logout);
        logout.setLayout(logoutLayout);
        logoutLayout.setHorizontalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        logoutLayout.setVerticalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jpanel_10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Jpanel_10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257))
        );

        CardHolder.setBackground(new java.awt.Color(255, 255, 255));
        CardHolder.setLayout(new java.awt.CardLayout());

        studentlist.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel3.setkEndColor(new java.awt.Color(228, 229, 230));
        kGradientPanel3.setkStartColor(new java.awt.Color(248, 228, 231));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Student Management");

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(183, 183, 183))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel22)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        scrollpane2.setBackground(new java.awt.Color(0, 0, 0));
        scrollpane2.setBorder(null);

        student_table.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        student_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Degree", "National ID", "Email"
            }
        ));
        student_table.setFocusable(false);
        student_table.setGridColor(new java.awt.Color(255, 255, 255));
        student_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        student_table.setRowHeight(25);
        student_table.setSelectionBackground(new java.awt.Color(153, 153, 255));
        student_table.setShowVerticalLines(false);
        student_table.getTableHeader().setReorderingAllowed(false);
        scrollpane2.setViewportView(student_table);
        if (student_table.getColumnModel().getColumnCount() > 0) {
            student_table.getColumnModel().getColumn(0).setPreferredWidth(10);
            student_table.getColumnModel().getColumn(1).setPreferredWidth(15);
            student_table.getColumnModel().getColumn(2).setPreferredWidth(12);
            student_table.getColumnModel().getColumn(3).setPreferredWidth(12);
            student_table.getColumnModel().getColumn(4).setPreferredWidth(12);
            student_table.getColumnModel().getColumn(5).setPreferredWidth(40);
        }

        jLabel31.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel31.setText("ID");

        ID_txt1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        delete_btn1.setkEndColor(new java.awt.Color(248, 228, 231));
        delete_btn1.setkGradientFocus(350);
        delete_btn1.setkStartColor(new java.awt.Color(54, 37, 90));
        delete_btn1.setkTransparentControls(false);
        delete_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                delete_btn1MousePressed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Delete");

        javax.swing.GroupLayout delete_btn1Layout = new javax.swing.GroupLayout(delete_btn1);
        delete_btn1.setLayout(delete_btn1Layout);
        delete_btn1Layout.setHorizontalGroup(
            delete_btn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_btn1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(75, 75, 75))
        );
        delete_btn1Layout.setVerticalGroup(
            delete_btn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout studentlistLayout = new javax.swing.GroupLayout(studentlist);
        studentlist.setLayout(studentlistLayout);
        studentlistLayout.setHorizontalGroup(
            studentlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(studentlistLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ID_txt1)
                .addGap(18, 18, 18)
                .addComponent(delete_btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(195, 195, 195))
            .addGroup(studentlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentlistLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scrollpane2, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        studentlistLayout.setVerticalGroup(
            studentlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentlistLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(446, 446, 446)
                .addGroup(studentlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(studentlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ID_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 94, 94))
            .addGroup(studentlistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(studentlistLayout.createSequentialGroup()
                    .addGap(179, 179, 179)
                    .addComponent(scrollpane2, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                    .addGap(180, 180, 180)))
        );

        CardHolder.add(studentlist, "card2");

        schedule.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel5.setkEndColor(new java.awt.Color(228, 229, 230));
        kGradientPanel5.setkStartColor(new java.awt.Color(248, 228, 231));

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Edit Lecture Schedule");

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel5Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(192, 192, 192))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel5Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(30, 30, 30))
        );

        scrollpane1.setBackground(new java.awt.Color(0, 0, 0));
        scrollpane1.setBorder(null);

        table_user1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        table_user1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Module", "Date", "Time", "Hall", "Batch"
            }
        ));
        table_user1.setFocusable(false);
        table_user1.setGridColor(new java.awt.Color(255, 255, 255));
        table_user1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        table_user1.setRowHeight(25);
        table_user1.setSelectionBackground(new java.awt.Color(153, 153, 255));
        table_user1.setShowVerticalLines(false);
        table_user1.getTableHeader().setReorderingAllowed(false);
        scrollpane1.setViewportView(table_user1);
        if (table_user1.getColumnModel().getColumnCount() > 0) {
            table_user1.getColumnModel().getColumn(0).setPreferredWidth(15);
            table_user1.getColumnModel().getColumn(2).setPreferredWidth(15);
            table_user1.getColumnModel().getColumn(4).setPreferredWidth(15);
            table_user1.getColumnModel().getColumn(5).setPreferredWidth(15);
            table_user1.getColumnModel().getColumn(6).setPreferredWidth(15);
        }

        ID_txt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel9.setText("ID");

        delete_btn.setkEndColor(new java.awt.Color(248, 228, 231));
        delete_btn.setkGradientFocus(350);
        delete_btn.setkStartColor(new java.awt.Color(54, 37, 90));
        delete_btn.setkTransparentControls(false);
        delete_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                delete_btnMousePressed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Delete");

        javax.swing.GroupLayout delete_btnLayout = new javax.swing.GroupLayout(delete_btn);
        delete_btn.setLayout(delete_btnLayout);
        delete_btnLayout.setHorizontalGroup(
            delete_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_btnLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(52, 52, 52))
        );
        delete_btnLayout.setVerticalGroup(
            delete_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout scheduleLayout = new javax.swing.GroupLayout(schedule);
        schedule.setLayout(scheduleLayout);
        scheduleLayout.setHorizontalGroup(
            scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(scheduleLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(delete_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(214, 214, 214))
            .addGroup(scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(scheduleLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(scrollpane1, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
                    .addGap(15, 15, 15)))
        );
        scheduleLayout.setVerticalGroup(
            scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scheduleLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 461, Short.MAX_VALUE)
                .addGroup(scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ID_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(81, 81, 81))
            .addGroup(scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(scheduleLayout.createSequentialGroup()
                    .addGap(179, 179, 179)
                    .addComponent(scrollpane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                    .addGap(180, 180, 180)))
        );

        CardHolder.add(schedule, "card4");

        register.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel6.setkEndColor(new java.awt.Color(228, 229, 230));
        kGradientPanel6.setkStartColor(new java.awt.Color(248, 228, 231));

        jLabel25.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Student Registration");

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(192, 192, 192))
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel25)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel15.setText("First Name");

        first_name_txt.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        first_name_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        first_name_txt.setName("first_name_txt"); // NOI18N

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel14.setText("Last Name");

        last_name_txt.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        last_name_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        last_name_txt.setName("last_name_txt"); // NOI18N

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel16.setText("National ID");

        national_id_txt.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        national_id_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        national_id_txt.setName("national_id_txt"); // NOI18N

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel18.setText("Email");

        email_txt.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        email_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        email_txt.setName("email_txt"); // NOI18N

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel17.setText("Password");

        password_txt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        password_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        password_txt.setName("password_txt"); // NOI18N

        student_registeration.setkEndColor(new java.awt.Color(248, 228, 231));
        student_registeration.setkGradientFocus(350);
        student_registeration.setkStartColor(new java.awt.Color(54, 37, 90));
        student_registeration.setkTransparentControls(false);
        student_registeration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                student_registerationMousePressed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("SIGN UP");

        javax.swing.GroupLayout student_registerationLayout = new javax.swing.GroupLayout(student_registeration);
        student_registeration.setLayout(student_registerationLayout);
        student_registerationLayout.setHorizontalGroup(
            student_registerationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(student_registerationLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(96, 96, 96))
        );
        student_registerationLayout.setVerticalGroup(
            student_registerationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(student_registerationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        combo1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SE", "CS", "BA", " " }));
        combo1.setBorder(null);

        jLabel30.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel30.setText("Module");

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(registerLayout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(first_name_txt)
                    .addComponent(jLabel14)
                    .addComponent(last_name_txt)
                    .addComponent(jLabel16)
                    .addComponent(national_id_txt)
                    .addComponent(jLabel18)
                    .addComponent(email_txt)
                    .addComponent(jLabel17)
                    .addComponent(password_txt)
                    .addComponent(jLabel30)
                    .addComponent(combo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(student_registeration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(234, 234, 234))
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(kGradientPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(11, 11, 11)
                .addComponent(first_name_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(11, 11, 11)
                .addComponent(last_name_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(11, 11, 11)
                .addComponent(national_id_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addGap(11, 11, 11)
                .addComponent(email_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(11, 11, 11)
                .addComponent(password_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addGap(11, 11, 11)
                .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(student_registeration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        CardHolder.add(register, "card5");

        lecture_register.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel8.setkEndColor(new java.awt.Color(228, 229, 230));
        kGradientPanel8.setkStartColor(new java.awt.Color(248, 228, 231));

        jLabel26.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Lecture Registration");

        javax.swing.GroupLayout kGradientPanel8Layout = new javax.swing.GroupLayout(kGradientPanel8);
        kGradientPanel8.setLayout(kGradientPanel8Layout);
        kGradientPanel8Layout.setHorizontalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(211, 211, 211))
        );
        kGradientPanel8Layout.setVerticalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel26)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel20.setText("First Name");

        lecture_first_name.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lecture_first_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        lecture_first_name.setName("first_name_txt"); // NOI18N

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel21.setText("Last Name");

        lecture_last_name.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lecture_last_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        lecture_last_name.setName("last_name_txt"); // NOI18N

        jLabel27.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel27.setText("National ID");

        lecture_nationalid.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lecture_nationalid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        lecture_nationalid.setName("national_id_txt"); // NOI18N

        jLabel28.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel28.setText("Email");

        lecture_email.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lecture_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        lecture_email.setName("email_txt"); // NOI18N

        lecture_password.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lecture_password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        lecture_password.setName("password_txt"); // NOI18N

        jLabel29.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel29.setText("Module");

        lecture_registeration.setkEndColor(new java.awt.Color(248, 228, 231));
        lecture_registeration.setkGradientFocus(350);
        lecture_registeration.setkStartColor(new java.awt.Color(54, 37, 90));
        lecture_registeration.setkTransparentControls(false);
        lecture_registeration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lecture_registerationMousePressed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("SIGN UP");

        javax.swing.GroupLayout lecture_registerationLayout = new javax.swing.GroupLayout(lecture_registeration);
        lecture_registeration.setLayout(lecture_registerationLayout);
        lecture_registerationLayout.setHorizontalGroup(
            lecture_registerationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lecture_registerationLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(96, 96, 96))
        );
        lecture_registerationLayout.setVerticalGroup(
            lecture_registerationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lecture_registerationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel33.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel33.setText("Password");

        combo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SE", "CS", "BA", " " }));
        combo.setBorder(null);

        javax.swing.GroupLayout lecture_registerLayout = new javax.swing.GroupLayout(lecture_register);
        lecture_register.setLayout(lecture_registerLayout);
        lecture_registerLayout.setHorizontalGroup(
            lecture_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lecture_registerLayout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addGroup(lecture_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20)
                    .addComponent(lecture_first_name)
                    .addComponent(lecture_last_name)
                    .addComponent(lecture_nationalid)
                    .addComponent(lecture_password)
                    .addComponent(lecture_email)
                    .addComponent(lecture_registeration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(235, 235, 235))
        );
        lecture_registerLayout.setVerticalGroup(
            lecture_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lecture_registerLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(kGradientPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lecture_first_name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lecture_last_name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lecture_nationalid, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lecture_email, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lecture_password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lecture_registeration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        CardHolder.add(lecture_register, "card6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(CardHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        
        setColor(jPanel6);
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        
        resetColor(jPanel6);
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
      
        goStudentList();

    }//GEN-LAST:event_jPanel6MousePressed

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
        
        setColor(jPanel8);
        jLabel6.setBackground(Color.red);
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
    
        resetColor(jPanel8);
    }//GEN-LAST:event_jPanel8MouseExited

    private void jPanel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MousePressed
      
        goSchedule();

    }//GEN-LAST:event_jPanel8MousePressed

    private void Jpanel_10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jpanel_10MouseEntered
        
        setColor(Jpanel_10);
    }//GEN-LAST:event_Jpanel_10MouseEntered

    private void Jpanel_10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jpanel_10MouseExited
        
        resetColor(Jpanel_10);
    }//GEN-LAST:event_Jpanel_10MouseExited

    private void Jpanel_10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jpanel_10MousePressed
        
        goRegister();

    }//GEN-LAST:event_Jpanel_10MousePressed

    private void student_registerationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_registerationMousePressed
        //check lecture_registeration below to see the code explaination
       
         pwd = new String(password_txt.getPassword());
        String combovalue = combo1.getSelectedItem().toString();
        String table = "student_details";
        String Fname = first_name_txt.getText();
        String Lname = last_name_txt.getText();
        String National = national_id_txt.getText();
        String Email = email_txt.getText();
        CheckValue checkEmail = new CheckValue();
        Matcher m = pattern.matcher(National);
        String SQL = "SELECT * FROM student_details WHERE National ='" +National+ "'";
        String SQLEmail = "SELECT * FROM student_details WHERE Email ='" +Email+ "'";
       
       if(checkValid.Validate(Fname, Lname, Email, pwd, National) == false)
       {
       
       }
       
       else if(checkEmail.check(Email, SQLEmail)){
        
        checkValid.label("Email Already Exist!");
       }
       
       else if(checkEmail.checkNat(National, SQL))
       {
          
       }
       else {
        DBoperations operation = new DBoperations(table,Fname, Lname, National, Email, pwd, combovalue,student_table);
        
        operation.registeration();
        clearFields();
       }
           
    }//GEN-LAST:event_student_registerationMousePressed

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
       
         setColor(jPanel9);
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
       
        resetColor(jPanel9);
    }//GEN-LAST:event_jPanel9MouseExited

    private void jPanel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MousePressed
     
        goLectureRegister();
    }//GEN-LAST:event_jPanel9MousePressed

    private void lecture_registerationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecture_registerationMousePressed
     
       
         
        String pwd = new String(lecture_password.getPassword());
        String combovalue = combo.getSelectedItem().toString();
        String table = "lecture_details";
        String Fname = lecture_first_name.getText();
        String Lname = lecture_last_name.getText();
        String National = lecture_nationalid.getText();
        String Email = lecture_email.getText();
        Matcher m = pattern.matcher(National);
        CheckValue check = new CheckValue();
        //this query is to select all the values from lecture_details where national is equal to user input
        String SQL = "SELECT * FROM lecture_details WHERE National ='" +National+ "'";
        //this query is to select email from student_details
        String SQLEmail = "SELECT * FROM student_details WHERE Email ='" +Email+ "'";
      
       //checkValid is a object of Validator class
       if(checkValid.Validate(Fname, Lname, Email, pwd, National) == false)  //To check check if the textfield values are valid using Validate function
       {
           //if a value returns true this if conditon will stop it from running and show an error
       }
       else if (!m.matches()) {
           checkValid.label("Invalid National");  //to check national validity
           
       }
       else if(check.check(Email, SQLEmail)){ //check is a object of CheckValue which checks if an email is already in the databse
       
        checkValid.label("Email Already Exist!");  //we're using checkValid of Validator class to access label function to show the error message
       }
       
       else if(check.checkNat(National, SQL)) //checks if a national ID is already in the database
       {
          
       }
       
       else {
        DBoperations operation = new DBoperations(table,Fname, Lname, National, Email, pwd, combovalue);
       
        operation.register_lecture();
        clearFields();
        
       }
         
    }//GEN-LAST:event_lecture_registerationMousePressed

    private void delete_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_btnMousePressed
        
        Id = Integer.parseInt(ID_txt.getText());
        Connection_string = "jdbc:mysql://localhost:3306/student_registeration";
        query = "delete from lecture_schedule where ID='"+Id+"' ";
        
        DBoperations operation = new DBoperations();
        operation.delete_lecture_schedule(Id, Connection_string, query, table_user1);
     
    }//GEN-LAST:event_delete_btnMousePressed

    private void delete_btn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_btn1MousePressed
        
        //when the delete button is clicked the below code executes
        
         Id = Integer.parseInt(ID_txt1.getText());
         Connection_string = "jdbc:mysql://localhost:3306/registeration_details"; //main string used to connect the database
         query = "delete from student_details where ID='"+Id+"' ";  //query to delete from student_details
         DBoperations operation = new DBoperations();                      //creation of DBoperation class
        operation.delete_from_student_details(Id, Connection_string, query, student_table); //student_table is the table name for the data being shown
         
       
    }//GEN-LAST:event_delete_btn1MousePressed

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        setColor(logout);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
      
        resetColor(logout);
    }//GEN-LAST:event_logoutMouseExited

    private void logoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMousePressed
      
        //logout button
        
        if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        this.dispose();
        portal.setVisible(true);
        }

    }//GEN-LAST:event_logoutMousePressed
     
    
     //used to make a hover effect
    public void setColor(JPanel panel)
    {
        panel.setBackground(new java.awt.Color(85,65,118));
    }
    
     public void resetColor(JPanel panel)
    {
        panel.setBackground(new java.awt.Color(54,37,90));
    }
     
     
     
     public void clearFields(){  //this function is used to clear the text fields after entering a data
         
       password_txt.setText(null);
       first_name_txt.setText(null);
       last_name_txt.setText(null);
       national_id_txt.setText(null);
       email_txt.setText(null);
       
     }
      
    
    
    
 
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adminport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminport().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardHolder;
    private javax.swing.JTextField ID_txt;
    private javax.swing.JTextField ID_txt1;
    private javax.swing.JPanel Jpanel_10;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JComboBox<String> combo1;
    private keeptoo.KGradientPanel delete_btn;
    private keeptoo.KGradientPanel delete_btn1;
    private javax.swing.JTextField email_txt;
    private javax.swing.JTextField first_name_txt;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel6;
    private keeptoo.KGradientPanel kGradientPanel8;
    private javax.swing.JTextField last_name_txt;
    private javax.swing.JTextField lecture_email;
    private javax.swing.JTextField lecture_first_name;
    private javax.swing.JTextField lecture_last_name;
    private javax.swing.JTextField lecture_nationalid;
    private javax.swing.JPasswordField lecture_password;
    private javax.swing.JPanel lecture_register;
    private keeptoo.KGradientPanel lecture_registeration;
    private javax.swing.JPanel logout;
    private javax.swing.JTextField national_id_txt;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JPanel register;
    private javax.swing.JPanel schedule;
    private javax.swing.JScrollPane scrollpane1;
    private javax.swing.JScrollPane scrollpane2;
    private keeptoo.KGradientPanel student_registeration;
    private javax.swing.JTable student_table;
    private javax.swing.JPanel studentlist;
    private javax.swing.JTable table_user1;
    // End of variables declaration//GEN-END:variables

   


}
