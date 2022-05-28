package homeworkLesson4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordsArray {
    private String[] arrayWords;

    public WordsArray(String[] arrayWords) {
        this.arrayWords = arrayWords;
    }

    // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
    // Посчитать, сколько раз встречается каждое слово.


    private HashMap<String, Integer> getMapWords(String[] arrayWords) {
        HashMap<String, Integer> mapWords = new HashMap<>();
        for (int i = 0; i < arrayWords.length; i++) {
            if (mapWords.containsKey(arrayWords[i])) {
                mapWords.put(arrayWords[i], mapWords.get(arrayWords[i]) + 1);
                System.out.println(arrayWords[i] + "," + mapWords.get(arrayWords[i]));
            } else {
                mapWords.put(arrayWords[i], 1);
                System.out.println(arrayWords[i] + ",1");
            }
        }
        return mapWords;

    }

    public void doArrayWords() {
        HashMap<String, Integer> mapWords = getMapWords(arrayWords);
        for (Map.Entry entry : mapWords.entrySet()) {
            if (entry.getValue().equals(1)) {
                System.out.println(entry.getKey());
            }
        }

    }
}