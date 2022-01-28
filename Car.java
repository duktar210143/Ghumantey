package Ghumantey.ANOZ;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Car extends JFrame{
         JLabel lb1 ,lb2, lb3, lb4;
         JComboBox cb1,cb2,cb3,cb4;
         JTextField tx1,tx2;
         JButton bt1;
         public Car(){
           
//FOR lables==========================================================================================================================
            lb1 = new JLabel("Starting point:::");
            lb1.setBounds(50, 10, 100, 30);
            add(lb1);

            lb2 = new JLabel("Destination:::");
            lb2.setBounds(330,10,100,30);
            add(lb2);

            lb3 = new JLabel("Departure date:");
            lb3.setBounds(50, 120, 100, 30);
            add(lb3);

            
            lb4 = new JLabel("Arrival date:");
            lb4.setBounds(330, 120, 100, 30);
            add(lb4);



//FOR textfields=====================================================================================================================
            tx1 = new JTextField();
            tx1.setBounds(150, 10, 150, 30);
            add(tx1);

            tx2 = new JTextField();
            tx2.setBounds(420, 10, 150, 30);
            add(tx2);


//FOR comboboxes=========================================================================================================================

             Integer date[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
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



             








            setTitle("Car");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setBounds(400,150,700,300);
            setLayout(null);
            //setResizable(false);
            setVisible(true);



    

         }

        
     public static void main(String[] args) {
         new Car();
        
     }
    
    }
