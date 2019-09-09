package inheritance;

public class Car {

    private String make;
    private int cost;

    protected String col;
    int wheels;

    private Engine engine;

    public void speedUp() {
        System.out.println("Speeding Up Car");

        if(isSpeedDanger()) {

        }
    }

    private boolean isSpeedDanger() {
        return true;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", cost=" + cost +
                ", col='" + col + '\'' +
                ", wheels=" + wheels +
                ", engine=" + engine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}


//final class Hi extends Car { }
//class Hello extends Hi { }