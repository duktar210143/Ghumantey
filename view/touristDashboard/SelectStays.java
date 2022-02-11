package view.touristDashboard;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import controller.StaysController;
import model.Stays;

public class SelectStays extends JFrame   {    
    Object[] columns = {"Stays ID","Name","Mail","Pass","Kids count","Adults Count","Arrival","Departure"};
    String data[][];
    JTable table;
    DefaultTableModel model;
    // SelectStaysDash s;
    String pass;

    public SelectStays(List<Stays> stays,String pass){
        this.pass = pass;
        fillArray();
        
        setTitle("Dashboard");
        setSize(750, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        
        setLayout(new BorderLayout());
        table = new JTable(model);
    
        table.setFont(new Font("Serif", Font.ITALIC, 16));
        table.setSelectionBackground(Color.green);
        table.getTableHeader().setBackground(Color.yellow);
        table.getTableHeader().setFont(new Font("Serif", Font.BOLD, 16));
        add(new JScrollPane(table), BorderLayout.CENTER);   
        setVisible(true);

    }
    private void fillArray(){  

        StaysController controller = new StaysController();
        List<Stays> lststays = controller.viewStays(pass);

        data = new String[lststays.size()][8];

        for(int i = 0;i<lststays.size();i++){
            data[i][0] = Integer.toString(lststays.get(i).getStaysID());
            data[i][1] = lststays.get(i).getName();
            data[i][2] = lststays.get(i).getMail();
            data[i][3] = lststays.get(i).getPass();
            data[i][4] = Integer.toString(lststays.get(i).getTotalnumberofAdults());
            data[i][5] = Integer.toString(lststays.get(i).getTotalnumberofChildren());
            data[i][6] = lststays.get(i).getArrivalDate();
            data[i][7] = lststays.get(i).getDepartureDate();
        }
        model = new DefaultTableModel(data,columns);    
        
    }
}
