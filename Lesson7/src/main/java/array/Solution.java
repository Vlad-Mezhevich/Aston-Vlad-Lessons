package array;

import exception.MyArrayDataException;
import exception.MyArraySizeException;

public class Solution {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "2", "2"},
                {"1", "2", "0", "2"},
                {"1", "2", "2", "1"},
                {"1", "2", "2", "0"}
        };
        try {
            int result = calculateArraySum(array);
            System.out.println("Сумма элементов массива " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка " + e.getMessage());
        }
    }

    /**
    метода calculateArraySum выполняет проверку размера массива и суммирует его элементы,
    бросая соответствующие исключения в случае ошибок.
     */
    public static int calculateArraySum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int rows = array.length;
        int columns = array[0].length;
        int sum = 0;
        if (rows != 4 || columns != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4х4");
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    // В случае ошибки преобразования бросаем исключение с информацией о ячейке
                    throw new MyArrayDataException("Неверные данные в ячейке " + i + " " + j);
                }
            }
        }
        return sum;
    }

}
