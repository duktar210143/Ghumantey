package view.Car;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import controller.Carcontroller;
import model.Car;

import java.awt.*;
import java.awt.event.*;
import java.util.List;


public class Result extends JFrame implements ActionListener {
    Object[] columns = { "Phone no","Starting point", "Ending point", "Arrival date", "Departure date" };
    String data[][];
    JTable table;
    DefaultTableModel model; 
    String Carphoneno;  

    public Result(List<Car>car,String Carphoneno){
        this.Carphoneno = Carphoneno;

        fillArray();


        setTitle("Booking of Car");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLayout(new BorderLayout());
        JLabel lblUsername = new JLabel("Bus Booking");
        lblUsername.setFont(new Font("Arial", Font.BOLD, 20));
        lblUsername.setHorizontalAlignment(JLabel.CENTER);

         // Bind model to JTable
         table = new JTable(model);


         table.setFont(new Font("Serif", Font.ITALIC, 16));
         table.setForeground(Color.BLACK);
         table.setSelectionBackground(Color.yellow);
         table.getTableHeader().setBackground(Color.cyan);
         table.getTableHeader().setFont(new Font("Serif", Font.BOLD, 16));
         add(new JScrollPane(table), BorderLayout.CENTER);
 
         add(lblUsername, BorderLayout.NORTH);
         setVisible(true);
     }
     private void fillArray() {
        Carcontroller controller = new Carcontroller();
        List<Car> lstCar = controller.getAllCar(Carphoneno);
        
        data = new String[lstCar.size()][5];

        for (int i = 0; i < lstCar.size(); i++) {
            data[i][0] = lstCar.get(i).getCarphoneno();
            data[i][1] = lstCar.get(i).getcarstartingpoint();
            data[i][2] = lstCar.get(i).getcarendingpoint();
            data[i][3] = lstCar.get(i).getcararrivaldate();
            data[i][4] = lstCar.get(i).getcardeparturedate();
            
        }

        model = new DefaultTableModel(data, columns);



    }
    @Override
    public void actionPerformed(ActionEvent e){

    }
}
