package Photos.Icons;
import javax.swing.*;

public class About  {
    JLabel Icon;

    public About(){
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setBounds(100,100,666,520);
        frame.setResizable(false);

    
        Icon = new JLabel();
        Icon.setBounds(0,0,666,520);
        Icon.setIcon(new ImageIcon("Photos/Icons/Screen Shot 2022-01-24 at 18.26.39.png"));
        frame.add(Icon);

        frame.setVisible(true);
    }
    // public static void main(String[] args) {
    //     new About();
    // }

    
}
