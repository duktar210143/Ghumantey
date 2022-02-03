package controller;

import model.Car;
import database.dbconnection;





public class Carcontroller {
    
    
    dbconnection db;
    public int registercar(Car car) {
        String query;
        query = "insert into car(carstartingpoint,carendingpoint,cararrivaldate,cardeparturedate) Values ('"+
        car.getcarstartingpoint()+"','"+
        car.getcarendingpoint()+"','"+
        car.getcararrivaldate()+"','"+
        car.getcardeparturedate()  + "')";
 
        db = new dbconnection();
        return db.maniulate(query);
    }
    



    
}
