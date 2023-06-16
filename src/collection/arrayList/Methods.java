package collection.arrayList;

import java.util.ArrayList;

public class Methods {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Misha");
        arrayList1.add("Kate");
        arrayList1.add("Braun");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Maria");
        arrayList2.add("Ivan");
        arrayList2.add("Ludmila");
        arrayList2.add("Valentina");

        // add() --> boolean
        arrayList1.add(0, "Alex");

        // get() --> boolean
        System.out.println(arrayList1.get(1));

        // set() Replaces the element at the specified position in this list with the specified element.
        arrayList1.set(2, "new Kate");
        System.out.println(arrayList1);

        // remove (int index) Removes the element at the specified position in this list.
        // Shifts any subsequent elements to the left (subtracts one from their indices). --> E element
        String str = arrayList1.remove(2);
        System.out.println(str);

        // remove (Object o) Removes the first occurrence of the specified element from this list, if it is present.
        // If the list does not contain the element, it is unchanged. --> boolean
        if (arrayList1.remove("Alex"))
            System.out.println("Удалили Alex");
        System.out.println(arrayList1);
        System.out.println("Misha");
    }
}
