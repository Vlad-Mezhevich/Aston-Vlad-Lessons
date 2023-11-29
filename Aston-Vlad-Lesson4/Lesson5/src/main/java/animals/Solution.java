package animals;

import animals.*;
import animals.interfaces.ISwimmingable;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        int action;
        Animals[] animal = new Animals[4];
        animal[0] = new Cat("Барсик", 5, 6.2, Color.Black, 5.1, 0.0, 1, false);
        animal[1] = new Cat("Лелька", 3, 4.5, Color.Black, 340.2, 0.0, 1, false);
        animal[2] = new Dog("Мухтар", 3, 7.5, Color.Black, 302.0, 5.2);
        animal[3] = new Dog("Рыжик", 7, 8.2, Color.BlackWhite, 140.2, 8.3);

        for (Animals animals : animal) {
            System.out.println(animals);
        }
        System.out.println("Бег: ");
        System.out.println("----------------------------------------------------------------------");
        for (int i = 0; i < animal.length; i++) {
            animal[i].run(500);
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Плавание: ");
        System.out.println("----------------------------------------------------------------------");
        for (int i = 0; i < animal.length; i++) {
            try {
                ((ISwimmingable)animal[i]).swim(8);
            }
            catch (ClassCastException exception){
                System.out.println(animal[i].name + " не может плавать");
            }
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Общее количество животных " + Animals.getCountAnimals());
        System.out.println("Количество котов " + Cat.getCountCat());
        System.out.println("Количество собак " + Dog.getCountDog());
        System.out.println("----------------------------------------------------------------------");
        Animals[] cat = new Cat[2];
        cat[0] = new Cat("Лева", 5, 6.2, Color.Black, 65.2, 0.0, 5, false);
        cat[1] = new Cat("Бася", 3, 4.5, Color.Black, 300.2, 0.0, 4, false);
        Plate plate = new Plate(100);
        plate.info();
        for (int i = 0; i < cat.length; i++) {
            if (cat[i].fullness == false && cat[i].appetite < plate.food) {
                cat[i].eat(plate);
                cat[i].fullness = true;
                System.out.println("Котик " + cat[i].name + " покушал!");
            } else {
                System.out.println("Котик " + cat[i].name + " не поел!");
            }
        }
        plate.info();
        System.out.print("Добавить еду в миску (введите число) = ");
        Scanner scanner = new Scanner(System.in);
        action = scanner.nextInt();
        scanner.close();
        plate.increaseFood(action);
        plate.info();
    }

}
