package HomeworkLesson3;

import java.util.Arrays;

public class Main1 {

    // 1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
    public static void main(String[] args) {

        String[] array = {"сыр", "хлеб", "масло", "колбаса", "помидор"};
        System.out.println(Arrays.toString(array));
        doLesson_Array(array, 3, 4);

        System.out.println( );

        Integer[] integers = {50, 40, 30, 20, 10};
        System.out.println(Arrays.toString(integers));
        doLesson_ArrayWithoutTemp(integers, 0, 1);

    }

    private static void doLesson_ArrayWithoutTemp(Integer[] integers, int i, int j) {

        Integer a = integers[i];
        Integer b = integers[j];

        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;

        integers[i] = a;
        integers[j] = b;

        printArray(integers);
    }

    public static void doLesson_Array(Object[] array, int firstIndex, int secondIndex) {
        Object temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
        printArray(array);
    }

    private static void printArray(Object[] array) {
        System.out.println(Arrays.toString(array));
    }
}

