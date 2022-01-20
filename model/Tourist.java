package model;

public class Tourist {

    public static int registerTourist;
    private int TouristID;
    private String TourName;
    private String Tourmobile;
    private char TourGender;
    private String TourDOB;
    private String TourAddress;
    private String TourUserName;
    private String Password;

public Tourist(String TourName,String Tourmobile, char TourGender,String TourDOB,String TourAddress,String TourUserName,String Password ){
    this.TourName= TourName;
    this.Tourmobile= Tourmobile;
    this.TourGender = TourGender;
    this.TourDOB = TourDOB;
    this.TourAddress = TourAddress;
    this.TourUserName = TourUserName;
    this.Password = Password;
    }

public Tourist(){

}




public int getTouristID( ){
    return TouristID;
}

public void setTouristID(int TouristID){
    this.TouristID = TouristID;
}

public String getTourName( ){
    return TourName;
}

public void setTourName(String TourName){
    this.TourName = TourName;
}

public String getTourmobile( ){
    return Tourmobile;
}

public void setTourmobile(String Tourmobile){
    this.Tourmobile = Tourmobile;
}

public char getTourGender ( ){
    return TourGender;
}

public void setTourGender(char TourGender){
    this.TourGender = TourGender;
}

public String getTourDOB ( ){
    return TourDOB;
}

public void setTourDOB(String TourDOB){
    this.TourDOB = TourDOB;
}
public String getTourAddress ( ){
    return TourAddress;
}

public void setTourAddress(String TourAddress){
    this.TourAddress= TourAddress;
}

public String getTourUserName( ){
    return TourUserName;
}

public void setTourUserName(String TourUserName){
    this.TourUserName = TourUserName;
}

public String getPassword(){
    return Password;
}

public void setPassword(String Password){
    this.Password = Password;
}

}

