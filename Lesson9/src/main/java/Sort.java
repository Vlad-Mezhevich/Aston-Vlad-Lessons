import java.util.Arrays;

public class Sort {

    /**
     * 3. Задана коллекция, содержащая элементы "f10", "f15", "f2", "f4", "f4".
     * Необходимо отсортировать строки по возрастанию и добавить их в массив;
     */

    public static void main(String[] args) {
        String[] stringsCollection = {"f10", "f15", "f2", "f4", "f4"};
        // сортировка по возрастанию
        Arrays.sort(stringsCollection);
        System.out.println("Отсортированные строки " + Arrays.toString(stringsCollection));
    }

}
