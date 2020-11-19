package bookedresort;

public class ResortData {

    private String ownerName;
    private int ownerId;
    private boolean RoomStatus;
    private RoomType RoomType;
    private int CustumerNum;
   private String TimeDate;
    

    public ResortData(String name, int id, boolean RoomStatus ,int customer,String time) {
        this.ownerName = name ;
        this.ownerId = id;
        this.RoomStatus = RoomStatus;
        this.CustumerNum=customer;
        this.TimeDate=time;
  
        this.RoomType = RoomType.None;
    }
    
    public String getDate(){
    return this.TimeDate;
    }
    public void setDate(String time){
        this.TimeDate=time;
    }
    
   public  int getNCustomer(){
   return this.CustumerNum;
   }
   public void  setNCustomer(int customer){
       this.CustumerNum=customer;
    }

    public void setownername(String name) {
        this.ownerName = name;
    }

    public void setownerid(int id) {
        this.ownerId = id;
    }

    public void setroomstatus(boolean status) {
        this.RoomStatus = status;
    }

    public String getownername() {
        return this.ownerName;
    }

    public int getownerid() {
        return this.ownerId;
    }

    public boolean getroomstatus() {
        return this.RoomStatus;
    }

    public void setdeluxe() {
        this.RoomType = RoomType.Deluxe;
    }

    public void setsuite() {
        this.RoomType = RoomType.Suite;
    }

    public String getroomtype() {
        String Room = "null";
        if (this.RoomType == RoomType.Deluxe) {
            Room = "Deluxe";
        } else if (this.RoomType == RoomType.Suite) {
            Room = "Suite";
        } 
        return Room;
    }

    @Override
    public String toString() {
        return "ResortData[" + "ownerName=[ "+ownerName+" ]"  + " ownerId= ["+ ownerId +"]   RoomStatus=[ " + RoomStatus + " ]  RoomType=[" + getroomtype() + "] number of customer=[ "+CustumerNum+" ] DateTime=[ "+TimeDate+" ]";
    }

}
