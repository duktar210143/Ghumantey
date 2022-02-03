package model;

public class Bus {
    public static int registerBus;
    private int BusId;
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
public Bus(){

}


public int getBusId(){
    return BusId;
}
public void setBusId(int BusId){
    this.BusId = BusId;
}
public String getbusstartingpoint(){
    return busstartingpoint;
}
public void setbusstartingpoint(){
    this.busstartingpoint = busstartingpoint;
}
public String getbusendingpoint(){
    return busendingpoint;
}
public void setbusendingpoint(){
    this.busendingpoint= busendingpoint;
}
public String getbusarrivaldate(){
    return busarrivaldate;
}
public void setbusarrivaldate(){
    this.busarrivaldate= busarrivaldate;
}
public String getbusdeparturedate(){
    return busdeparturedate;
}
public void setbusdeparturedate(){
    this.busdeparturedate=busdeparturedate;
}
    
}
