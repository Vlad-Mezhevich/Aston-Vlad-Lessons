package animals;

import animals.interfaces.ISwimmingable;

public class Dog extends Animals implements ISwimmingable {

    private static int count;

    public Dog(String name, int age, Double weight, Color color, Double speedDistance, Double swimDistance) {
        super(name, age, weight, color, speedDistance, swimDistance, 0, false);
        count++;
    }

    public static int getCountDog() {
        return count;
    }

    @Override
    public void swim(double swimDistance) {
        if (getSwimDistance() < swimDistance) {
            System.out.println(getName() + " не проплыл " + swimDistance + "м., проплыл " + getSwimDistance() + "м.");
        } else {
            System.out.println(getName() + " проплыл " + getSwimDistance() +
                    "м., дистанцию необходимую проплыл " + swimDistance + "м.");
        }
    }

    @Override
    public void run(double runDistance) {
        if (getSpeedDistance() < runDistance) {
            System.out.println(getName() + " не пробежал " + runDistance +
                    "м., пробежал " + getSpeedDistance() + "м.");
        } else {
            System.out.println(getName() + " пробежал " + getSpeedDistance() +
                    "м., дистанцию необходимую пробежать " + runDistance + "м.");
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "Имя: " + name +
                " " + color +
                ", Лет: " + age +
                ", Вес: " + weight + " кг." +
                ", Максимальная дистанция бега " + speedDistance + " м." +
                ", Максимальная дистанция по воде " + swimDistance + " м." +
                '}';
    }

}
