package L8_MultiThreading.Thread_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {
    List<Product> soldProductsList = new CopyOnWriteArrayList<>();
    List<Product> purchasedProductsList = new ArrayList<Product>();

    Vector vector = new Vector();


    public void populateSoldProducts(){
        for (int i = 0; i<1000; i++){
            Product prod = new Product(i, "test_product_" + i);
            soldProductsList.add(prod);
            System.out.println("Added: " + prod);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void  displaySoldProduct(){
        for (Product product: soldProductsList){
            System.out.println("PRINTING THE SOLD: " + product);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
