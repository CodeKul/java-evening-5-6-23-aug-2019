package inheritance;

public class Main {

    public static void main(String[] args) {

        Bmw bmw = new Bmw();
//        bmw.cost = 10;
//        bmw.make = "Volkwagon";
        bmw.col = "red";

        bmw.controls[0] = 1;
        bmw.controls[1] = 2;
        bmw.controls[2] = 3;

        bmw.speedUp();
        bmw.wheels = 4;

        Object obj = new Car();

        Car cr = new Car();
        System.out.println(
                cr.equals(new Car())
        );
        ;;;;;;;;;;;;;;;;;;

        System.out.println(Main.class);
    }

}
