public class Blocks {

    static  {
        System.out.println("Static");
    }

    {
        // init
        System.out.println("Init");
    }

    Blocks() {
        System.out.println("Constructor");
    }
}
