package model;

public class Car {
    public static int registerCar;
    private int CarId;
    private String carstartingpoint;
    private String carendingpoint;
    private String cararrivaldate;
    private String cardeparturedate;


public Car(String carstartingpoint,String carendingpoint, String cararrivaldate, String cardeparturedate){
    this.carstartingpoint= carstartingpoint;
    this.carendingpoint= carendingpoint;
    this.cararrivaldate= cararrivaldate;
    this.cardeparturedate= cardeparturedate;
}
public Car(){

}


public int getCarId(){
    return CarId;
}
public void setCarId(int CarId){
    this.CarId = CarId;
}
public String getcarstartingpoint(){
    return carstartingpoint;
}
public void setcarstartingpoint(){
    this.carstartingpoint = carstartingpoint;
}
public String getcarendingpoint(){
    return carendingpoint;
}
public void setcarendingpoint(){
    this.carendingpoint= carendingpoint;
}
public String getcararrivaldate(){
    return cararrivaldate;
}
public void setcararrivaldate(){
    this.cararrivaldate= cararrivaldate;
}
public String getcardeparturedate(){
    return cardeparturedate;
}
public void setcardeparturedate(){
    this.cardeparturedate=cardeparturedate;
}
}
