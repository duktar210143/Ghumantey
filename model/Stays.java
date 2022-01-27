package model;

public class Stays {
    public static int RegisterStays;
    private int StaysID;
    private int TotalnumberofAdults;
    private int TotalnumberofChildren;
    private String ArrivalDate;
    private String DepartureDate;
    
    public Stays(int TotalnumberofAdults, int TotalnumberofChildren, String ArrivalDate,String DepartureDate){
    this.TotalnumberofAdults = TotalnumberofAdults;
    this.TotalnumberofChildren = TotalnumberofChildren;
    this.ArrivalDate = ArrivalDate;
    this.DepartureDate = DepartureDate;
    }
    public void setTotalnumberofAdults(int TotalnumberofAdults){
        this.TotalnumberofAdults = TotalnumberofAdults;

    }
    public int getTotalnumberofAdults(){
        return this.TotalnumberofAdults;
    }
    public void setTotalnumberofChildren(int TotalnumberofChildren){
        this.TotalnumberofChildren = TotalnumberofChildren;

    }
    public int getTotalnumberofChildren(){
        return this.TotalnumberofChildren;
    }
    public void setArrivalDate(String ArrivalDate){
        this.ArrivalDate = ArrivalDate;

    }
    public String getArrivalDate(){
        return this.ArrivalDate;
    }
    public void setDepartureDate(String DepartureDate){
        this.DepartureDate = DepartureDate;

    }
    public String getDepartureDate(){
        return this.DepartureDate;
    }
}
