package HomeworkLesson3;

import java.util.Arrays;

public class LessonFruits {

    // 2. Задача
    public static void main(String[] args) {
        doLesson_Fruits();
    }

    private static void doLesson_Fruits() {
        //Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
        //Класс Box, в который можно складывать фрукты (В коде он назван: BoxFruit);
        //Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        BoxFruit<Apple> appleBox = new BoxFruit<Apple>(1);
        BoxFruit<Orange> orangeBox = new BoxFruit<Orange>(1.5);
        BoxFruit<Apple> appleBox2 = new BoxFruit<Apple>(1);
        // вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
        for (int i = 0; i < 3; i++) {
            orangeBox.addFruit(new Orange());
            appleBox.addFruit(new Apple());
            appleBox2.addFruit(new Apple());
        }

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        appleBox2.addFruit(new Apple());


        System.out.println("Вес коробки с яблоками: " + appleBox.getBoxWeight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getBoxWeight());
        System.out.println("Равен ли их вес? (да - true/ нет - false):  " + appleBox.compare(orangeBox));
        System.out.println("---------------------------------------------");

        appleBox.addFruits(appleBox2);

    }

}
