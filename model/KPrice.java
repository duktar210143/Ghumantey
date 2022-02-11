package model;

public class KPrice {
    public static int RegisterKtmPrice;
    int RoomId;
    String HotelName;
    String Roomtype;
    int priceofroom;
    public KPrice(){

    }

    public KPrice(int RoomId,String Roomtype,int priceofroom){
        this.RoomId = RoomId;
        this.Roomtype = Roomtype;
        this.priceofroom = priceofroom;
    }
    public KPrice(String Roomtype,int priceofroom,String typeofroom2){
       
        this.Roomtype = Roomtype;
        this.priceofroom = priceofroom;
    }
    public void setRoomId(int RoomId){
        this.RoomId = RoomId;
    }
    public int getRoomId(){
        return this.RoomId;
    }
    public void setRoomtype(String Roomtype){
        this.Roomtype = Roomtype;
    }
    public String getRoomtype(){
        return this.Roomtype;
    }
    public void setPriceofroom(int priceofroom){
        this.priceofroom = priceofroom;
    }
    public int getpriceofroom(){
        return this.priceofroom;
    }

}
