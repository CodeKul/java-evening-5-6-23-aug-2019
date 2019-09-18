package innerclasses;

public class Car {

    private int tpSp;

    private IGps gps = new MyGps();
    private IGps gpsOne = new IGps() {
        @Override
        public void locate() {
            System.out.println("Locating");
        }
    };

    //lambda - java 8
    IGps gpsTwo = () -> System.out.println("Locating");

    public void speedUp() {

    }


    Car() {

    }

    public class Engine {
        int bhp = 10;

        Engine() {
            tpSp = 10;
        }
    }

    public static class Light {

    }

    public static void main(String[] args) {

        Car c = new Car();
        c.new Engine();

        new Car.Light();

        class MainLocal {

        }

        Car c1 = new Car() {
            @Override
            public void speedUp() {
                super.speedUp();
            }
        };
    }
}

@FunctionalInterface
interface IGps {
    void locate();
}


class MyGps implements IGps {
    @Override
    public void locate() {

    }
}
