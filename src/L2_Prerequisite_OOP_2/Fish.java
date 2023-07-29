package L2_Prerequisite_OOP_2;

public class Fish extends Animals{
    public Fish(String name, int poids, int age, String couleur, String caracteristiquesSpeciales) {
        super(name, poids, age, couleur, caracteristiquesSpeciales);
    }

    public void swim(){
        System.out.println("Swimming...");
    }

    @Override
    public void move() {
        System.out.println("Fish is swimmming...");
    }
}
