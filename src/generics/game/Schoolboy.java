package generics.game;

public class Schoolboy extends Participant {
    public Schoolboy(String name, int age) {
        super(name, age);
    }

    public String toString() {
        return "Schoolboy: " + getName() + ", " + getAge();
    }
}
