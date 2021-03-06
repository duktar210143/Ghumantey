package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin1 extends JFrame implements ActionListener {
    private Container c;
    private JButton sub;
    private JButton sub1;
    private JButton sub3;
    private JButton sub0;
    private JButton sub2;
    private JLabel label1;
    private JLabel label0;
    private JLabel label3;
    private JLabel label2;

    public Admin1() {
        setTitle("Admin");
        setBounds(600, 300, 500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        //color
        Color color=new Color(0,102,0);
        getContentPane().setBackground(color);

        c = getContentPane();
        c.setLayout(null);



        sub = new JButton("View Stay Booking");
        sub.setFont(new Font("Arial", Font.PLAIN, 16));
        sub.setSize(150, 30);
        sub.setLocation(190, 100);
        sub.addActionListener(this);
        c.add(sub);

        sub1 = new JButton("View Car Booking");
        sub1.setFont(new Font("Arial", Font.PLAIN, 16));
        sub1.setSize(150, 30);
        sub1.setLocation(190, 150);
        sub1.addActionListener(this);
        c.add(sub1);

        sub3 = new JButton("View Bus Booking");
        sub3.setFont(new Font("Arial", Font.PLAIN, 16));
        sub3.setSize(150, 30);
        sub3.setLocation(190, 200);
        sub3.addActionListener(this);
        c.add(sub3);


        sub2 = new JButton("Log Out");
        sub2.setFont(new Font("Arial", Font.PLAIN, 15));
        sub2.setSize(100, 20);
        sub2.setLocation(380, 10);
        sub2.addActionListener(this);

        sub2.setForeground(Color.RED);
        c.add(sub2);

        label0 = new JLabel();
        label0.setIcon(new ImageIcon("image/admin.png"));
        label0.setBounds(10, 5, 72, 72);
        c.add(label0);

        label1 = new JLabel();
        label1.setIcon(new ImageIcon("image/view.png"));
        label1.setBounds(125, 90, 48, 48);
        c.add(label1);

        label3 = new JLabel();
        label3.setIcon(new ImageIcon("image/update.png"));
        label3.setBounds(60, 5, 72, 72);
        c.add(label3);


        label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBounds(0, 0, 500, 71);
        Color color1=new Color(51,153,255);
        label2.setBackground(color1);

        c.add(label2);


        setVisible(true);
        setResizable(false);
        sub.addActionListener(this);
        sub0.addActionListener(this);
        sub2.addActionListener(this);

    }

    // public static void main(String[] args) {
    //     new Admin1();
    // }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(sub))
        {

            new view().setVisible(true);
            
        }
        // if (e.getSource().equals(sub0))
        // {
        //     new sub0().setVisible(true);
        // }
        if (e.getSource().equals(sub2))
        {
            new Home().setVisible(true);
            dispose();
        }

    }
}