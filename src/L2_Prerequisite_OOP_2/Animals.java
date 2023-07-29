package L2_Prerequisite_OOP_2;

public abstract class Animals {
    // definim atributele generale pt animale = caracteristicile
    String name;
    int poids;
    int age;
    String couleur;
    String caracteristiquesSpeciales;

    public Animals(String name, int poids, int age, String couleur, String caracteristiquesSpeciales) {
        this.name = name;
        this.poids = poids;
        this.age = age;
        this.couleur = couleur;
        this.caracteristiquesSpeciales = caracteristiquesSpeciales;
    }
    public void presentation(){
        System.out.println("Bonjour, je suis " + name);
        System.out.println("J'ai " + poids + " kilos");
        System.out.println("J'ai  " + age + " ans");
        System.out.println("Ma couleur prefere est " + couleur);
        System.out.println("et je suis unique dans le monde par: " + caracteristiquesSpeciales);
    }
    public void animauxHerbivores(){
        System.out.println("Je mange d'herbes partout ou je vais");
    }
    public void animauxCarnivores(){
        System.out.println("J'aime toujour la viande");
    }
    public void dormir(){
        System.out.println("Je suis une animal qui aime dormir");
    }
    public abstract void move();

}
