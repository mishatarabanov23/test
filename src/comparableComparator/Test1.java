package comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Misha");
        list.add("Kate");
        list.add("Mark");
                            //      Comparable
        // This interface imposes a total ordering on the objects of each class that implements it.
        // This ordering is referred to as the class's natural ordering, and the class's compareTo method
        // is referred to as its natural comparison method.
        // The natural ordering for a class C is said to be consistent with equals if and only if
        // e1.compareTo(e2) == 0 has the same boolean value as e1.equals(e2) for every e1 and e2 of class C.
        // Note that null is not an instance of any class, and e.compareTo(null)
        // should throw a NullPointerException even though e.equals(null) returns false.

                            //      Sort
        // Sorts the specified list into ascending order, according to the natural ordering of its elements.
        // All elements in the list must implement the Comparable interface.
        // Furthermore, all elements in the list must be mutually comparable (that is, e1.compareTo(e2)
        // must not throw a ClassCastException for any elements e1 and e2 in the list).

        System.out.println("Перед сортировкой");
        System.out.println(list);
        System.out.println("После сортировки");
        Collections.sort(list);
        System.out.println(list);
    }
}
