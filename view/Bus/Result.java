package view.Bus;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.Buscontroller;
import model.Bus;
import java.awt.*;
import java.awt.event.*;
import java.util.List;


public class Result extends JFrame implements ActionListener {
    Object[] columns = { "Phone no","Starting point", "Ending point", "Arrival date", "Departure date" };
    String data[][];
    JTable table;
    DefaultTableModel model; 
    String Busphoneno;  

    public Result(List<Bus>bus,String Busphoneno){
        this.Busphoneno = Busphoneno;

        fillArray();


        setTitle("Booking of Bus");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
        Buscontroller controller = new Buscontroller();
        List<Bus> lstBus = controller.getAllBus(Busphoneno);
        
        data = new String[lstBus.size()][5];

        for (int i = 0; i < lstBus.size(); i++) {
            data[i][0] = lstBus.get(i).getBusphoneno();
            data[i][1] = lstBus.get(i).getbusstartingpoint();
            data[i][2] = lstBus.get(i).getbusendingpoint();
            data[i][3] = lstBus.get(i).getbusarrivaldate();
            data[i][4] = lstBus.get(i).getbusdeparturedate();
            
        }

        model = new DefaultTableModel(data, columns);



    }
    @Override
    public void actionPerformed(ActionEvent e){

    }
}
