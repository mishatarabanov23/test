package collection.arrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Methods4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder sb5 = new StringBuilder("E");

//        Returns a fixed-size list backed by the specified array.
//        Changes made to the array will be visible in the returned list,
//        and changes made to the list will be visible in the array.
        StringBuilder[] array = {sb1, sb2, sb3, sb4, sb5};
        List<StringBuilder> list = Arrays.asList(array);

        System.out.println(Arrays.toString(array));
        System.out.println(list);

        list.set(1, new StringBuilder("F"));
        System.out.println(Arrays.toString(array));
        System.out.println(list);

        // массив и лист ссылаются на одни и те же объекты
        System.out.println(list.get(0) == array[0]);
    }
}
