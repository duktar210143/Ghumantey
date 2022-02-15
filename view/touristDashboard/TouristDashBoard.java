
package view.touristDashboard;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import Photos.Icons.About;

/**
 *
 * @author duktartamang
 */
public class TouristDashBoard extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form TouristDash
     */
    public TouristDashBoard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        icon = new javax.swing.JLabel();
        jMenu1 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        Tmenu = new javax.swing.JMenuBar();
        Tview = new javax.swing.JMenu();
        aboutus = new javax.swing.JMenuItem();
        yourbookings = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Cars = new javax.swing.JMenu();
        Bus = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Edit");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("jMenu5");

        jMenu6.setText("jMenu6");

        jMenuItem1.setText("jMenuItem1");        

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        setResizable(false);
        getContentPane().setLayout(null);
        setBounds(300,100,1480,1600);
    



        Tview.setText("View                       ");
        Tview.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N

        aboutus.setText("About Us");
        aboutus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutusActionPerformed(evt);
            }
        });
        Tview.add(aboutus);

        yourbookings.setText("booking history");
        yourbookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yourbookingsActionPerformed(evt);
            }
        });
        Tview.add(yourbookings);

        Tmenu.add(Tview);
        Tview.getAccessibleContext().setAccessibleDescription("");
        Tview.getAccessibleContext().setAccessibleParent(Tmenu
        );

        jMenu3.setText("Stays                      ");
        jMenu3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        Tmenu.add(jMenu3);
        jMenu3.addMouseListener(new MouseListener() {

        @Override
        public void mouseClicked(MouseEvent e) {
        //     try {
        //         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        //             if ("Nimbus".equals(info.getName())) {
        //                 javax.swing.UIManager.setLookAndFeel(info.getClassName());
        //                 break;
        //             }
        //         }
        //     } catch (ClassNotFoundException ex) {
        //         java.util.logging.Logger.getLogger(StaysDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //     } catch (InstantiationException ex) {
        //         java.util.logging.Logger.getLogger(StaysDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //     } catch (IllegalAccessException ex) {
        //         java.util.logging.Logger.getLogger(StaysDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        //         java.util.logging.Logger.getLogger(StaysDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //     }
        //     //</editor-fold>
    
        //     /* Create and display the form */
        //     java.awt.EventQueue.invokeLater(new Runnable() {
        //         public void run() {
        //             new StaysDashBoard().setVisible(true);
        //         }   
        // });
        new StaysDashBoard().setVisible(true);
    }

        @Override
        public void mousePressed(MouseEvent e) {
           
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }});
    

        Cars.setText(" Cars                  ");
        Cars.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        Tmenu.add(Cars);

        Bus.setText("Bus                     ");
        Bus.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        Tmenu.add(Bus);

        jMenu8.setText("packages");
        jMenu8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        Tmenu.add(jMenu8);

        setJMenuBar(Tmenu);
        Tmenu.getAccessibleContext().setAccessibleName("Tmenubar");

        
        icon.setIcon(new ImageIcon("Photos/Untitled design.png"));
        icon.setBounds(-200,-250,1650,1400);
        getContentPane().add(icon);

    }// </editor-fold>     
    private void aboutusActionPerformed(java.awt.event.ActionEvent evt) {                                        
        new About();
    }                                    

    private void yourbookingsActionPerformed(java.awt.event.ActionEvent evt) {                                             
        new SelectStaysDash().setVisible(true);
    }
   
 
  
    
    /**
    //  * @param args the command line arguments
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
    //         java.util.logging.Logger.getLogger(TouristDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (InstantiationException ex) {
    //         java.util.logging.Logger.getLogger(TouristDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (IllegalAccessException ex) {
    //         java.util.logging.Logger.getLogger(TouristDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    //         java.util.logging.Logger.getLogger(TouristDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     }
    //     //</editor-fold>

    //     /* Create and display the form */
    //     java.awt.EventQueue.invokeLater(new Runnable() {
    //         public void run() {
    //             new TouristDashBoard().setVisible(true);
    //         }
    //     });
    // }

    // Variables declaration - do not modify   
    private javax.swing.JLabel icon;                  
    private javax.swing.JMenu Bus;
    private javax.swing.JMenu Cars;
    private javax.swing.JMenuBar Tmenu;
    private javax.swing.JMenu Tview;
    private javax.swing.JMenuItem aboutus;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem yourbookings;
    // End of variables declaration                   
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

  
}