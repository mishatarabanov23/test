package collection.arrayList;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        // в основе ArrayList лежит массив Object
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Misha");
        arrayList1.add("Kate");

        // сразу создали ArrayList размером 200 (возможно, но это не точно - это увеличит скорость добавления
        // элементов, если мы сразу знаем примерное их количество)
        // Default initial capacity == 10
        ArrayList<String> arrayList2 = new ArrayList<>(200);

        ArrayList<String> arrayList3 = new ArrayList<>(arrayList1);
        System.out.println(arrayList3);
        // естественно это разные ArrayList
        System.out.println(arrayList1 == arrayList3);

        ArrayList<Car> arrayList4 = new ArrayList<>();
        arrayList4.add(new Car());
    }
}

class Car{}
