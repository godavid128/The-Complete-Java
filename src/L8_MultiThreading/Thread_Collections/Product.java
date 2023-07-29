package L8_MultiThreading.Thread_Collections;

public class Product {
    int id;
    String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return "id; " + id + " | name; " + name;
    }
}
