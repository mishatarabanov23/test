package collection.arrayList;

import java.util.ArrayList;
import java.util.Objects;

public class Methods2 {
    public static void main(String[] args) {
        Student student = new Student("Misha", 'M', 24, 5, 4.8);
        Student student2 = new Student("Kate", 'F', 23, 4, 4.7);
        Student student3 = new Student("Felipe", 'M', 23, 2, 3.8);
        Student student4 = new Student("Nico", 'M', 22, 3, 2.5);
        Student student5 = new Student("Lara", 'F', 21, 6, 5.1);
        Student student6 = new Student("Lara", 'F', 21, 6, 5.1);

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(student);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        studentArrayList.add(student5);

        // student6 не удалился из ArrayList, потому что student5 == student6 возвращает false, они ссылаются на
        // разные объекты, поэтому нужно переопределить метод equals
        studentArrayList.remove(student6);

        System.out.println(studentArrayList);
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age && course == student.course &&
                Double.compare(student.avgGrade, avgGrade) == 0 && Objects.equals(name, student.name);
    }
}
