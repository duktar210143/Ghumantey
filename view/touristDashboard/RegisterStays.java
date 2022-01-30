 package view.touristDashboard;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import controller.StaysController;
import model.Stays;

// import javax.swing.JButton;
// import javax.swing.JComboBox;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JOptionPane;
// import javax.swing.JTextField;
// import javax.swing.WindowConstants;

// import java.awt.event.*;
// import java.awt.*;

// import model.Stays;
// import model.Tourist;
// import controller.StaysController;

// public class RegisterStays
//  extends JFrame 
// implements ActionListener {

//          private JLabel lb1 ,lb2, lb3, lb4;
//          private JComboBox cb1,cb2,cb3,cb4;
//          private JTextField tx1,tx2;
//          private JButton bt1;
//          StaysController staysController;

//          private void registerStays(){
//             int Totaladults = Integer.parseInt(tx1.getText());
//             int Totalkids = Integer.parseInt(tx2.getText());
//             String Arrival = (String)cb1.getSelectedItem()+" "+(String)cb2.getSelectedItem();
//             String Departure = (String)cb3.getSelectedItem()+" "+(String)cb4.getSelectedItem();


//             Stays stays = new Stays(Totaladults,Totalkids,Arrival,Departure);

//             staysController = new StaysController();
//             int insert = staysController.registerStays(stays);
//             if(insert>0){
//                 JOptionPane.showMessageDialog(null, "Booked");
//             }
//             else
//             JOptionPane.showMessageDialog(null, "something went wrong");
//          }
         
                   
//          public RegisterStays(){
           
// //FOR lables==========================================================================================================================
//             lb1 = new JLabel("Total number of adults");
//             lb1.setBounds(50, 10, 180, 30);
//             add(lb1);

//             lb2 = new JLabel("Total numbers of children");
//             lb2.setBounds(330,10,180,30);
//             add(lb2);

//             lb3 = new JLabel("Arrival");
//             lb3.setFont(new java.awt.Font("Optima",Font.BOLD, 20));
//             lb3.setBounds(50, 120, 100, 30);
//             add(lb3);

            
//             lb4 = new JLabel("Departure");
//             lb4.setFont(new java.awt.Font("Optima",Font.BOLD, 20));
//             lb4.setBounds(330, 120, 100, 30);
//             add(lb4);

// //FOR textfields=====================================================================================================================
//             tx1 = new JTextField();
//             tx1.setBounds(220, 10, 30, 30);
//             add(tx1);

//             tx2 = new JTextField();
//             tx2.setBounds(520, 10, 30, 30);
//             add(tx2);

// //FOR comboboxes=========================================================================================================================

//              String date[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
//              String months[] = {"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec"};
            

//              cb1 = new JComboBox<>(months);
//              cb1.setBounds(110, 100, 90, 130);
//              add(cb1);

//              cb2 = new JComboBox<>(date);
//              cb2.setBounds(200, 100, 90, 130);
//              add(cb2);

//              cb3 = new JComboBox<>(months);
//              cb3.setBounds(420,100,90,130);
//              add(cb3);
             
//              cb4 = new JComboBox<>(date);
//              cb4.setBounds(500, 100, 90, 130);
//              add(cb4);
// // FOR submit button=========================================================================================================================
//              bt1 = new JButton("Submit");
//              bt1.setBounds(300,200,100,30);
//              add(bt1);

//             bt1.addActionListener(this);


//             setTitle("Stays");
//             // setDefaultCloseOperation(EXIT_ON_CLOSE);
//             setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//             setBounds(400,150,700,300);
//             setLayout(null);
//             //setResizable(false);
//             setVisible(true);
        
//          }
                 
//      public static void main(String[] args) {
//          new RegisterStays();
        
//      }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         if(e.getSource()==bt1){
//             registerStays();
//         }
        
//     }
// }
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author duktartamang
 */
public class RegisterStays extends javax.swing.JFrame {

    /**
     * Creates new form RegisterStays
     */
    public RegisterStays() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        Namelbl = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        emaillbl = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        genderlbl = new javax.swing.JTextField();
        maleRbtn = new javax.swing.JRadioButton();
        femaleRbtn = new javax.swing.JRadioButton();
        Numberadultslbl = new javax.swing.JLabel();
        Adultstxt = new javax.swing.JTextField();
        Kidslbl = new javax.swing.JLabel();
        kidstxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        passcodelbl = new javax.swing.JLabel();
        passcodetxt = new javax.swing.JTextField();

