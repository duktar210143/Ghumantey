package model;

public class Car {
    public static int registerCar;
    private String carphoneno;
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
public Car(String carphoneno,String carstartingpoint,
String carendingpoint, String cararrivaldate, String cardeparturedate){
this.carphoneno = carphoneno;
this.carstartingpoint= carstartingpoint;
this.carendingpoint= carendingpoint;
this.cararrivaldate= cararrivaldate;
this.cardeparturedate= cardeparturedate;
}


public Car() {
}
public String getCarphoneno(){
    return carphoneno;
}
public void setCarphoneno(String carphoneno){
    this.carphoneno = carphoneno;
}
public String getcarstartingpoint(){
    return carstartingpoint;
}
public void setcarstartingpoint(String carstartingpoint){
    this.carstartingpoint = carstartingpoint;
}
public String getcarendingpoint(){
    return carendingpoint;
}
public void setcarendingpoint(String carendingpoint){
    this.carendingpoint= carendingpoint;
}
public String getcararrivaldate(){
    return cararrivaldate;
}
public void setcararrivaldate(String cararrivaldate){
    this.cararrivaldate= cararrivaldate;
}
public String getcardeparturedate(){
    return cardeparturedate;
}
public void setcardeparturedate(String cardeparturedate){
    this.cardeparturedate=cardeparturedate;
}
}
