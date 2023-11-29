package animals;

import animals.exception.InvalidValueException;

public class Plate {

    public int food;

    public Plate(int food) {
        foodPlate(food);
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void increaseFood(int x) {
        food += x;
    }

    public void info() {
        System.out.println("Всего еды: " + food);
    }

    protected void foodPlate(int food) {
        if (food < 0) {
            throw new InvalidValueException("В тарелке не может быть отрицательное значение " + food);
        } else {
            this.food = food;
        }
    }
}
