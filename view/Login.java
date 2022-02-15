package view;

import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.TouristController;
import model.Tourist;

import view.touristDashboard.TouristDashBoard;


public class Login {
  public Login(){
    JFrame frame = new JFrame("LOGIN TO GHUMANTEY ");
      frame.setBounds(400,400,350,450);
      frame.setLayout(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      JLabel lblUsername = new JLabel("Username");
      JLabel lblPassword = new JLabel("Password");


      frame.add(lblUsername);
      frame.add(lblPassword);

      JTextField txtUsername = new JTextField();
      JPasswordField txtPassword = new JPasswordField();

      frame.add(txtUsername);
      frame.add(txtPassword);

      JButton btnLogin = new JButton("Login");
 

      frame.add(btnLogin);


      lblUsername.setBounds(20,50,80,25);
      lblUsername.setForeground(Color.white);
      lblPassword.setBounds(20,110,80,25);
      lblPassword.setForeground(Color.white);

      txtUsername.setBounds(100,50,160,25);
      txtPassword.setBounds(100,110,160,25);

      btnLogin.setBounds(110,180,110,25);


      JLabel Icon = new JLabel();
      Icon.setIcon(new ImageIcon("Photos/Screen Shot 2022-01-23 at 22.15.13.png"));
      Icon.setBounds(0,0,350,450);
      frame.add(Icon);

      // frame.setVisible(true);
      btnLogin.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          
            TouristController controller = new TouristController();
            Tourist tourist = controller.loginTourist(txtUsername.getText(),txtPassword.getText());
            if(tourist!=null){
              new TouristDashBoard().setVisible(true);;
            }else{
              JOptionPane.showMessageDialog(null, "invalid Username or Password");
            
          }
        }
          
    });

      // btnRegister.addActionListener(new ActionListener() {
      //   @Override
      //   public void actionPerformed(ActionEvent e) {
      //     new RegisterTourist();          
      //   }
    // });

      frame.setVisible(true);
  
    //   btnLogin.addActionListener(new ActionListener() {
    //     @Override
    //     public void actionPerformed(ActionEvent e) {
          
    //         TouristController controller = new TouristController();
    //         Tourist tourist = controller.loginTourist(txtUsername.getText(),txtPassword.getText());
    //         if(tourist!=null){
    //           new TouristDashBoard().setVisible(true);;
    //         }else{
    //           JOptionPane.showMessageDialog(null, "invalid Username or Password");
            
    //       }
    //     }
          
    // });
  }
    public static void main(String[] args) {

      new Login();
  }

 
}
 
