package controller;
import view.touristDashboard.SelectStaysDash;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import database.Dbconnection;
import model.Stays;

public class StaysController {
    Dbconnection db;
    // public StaysController() {
    // }
    public int registerStays(Stays stay){
        String query;

        query = "insert into Stays(Name,Mail,Gender,Pass,TotalnumberofAdults,TotalnumberofChildren,ArrivalDate,DepartureDate)Values ('"
        +stay.getName()+"','"
        +stay.getMail()+"','"
        +stay.getGender()+"','"
        +stay.getPass()+"','"
        +stay.getTotalnumberofAdults()+"','"
        +stay.getTotalnumberofChildren()+"','"
        +stay.getArrivalDate()+"','"
        +stay.getDepartureDate()+"')";

        db = new Dbconnection();
        // return DbmanipulateQuery
        return db.maniulate(query);

    }
    public List<Stays>viewStays(String PassCode){
        String query;
        query = "SELECT * from Stays where Pass = '" + PassCode +"' ";
        db = new Dbconnection();
        ResultSet rs = db.retrieve(query);
        List<Stays>lststays = new ArrayList<Stays>();
        try{
            while(rs.next()){
                Stays stays = new Stays();
                stays.setStaysID(rs.getInt("StaysID"));
                stays.setName(rs.getString("Name"));
                stays.setMail(rs.getString("Mail"));
                stays.setPass(rs.getString("Pass"));
                stays.setGender(rs.getString("Gender").charAt(0));
                stays.setArrivalDate(rs.getString("ArrivalDate"));
                stays.setDepartureDate(rs.getString("DepartureDate"));
                stays.setTotalnumberofAdults(rs.getInt("TotalnumberofAdults"));
                stays.setTotalnumberofChildren(rs.getInt("TotalnumberofChildren"));

                lststays.add(stays);
            }
        }catch(Exception ex){
            System.out.println("error"+ex);
        }
        return lststays;
    }
}

