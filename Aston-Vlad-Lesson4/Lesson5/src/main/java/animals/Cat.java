package animals;

public class Cat extends Animals {


    private static int count;

    public Cat(String name, int age, Double weight, Color color, Double speedDistance, Double swimDistance, int appetite, boolean fullness) {
        super(name, age, weight, color, speedDistance, swimDistance, appetite, fullness);

        count++;
    }

    public static int getCountCat() {
        return count;
    }

    @Override
    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

    @Override
    public void run(double runDistance) {
        if (getSpeedDistance() < runDistance) {
            System.out.println(getName() + " не пробежал до конца" + (runDistance - getSpeedDistance()) + "м.");
        } else {
            System.out.println(getName() + " пробежал " + getSpeedDistance() +
                    "м., дистанцию необходимую проплыл " + runDistance + "м.");
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "Имя: " + getName() +
                " " + getColor() +
                ", Лет: " + getAge() +
                ", Вес: " + getWeight() + " кг." +
                ", Максимальная дистанция бега: " + getSpeedDistance() + " м." +
                ", Сытость: " + getFullness() +
                ", Кол-во порций: " + getAppetite() +
                '}';
    }

}
