package model;

public class Bus {
    public static int registerBus;
    private String busphoneno;
    private String busstartingpoint;
    private String busendingpoint;
    private String busarrivaldate;
    private String busdeparturedate;
    


public Bus(String busstartingpoint,String busendingpoint, String busarrivaldate, String busdeparturedate){
    this.busstartingpoint= busstartingpoint;
    this.busendingpoint= busendingpoint;
    this.busarrivaldate= busarrivaldate;
    this.busdeparturedate= busdeparturedate;
}
    
public Bus(String busphoneno,String busstartingpoint,String busendingpoint,
 String busarrivaldate, String busdeparturedate){
     this.busphoneno = busphoneno;
     this.busstartingpoint = busstartingpoint;
     this.busendingpoint = busendingpoint;
     this.busarrivaldate = busarrivaldate;
     this.busdeparturedate = busdeparturedate;
     

}


public Bus() {
}
public String getBusphoneno(){
    return busphoneno;
}
public void setBusphoneno(String busphoneno){
    this.busphoneno = busphoneno;
}
public String getbusstartingpoint(){
    return busstartingpoint;
}
public void setbusstartingpoint(String busstartingpoint){
    this.busstartingpoint = busstartingpoint;
}
public String getbusendingpoint(){
    return busendingpoint;
}
public void setbusendingpoint(String busendingpoint){
    this.busendingpoint= busendingpoint;
}
public String getbusarrivaldate(){
    return busarrivaldate;
}
public void setbusarrivaldate(String busarrivaldate){
    this.busarrivaldate= busarrivaldate;
}
public String getbusdeparturedate(){
    return busdeparturedate;
}
public void setbusdeparturedate(String busdeparturedate){
    this.busdeparturedate=busdeparturedate;
}





    
}
