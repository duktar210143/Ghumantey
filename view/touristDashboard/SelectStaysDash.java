package view.touristDashboard;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import controller.StaysController;
import model.Stays;
public class SelectStaysDash extends javax.swing.JFrame {
    Object[] columns = {"Name","Mail","Pass","Arrival","Departure"};
    String data[][];
    JTable table;
    DefaultTableModel model;
    /**
     * Creates new form SelectStays
     */
    public SelectStaysDash() {
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        

        passlbl = new javax.swing.JLabel();
        Passtxt = new javax.swing.JTextField();
        Viewbtn = new javax.swing.JButton();
        
        setBounds(100,100,400,200);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        passlbl.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        passlbl.setText("Enter your PhoneNumber");
        getContentPane().add(passlbl);
        passlbl.setBounds(6, 30, 220, 22);
        getContentPane().add(Passtxt);
        Passtxt.setBounds(206, 30, 84, 26);
        add(Passtxt);
        
        Viewbtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        Viewbtn.setForeground(new java.awt.Color(0, 51, 51));
        Viewbtn.setText("View");
        Viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewbtnActionPerformed(evt);
            }
        });
        
        getContentPane().add(Viewbtn);
        Viewbtn.setBounds(87, 85, 90, 30);

      
    }// </editor-fold>  
    public String getPasstxt(){
        return Passtxt.getText();
    }
  
    
    private void ViewbtnActionPerformed(java.awt.event.ActionEvent evt) {     
        StaysController controller = new StaysController();
        List<Stays> stays = controller.viewStays(Passtxt.getText());
        if(stays != null){
        new SelectStays(stays,Passtxt.getText());
        }else{
            JOptionPane.showMessageDialog(null, "No booked histories" );
        }
    }                                       

    /**
     * @param args the command line arguments
    //  */
    // public static void main(String args[]) {
    //     /* Set the Nimbus look and feel */
    //     //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    //     /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
    //      * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
    //      */
    //     try {
    //         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    //             if ("Nimbus".equals(info.getName())) {
    //                 javax.swing.UIManager.setLookAndFeel(info.getClassName());
    //                 break;
    //             }
    //         }
    //     } catch (ClassNotFoundException ex) {
    //         java.util.logging.Logger.getLogger(SelectStaysDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (InstantiationException ex) {
    //         java.util.logging.Logger.getLogger(SelectStaysDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (IllegalAccessException ex) {
    //         java.util.logging.Logger.getLogger(SelectStaysDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    //         java.util.logging.Logger.getLogger(SelectStaysDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     }
    //     //</editor-fold>

    //     /* Create and display the form */
    //     java.awt.EventQueue.invokeLater(new Runnable() {
    //         public void run() {
    //             new SelectStaysDash().setVisible(true);
    //         }
    //     });
    // }

    // Variables declaration - do not modify                     
    javax.swing.JTextField Passtxt;
    private javax.swing.JButton Viewbtn;
    private javax.swing.JLabel passlbl;
    // End of variables declaration     

    public Result getComponentAt(String text) {
        return null;
    }
                
}
