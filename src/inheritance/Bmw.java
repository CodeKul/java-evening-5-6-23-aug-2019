package inheritance;

public class Bmw extends Car {

    int []controls = new int[3];

    Bmw() {
        super();
    }

    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("BMW is speeding up");
    }
}
