package controller;

import java.sql.ResultSet;

import database.Dbconnection;
import model.Tourist;

public class TouristController {
    
    Dbconnection db;

    public int registerTourist(Tourist tourist){
       String query;
       query = "insert into Tourist(TourName,Tourmobile,TourGender,TourDOB,TourAddress,TourUserName,Password) Values ('"+
       tourist.getTourName()+"','"+
       tourist.getTourmobile()+"','"+
       tourist.getTourGender()+"','"+
       tourist.getTourDOB() + "','"+
       tourist.getTourAddress() + "','" +
       tourist.getTourUserName() + "','" +
       tourist.getPassword() + "')";

       db = new Dbconnection();
    //    return db.manipulate(query);
    return db.maniulate(query);
    }


public Tourist loginTourist(String UserName, String Password){
    String query;
    query = "select * from Tourist where TourUserName = '"+UserName+"'and Password ='"+Password+"';";
    db = new Dbconnection();
    ResultSet rs = db.retrieve(query);
    Tourist tourist = null;
    try{
        while(rs.next()){
            tourist = new Tourist();
            tourist.setTouristID(rs.getInt("TouristID"));
            tourist.setTourName(rs.getString("TourName"));
            tourist.setTourmobile(rs.getString("Tourmobile"));
            tourist.setTourGender(rs.getString("Tourgender").charAt(0));
            tourist.setTourAddress(rs.getString("Touraddress"));
            tourist.setTourUserName(UserName);
        }
    }catch (Exception e) {
        e.printStackTrace();

    }
    return tourist;
}
}
    
