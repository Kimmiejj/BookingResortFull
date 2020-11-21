package bookedresort;

import java.time.LocalDateTime;

public class BookedResort {

    private ResortData[] Resort;
    private int ResortLength;
   
        public BookedResort(int amountResort ) {
        Resort = new ResortData[amountResort];
        this.ResortLength = amountResort;
    }
    

    public boolean getRoomStatus(int number){
        return Resort[number-1].getroomstatus();
    }
   
    public void setRoom(int amountRoom, String name, int id ,int customer,String time ) {
        Resort[amountRoom - 1] = new ResortData(name, id, true ,0 ,time );
    }

    public void checkin(int checkin, String name, int id , int customer ,String time  ) {
        Resort[checkin - 1] = new ResortData(name, id, false , customer , time );
    }

    public String getRoomDetail(int index) {
        return Resort[index - 1].toString();
    }

    public int getresortlength() {
        return this.ResortLength;
    }

    public void setDeluxe(int amountDeluxe) {
        Resort[amountDeluxe - 1].setdeluxe();
    }

    public void setSuite(int amountSuite) {
        Resort[amountSuite- 1].setsuite();
    }

    public void checkout(int checkout) {
        Resort[checkout - 1].setownername("Room " + checkout);
        Resort[checkout - 1].setownerid(0);
        Resort[checkout - 1].setroomstatus(true);
        Resort[checkout - 1].setNCustomer(0);
        Resort[checkout -1].setDate("None");
    }

   
}
