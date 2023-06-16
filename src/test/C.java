package test;

public class C extends B {
    public C() {
        System.out.println("Конструктор класс C");
    }

    public C(int x) {
        super(x);
        System.out.println("Конструктор класс С");
    }
}
