import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Task 1
        System.out.println("Задание 1");
        int [] number = new int[]{1,2,3};
        double[] number1 = {1.57, 7.654, 9.986};
        long[] number2 = new long[20];

        //Task 2
        System.out.println("Задание 2");

        for (int i=0; i<number.length; i++) {
            System.out.print(number[i]);
            if (i != number.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        for (int i=0; i<number1.length; i++) {
            System.out.print(number1[i]);
            if (i != number1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        for (int i=0; i<number2.length; i++) {
            System.out.print(number2[i]);
            if (i != number2.length - 1) {
                System.out.print(", ");
            }
        }
        //Task 3
        System.out.println(" ");
        System.out.println("Задание 3");

        for (int i=number.length-1; i>=0; i--) {
            System.out.print(number[i]);
            if (i !=0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        for (int i=number1.length-1; i>=0; i--) {
            System.out.print(number1[i]);
            if (i !=0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        for (int i=number2.length-1; i>=0; i--) {
            System.out.print(number2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        //Task 4
        System.out.println(" ");
        System.out.println("Задание 4");

        for (int i=0; i<number.length; i++){
            if (number[i] %2 !=0){
                number[i]++;
            }
        }
        System.out.println(Arrays.toString(number));
    }
}