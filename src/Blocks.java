public class Blocks {

    int objAcc = 10;
    static int clsAcc = 50;

    static  {
        clsAcc = 89;
        System.out.println("In Static");

        stFn();
    }

    /*init*/ {
        objAcc = 78;
        System.out.println("In Init");

        nstFn();
    }

    Blocks() {
        objAcc = 78;
        System.out.println("In Constructor");

        nstFn();
    }

    static void stFn() {
        clsAcc = 89;
    }

    void nstFn() {
        objAcc = 89;
        clsAcc = 89;
    }

    public static void msadfkksajfkain(String[] aadlfkkasdlfkrgs) {

        // java copyfile "./my.txt" "/desktop/hi.txt" // command line args

        stFn();
    }

    public static void main(String[] args) {

        //javac Calc.java
        //java Calc 12 89

        System.exit(0);
    }
}
