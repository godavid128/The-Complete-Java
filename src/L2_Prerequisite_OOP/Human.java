package L2_Prerequisite_OOP;

public class Human {
    // Aici definim cateva caracteristici umane de baza, cateva atribute care simplifica lucrurile
    // ex: numele, anii, inaltimea, culoarea ochilor.
    // Aceste atribute definite vor sta la baza oricarui obiect creat in aceasta clasa
    String name;
    int age;
    int heithtInInches;
    String eyeColor;
    // Aici am generat constructorul: Click dreapta -  generate - constructor
    public Human(String name, int age, int heithtInInches, String eyeColor) {
        this.name = name;
        this.age = age;
        this.heithtInInches = heithtInInches;
        this.eyeColor = eyeColor;
    }
    // Aici definim cateva comportamente de baza a omului (vorbeste, mananca, lucreaza si merge)
    // Metodele class care sunt definite aici sunt instructiunile pentru comportamentul uman.
    //
    public void speak(){
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + heithtInInches + " inches tall");
        System.out.println("I am " + age + " years old");
        System.out.println("My eye color is " + eyeColor);
    }
    public void eat(){
        System.out.println("eating...");
    }
    public void walk(){
        System.out.println("walking...");
    }
    public void work(){
        System.out.println("working...");
    }

}
