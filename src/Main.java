import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Task 1
        System.out.println("Задание 1");
        int[] number = new int[]{1, 2, 3};
        double[] number1 = {1.57, 7.654, 9.986};
        long[] number2 = new long[20];

        //Task 2
        System.out.println("Задание 2");

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if (i != number.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        for (int i = 0; i < number1.length; i++) {
            System.out.print(number1[i]);
            if (i != number1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        for (int i = 0; i < number2.length; i++) {
            System.out.print(number2[i]);
            if (i != number2.length - 1) {
                System.out.print(", ");
            }
        }
        //Task 3
        System.out.println(" ");
        System.out.println("Задание 3");

        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        for (int i = number1.length - 1; i >= 0; i--) {
            System.out.print(number1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        for (int i = number2.length - 1; i >= 0; i--) {
            System.out.print(number2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        //Task 4
        System.out.println(" ");
        System.out.println("Задание 4");

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                number[i]++;
            }
            System.out.println(Arrays.toString(number));
        }
        //Task 1.Part 2.
        System.out.println("Задание 1");

        int[] salaryArray = new int[5];
        salaryArray[0] = 56796;
        salaryArray[1] = 5432;
        salaryArray[2] = 12543;
        salaryArray[3] = 48392;
        salaryArray[4] = 29485;

        int salarySum = 0;
        for (int salary : salaryArray) {
            salarySum += salary;
        }
        System.out.println("Сумма трат за месяц составила " + salarySum + " рублей");

        System.out.println("Задание 2");

        int[] salaryArray2 = new int[5];
        salaryArray2[0] = 56796;
        salaryArray2[1] = 5432;
        salaryArray2[2] = 12543;
        salaryArray2[3] = 48392;
        salaryArray2[4] = 29485;

        int minSum = salaryArray2[0];
        int maxSum = salaryArray2[0];
        for (int salary1 : salaryArray2) {
            if (salary1 < minSum){
                minSum = salary1;
            }
            if (salary1 > maxSum){
                maxSum = salary1;
            }
        } System.out.println("Минимальная сумма трат за неделю составила "+ minSum +" рублей. Максимальная сумма трат за неделю составила "+maxSum+" рублей");

        System.out.println("Задание 3");

        int[] salaryArray3 = new int[5];
        salaryArray3[0] = 56796;
        salaryArray3[1] = 5432;
        salaryArray3[2] = 12543;
        salaryArray3[3] = 48392;
        salaryArray3[4] = 29485;

        double sum2 = 0;
        for (double salary3 : salaryArray3) {
            sum2 = sum2+salary3;
        }
        double averageAmount = sum2 / salaryArray3.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей");

        System.out.println("Задание 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length/2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
}