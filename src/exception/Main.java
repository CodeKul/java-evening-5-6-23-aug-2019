package exception;

import java.nio.file.FileAlreadyExistsException;

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

    public static void main(String[] args) throws Exception {

        Main m = new Main();
        m.firstType();
        m.secondType();
        System.out.println("Error");

    }
}
