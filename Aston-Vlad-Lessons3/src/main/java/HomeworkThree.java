import java.util.Arrays;

public class HomeworkThree {

    public static void main(String[] args) {
        int[] arrayFirst = new int[]{1, 5, 0, 3, 1, 49, 0, 5};
        int[] arraySecond = new int[100];
        int[] arrayThree = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        checkSum(5, 6);
        printStrings("Привет мир!", 2);
        checkNumber(-1);
        checkNumberTrueFalse(1);
        System.out.println(checkLeapYear(2016));
        for (int i = 0; i < arrayFirst.length; i++) {
            if (arrayFirst[i] == 1) {
                arrayFirst[i] = 0;
            } else if (arrayFirst[i] == 0) {
                arrayFirst[i] = 1;
            }
        }
        printArray(arrayFirst);
        for (int i = 0; i <= arraySecond.length - 1; i++) {
            for (int j = 1; j <= 100; j++) {
                arraySecond[i] = j;
                i++;
            }
        }
        printArray(arraySecond);
        for (int i = 0; i < arrayThree.length; i++) {
            if (arrayThree[i] < 6) {
                arrayThree[i] *= 2;
            }
        }
        printArray(arrayThree);
        System.out.println(Arrays.toString(initiativeArray(10, 2)));
        diagonalArray(3, 3);
    }

    public static void checkSum(int numberFirst, int numberSecond) {
        int sum = numberFirst + numberSecond;
        if (sum >= 10 && sum <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void printStrings(String text, int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(text);
        }
    }

    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        }
    }

    public static void checkNumberTrueFalse(int number) {
        if (number >= 0) {
            System.out.println(String.format("Число %d - False", number));
        } else {
            System.out.println(String.format("Число %d - True", number));
        }
    }

    public static boolean checkLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void diagonalArray(int line, int height) {
        int[][] array = new int[line][height];
        int i;
        for (i = 0; i < array.length; i++) {
            array[i][array.length - i - 1] = 1;
        }
        for (i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][i] = 1;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] initiativeArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = initialValue;
        }
        return array;
    }

}
