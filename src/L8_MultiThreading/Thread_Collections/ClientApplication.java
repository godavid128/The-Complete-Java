package L8_MultiThreading.Thread_Collections;

public class ClientApplication {
    public static void main(String[] args) throws InterruptedException {
        InventoryManager manager = new InventoryManager();

        Thread inventoryTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.populateSoldProducts();
            }
        });
        Thread displayTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.displaySoldProduct();
            }
        });
        inventoryTask.start();
        Thread.sleep(2000);
        displayTask.start();

    }
}
