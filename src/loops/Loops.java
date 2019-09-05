package loops;

public class Loops {

    void forLoop() {
        for (int i = 1 ; i <= 10 ;i++) {
            System.out.println(i*2);
            // two ones are 2
        }
    }

    void whileLoop() {
        int i = 0;
        while( i++ < 10 ) {
            System.out.println(i * 2);
        }
    }

    void doWhile() {

        int i = 0;

        do {
            System.out.println("I is "+i*2);
        }while ( ++i <10);
    }

    void nestedFor() {
        for ( int start = 1 ; start <= 10 ; start++ ) {
            for(int end = 1; end <=10 ; end++ ) {
                System.out.println(start*end);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Loops lp = new Loops();
//        lp.forLoop();
//        lp.whileLoop();
//        lp.doWhile();
        lp.nestedFor();
    }
}
