package collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Methods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Misha");
        arrayList1.add("Katya");
        arrayList1.add("Ivan");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");

        // addAll: Appends all of the elements in the specified collection to the end of this list
        System.out.println(arrayList1);
        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);

        arrayList1.addAll(0, arrayList2);
        System.out.println(arrayList1);

        // indexOf: Returns the index of the first occurrence of the specified element in this list,
        // or -1 if this list does not contain the element.
        // lastIndexOf: Returns the index of the last occurrence of the specified element in this list,
        // or -1 if this list does not contain the element.
        System.out.println(arrayList1.indexOf("Misha"));
        System.out.println(arrayList1.lastIndexOf("???"));

        // clear: Removes all of the elements from this list. The list will be empty after this call returns.
        arrayList1.clear();
        arrayList2.clear();
        System.out.println(arrayList1.isEmpty());

        arrayList1.add("Misha");
        arrayList1.add("Katya");
        arrayList1.add("Ivan");

        arrayList2.add("Misha");
        arrayList2.add("Katya");
        arrayList2.add("Kolya");

        // remove: Removes from this list all of its elements that are contained in the specified collection.
        arrayList1.removeAll(arrayList2);
        System.out.println(arrayList1);

        // retain: Retains only the elements in this list that are contained in the specified collection.
        // In other words, removes from this list all of its elements that are not contained
        // in the specified collection
        arrayList1.add("Misha");
        arrayList1.add("Katya");
        arrayList1.retainAll(arrayList2);

        arrayList1.clear();
        arrayList2.clear();
        arrayList1.add("Misha");
        arrayList1.add("Katya");
        arrayList1.add("Ivan");
        arrayList2.add("Misha");
        arrayList2.add("Katya");
        System.out.println(arrayList1);
        System.out.println(arrayList2);

        // Returns true if this list contains the specified element
        boolean result = arrayList1.contains("Misha");
        System.out.println(result);
        // Returns true if this collection contains all of the elements in the specified collection.
        result = arrayList1.containsAll(arrayList2);
        System.out.println(result);
        arrayList2.clear();

        List<String> list = arrayList1.subList(1, 3);
        System.out.println(list);
        list.add("Fedor");
        System.out.println(arrayList1);
        System.out.println(list);
    }
}
