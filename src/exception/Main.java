package exception;

import exception.custom.NotFromAException;

import java.lang.reflect.Field;

public class Main {

    public void firstType() {
        int workingHrs = 0;
        int hours = 16;
        int workingDays = 0;
        try {
            workingDays = hours / workingHrs; //throw new Throwable("");
        } catch (ArithmeticException t) {
            workingHrs = 8;
            workingDays = hours / workingHrs; //remedy
            t.printStackTrace();
        } catch (Exception e) {

        } finally {
            System.out.println("Working Days are " + workingDays);
        }
    }

    public void secondType() throws Exception {
        Class.forName("java.lang.Math");
    }

    public void myEx(String nm) throws NotFromAException{

        Class cls = NotFromAException.class;
        System.out.println("Canonical Name "+cls.getCanonicalName());
        System.out.println("Name "+cls.getName());
        System.out.println("Simple Name "+cls.getSimpleName());
        Field []arr =  cls.getDeclaredFields();
        for ( Field fld : arr) {
            System.out.println("Your Field Name is "+fld.getName());
        }

        if(!nm.startsWith("a") || !nm.startsWith("A") ) {
            throw new NotFromAException(nm);
        }
    }

    public static void main(String[] args)  {

        Main m = new Main();
        m.myEx("java");
//        m.firstType();
//
//        try {
//            m.secondType();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println("Error");


    }
}
