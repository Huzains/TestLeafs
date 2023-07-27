package week1.day2;

public class mobile {
    public  void sendSms() {
        System.out.println("From Oppo");
    }

    public long makeCall(long phno) {
       
        return phno;
    }

    public static void main(String[] args) {
    	mobile MobileObject = new mobile();
        MobileObject.sendSms();
        long mobilenum = 9841775305L;
        long returnedMobNumber = MobileObject.makeCall(mobilenum);
        System.out.println("Returned mobile number: " + returnedMobNumber);
    }
}

