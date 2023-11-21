import exception.InvalidValueException;

public abstract class Animals {

    protected String name;
    protected Integer age;
    protected Double weight;
    protected Color color;
    protected Double speedDistance;
    protected Double swimDistance;
    protected int appetite;
    protected boolean fullness;
    private static int count;

    /**
     * Конструкторы
     * public Animals - пустой конструктор(создается при компиляции),
     * но так как есть другие конструкторы, необходимо вручную создавать, если необходимо)
     */
    public Animals(String name, Integer age, Double weight, Color color, Double speedDistance, Double swimDistance,int appetite,boolean fullness) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.speedDistance = speedDistance;
        this.swimDistance = swimDistance;
        this.appetite=appetite;
        this.fullness=fullness;
        count++;
    }

    /**
     * getName() - передача private полей в наследуемые классы, если бы поля имели модификацию
     * protected в этой задачи методы get необязательны.
     */

    public int getAppetite() {
        return appetite;
    }

    public boolean getFullness() {
        return fullness;
    }

    public static int getCountAnimals() {
        return count;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    public Double getSpeedDistance() {
        return speedDistance;
    }

    public Double getSwimDistance() {
        return swimDistance;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

    /**
     * dontSwim() - метод не умение плавать
     * swim(double swimDistance) - метод проплыть дистанцию, дистанция задается вручную;
     * run(double runDistance) - метод пробежать дистанцию, дистанция задается вручную;
     * toString() - вывод объекта класса Animals, можно переопределять в каждом наследуемом классе, соответсвенно
     * вывод будет меняться.
     */
    public void dontSwim() {
        System.out.println(getName() + " не умеет плавать");
    }

    public void swim(double swimDistance) {
        if (getSwimDistance() <= swimDistance) {
            System.out.println(getName() + " не проплыл " + swimDistance + "м., проплыл " + getSwimDistance() + "м.");
        } else {
            System.out.println(getName() + " проплыл");
        }
    }

    public void run(double runDistance) {
        if (getSpeedDistance() <= runDistance) {
            System.out.println(getName() + " не пробежал " + runDistance + "м., пробежал " + getSpeedDistance() + "м.");
        } else {
            System.out.println(getName() + " пробежал");
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

    /**
     * @param speedDistance максимальная дистанция пробега животного за 1 раз, создание исключений на дистанцию бега
     *                      не может быть больше 500 и меньше 5;
     */
    protected void chechMaxSpeed(double speedDistance) {
        if (speedDistance > 500) {
            throw new InvalidValueException("Перепроверьте максимальную дистанцию бега животного " + getName() +
                    ". Дистанция превышает на " + (1000 - speedDistance));
        } else if (speedDistance < 5) {
            throw new InvalidValueException("Дистанцию бега не можеты быть меньше 5" + speedDistance);
        }
    }

    /**
     * @param swimDistance максимальная дистанция проплыва животного за 1 раз, создание исключений на дистанцию бега
     *                     не может быть больше 100 и меньше 0;
     */
    protected void chechMaxSweem(double swimDistance) {
        if (swimDistance > 100) {
            throw new InvalidValueException("Перепроверьте максимальную дистанцию плавания животного " + getName() +
                    ". Дистанция превышает на " + (1000 - swimDistance));
        } else if (swimDistance < 0) {
            throw new InvalidValueException("Дистанцию бега не можеты быть меньше 0" + swimDistance);
        }
    }

}
