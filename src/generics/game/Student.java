package generics.game;

public class Student extends Participant {
    public Student(String name, int age) {
        super(name, age);
    }

    public String toString() {
        return "Student: " + getName() + ", " + getAge();
    }
}
