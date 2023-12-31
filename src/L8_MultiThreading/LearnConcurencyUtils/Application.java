package L8_MultiThreading.LearnConcurencyUtils;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;

public class Application {
    public static void main(String[] args) {
        BlockingDeque<Integer> questionQueue = (BlockingDeque<Integer>) new ArrayBlockingQueue<Integer>(5);
        Thread t1 = new Thread(new Producer(questionQueue));
        Thread t2 = new Thread(new Consumer(questionQueue));

        t1.start();
        t2.start();

    }
}
