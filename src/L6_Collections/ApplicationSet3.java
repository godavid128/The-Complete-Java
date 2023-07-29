package L6_Collections;

import java.util.HashSet;

public class ApplicationSet3 {
    public static void main(String[] args) {
        HashSet<Integer> values = new HashSet<Integer>();
        values.add(12);
        values.add(43);
        values.add(15);
        values.add(67);
        // set nu accepta dublura
        values.add(43);
        for (Integer value: values){
            System.out.println(value);
        }

        HashSet<AnimalSet> animals = new HashSet<AnimalSet>();
        AnimalSet animal1 = new AnimalSet("Dog", 12);
        AnimalSet animal2 = new AnimalSet("Cat", 8);
        AnimalSet animal3 = new AnimalSet("Bird", 3);
        AnimalSet animal4 = new AnimalSet("Dog", 12);
        AnimalSet animal5 = new AnimalSet("Kangoroo", 24);
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        animals.add(animal5);

        System.out.println(animal1.equals(animal4));
        for (AnimalSet value: animals){
            System.out.println(value);
        }
    }
}
