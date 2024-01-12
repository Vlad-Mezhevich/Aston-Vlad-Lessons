package Aston;

import java.util.Scanner;

public class SolutionTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------Задание 2----------");
        System.out.print("Введите имя: ");
        String nameFirst = scanner.nextLine();
        String nameSecond = "Вячеслав";
        if (nameFirst.equals(nameSecond)) {
            System.out.println("Привет, " + nameSecond);
        } else {
            System.out.println("Нет такого имени " + nameFirst);
        }
        scanner.close();
    }

}
