package L6_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ApplicationArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Lion");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");
//        // Folosim for pentru a parcurge toata lista si sa imprimam datele
//        for (int i = 0; i < animals.size(); i++){
//            System.out.println(animals.get(i));
//        }
//        // For each loop
//        for (String value: animals){
//            System.out.println(value);
//        }
        LinkedList<Vehicle> vehicles = new LinkedList<>();
        Vehicle vehicle2 = new Vehicle("--Toyota", "Cambry", 120, false);
        vehicles.add(new Vehicle("--Honda", "Accord", 1200, false));
        vehicles.add(vehicle2);
        vehicles.add(new Vehicle("--Jeep", "Wrangler", 2500, true));
//        for (Vehicle car: vehicles) {
//            System.out.println(car);
//        }
        printElements(vehicles);
        printElements(animals);
    }
    public static void printElements(List someList){
        for (int i = 0; i< someList.size(); i++){
            System.out.println(someList.get(i));
        }
    }
}
