package model;

public class Stays {
    public static int RegisterStays;
    private int StaysID;
    private String Name;
    private String Mail;
    private char Gender;
    private String Pass;
    private int TotalnumberofAdults;
    private int TotalnumberofChildren;
    private String ArrivalDate;
    private String DepartureDate;

    public Stays(){

    }
    
    public Stays(String Name,String Mail,char Gender,String Pass,int TotalnumberofAdults, int TotalnumberofChildren, String ArrivalDate,String DepartureDate){
    this.Name = Name;
    this.Mail = Mail;
    this.Gender = Gender;
    this.Pass = Pass;
    this.TotalnumberofAdults = TotalnumberofAdults;
    this.TotalnumberofChildren = TotalnumberofChildren;
    this.ArrivalDate = ArrivalDate;
    this.DepartureDate = DepartureDate;
    }
    public Stays(int StaysID,String Name,String Mail,char Gender,String Pass,int TotalnumberofAdults, int TotalnumberofChildren, String ArrivalDate,String DepartureDate){
        this.StaysID = StaysID;
        this.Name = Name;
        this.Mail = Mail;
        this.Gender = Gender;
        this.Pass = Pass;
        this.TotalnumberofAdults = TotalnumberofAdults;
        this.TotalnumberofChildren = TotalnumberofChildren;
        this.ArrivalDate = ArrivalDate;
        this.DepartureDate = DepartureDate;
        }

    public void setStaysID(int StaysID){
        this.StaysID = StaysID;
    
    }
    public int getStaysID(){
        return this.StaysID;
    }    
    public void setName(String Name){
        this.Name = Name;

    }
    public String getName(){
        return this.Name;
    }
    public void setMail(String Mail){
        this.Mail = Mail;

    }
    public String getMail(){
        return this.Mail;
    }
    public void setGender(char Gender){
        this.Gender = Gender;

    }
    public char getGender(){
        return this.Gender;
    }
    public void setPass(String Pass){
        this.Pass = Pass;

    }
    public String getPass(){
        return this.Pass;
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