        setBounds(300,100,350,600);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        Namelbl.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        Namelbl.setText("Name");
        getContentPane().add(Namelbl);
        Namelbl.setBounds(45, 19, 70, 22);

        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });
        getContentPane().add(nametxt);
        nametxt.setBounds(121, 19, 148, 26);

        emaillbl.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        emaillbl.setText("Email");
        getContentPane().add(emaillbl);
        emaillbl.setBounds(45, 63, 51, 22);

        emailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtxtActionPerformed(evt);
            }
        });
        getContentPane().add(emailtxt);
        emailtxt.setBounds(129, 63, 140, 26);

        genderlbl.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        genderlbl.setText("Gender");
        genderlbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderlblActionPerformed(evt);
            }
        });
        getContentPane().add(genderlbl);
        genderlbl.setBounds(40, 110, 90, 30);

        maleRbtn.setText("Male");
        getContentPane().add(maleRbtn);
        maleRbtn.setBounds(164, 109, 61, 23);

        femaleRbtn.setText("Female");
        femaleRbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRbtnActionPerformed(evt);
            }
        });
        getContentPane().add(femaleRbtn);
        femaleRbtn.setBounds(164, 144, 76, 23);
        

        Numberadultslbl.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Numberadultslbl.setText("Number of Adults");
        getContentPane().add(Numberadultslbl);
        Numberadultslbl.setBounds(45, 199, 140, 26);

        Adultstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdultstxtActionPerformed(evt);
            }
        });
        getContentPane().add(Adultstxt);
        Adultstxt.setBounds(203, 200, 37, 26);

        Kidslbl.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Kidslbl.setText("Number of Kids");
        getContentPane().add(Kidslbl);
        Kidslbl.setBounds(45, 254, 123, 17);
        getContentPane().add(kidstxt);
        kidstxt.setBounds(203, 245, 37, 26);

        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }

            private void jButton1ActionPerformed(ActionEvent evt) {
                registerStays();
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(71, 525, 97, 29);

        passcodelbl.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        passcodelbl.setText("Set a passcode");
        getContentPane().add(passcodelbl);
        passcodelbl.setBounds(45, 298, 106, 17);
        getContentPane().add(passcodetxt);
        passcodetxt.setBounds(203, 294, 37, 26);

        String date[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String months[] = {"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec"};

        jcb1 = new JLabel("Arrival");
        jcb1.setBounds(45,330,60,26);
        jcb1.setFont(new java.awt.Font("Lucida Grande", 1, 16));
        getContentPane().add(jcb1);

        cb1 = new JComboBox<>(months);
        cb1.setBounds(180, 330, 60, 40);
        getContentPane().add(cb1);

        cb2 = new JComboBox<>(date);
        cb2.setBounds(240, 330, 60, 40);
        getContentPane().add(cb2);

        jcb2 = new JLabel("deprature");
        jcb2.setBounds(45,380,90,26);
        jcb2.setFont(new java.awt.Font("Lucida Grande", 1, 16));
        getContentPane().add(jcb2);

        cb3 = new JComboBox<>(months);
        cb3.setBounds(180, 380, 60, 40);
        add(cb3);
             
        cb4 = new JComboBox<>(date);
        cb4.setBounds(240, 380, 60, 40);
        add(cb4);

        buttonGroup1.add(maleRbtn);
        buttonGroup1.add(femaleRbtn);
    }// </editor-fold>                        

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void emailtxtActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void genderlblActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void femaleRbtnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void AdultstxtActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
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
    //         java.util.logging.Logger.getLogger(RegisterStays.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (InstantiationException ex) {
    //         java.util.logging.Logger.getLogger(RegisterStays.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (IllegalAccessException ex) {
    //         java.util.logging.Logger.getLogger(RegisterStays.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    //         java.util.logging.Logger.getLogger(RegisterStays.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     }
    //     //</editor-fold>

    //     /* Create and display the form */
    //     java.awt.EventQueue.invokeLater(new Runnable() {
    //         public void run() {
    //             new RegisterStays().setVisible(true);
    //         }
    //     });
    // }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField Adultstxt;
    private javax.swing.JLabel Kidslbl;
    private javax.swing.JLabel Namelbl;
    private javax.swing.JLabel Numberadultslbl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel emaillbl;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JRadioButton femaleRbtn;
    private javax.swing.JTextField genderlbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField kidstxt;
    private javax.swing.JRadioButton maleRbtn;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel passcodelbl;
    private javax.swing.JTextField passcodetxt;
    private javax.swing.JComboBox cb1;
    private javax.swing.JComboBox cb2;
    private javax.swing.JComboBox cb3;
    private javax.swing.JComboBox cb4;
    private JLabel jcb1;
    private JLabel jcb2;


    StaysController staysController;
    // End of variables declaration    
    
             private void registerStays(){
            String name = nametxt.getText();
            String email = emailtxt.getText();
            char gender;
            if(maleRbtn.isSelected())
            gender = 'm';
            else
            gender = 'f';
            String pass = passcodetxt.getText();
            int Totaladults = Integer.parseInt(Adultstxt.getText());
            int Totalkids = Integer.parseInt(kidstxt.getText());
            String Arrival = (String)cb1.getSelectedItem()+" "+(String)cb2.getSelectedItem();
            String Departure = (String)cb3.getSelectedItem()+" "+(String)cb4.getSelectedItem();


            Stays stays = new Stays(name,email,gender,pass,Totaladults,Totalkids,Arrival,Departure);

            staysController = new StaysController();
            int insert = staysController.registerStays(stays);
            if(insert>0){
                JOptionPane.showMessageDialog(null, "Booked");
            }
            else
            JOptionPane.showMessageDialog(null, "something went wrong");
         }
}
