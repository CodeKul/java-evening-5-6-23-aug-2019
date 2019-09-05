public class ConstructorAndOverloading {

    public static void main(String[] args) {

        new ConstructorAndOverloading();

        ConstructorAndOverloading co =
                new ConstructorAndOverloading(89, "s");
        co.add(56, 89);
        co.add(89, 78, 52);

        new ConstructorAndOverloading(co);
    }

    int col;
    String cont;

    ConstructorAndOverloading() { // default constructor
        col = 1;
        cont = "IN";
    }

    ConstructorAndOverloading( // parameterized
                               int col,
                               String cont

    ) {
        this(); // calling default constructor

        this.col = col;
        this.cont = cont;
    }

    ConstructorAndOverloading( //copy constructor
                               ConstructorAndOverloading con
    ) {
        this.cont = con.cont;
        this.col = con.col;
    }

    void add(int num1, int num2) {
        System.out.println("Addition is " + (num1 + num2));
    }

    int add(double num1, int num2) {
        System.out.println("Addition is " + (num1 + num2));
        return 0;
    }

    void add(int num1, int num2, int num3) {
        System.out.println("Addition is " + (num1 + num2 + num3));
    }


}
