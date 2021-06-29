
package schedulemanagement;

//READ THIS BEFORE RUNNING//
// go to tools --> options ---> font & color and choose comment and change the comment color to magenta for a darker color shade
//this code is run on apache netbeans ide 12.1 
//download xampp to run databases
//place your own connection string to connect with databse 
// create twp databases with the  name registeration_details and student_registeration
//registeration_details has three tables : admin_details,lecture_details,student_details
//student_registeration has one table named lecture_details
//REFER THE SCREEN SHOTS OF THE DATABASES TO CHECK ATTRIBUTE
//Each databse has different username and password, my own database is set to krishan as username and root as password
//if you have another username and password , you need to change them respectively or  keep the same username and password as mine
// to do this start xampp go to localhost/phpmyadmin then previleges then add click on add user account and give it all privileges, check screenshots for reference 
// start viewing the code from this page then student.java --> lecture.java --> admin.java --> studentport.java -->lectureport.java
//download and add the jar files to the lib





import javax.swing.JPanel;

/**
 *
 * @author shanu
 */
public class Homeportal extends javax.swing.JFrame {

   
    public Homeportal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Redirect_To_Student_Portal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Redirect_To_Lecture_Portal = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Redirect_To_Admin_Portal = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(961, 834));

        jPanel2.setBackground(new java.awt.Color(54, 37, 90));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("University Management");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(159, 159, 159))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(76, 76, 76))
        );

        Redirect_To_Student_Portal.setBackground(new java.awt.Color(248, 228, 231));
        Redirect_To_Student_Portal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Redirect_To_Student_PortalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Redirect_To_Student_PortalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Redirect_To_Student_PortalMouseExited(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\shanu\\Desktop\\images\\icons8-student-center-50.png")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Student Portal");

        javax.swing.GroupLayout Redirect_To_Student_PortalLayout = new javax.swing.GroupLayout(Redirect_To_Student_Portal);
        Redirect_To_Student_Portal.setLayout(Redirect_To_Student_PortalLayout);
        Redirect_To_Student_PortalLayout.setHorizontalGroup(
            Redirect_To_Student_PortalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Redirect_To_Student_PortalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Redirect_To_Student_PortalLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel3)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        Redirect_To_Student_PortalLayout.setVerticalGroup(
            Redirect_To_Student_PortalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Redirect_To_Student_PortalLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        Redirect_To_Lecture_Portal.setBackground(new java.awt.Color(248, 228, 231));
        Redirect_To_Lecture_Portal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Redirect_To_Lecture_PortalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Redirect_To_Lecture_PortalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Redirect_To_Lecture_PortalMouseExited(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\shanu\\Desktop\\images\\icons8-teacher-50.png")); // NOI18N

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Lecturer Portal");

        javax.swing.GroupLayout Redirect_To_Lecture_PortalLayout = new javax.swing.GroupLayout(Redirect_To_Lecture_Portal);
        Redirect_To_Lecture_Portal.setLayout(Redirect_To_Lecture_PortalLayout);
        Redirect_To_Lecture_PortalLayout.setHorizontalGroup(
            Redirect_To_Lecture_PortalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Redirect_To_Lecture_PortalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Redirect_To_Lecture_PortalLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel6)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        Redirect_To_Lecture_PortalLayout.setVerticalGroup(
            Redirect_To_Lecture_PortalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Redirect_To_Lecture_PortalLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        Redirect_To_Admin_Portal.setBackground(new java.awt.Color(248, 228, 231));
        Redirect_To_Admin_Portal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Redirect_To_Admin_PortalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Redirect_To_Admin_PortalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Redirect_To_Admin_PortalMouseExited(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\shanu\\Desktop\\images\\icons8-microsoft-admin-50.png")); // NOI18N

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Admin Portal");

        javax.swing.GroupLayout Redirect_To_Admin_PortalLayout = new javax.swing.GroupLayout(Redirect_To_Admin_Portal);
        Redirect_To_Admin_Portal.setLayout(Redirect_To_Admin_PortalLayout);
        Redirect_To_Admin_PortalLayout.setHorizontalGroup(
            Redirect_To_Admin_PortalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Redirect_To_Admin_PortalLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel8)
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(Redirect_To_Admin_PortalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Redirect_To_Admin_PortalLayout.setVerticalGroup(
            Redirect_To_Admin_PortalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Redirect_To_Admin_PortalLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Redirect_To_Student_Portal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(Redirect_To_Lecture_Portal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(Redirect_To_Admin_Portal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Redirect_To_Student_Portal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Redirect_To_Admin_Portal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Redirect_To_Lecture_Portal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 185, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Redirect_To_Student_PortalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Redirect_To_Student_PortalMouseEntered
       
        setColor(Redirect_To_Student_Portal);
    }//GEN-LAST:event_Redirect_To_Student_PortalMouseEntered

    private void Redirect_To_Student_PortalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Redirect_To_Student_PortalMouseExited
        
        resetColor(Redirect_To_Student_Portal);
    }//GEN-LAST:event_Redirect_To_Student_PortalMouseExited

    private void Redirect_To_Lecture_PortalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Redirect_To_Lecture_PortalMouseEntered
      
         setColor(Redirect_To_Lecture_Portal);
    }//GEN-LAST:event_Redirect_To_Lecture_PortalMouseEntered

    private void Redirect_To_Lecture_PortalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Redirect_To_Lecture_PortalMouseExited
     
        resetColor(Redirect_To_Lecture_Portal);
    }//GEN-LAST:event_Redirect_To_Lecture_PortalMouseExited

    private void Redirect_To_Admin_PortalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Redirect_To_Admin_PortalMouseEntered
        
         setColor(Redirect_To_Admin_Portal);
    }//GEN-LAST:event_Redirect_To_Admin_PortalMouseEntered

    private void Redirect_To_Admin_PortalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Redirect_To_Admin_PortalMouseExited
      
         resetColor(Redirect_To_Admin_Portal);
    }//GEN-LAST:event_Redirect_To_Admin_PortalMouseExited

    private void Redirect_To_Student_PortalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Redirect_To_Student_PortalMouseClicked
       
        //creating student class object to we can show when this button is clicked and also to hide Homeportal.java//
        
        new student().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Redirect_To_Student_PortalMouseClicked

    private void Redirect_To_Lecture_PortalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Redirect_To_Lecture_PortalMouseClicked
      
          //creating lecture class object to we can show when this button is clicked and also to hide Homeportal.java//
        
        new lecturer().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_Redirect_To_Lecture_PortalMouseClicked

    private void Redirect_To_Admin_PortalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Redirect_To_Admin_PortalMouseClicked
        
          //creating sadmin class object to we can show when this button is clicked and also to hide Homeportal.java//
        
        new admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Redirect_To_Admin_PortalMouseClicked
    
    
    //function to give an over-effect 
    public void setColor(JPanel panel)
    {
        panel.setBackground(new java.awt.Color(248, 238, 231));
    }
    
     public void resetColor(JPanel panel)
    {
        panel.setBackground(new java.awt.Color(248,228,231));
    }
    //end of color function
    
     
    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Homeportal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homeportal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homeportal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homeportal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
                
                new Homeportal().setVisible(true);
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Redirect_To_Admin_Portal;
    private javax.swing.JPanel Redirect_To_Lecture_Portal;
    private javax.swing.JPanel Redirect_To_Student_Portal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
