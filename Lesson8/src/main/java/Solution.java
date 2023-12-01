import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {

        Map<String, Integer> wordCounts = getStringIntegerMap();
        List<String> uniqueWords = new ArrayList<>(wordCounts.keySet());
        // Выводим слов
        System.out.println("args = " + uniqueWords);
        System.out.println("args = " + wordCounts);
        System.out.println();
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Федя", "124-45-78");
        phoneBook.add("Григорий", "432-61-32");
        phoneBook.add("Федя", "124-42-78");
        phoneBook.add("Сидоров", "666-66-66");
        phoneBook.add("Григорий", "545-88-12");
        // Поиск телефона по фамилии
        System.out.println("Телефон Федин: " + phoneBook.get("Федя"));
        System.out.println("Телефоны Григория: " + phoneBook.get("Григорий"));
        System.out.println("Телефоны Сидорова: " + phoneBook.get("Сидоров"));

    }

    private static Map<String, Integer> getStringIntegerMap() {
        String[] wordsArray = {"baldurs", "gate", "three", "civilization", "phone",
                "captain", "commander", "gate", "three", "civilization", "gunner",
                "stellaris", "factory", "commander", "winter", "year", "tesla",
                "spring", "metal", "baldurs"};
        // Находим уникальные слова и считаем их колличество
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : wordsArray) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        return wordCounts;
    }

}
