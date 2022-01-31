package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin1 extends JFrame implements ActionListener {
    private Container c;
    private JButton sub;
    private JButton sub0;
    private JButton sub2;
    private JLabel label1;
    private JLabel label0;
    private JLabel label3;
    private JLabel label2;

    public Admin1() {
        setTitle("Admin");
        setBounds(600, 300, 500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        //color
        Color color=new Color(0,102,0);
        getContentPane().setBackground(color);

        c = getContentPane();
        c.setLayout(null);



        sub = new JButton("View Booking");
        sub.setFont(new Font("Arial", Font.PLAIN, 16));
        sub.setSize(150, 30);
        sub.setLocation(190, 100);
        sub.addActionListener(this);
        sub.setBackground(Color.DARK_GRAY);
        sub.setForeground(Color.WHITE);
        c.add(sub);

        sub0 = new JButton("Update ");
        sub0.setFont(new Font("Arial", Font.PLAIN, 16));
        sub0.setSize(150, 30);
        sub0.setLocation(190, 170);
        sub0.addActionListener(this);
        sub0.setBackground(Color.DARK_GRAY);
        sub0.setForeground(Color.WHITE);
        c.add(sub0);



        sub2 = new JButton("Log Out");
        sub2.setFont(new Font("Arial", Font.PLAIN, 15));
        sub2.setSize(100, 20);
        sub2.setLocation(380, 10);
        sub2.addActionListener(this);

        sub2.setForeground(Color.RED);
        c.add(sub2);

        label0 = new JLabel();
        label0.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\admin.png"));
        label0.setBounds(10, 5, 72, 72);
        c.add(label0);

        label1 = new JLabel();
        label1.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\white-24dp (2)\\2x\\view.png"));
        label1.setBounds(125, 90, 48, 48);
        c.add(label1);

        label3 = new JLabel();
        label3.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\white-24dp (3)\\2x\\update.png"));
        label3.setBounds(125, 160, 48, 48);
        c.add(label3);


        label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBounds(0, 0, 500, 71);
        Color color1=new Color(51,153,255);
        label2.setBackground(color1);

        c.add(label2);


        setVisible(true);
        setResizable(false);


    }

    public static void main(String[] args) {
        new Admin1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}