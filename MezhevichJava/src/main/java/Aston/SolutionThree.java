package Aston;

import java.util.Scanner;
import java.util.Arrays;

public class SolutionThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
        int indexArray = 0;
        int[] array = new int[length];
        int[] arraySecond = new int[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Введенный массив: " + Arrays.toString(array));
        scanner.close();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                arraySecond[indexArray] = array[i];
                indexArray++;
            }
        }
        System.out.println("Массив с числами кратные 3 " + Arrays.toString(arraySecond));

    }

}
