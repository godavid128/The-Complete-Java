package L8_MultiThreading;

public class AppliThreading {
    public static void main(String[] args) {

        // creeam o instanta de clasa
        System.out.println("Starting Thread 1:");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("number: " + i + "-" + Thread.currentThread().getName());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        t1.start();

        System.out.println("Starting Thread 2: ");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("number: " + i + "-" + Thread.currentThread().getName());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        t2.start();

    }
}

//metoda Runnable = executa cod separat
// metoda Thread = executa cod filetat
class Task implements Runnable {
    String name;

    public Task(String name) {
        this.name = name;
    }

    public void run() {
    }
}
