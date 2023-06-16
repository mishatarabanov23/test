package generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Misha");
        Info<String> info2 = new Info<>("Katya");
        System.out.println(info1);
        System.out.println(info2);
        System.out.println(info1.getValue());

        Info<Integer> info3 = new Info<>(24);
        System.out.println(info3);
        System.out.println(info3.getValue());
    }

    // JVM видит следующее: public void test(Info info), поэтому overloading так не работает
//    public void test(Info<String> info) {
//        System.out.println(info.getValue());
//    }
//
//    public void test(Info<Integer> info) {
//        System.out.println(info.getValue());
//    }
}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{[" + value + "]}";
    }
}

class Parent {
    public void test(Info<String> info) {
        System.out.println(info.getValue());
    }
}

// делать overriding так тоже нельзя, потому что возникает type erasure
//class Child extends Parent {
//    @Override
//    public void test(Info<Integer> info) {
//        System.out.println(info.getValue());
//    }
//}
