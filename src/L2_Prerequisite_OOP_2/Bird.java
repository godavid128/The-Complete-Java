package L2_Prerequisite_OOP_2;

public class Bird extends Animals {
    public Bird(String name, int poids, int age, String couleur, String caracteristiquesSpeciales) {
        super(name, poids, age, couleur, caracteristiquesSpeciales);
    }

    @Override
    public void move() {
        System.out.println("Flapping wings...");
    }
    // override(trece peste) - inseamna ca aceasta metoda apelata in 'class Chicken" este inlocuita
//    public void fly(){
//        System.out.println("Flying...");
//    }

}
