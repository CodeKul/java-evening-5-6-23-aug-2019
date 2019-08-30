public class ConstructorAndOverloading {

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
        this.col = col;
        this.cont = cont;
    }

    ConstructorAndOverloading( //copy constructor
            ConstructorAndOverloading con
    ) {
        this.cont = con.cont;
        this.col = con.col;
    }

    public static void main(String[] args) {
         ConstructorAndOverloading co =
                 new ConstructorAndOverloading(89,"s");

         new ConstructorAndOverloading(co);
    }
}
