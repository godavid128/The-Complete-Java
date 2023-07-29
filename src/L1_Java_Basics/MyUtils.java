package L1_Java_Basics;

public class MyUtils {
    public static void printSomeJunk(String argument){ // printeaza niste vechituri
        System.out.println("Armoire, lit et tapis " + argument);
    }
    public static void printSomeJunk(int argument){ // printeaza niste vechituri
        System.out.println("Integer passed in: " + argument);
    }
    public static void sum2Numbers(int firsArg, int secondArg){
        System.out.println(firsArg+secondArg);
    }
    public static int add10(int someArgument){
        int result = someArgument+10;
        return result;
    }
    // cuv cheie 'public' - inseamna ca putem accesa metodele din orice alta clasa creata in proiectul ns.
    // cuva cheie 'private - ins ca putem accesa metodele doar local.
    // - O 'class private' poate fi accesata doar din orice class creata in interiorul package ns.(ex. java_basics)
    // - O 'metod private' poate fi accesata din orice clasa din interiorul proiectului ns
    // cuv cheie 'static' -
    // ctrl + sift + O - sterge orice importuri nefolosite in proiect

}
