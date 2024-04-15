import java.util.ArrayList;

public class CircularBuffer {
    int maxSize;
    ArrayList<String> buffer;
    int currentIndex;
    CircularBuffer(int maxSize){
        this.maxSize=maxSize;
        buffer=new ArrayList<>(maxSize);
        currentIndex=0;
    }

    public void addMessage(String s) {
        if(buffer.size()>=maxSize){
            buffer.set(currentIndex,s);
        }
        else
            buffer.add(s);
        currentIndex=(currentIndex+1)%maxSize;
    }

    public void printMessage() {
        for(String msg:buffer){
            System.out.println(msg);
        }
    }
}
class CircularDemo{
    public static void main(String[] args) {
        CircularBuffer cd=new CircularBuffer(5);
        cd.addMessage("Message 1");
        cd.addMessage("Message 2");
        cd.addMessage("Message 3");
        cd.addMessage("Message 4");
        cd.addMessage("Message 5");
        cd.addMessage("Message 6");
        cd.addMessage("Message 7");
        cd.printMessage();
    }
}
