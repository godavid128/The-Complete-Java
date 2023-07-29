package L8_MultiThreading;

public class Sequence {
    private int value = 0;

    public synchronized int getNext() {
            value++;
            return value;
    }
}
