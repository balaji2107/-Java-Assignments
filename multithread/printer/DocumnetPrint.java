package printer;

public class DocumnetPrint {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread thread1 = new Thread(new PrintTask(printer, "Document1"));
        Thread thread2 = new Thread(new PrintTask(printer, "Document2"));
        Thread thread3 = new Thread(new PrintTask(printer, "Document3"));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
