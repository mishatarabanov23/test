package generics;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        // X x = new Y();
        // List<X> list = new ArrayList<Y>(); так работать не будет, потому что в совокупности ArrayList<Y>()
        // не является подклассом List<X>

//        List<Number> list = new ArrayList<Integer>();
//        list.add(18);
//        list.add(3.14);
    }
}

class X {}

class Y extends X {}
