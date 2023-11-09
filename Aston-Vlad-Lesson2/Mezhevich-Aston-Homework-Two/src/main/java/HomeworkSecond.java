public class HomeworkSecond {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple\n");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 2;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная\n");
        } else {
            System.out.println("Сумма отрицательная\n");
        }
    }

    public static void printColor() {
        int value = 55;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый\n");
        } else {
            System.out.println("Зеленый\n");
        }
    }

    public static void compareNumbers() {
        int a = 3441;
        int b = 511;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

}
