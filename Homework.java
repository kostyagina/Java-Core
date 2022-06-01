package homeworkLesson5;

import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        AppData data = new AppData();
        data.readFromFile("file.csv"); //1. Реализовать сохранение данных в csv файл;
        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.deepToString(data.getData()));

        data.writeToCSV("new_file.csv"); //2. Реализовать загрузку данных из csv файла. Файл читается целиком.
    }

}

//Пример:
//Value 1;Value 2;Value 3
//100;200;123
//300,400,500

//Если выполняется save(AppData data), то старые данные в файле полностью перезаписываются.