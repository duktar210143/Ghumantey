package controller;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Bus;
import database.Dbconnection;

public class Buscontroller{
    Dbconnection db = new Dbconnection();

    public int BuscontrollerPreparedStatement(Bus bus){
        try{
            String query = "insert into bus(Busphoneno,busstartingpoint,busendingpoint,busarrivaldate,busdeparturedate) values(?,?,?,?,?)";
            PreparedStatement st = db.con.prepareStatement(query);
            st.setString(1, bus.getBusphoneno());
            st.setString(2, bus.getbusstartingpoint());
            st.setString(3, bus.getbusendingpoint());
            st.setString(4, bus.getbusarrivaldate());
            st.setString(5, bus.getbusdeparturedate());
            return db.manipulate(st);
        }
        catch (SQLException e){
            e.printStackTrace();
            return 0;
        }

        }

    



    //Register costumer===================
    public int registerbus(Bus bus) {
        String query;
        query = "insert into bus(Busphoneno,busstartingpoint,busendingpoint,busarrivaldate,busdeparturedate) Values ('"+
        bus.getBusphoneno()+"','"+
        bus.getbusstartingpoint()+"','"+
        bus.getbusendingpoint()+"','"+
        bus.getbusarrivaldate()+"','"+
        bus.getbusdeparturedate() + "');";
 
        
        return db.manipulate(query);
    }
    // view details
    public Bus detailsBus(){
        String query;
        query = "select * from bus";
        ResultSet rs = db.retrieve(query);
        Bus bus = null;

        try{
            while(rs.next()){
                bus = new Bus();
                bus.setBusphoneno(rs.getString("Busphoneno"));
                bus.setbusstartingpoint(rs.getString("busstartingpoint"));
                bus.setbusendingpoint(rs.getString("busendingpoint"));
                bus.setbusarrivaldate(rs.getString("busarrivaldate"));
                bus.setbusdeparturedate(rs.getString("busdeparturedate"));
            }  
        }
        catch(Exception ex){
            System.out.println("Error"+ ex);
        }
        return bus;
    }

    public List<Bus> getAllBus(String Busphoneno) {
        String query;
        query = "select * from bus where Busphoneno = '"+Busphoneno+"';";
        db = new Dbconnection();
        ResultSet rs = db.retrieve(query);
        List<Bus> lstBus = new ArrayList<Bus>();

        try{
            while(rs.next()){
                Bus bus = new Bus();
                bus.setBusphoneno(rs.getString("Busphoneno"));
                bus.setbusstartingpoint(rs.getString("busstartingpoint"));
                bus.setbusendingpoint(rs.getString("busendingpoint"));
                bus.setbusarrivaldate(rs.getString("busarrivaldate"));
                bus.setbusdeparturedate(rs.getString("busdeparturedate"));
               
                lstBus.add(bus);

            }
        }catch (Exception ex){
            System.out.println("Error"+ ex);
        }

        return lstBus;


    }
    
}
