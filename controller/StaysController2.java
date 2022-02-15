package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.Dbconnection2;
import model.Stays2;

public class StaysController2 {
    Dbconnection2 db;
    public int registerStaysPrepaedStatement(Stays2 stays){
        try{
            String query = "insert into customer(insert into Stays(Name,Mail,Gender,Pass,TotalnumberofAdults,TotalnumberofChildren,ArrivalDate,DepartureDate) values(?,?,?,?,?,?,?)";

            PreparedStatement st = db.con.prepareStatement(query);

            st.setString(1, stays.getName());
            st.setString(2, stays.getMail());
            st.setString(3, String.valueOf(stays.getGender()));
            st.setString(4, stays.getPass());
            st.setString(5,  String.valueOf(stays.getTotalnumberofAdults()));
            st.setString(5,  String.valueOf(stays.getTotalnumberofChildren()));
            st.setString(5,  String.valueOf(stays.getArrivalDate()));
            st.setString(5,  String.valueOf(stays.getDepartureDate()));


            return db.maniulate(query);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
        // Register customer;
        public int registerCustomer(Stays2 stays) {
            String query;
    
            query = "insert into customer(insert into Stays(Name,Mail,Gender,Pass,TotalnumberofAdults,TotalnumberofChildren,ArrivalDate,DepartureDate) values('" +
                    stays.getName() + "','" +
                    stays.getMail() + "','" +
                    stays.getGender() + "','" +
                    stays.getPass() + "','" +
                    stays.getTotalnumberofAdults() + "','" +
                    stays.getTotalnumberofChildren() + "','" +
                    stays.getArrivalDate() + "','" +
                    stays.getDepartureDate()+ "');";

    
            return db.maniulate(query);
        }
    
    //     String query;

    //     query = "insert into Stays(Name,Mail,Gender,Pass,TotalnumberofAdults,TotalnumberofChildren,ArrivalDate,DepartureDate)Values ('"
    //     +stay.getName()+"','"
    //     +stay.getMail()+"','"
    //     +stay.getGender()+"','"
    //     +stay.getPass()+"','"
    //     +stay.getTotalnumberofAdults()+"','"
    //     +stay.getTotalnumberofChildren()+"','"
    //     +stay.getArrivalDate()+"','"
    //     +stay.getDepartureDate()+"')";

    //     db = new Dbconnection();
    //     // return DbmanipulateQuery
    //     return db.maniulate(query);

    // }
        // Login customer
        public Stays2 loginCustomer(int StaysID, String Mail) {
            String query;
            query = "select * from customer where username = '" + StaysID +
                    "' and password = '" + Mail + "';";
    
            ResultSet rs = db.retrieve(query);
            Stays2 stays = null;
    
            try {
                while (rs.next()) {
                    stays = new Stays2();
                    stays.setStaysID(rs.getInt("StaysID"));
                    stays.setName(rs.getString("Name"));
                    stays.setMail(rs.getString("Mail"));
                    stays.setPass(rs.getString("Pass"));
                    stays.setGender(rs.getString("gender").charAt(0));
                    stays.setTotalnumberofAdults(rs.getInt("TotalnumberofAdults"));
                    stays.setTotalnumberofChildren(rs.getInt("TotalnumberofChildren"));
                    stays.setArrivalDate(rs.getString("ArrivalDate"));
                    stays.setDepartureDate(rs.getString("DepartureDate"));
                  
                }

            } catch (Exception ex) {
                System.out.println("Error" + ex);
            }
    
            return stays;
        }
    
        public List<Stays2> getAllStays() {
            String query;
            query = "select * from stays";
            db = new Dbconnection2();
            ResultSet rs = db.retrieve(query);
            List<Stays2> lstStays = new ArrayList<Stays2>();
    
            try {
                while (rs.next()) {
                    Stays2 stays = new Stays2();
                    stays.setStaysID(rs.getInt("StaysID"));
                    stays.setName(rs.getString("Name"));
                    stays.setMail(rs.getString("Mail"));
                    stays.setPass(rs.getString("Pass"));
                    stays.setGender(rs.getString("gender").charAt(0));
                    stays.setTotalnumberofAdults(rs.getInt("TotalnumberofAdults"));
                    stays.setTotalnumberofChildren(rs.getInt("TotalnumberofChildren"));
                    stays.setArrivalDate(rs.getString("ArrivalDate"));
                    stays.setDepartureDate(rs.getString("DepartureDate"));
                    

    
                    lstStays.add(stays);
                }
            } catch (Exception ex) {
                System.out.println("Error" + ex);
            }
    
            return lstStays;
        }
}
