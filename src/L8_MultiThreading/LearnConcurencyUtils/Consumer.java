package L8_MultiThreading.LearnConcurencyUtils;

import java.util.concurrent.BlockingDeque;

public class Consumer implements Runnable{
    BlockingDeque<Integer> questionQueue;

    public Consumer(BlockingDeque<Integer> questionQueue){
        this.questionQueue = questionQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println("Answered Question: " + questionQueue.take());
            } catch (InterruptedException e) {
            }
        }
    }
}
