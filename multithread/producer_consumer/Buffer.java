package producer_consumer;

public class Buffer {
    private int value;
    private boolean hasValue = false;

    public synchronized void put(int value) {
        while (hasValue) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
        this.value = value;
        hasValue = true;
        System.out.println("Produced: " + value);
        notifyAll();
    }

    public synchronized int get() {
        while (!hasValue) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
        hasValue = false;
        System.out.println("Consumed: " + value);
        notifyAll();
        return value;
    }
}
