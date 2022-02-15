package view.touristDashboard;

import java.awt.Font;

import javax.swing.ImageIcon;

import view.tourist.PriceDashboard;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author duktartamang
 */
public class StaysDashBoard extends javax.swing.JFrame {

    /**
     * Creates new form StaysDashBoard
     */
    public StaysDashBoard() {
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

        Detailsbtn = new javax.swing.JButton();
        pricebtn = new javax.swing.JButton();
        Icon = new javax.swing.JLabel();

        
        setBounds(0,0,1450,900);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        Detailsbtn.setText("Details");
        Detailsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailsbtnActionPerformed(evt);
            }
        });
        Detailsbtn.setFont(new Font("Arial", Font.BOLD, 20));
        getContentPane().add(Detailsbtn);
        Detailsbtn.setBounds(20, 620, 120, 35);

        pricebtn.setText("Book");
        pricebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricebtnActionPerformed(evt);
            }
        });
        pricebtn.setFont(new Font("Arial", Font.BOLD, 20));
        getContentPane().add(pricebtn);
        pricebtn.setBounds(200, 620, 120, 35);

        Icon.setIcon(new ImageIcon("Photos/Motel.png"));
        getContentPane().add(Icon);
        Icon.setBounds(0,0,1600,1050);

      
    }// </editor-fold>                        

    private void pricebtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new RegisterStays().setVisible(true);
    } 
    private void DetailsbtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new PriceDashboard(null);
    }                                           

   
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
    //     });
    // }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Detailsbtn;
    private javax.swing.JLabel Icon;
    private javax.swing.JButton pricebtn;
    // End of variables declaration                   
}
