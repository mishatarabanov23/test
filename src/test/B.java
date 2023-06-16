package test;

public class B extends A {
    public B() {
        System.out.println("Конструктор класса B");
    }

    public B(int x) {
        super(x);
        System.out.println("Конструктор класс В");
    }
}
