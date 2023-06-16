package generics;

import java.util.ArrayList;

public class TypeErasureDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // как видит это всё JVM ArrayList list = new ArrayList();
        // int i = (Integer) list.get(0); потому что без кастинга возвращается object
        // этот процесс называется type erasure (стирание типов)

    }
}
