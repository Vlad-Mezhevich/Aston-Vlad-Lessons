package Aston;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------Задание 1----------");
        System.out.print("Введите число: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number > 7) {8
                System.out.println("Hello");
            } else
                System.out.println("Вы ввели число - " + number);
        } else {
            System.out.println("Вы ввели не число");
        }
        scanner.close();
    }

}
