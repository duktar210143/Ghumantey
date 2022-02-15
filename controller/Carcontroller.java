package controller;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import model.Car;
import database.Dbconnection;

public class Carcontroller {

        Dbconnection db = new Dbconnection();

        public int CarcontrollerPreparedStatement(Car car){
            try{
                String query = "insert into car(Carphoneno,carstartingpoint,carendingpoint,cararrivaldate,cardeparturedate) values(?,?,?,?,?)";
                PreparedStatement st = db.con.prepareStatement(query);
                st.setString(1, car.getCarphoneno());
                st.setString(2, car.getcarstartingpoint());
                st.setString(3, car.getcarendingpoint());
                st.setString(4, car.getcararrivaldate());
                st.setString(5, car.getcardeparturedate());
                return db.manipulate(st);
            }
            catch (SQLException e){
                e.printStackTrace();
                return 0;
            }
    
            }
    
        //Register costumer===================
        public int registercar(Car car) {
            String query;
            query = "insert into car(Carphoneno,carstartingpoint,carendingpoint,cararrivaldate,cardeparturedate) Values ('"+
            car.getCarphoneno()+"','"+
            car.getcarstartingpoint()+"','"+
            car.getcarendingpoint()+"','"+
            car.getcararrivaldate()+"','"+
            car.getcardeparturedate() + "');";
     
            
            return db.manipulate(query);
        }
        // view details
        public Car detailsBus(){
            String query;
            query = "select * from car";
            ResultSet rs = db.retrieve(query);
            Car car = null;
    
            try{
                while(rs.next()){
                    car = new Car();
                    car.setCarphoneno(rs.getString("Carphoneno"));
                    car.setcarstartingpoint(rs.getString("carstartingpoint"));
                    car.setcarendingpoint(rs.getString("carendingpoint"));
                    car.setcararrivaldate(rs.getString("cararrivaldate"));
                    car.setcardeparturedate(rs.getString("cardeparturedate"));
                }  
            }
            catch(Exception ex){
                System.out.println("Error"+ ex);
            }
            return car;
        }
    
        public List<Car> getAllCar(String Carphoneno) {
            String query;
            query = "select * from car where Carphoneno = '"+Carphoneno+"';";
            db = new Dbconnection();
            ResultSet rs = db.retrieve(query);
            List<Car> lstCar = new ArrayList<Car>();
    
            try{
                while(rs.next()){
                    Car car = new Car();
                    car.setCarphoneno(rs.getString("Carphoneno"));
                    car.setcarstartingpoint(rs.getString("carstartingpoint"));
                    car.setcarendingpoint(rs.getString("carendingpoint"));
                    car.setcararrivaldate(rs.getString("cararrivaldate"));
                    car.setcardeparturedate(rs.getString("cardeparturedate"));
                   
                    lstCar.add(car);
    
                }
            }catch (Exception ex){
                System.out.println("Error"+ ex);
            
        }
    
         return lstCar;
    
    
        
        
        
        
    }

        
    
    
}
    