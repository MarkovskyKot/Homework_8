import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] integerArray = new int[3];
        for (int index = 0; index < integerArray.length; index++) {
            integerArray[index] = index + 1;
        }
        System.out.println(Arrays.toString(integerArray));
        double[] doubleArray = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(doubleArray));
        boolean[] booleanArray = {true, false};
        System.out.println(Arrays.toString(booleanArray));
        System.out.println();
        //Задача 2
        //Только так придумал, чтобы не ставить запятую в конце
        for (int index = 0; ; index++) {
            System.out.print(integerArray[index]);
            if (index == integerArray.length - 1) {
                break;
            } else {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int index = 0; ; index++) {
            System.out.print(doubleArray[index]);
            if (index == doubleArray.length - 1) {
                break;
            } else {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int index = 0; ; index++) {
            System.out.print(booleanArray[index]);
            if (index == booleanArray.length - 1) {
                break;
            } else {
                System.out.print(", ");
            }
        }
        System.out.println();
        //Задача 3
        //index >= 0
        for (int index = integerArray.length - 1; ; index--) {
            System.out.print(integerArray[index]);
            if (index == 0) {
                break;
            } else System.out.print(", ");
        }
        System.out.println();
        for (int index = doubleArray.length - 1; ; index--) {
            System.out.print(doubleArray[index]);
            if (index == 0) {
                break;
            } else System.out.print(", ");
        }
        System.out.println();
        for (int index = booleanArray.length - 1; ; index--) {
            System.out.print(booleanArray[index]);
            if (index == 0) {
                break;
            } else System.out.print(", ");
        }
        System.out.println();
        //Задача 4
        for (int index = 0; index < integerArray.length; index++) {
            if (integerArray[index] % 2 != 0) {
                integerArray[index]++;
            }
        }
        System.out.println(Arrays.toString(integerArray));
    }
}