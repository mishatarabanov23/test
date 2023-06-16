package comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// благодаря интерфейсу Comparable мы создаем одну базовую сортировку, но каждый раз под другое поле
// менять метод compareTo неудобно, поэтому мы для полей Name & Salary создали Comparator

public class Test2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee(3, "Misha", "Tarabanov", 10000);
        Employee employee2 = new Employee(1, "Kate", "Kobzar", 13000);
        Employee employee3 = new Employee(2, "Mark", "Markovich", 1000);
        Employee employee4 = new Employee(2, "Kate", "Tarabanova", 1000);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        System.out.println("Before sorting \n" + employees + "\nAfter sorting");
        Collections.sort(employees);
        System.out.println(employees);

        // public static <T extends Comparable<? super T>> void sort(List<T> list)
        // public static <T> void sort(List<T> list, Comparator<? super T> c)

        // можно не создавать отдельно класс SalaryComparator, можно использовать анонимный класс
        // или лямба-выражения, но об этом позже)
    }
}

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String surname;
    private int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    // Compares this object with the specified object for order. Returns a negative integer, zero,
    // or a positive integer as this object is less than, equal to, or greater than the specified object.
    // this писать необязательно, там где он не нужен
    @Override
    public int compareTo(Employee o) {
                //  way1
//        if (id == o.id)
//            return 0;
//
//        return id > o.id ? 1 : -1;

                //  way2 !!!
//        return id - o.id;

                //  way3 !!!
        return Integer.compare(id, o.id);

                //  if you need to compare by field "Name" and then by field "surname"
//        if (name.compareTo(o.name) == 0)
//            return surname.compareTo(o.surname);
//
//        return name.compareTo(o.name);
}

//class IdComparator implements Comparator<Employee> {
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return Integer.compare(o1.getId(), o2.getId());
//    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }
}

//    Принципиальное различие в том, что в Comparable "зашит" один-единственный алгоритм сравнения объектов,
//    в то время как Comparator представляет собой внешнюю заменяемую настройку.
//    Архитектурно, Comparable - это интерфейс значения, в то время как Comparator - настройка контейнера.
//    Следует использовать Comparable в том случае, когда задается естественный (наиболее логичный) порядок.
//    Например, для строк это регистрозависимое лексикографическое сравнение,
//    а для длинных чисел - сравнение по значению.
//    Во всех остальных случаях - без отдельного компаратора не обойтись.

//    Comparator и Comparable - это оба интерфейсы
//    Коллекция (ну хорошо, объект) является Comparable, когда объект может быть как то сравнен с другим
//    объектом.
//    Comparator, в отличие от этого — это способ сравнения объектов.
//    Пример: школьники на уроке физкультуры, физрук говорит: строиться по росту! - ученики быстренько
//    сравнивают свои росты и строятся - кто выше вперед, кто ниже в хвост строя - это пример
//    реализации Comparable, где в качестве compareTo(сосед) используется рост учеников.
//    Второй пример: те же школьники. Директор дает задание учителю математики сравнить учеников по
//    успеваемости. Математичка берет журнал и сравнивает учеников по успеваемости - здесь работает
//    compare(ученик1, ученик2) - Comparator'ом выступает математичка.
//    Аналогично компаратором может выступить химичка или трудовик.

