package printer;

public class Printer {
    public void printDocument(String name){
        synchronized(this) {
            System.out.println("Printing document: " + name);
            // Simulate time taken to print
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Document printed: " + name);
        }
    }
}
