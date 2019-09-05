package basics;

import loops.Loops;

public class Main {

    // state
    int date;
    String nm;

    Main() {
       date = 45;
       nm = "Android";

        Loops lp = new Loops();
    }

    // behaviour
    void currentDate() {
        date = 45;
    }

    String whatIsName() {
        return nm;
    }

    void objExp() {

        //LHS = RHS
        // data type + variable name = value

        int i = 10;

        //object  creation
        Main mn = new/*Reserve Memory Block dynamically*/ Main() /*Special function which inserts values */; //ORV
        mn.date = 89;
        mn.nm = "hi";

        mn.currentDate();
        mn.whatIsName();
    }
}
