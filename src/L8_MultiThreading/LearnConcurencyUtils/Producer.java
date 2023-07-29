package L8_MultiThreading.LearnConcurencyUtils;

import java.util.concurrent.BlockingDeque;

public class Producer implements Runnable {
    int questionNo;
    BlockingDeque<Integer> questionQueue;

    public Producer(BlockingDeque<Integer> questionQueue) {
        this.questionQueue = questionQueue;
    }
    @Override
    public void run() {
        while (true) {
            try {
                synchronized (this) {
                    int nextQuestion = questionNo++;
                    System.out.println("Got new Question: " + nextQuestion);
                    questionQueue.put(nextQuestion);
                }
            } catch (InterruptedException e) {
            }
        }
    }
}
