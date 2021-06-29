
package schedulemanagement;


import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import schedulemanagement.lectureport.HeaderColor;

/**
 *
 * @author shanu
 */


// inheritance is used here 
public class GeneralDesgin  {
    
    public static void design(JTable table , JScrollPane scroll){ //used to design the jtables
        scroll.getViewport().setBackground(Color.white);
        table.getTableHeader().setPreferredSize(new Dimension(50,30));
        table.getTableHeader().setDefaultRenderer(new HeaderColor());
    } 
     public static void comboDesign(JComboBox combo){
        combo.setForeground(Color.black);
        combo.setBackground(Color.white);
     }
     public static void TableSpace(JTable table){
        table.getColumnModel().getColumn(0).setPreferredWidth(10);
        table.getColumnModel().getColumn(1).setPreferredWidth(17);
        table.getColumnModel().getColumn(2).setPreferredWidth(17);
        table.getColumnModel().getColumn(3).setPreferredWidth(17);
        table.getColumnModel().getColumn(4).setPreferredWidth(17);
        table.getColumnModel().getColumn(5).setPreferredWidth(110);
        
          
     }
     
    
    
}
