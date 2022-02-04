package controller;

import model.Bus;
import database.dbconnection;

public class Buscontroller {
    dbconnection db;

    public int registerbus(Bus bus) {
        String query;
        query = "insert into bus(busstartingpoint,busendingpoint,busarrivaldate,busdeparturedate) Values ('"+
        bus.getbusstartingpoint()+"','"+
        bus.getbusendingpoint()+"','"+
        bus.getbusarrivaldate()+"','"+
        bus.getbusdeparturedate()  + "')";
 
        db = new dbconnection();
        return db.maniulate(query);
    }
    
}
