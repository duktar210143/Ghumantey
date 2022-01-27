package view.tourist;

import java.awt.event.*;

import javax.swing.*;
import javax.swing.JPasswordField;
import java.awt.*;

import controller.TouristController;
import model.Tourist;


public class RegisterTourist
    extends JFrame
    implements ActionListener {
 
    // Components of the Form
    private JFrame frame;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel add;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
    private JLabel USer,pass,pass2;
    private JTextField Username;
    private JPasswordField password,password2;
    TouristController touristController;
 
    private String dates[]
        = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String months[]
        = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private String years[]
        = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };

    private void registerTourist(){
        String Name = tname.getText();
        String mobile = tmno.getText();
        char gender;
        if(male.isSelected())
        gender = 'm';
        else
        gender = 'f';

        String DOB = (String) date.getSelectedItem()+ " " + (String)year.getSelectedItem()+ " "+(String)month.getSelectedItem();
        String address = tadd.getText();
        String username = Username.getText();
        String Password = password.getText();
        String confirmpassword = password2.getText();


        if(Password.equals(confirmpassword)){
                    Tourist tourist = 
            new Tourist(Name,mobile,gender,DOB,address,username,Password);
            touristController = new TouristController();
                int insert = touristController.registerTourist(tourist);  
                if(insert>0)
                JOptionPane.showMessageDialog(null, "successfully Registered");
                else
                    JOptionPane.showMessageDialog(null,"failed to register");
                }

                else{
            JOptionPane.showMessageDialog(null,"Passwords do not match ");
            }     
        }

    // constructor, to initialize the components
    // with default values.

    public RegisterTourist()
    {
        setTitle("Register to GHU-MANTEY");

        frame = new JFrame();

        frame.setLayout(null);
        frame.setBounds(300, 90, 900, 850);
        frame.setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

       
        title = new JLabel("Registration Form");
        title.setForeground(Color.white);
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        frame.add(title);
 
        name = new JLabel("Name");
        name.setForeground(Color.white);
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        frame.add(name);
 
        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        frame.add(tname);
 
        mno = new JLabel("Mobile");
        mno.setForeground(Color.white);
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(100, 150);
        frame.add(mno);
 
        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(200, 150);
        frame.add(tmno);
 
        gender = new JLabel("Gender");
        gender.setForeground(Color.white);
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 200);
        frame.add(gender);
 
        male = new JRadioButton("Male");
        male.setForeground(Color.white);
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 200);
        frame.add(male);
 
        female = new JRadioButton("Female");
        female.setForeground(Color.white);
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 200);
        frame.add(female);
 
        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);
 
        dob = new JLabel("DOB");
        dob.setForeground(Color.white);
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 250);
        frame.add(dob);
 
        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(200, 250);
        frame.add(date);
 
        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(250, 250);
        frame.add(month);
 
        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(320, 250);
        frame.add(year);
 
        add = new JLabel("Address");
        add.setForeground(Color.white);
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(100, 300);
        frame.add(add);
 
        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 300);
        tadd.setLineWrap(true);
        frame.add(tadd);

        USer = new JLabel("User Name");
        USer.setForeground(Color.white);
        USer.setFont(new Font("Arial", Font.PLAIN, 20));
        USer.setSize(250, 20);
        USer.setLocation(100,400);
        frame.add(USer);

        Username = new JTextField();
        Username.setFont(new Font("Arial", Font.PLAIN, 15));
        Username.setSize(200,25);
        Username.setLocation(210,395);
        frame.add(Username);


        pass = new JLabel("Password");
        pass.setForeground(Color.white);
        pass.setFont(new Font("Arial", Font.PLAIN, 20));
        pass.setSize(250, 20);
        pass.setLocation(100,450);
        frame.add(pass);

        password = new JPasswordField();
        password.setFont(new Font("Arial", Font.PLAIN, 15));
        password.setSize(200,25);
        password.setLocation(210,443);
        frame.add(password);

        pass2 = new JLabel("Re-enter your Password");
        pass2.setForeground(Color.white);
        pass2.setFont(new Font("Arial", Font.PLAIN, 20));
        pass2.setSize(250, 20);
        pass2.setLocation(100,500);
        frame.add(pass2);

        password2 = new JPasswordField();
        password2.setFont(new Font("Arial", Font.PLAIN, 15));
        password2.setSize(200,25);
        password2.setLocation(325,500);
        frame.add(password2);


       
        
 
        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 550);
        frame.add(term);

        
 
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 600);
        sub.addActionListener(this);
        frame.add(sub);
 
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(290, 600);
        reset.addActionListener(this);
        frame.add(reset);
 
        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 350);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        frame.add(tout);
 
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 700);
        frame.add(res);
 
        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);

        JLabel Icon = new JLabel();
        Icon.setIcon(new ImageIcon("Photos/nepal-village.jpg"));
        Icon.setBounds(0,0, 900, 850);
        frame.add(Icon);
        
        frame.add(resadd);
 
        frame.setVisible(true);
    }
    public boolean checkfield(){
        boolean flag = false;
        if(tname.getText().equals("")){
            JOptionPane.showMessageDialog(null, "name cannot be empty");
            tname.requestFocus();
            return true;
            
        }else if(tmno.getText().equals("")){
             JOptionPane.showMessageDialog(null, "mobile number cannot be null");
             tmno.requestFocus();
             return true;

        }else if(Username.getText().equals("")){
            JOptionPane.showMessageDialog(null, "username cannot be empty");
            Username.requestFocus();
            return true;

        }else if(password.getText().equals("")){
            JOptionPane.showMessageDialog(null, "password cannot be empty");
            password.requestFocus();
            return true;
            
        }
        return flag;
    }
 
    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            if(!checkfield()){
                                    
            String passcheck1 = password.getText();
            String passcheck2 = password2.getText();
            if(passcheck1.equals(passcheck2)){
                if (term.isSelected()) {
                    registerTourist();
                    String data1;
                    String data
                        = "Name : "
                          + tname.getText() + "\n"
                          + "Mobile : "
                          + tmno.getText() + "\n"
                          + "User name : "
                          + Username.getText() + "\n";
                    
                    if (male.isSelected())
                        data1 = "Gender : Male"
                            + "\n";

                    else
                        data1 = "Gender : Female"
                            + "\n";
                    String data2
                        = "DOB : "
                      + (String)date.getSelectedItem()
                      + "/" + (String)month.getSelectedItem()
                      + "/" + (String)year.getSelectedItem()
                      + "\n";
 
                    String data3 = "Address : " + tadd.getText();
                    tout.setText(data + data1 + data2 + data3);
                    tout.setEditable(false);
                    res.setText("Registration Successfully");
                }
                else {
                    tout.setText("");
                    resadd.setText("");
                    res.setText("Please accept the"
                            + " terms & conditions");
                    res.setForeground(Color.white);
                }
            }else{
                tout.setText("");
            resadd.setText("");
            res.setText("Passwords  not match");
            res.setForeground(Color.white);
            res.setBackground(Color.BLACK);

            }
        }
 
        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tmno.setText(def);
            res.setText(def);
            tout.setText(def);
            Username.setText(def);
            password.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
        }
    }
    }
}
 
// Driver Code
// class Registration {
 
//     public static void main(String[] args) throws Exception
//     {
    
//          new RegisterTourist();
//     }
// }


