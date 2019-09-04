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

    void maths() {
        System.out.printf("\n Sqrt is %f ", Math.sqrt(89));
        int sq = (int) Math.sqrt(89);
        System.out.printf("\n Sqrt is numeric %d ", sq);

        System.out.println(89);
        System.out.println(true);
        System.out.println(89.898);
        System.out.println("");

        String num1 = "10";
        String num2 ="80";
        System.out.println(
                " Addition is "+(
                        Integer.parseInt(num1) +  Integer.parseInt(num2)
                )
        );

        System.out.println(
                "Random No. " + (Math.random() * 58)
        );

        int r = (int)(Math.random() * 256);
        int g = (int)(Math.random() * 256);
        int b = (int)(Math.random() * 256);
    }

    public static void main(String[] args) {

        BuiltIns bins =  new BuiltIns();
        bins.whatIsDate();

        bins.indianDate();
        bins.maths();

    }
}
