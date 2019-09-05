public class Operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 50;
        int i = 50;

        System.out.println("A B" + (a == b));
        System.out.println(" Increment " + (i = i + 1));
        System.out.println(" Pre Increment (unary) " + ++i);
        System.out.println(" Post Increment " + i++);
        System.out.println(" Increment " + (i += 5));
        System.out.println(" Ternary " + (i = ( i > 50 ? 60 : 90)));
        System.out.println(" And Operator  " + (i == 50 && a == 50));
        System.out.println(" And Operator  " + (i == 50 || a == 50));
        System.out.println(" Logical And Operator  " + (i & b));
        System.out.println(" Logical Or Operator  " + (i | b));
        System.out.println(" Left Shit  " + (10 >> 500));
    }
}
