package generics;

import java.util.ArrayList;
import java.util.List;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        int tmp = getSecondElement(list);
        System.out.println(tmp);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");

        String tmp2 = getSecondElement(list2);
        System.out.println(tmp2);


        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        Cat cat = new Cat();
        ArrayList<Animal> list3 = new ArrayList<>();
        list3.add(animal1);
        list3.add(animal2);
        list3.add(cat);
        System.out.println(getSecondAnimal(list3));
    }

    public static <T> T getSecondElement(ArrayList<T> list) {
        return list.get(1);
    }

    public static <S extends Animal> S getSecondAnimal(ArrayList<S> list) {
        return list.get(2);
    }
}

class Test<V> {
    // если класс параметризированный, то нам не нужно перед возвращаемым типом указывать <V>
    public V abc(V val) {
        return val;
    }
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

interface i1{}
interface i2{}

class Test3<U extends Number & i1 & i2>{}


