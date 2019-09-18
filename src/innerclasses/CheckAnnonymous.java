package innerclasses;

public class CheckAnnonymous  {

    public static void main(String[] args) {

        AbstractDemo demo=new AbstractDemo() {
            @Override
            void add() {

            }
        };

        demo.add();
    }

}
