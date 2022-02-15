 package view.touristDashboard;

import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import controller.StaysController;
import model.Stays;
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
        roomIdlbl = new javax.swing.JLabel();
        roomIdtxt = new javax.swing.JTextField();
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
        
        Kidslbl.setText("Number of Kids");
        Kidslbl.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        getContentPane().add(kidstxt);
        kidstxt.setBounds(203, 245, 37, 26);

        roomIdlbl.setText("Enter preferred room Id ");
        roomIdlbl.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        roomIdlbl.setBounds(45,420,400,26);
        getContentPane().add(roomIdlbl);
        roomIdtxt.setBounds(250,420,30,26);
        getContentPane().add(roomIdtxt);

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
        passcodelbl.setText("PhoneNumber");
        getContentPane().add(passcodelbl);
        passcodelbl.setBounds(45, 298, 106, 17);
        getContentPane().add(passcodetxt);
        passcodetxt.setBounds(203, 294, 107, 26);

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
     * @param args the command line arguments
     */
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
    private javax.swing.JLabel roomIdlbl;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JRadioButton femaleRbtn;
    private javax.swing.JTextField genderlbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField kidstxt;
    private javax.swing.JRadioButton maleRbtn;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel passcodelbl;
    private javax.swing.JTextField passcodetxt;
    private javax.swing.JTextField roomIdtxt;
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
            int roomId = Integer.parseInt(roomIdtxt.getText());


            Stays stays = new Stays(name,email,gender,pass,Totaladults,Totalkids,Arrival,Departure,roomId);

            staysController = new StaysController();
            int insert = staysController.registerStays(stays);
            if(insert>0){
                JOptionPane.showMessageDialog(null, "Booked");
            }
            else
            JOptionPane.showMessageDialog(null, "something went wrong");
         }
}
