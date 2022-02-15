package view;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import controller.StaysController2;
import model.Stays2;
import java.awt.*;
import java.util.List;

public class View extends JFrame   {

    Object[] columns = { "StaysID","Name","ArrivalDate", "DepartureDate", "TotalnumberofAdults", "DepartureDate" };
    String data[][];
    JTable table;
    DefaultTableModel model;

    public View() {

        fillArray();

        setTitle("view");
        setSize(600, 600);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLayout(new BorderLayout());

        // JLabel lblUsername = new JLabel("Welcome " + customer.getCustFname() +
        //         " " + customer.getCustLname());

        // lblUsername.setFont(new Font("Arial", Font.BOLD, 20));
        // lblUsername.setHorizontalAlignment(JLabel.CENTER);

        // Bind model to JTable
        table = new JTable(model);

        table.setFont(new Font("Serif", Font.ITALIC, 16));
        table.setSelectionBackground(Color.green);
        table.getTableHeader().setBackground(Color.orange);
        table.getTableHeader().setFont(new Font("Serif", Font.BOLD, 16));
        add(new JScrollPane(table), BorderLayout.CENTER);

        // add(lblUsername, BorderLayout.NORTH);
        setVisible(true);
    }
    
    private void fillArray() {
        StaysController2 controller = new StaysController2();
        List<Stays2> lstStays = controller.getAllStays();
        
        data = new String[lstStays.size()][6];

        for (int i = 0; i < lstStays.size(); i++) {
            data[i][0] = Integer.toString(lstStays.get(i).getStaysID());
            data[i][1] = lstStays.get(i).getName();
            data[i][2] = lstStays.get(i).getArrivalDate();
            data[i][3] = lstStays.get(i).getDepartureDate();
            data[i][4] = Integer.toString(lstStays.get(i).getTotalnumberofAdults());
            data[i][5] = Integer.toString(lstStays.get(i).getTotalnumberofChildren());
        }

        model = new DefaultTableModel(data, columns);

    }



}
