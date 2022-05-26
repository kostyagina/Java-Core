package HomeworkLesson3;

import java.util.ArrayList;

public class BoxFruit<F> {
    //Для хранения фруктов внутри коробки можно использовать ArrayList;
    private double weightFruit = 0.0;
    ArrayList<F> fruits = new ArrayList();

    public <F> BoxFruit(double weightFruit) {
        this.weightFruit = weightFruit;
    }

    public void addFruit(F fruit) {
        fruits.add(fruit);
    }

    public double getBoxWeight() {
        //Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
        // (Это метод в коде назван: getBoxWeight();
        return fruits.size() * weightFruit;
    }

    public boolean compare(BoxFruit<?> box) {
        //Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
        // которую подадут в compare() в качестве параметра.
        // true – если их массы равны, false в противоположном случае.
        // Можно сравнивать коробки с яблоками и апельсинами;
        return Math.abs(getBoxWeight() - box.getBoxWeight()) < 0.00001;
    }

    public void addFruits(BoxFruit<F> boxFruit) {
        //Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
        // Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
        // Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
        //Не забываем про метод добавления фрукта в коробку.
        System.out.println("Количество в коробке 1 до пересыпания фруктов: " + fruits.size());
        System.out.println("Количество в коробке 2 до пересыпания фруктов: " + boxFruit.fruits.size());
        fruits.addAll(boxFruit.fruits);
        boxFruit.fruits.clear();
        boxFruit.fruits.trimToSize();
        System.out.println("Количество в коробке 1 ПОСЛЕ пересыпания фруктов: " + fruits.size());
        System.out.println("Количество в коробке 2 ПОСЛЕ пересыпания фруктов: " + boxFruit.fruits.size());
    }

}
