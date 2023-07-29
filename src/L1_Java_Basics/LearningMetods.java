package L1_Java_Basics;

public class LearningMetods {
    //void = vid, adica nu returneaza nimic
    public static void main(String[] args) {
        System.out.println("Text ca - argument");// println - e metoda. text din paranteze - e argumentul
        MyUtils.printSomeJunk(34);
        // Ca sa fie printat acest arg,
        // el tb sa fie utilizat in interior metodei
        MyUtils.printSomeJunk("- Objets anciens");
        MyUtils.sum2Numbers(10, 23);
        int myvar = MyUtils.add10(99)+1000;
        System.out.println(myvar);
    }


}
