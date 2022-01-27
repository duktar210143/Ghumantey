package view.touristDashboard;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.*;

import model.Stays;
import model.Tourist;
import controller.StaysController;

public class RegisterStays
 extends JFrame 
implements ActionListener {

         private JLabel lb1 ,lb2, lb3, lb4;
         private JComboBox cb1,cb2,cb3,cb4;
         private JTextField tx1,tx2;
         private JButton bt1;
         StaysController staysController;

         private void registerStays(){
            int Totaladults = Integer.parseInt(tx1.getText());
            int Totalkids = Integer.parseInt(tx2.getText());
            String Arrival = (String)cb1.getSelectedItem()+" "+(String)cb2.getSelectedItem();
            String Departure = (String)cb3.getSelectedItem()+" "+(String)cb4.getSelectedItem();


            Stays stays = new Stays(Totaladults,Totalkids,Arrival,Departure);

            staysController = new StaysController();
            int insert = staysController.registerStays(stays);
            if(insert>0){
                JOptionPane.showMessageDialog(null, "Booked");
            }
            else
            JOptionPane.showMessageDialog(null, "something went wrong");
         }
                   
         public RegisterStays(){
           
//FOR lables==========================================================================================================================
            lb1 = new JLabel("Total number of adults");
            lb1.setBounds(50, 10, 180, 30);
            add(lb1);

            lb2 = new JLabel("Total numbers of children");
            lb2.setBounds(330,10,180,30);
            add(lb2);

            lb3 = new JLabel("From");
            lb3.setBounds(50, 120, 100, 30);
            add(lb3);

            
            lb4 = new JLabel("To");
            lb4.setBounds(330, 120, 100, 30);
            add(lb4);

//FOR textfields=====================================================================================================================
            tx1 = new JTextField();
            tx1.setBounds(220, 10, 30, 30);
            add(tx1);

            tx2 = new JTextField();
            tx2.setBounds(520, 10, 30, 30);
            add(tx2);

//FOR comboboxes=========================================================================================================================

             String date[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
             String months[] = {"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec"};
            

             cb1 = new JComboBox<>(months);
             cb1.setBounds(150, 100, 60, 50);
             add(cb1);

             cb2 = new JComboBox<>(date);
             cb2.setBounds(230, 100, 50, 50);
             add(cb2);

             cb3 = new JComboBox<>(months);
             cb3.setBounds(420,100,60,50);
             add(cb3);
             
             cb4 = new JComboBox<>(date);
             cb4.setBounds(500, 100, 50, 50);
             add(cb4);
// FOR submit button=========================================================================================================================
             bt1 = new JButton("Submit");
             bt1.setBounds(300,200,100,30);
             add(bt1);

            bt1.addActionListener(this);


            setTitle("Stays");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setBounds(400,150,700,300);
            setLayout(null);
            //setResizable(false);
            setVisible(true);
        
         }
                 
     public static void main(String[] args) {
         new RegisterStays();
        
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bt1){
            registerStays();
        }
        
    }
}