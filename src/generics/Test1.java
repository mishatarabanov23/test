package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        // если мы не параметризируем List он будет содержать объекты класса Object
        // 2 причины использования generics: Type Safe && Reusable Code
        List list = new ArrayList();
        list.add(1);
        list.add(1);
        list.add("OK");

        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
    }
}
