package view.Bus;

import controller.Buscontroller;
import model.Bus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;



public class Registerbus extends JFrame implements ActionListener  {
    private static JLabel lb1 ,lb2, lb3, lb4,lb5;
    private static JComboBox cb1,cb2,cb3,cb4;
    private static JTextField tx1,tx2,tx3;
    private static JButton bt1;
    Buscontroller buscontroller;

    public void registerbus(){
       String phoneno = tx3.getText();
       String start = tx1.getText();
       String end = tx2.getText();
       String Arrival = (String)cb1.getSelectedItem()+" "+(String)cb2.getSelectedItem();
       String Departure = (String)cb3.getSelectedItem()+" "+(String)cb4.getSelectedItem();
       buscontroller = new Buscontroller();
       Bus bus = new Bus(phoneno,start,end,Arrival,Departure);
       int insert = buscontroller.registerbus(bus);

       if(insert>0)
       JOptionPane.showMessageDialog(null,"successfully registered");
       else 
       JOptionPane.showMessageDialog(null, "failed to register");

   }
   public Registerbus(){
           
      
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

       lb5= new JLabel("phoneno");
       lb5.setBounds(230, 200, 70, 30);
       add(lb5);
    //    setBounds(x, y, width, height);

//FOR textfields=====================================================================================================================
       tx1 = new JTextField();
       tx1.setBounds(150, 10, 150, 30);
       add(tx1);

       tx2 = new JTextField();
       tx2.setBounds(420, 10, 150, 30);
       add(tx2);

       tx3 = new JTextField();
       tx3.setBounds(300, 200, 150, 30);
       add(tx3);
//FOR comboboxes=========================================================================================================================

        String date[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20",
        "21","22","23","24","25","26","27","28","29","30","31"};
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
        bt1 = new JButton("Book");
        bt1.setBounds(300,320,100,30);
        bt1.addActionListener(this);
        add(bt1);

       setTitle("Bus");
       setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       setBounds(400,150,700,400);
       setLayout(null);
       //setResizable(false);
       setVisible(true);

} 

        
@Override
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub 
    
    if(!checkFields())
    registerbus();
    
}
boolean flag = false;
        private boolean checkFields(){
    
            if(tx1.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Starting place is empty");
                tx1.requestFocus();
                flag = true;
            }else if(tx2.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Destination place is empty");
                tx2.requestFocus();
                flag = true;
            }
            else if(tx3.getText().equals("")){
                JOptionPane.showMessageDialog(null,"phone number is empty");
                tx2.requestFocus();
                flag = true;
            }         
            return flag;
        }
    
    

 
}



