package view;


import javax.swing.*;

import view.tourist.RegisterTourist;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener {

    private Container c;
    private  JLabel label;
    private  JLabel label1;
    private  JLabel label2;
    private  JLabel label3;
    private  JLabel label4;
    private  JLabel label5;
    private  JLabel label6;
    private  JButton button;
    private  JButton button1;
    private  JButton button2;

    JLabel pic;
    Timer tm;
    int x = 0;
    //Images Path In Array
    private String[] list = {
            "image/1.png",//0
            "image/2.png",//1
            "image/3.png",//2
            "image/4.png",//3
            "image/5.png",//4
            "image/6.png",//5
            "image/7.jpg"//6
//            "C:\\Users\\user\\Downloads\\Book Now\\7.png"//7
    };
    public Home(){
        setTitle("Travel Management System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(320,0,2560,1600);


        c = getContentPane();
        c.setLayout(null);

        label = new JLabel();
        label.setIcon(new ImageIcon("image/Home.jpg"));
        label.setBounds(0, 0, 1080, 1080);
        c.add(label);



        label1 = new JLabel("Travel Management System", SwingConstants.CENTER);
        label1.setBounds(950, 0, 1000, 100);
        label1.setFont(new Font("Times Roman", Font.BOLD, 20));
                Color color1=new Color(
                        102, 0, 153);
        label1.setForeground(color1);

//        label1.setBackground(Color.decode("#bdb67b"));
        Color color2=new Color(
255,204,51);
        label1.setBackground(color2);
        label1.setOpaque(true);
        c.add(label1);

        label2 = new JLabel();
        label2.setIcon(new ImageIcon("image/reg.png"));
        label2.setBounds(1230, 97, 48, 48);
        c.add(label2);

        label3 = new JLabel();
        label3.setIcon(new ImageIcon("image/u.png"));
        label3.setBounds(1515, 97, 48, 48);
        c.add(label3);

        label4 = new JLabel();
        label4.setIcon(new ImageIcon("image/a.png"));
        label4.setBounds(1220, 450, 48, 48);
        c.add(label4);

        label6 = new JLabel();
        label6.setIcon(new ImageIcon("image/ t.png"));
        label6.setBounds(1350, 390, 256,230);
        c.add(label6);

        label4 = new JLabel("CONTACT : 98746258628");
        label4.setBounds(1150, 250, 500, 50);
        label4.setFont(new Font("time Roman", Font.BOLD, 25));
        c.add(label4);

        label5 = new JLabel("GMAIL : GHUMANTEY0098@GMAIL.COM");
        label5.setBounds(1150, 300, 500, 50);
        label5.setFont(new Font("time Roman", Font.BOLD, 25));
        c.add(label5);

        label6 = new JLabel("INSTAGRAM : (GHUMANTEY)");
        label6.setBounds(1150, 350, 500, 50);
        label6.setFont(new Font("time Roman", Font.BOLD, 25));
        c.add(label6);



        button = new JButton("CUSTOMER REGISTER");
        button.setFont(new Font("Arial", Font.PLAIN, 16));
        button.setSize(210, 30);
        button.setLocation(1150, 145);
        button.addActionListener(this);
        c.add(button);

        button1= new JButton("CUSTOMER LOGIN");
        button1.setFont(new Font("Arial", Font.PLAIN, 16));
        button1.setSize(190, 30);
        button1.setLocation(1440, 145);
        button1.addActionListener(this);
        c.add(button1);

        button2= new JButton("ADMIN LOGIN");
        button2.setFont(new Font("Arial", Font.PLAIN, 16));
        button2.setBounds(1150, 500, 190, 30);
        button2.addActionListener(this);
        c.add(button2);


        pic = new JLabel();
        pic.setBounds(1080, 590, 600, 450);

        //Call The Function SetImageSize
        SetImageSize(6);
        //set a timer
        tm = new Timer(500,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x += 1;
                if(x >= list.length )
                    x = 0;
            }
        });
        add(pic);
        tm.start();
        setLayout(null);
        setSize(1920, 1080);
        getContentPane().setBackground(Color.decode("#bdb67b"));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        button.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);

    }
    //create a function to resize the image
    public void SetImageSize(int i){
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        pic.setIcon(newImc);
    }










    public static void main(String[] args) {
        new Home();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(button2))
        {
            new Admin1().setVisible(true);
            dispose();
        }
        if(e.getSource().equals(button))
        {

            new RegisterTourist().setVisible(true);
        }
        if (e.getSource().equals(button1))
        {
            new Login();
            dispose();
        }



    }
}
