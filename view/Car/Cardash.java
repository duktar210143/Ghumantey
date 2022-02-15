package view.Car;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import controller.Carcontroller;
import model.Car;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;



public class Cardash extends JFrame implements ActionListener{
    JButton view,register;
    JLabel code;
    JTextField codefield;



    public Cardash(){
    setTitle("Welcome");
    setBounds(450,300,260, 220);
    setLayout(null);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    code = new JLabel("Enter phoneno::");
    code.setBounds(10, 10, 100, 30);
    add(code);


    codefield = new JTextField();
    codefield.setBounds(10, 40, 100, 30);
    add(codefield);


    view = new JButton("View");
    view.setBounds(30, 100, 80, 30);
    view.addActionListener(this);
    add(view);
    // setBounds(x, y, width, height);

    register = new JButton("Book-Car");
    register.setBounds(150,100,90,30);
    register.addActionListener(this);
    add(register);

    setVisible(true);
    
}
@Override
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    if (e.getSource() == register){
        new Registercar();
    }
    else{
        Carcontroller controller = new Carcontroller();
        List<Car>car = controller.getAllCar(codefield.getText());
        if(car!=null){
            new Result(car,codefield.getText());
            // new Result(bus);
        }
        
        
    }

   
}


// public static void main(String[] args){
//     new Cardash();

    
// }



    
}
