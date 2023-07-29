package L2_Prerequisite_OOP_2;

public class Sparrow extends Bird implements Flyable{
    public Sparrow(String name, int poids, int age, String couleur, String caracteristiquesSpeciales) {
        super(name, poids, age, couleur, caracteristiquesSpeciales);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flying high...");
    }
}
