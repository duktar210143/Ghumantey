package controller;
import database.Dbconnection;
import model.Stays;

public class StaysController {
    Dbconnection db;
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
}
