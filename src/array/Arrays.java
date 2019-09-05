package array;

public class Arrays {

    void intArray() {
        int[] nums = {1, 2, 2, 8, 899, 656}; //single dimensional
        System.out.println("Third Element " + nums[3]);

        int[][] twoD = { // multi dimensional array
                {1, 2, 3, 4},
                {7, 8, 9, 10}
        };
        System.out.println("Length of array is " + twoD.length);
        System.out.println("oth element" + twoD[0]);
        System.out.println("oth element" + twoD[0][1]);

        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print("\t" + twoD[i][j]);
            }
            System.out.println();
        }
    }

    void objArr() {

        Car[] cars = new Car[3]; // dynamic alloc
        cars[0] = new Car();
        cars[1] = new Car();
        cars[2] = new Car();


        Car[] carsSt = { // static alloc
                new Car(),
                new Car(),
                new Car(),
                new Car(),
                new Car()
        };

        for (Car car : cars) { //for each
            System.out.println("Passing Number"+car.pass);
        }
    }

    public static void main(String[] args) {
        Arrays arr = new Arrays();
        arr.intArray();
//        java.util.Arrays
    }
}
