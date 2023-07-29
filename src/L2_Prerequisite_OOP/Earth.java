package L2_Prerequisite_OOP;

public class Earth {
    public static void main(String args[]) {
        // 'Human tom' este o variabila si obiectul este creeat in timpul executiei
        // este o variabila d'instanta
        // creeam obiectul human
        Human human1 = new Human("Tom", 25, 76, "blue");
        Human human2 = new Human("Joe", 28, 68, "green");
        // Apelam metodele create in class Human
        human1.speak();
        human2.speak();

    }
}
