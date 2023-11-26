import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        String path1 = "file1.csv";
        String path2 = "file2.csv";
        String[] header1 = {"Value1", "Value2", "Value3"};
        int[][] data1 = {
                {11, 12, 13},
                {21, 22, 23}};
        AppData table1 = new AppData(header1, data1);
        // Запишем информацию из объекта table1 в два файла
        table1.save(path1);
        table1.save(path2);
        // Теперь прочитаем данные, записанные в файлы
        AppData.readCSV(path1);
        AppData.readCSV(path2);
        /*
        Данные одинаковы
        Теперь запишем новые данные в файле file2.csv
        */
        String[] header2 = {"Value1", "Value2", "Value3", "Value4"};
        int[][] data2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        AppData table2 = new AppData(header2, data2);
        table2.save(path2);
        AppData.readCSV(path2);
    }

}
