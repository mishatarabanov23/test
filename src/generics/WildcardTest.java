package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WildcardTest {
    public static void main(String[] args) {
        ArrayList<? extends Number> arrayList = new ArrayList<Integer>();
        ArrayList<? super Number> arrayList1 = new ArrayList<Object>();

        // так писать не может, потому что ArrayList<Integer> не является подтипом для List<Number>
        // List<Number> list = new ArrayList<Integer>();
        // List<Object> list2 = new ArrayList<Integer>();

        // а так можем, получается, что List<?> явяляется супертипом для всех List
        // знак ? означает, что может быть подставлен любой класс
        List<?> list3 = new ArrayList<>();
//        list3.add("Hello"); в такие листы компилятор ничего не может добавить
//        list3.add(3); здесь проявляется один из принципов дженериков - Type Safe
        // когда мы используем wildcards мы не можем вызывать методы, которые изменяют наш объект
        showListInfo(list3);

        ArrayList<Double> list4 = new ArrayList<>();
        list4.add(3.14);
        list4.add(3.15);
        list4.add(3.16);
        showListInfo(list4);

        List<String> list5 = new ArrayList<>();
        list5.add("Hello");
        list5.add("World");
        list5.add("!");
        showListInfo(list5);

        // bounded wildcards
        List<? extends Number> list6 = new ArrayList<Integer>();

        System.out.println(sumArrayList(list4));

    }

    // в этом методе в параметрах мы можем указать совершенно любой лист
    public static void showListInfo(List<?> list) {
        System.out.println("Лист содержит: " + list);
    }

    // создадим метод, который находит сумму ArrayList, если он Number
    public static double sumArrayList(ArrayList<? extends Number> list) {
        double sum = 0;
        for (Number number : list)
            sum += number.doubleValue();

        return sum;
    }
}
