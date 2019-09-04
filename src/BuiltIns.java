import java.text.SimpleDateFormat;
import java.util.Date;
//import java.lang.System;

public class BuiltIns {

    void  whatIsDate() {
        Date dt = new Date();
        System.out.println( " Date is "+dt);
    }

    void indianDate() {
        long  cur = System.currentTimeMillis();
        System.out.println("Current Time Millis "+cur);

        Date dt = new Date(cur);
        SimpleDateFormat sdf  =  new SimpleDateFormat("yyyy MMM dd");
        String formatted = sdf.format(dt);

        System.out.println("Formatted Date is "+formatted);
        //i want to print the date in dd-mm-yyyy
    }

    public static void main(String[] args) {

        BuiltIns bins =  new BuiltIns();
        bins.whatIsDate();

        bins.indianDate();
    }
}
