package L7_Generics;
// class generics. Ca sa avem o class generica este nevoie sa specificam variabila.
//ex: string item1 => Object item1 <<sau public class Container (i1, i2) - i1 item1 si i2 item2;>>
// O class generics poate contine mai multe tipuri de date
public class G1_Container {
    Object item1;
    Object item2;

    public Object getItem1() {
        return item1;
    }

    public void setItem1(Object item1) {
        this.item1 = item1;
    }

    public Object getItem2() {
        return item2;
    }

    public void setItem2(Object item2) {
        this.item2 = item2;
    }

    public G1_Container(Object item1, Object item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public void printItems(){
        System.out.println("Printing Contents of container: ");
        System.out.println("Item 1: " + item1);
        System.out.println("Item 2: " + item2);
    }
}
