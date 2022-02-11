package controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import database.Dbconnection;
import model.KPrice;

public class KPriceController {
    Dbconnection db;
    public List<KPrice>viewPrice(){
    String query;
    query = "select * FROM Price";
    db = new Dbconnection();
    ResultSet rs = db.retrieve(query);
    List<KPrice>lstprice = new ArrayList<KPrice>();
    try{
        while(rs.next()){
            KPrice price = new KPrice();
            price.setRoomId(rs.getInt("RoomId"));
            price.setRoomtype(rs.getString("Roomtype"));
            price.setPriceofroom(rs.getInt("Priceofroom"));
            lstprice.add(price);
        }
    }catch(Exception ex){
        System.out.println("error"+ ex);
    }
    return lstprice;
    }
}
