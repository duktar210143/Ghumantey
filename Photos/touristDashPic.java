package Photos;

import javax.swing.*;

public class touristDashPic {
    JLabel Icon;

    public touristDashPic(){
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame. setBounds(100,100,1430,840);
      
        frame.setResizable(false);

    
        Icon = new JLabel();
        Icon.setBounds(0,0,1430,840);
        Icon.setIcon(new ImageIcon("Photos/Screen Shot 2022-01-25 at 11.28.59.png"));
        frame.add(Icon);

        frame.setVisible(true);
    }
    // public static void main(String[] args) {
    //     new touristDashPic();
    // }

    
}

