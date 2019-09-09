package interfaces;

import inheritance.Car;

public class Main {

    Animal an; // containment inheritance -has a relationship

    public static void main(String[] args) {
//        Animal an = new Animal() ; invalid

        Animal an = new Tiger();

        Tiger tg = new Tiger();

//        Tiger tg1 = new Animal();
        /*
        * 1. abstract can not be initialized
        * 2. if animal is concrete, still above line will be an error why ?
        * because every tiger is an animal, but every animal is not tiger
         * **/



    }
}
