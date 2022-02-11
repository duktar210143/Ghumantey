package view.tourist;
import java.awt.*;
import javax.swing.*;
import model.KPrice;
import javax.swing.JScrollPane;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import controller.KPriceController;

public class PriceDashboard extends JFrame {
    Object[] column = {"RoomId","RoomType","RooomPrice"};
    String Data[][];
    JTable table;
    DefaultTableModel Model;
    JButton book;
    public PriceDashboard(List<KPrice>price){

    fillArray();

    setTitle("Kathmandu Guest House");
    setBounds(400,400,800,500);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    book = new JButton("BOOK");
    book.setBounds(400,60,40,20);
    add(book);

    setLayout(new BorderLayout());
    table = new JTable(Model);
    
    table.setFont(new Font("Serif", Font.ITALIC, 16));
    table.setSelectionBackground(Color.green);
    table.getTableHeader().setBackground(Color.yellow);
    table.getTableHeader().setFont(new Font("Serif", Font.BOLD, 16));
    add(new JScrollPane(table), BorderLayout.CENTER);  

    setVisible(true);

    }
    public void fillArray(){
        KPriceController controller = new KPriceController();
        List<KPrice>lstprice = controller.viewPrice();

        Data = new String[(lstprice.size())][4];
        for(int i=0;i<lstprice.size();i++){
            Data[i][0] = Integer.toString(lstprice.get(i).getRoomId());
            Data[i][1]= lstprice.get(i).getRoomtype();
            Data[i][2]= Integer.toString(lstprice.get(i).getpriceofroom());
        }
        Model = new DefaultTableModel(Data,column);    
    }
    public static void main(String[] args) {
        new PriceDashboard(null);
    }
}
