package L6_Collections;

import java.util.Objects;

public class AnimalSet {
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalSet animal = (AnimalSet) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    int age;

    public AnimalSet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
