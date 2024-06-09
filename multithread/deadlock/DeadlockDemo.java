package deadlock;

public class DeadlockDemo implements Runnable {
    private ResourceA resourceA;
    private ResourceB resourceB;
    private boolean flag;

    public DeadlockDemo(ResourceA resourceA, ResourceB resourceB, boolean flag) {
        this.resourceA = resourceA;
        this.resourceB = resourceB;
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            resourceA.methodA(resourceB);
        } else {
            resourceB.methodB(resourceA);
        }
    }

    public static void main(String[] args) {
        ResourceA resourceA = new ResourceA();
        ResourceB resourceB = new ResourceB();

        Thread thread1 = new Thread(new DeadlockDemo(resourceA, resourceB, true), "Thread-1");
        Thread thread2 = new Thread(new DeadlockDemo(resourceA, resourceB, false), "Thread-2");

        thread1.start();
        thread2.start();
    }
}
