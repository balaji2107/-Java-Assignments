import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RandomSequencialAccess {
    public static void main(String[] args) {
        ArrayList<Integer> listDefault=new ArrayList<>();
        ArrayList<Integer> listCapacity=new ArrayList<>(1000);
        RandomSequencialAccess access=new RandomSequencialAccess();
        access.insertElement(listCapacity);
        access.insertElement(listDefault);
        access.performanceTest(listDefault);
        access.performanceTest(listCapacity);

    }

    public void insertElement(List<Integer> list){
        for(int i=0;i<1000;i++){
            list.add(i+1);
        }
    }

    public void performanceTest(List<Integer> list){
        long random=0;
        long sequenecial =0;
        long start=0;
        long end=0;
        int i=0;
        start=System.nanoTime();
        while (i<1000){
            list.get(i++);
        }
        end=System.nanoTime();
        random=end-start;
        Iterator<Integer> iterator =list.iterator();
        start=System.nanoTime();
        while (iterator.hasNext()){
            iterator.next();
        }
        end=System.nanoTime();
        sequenecial=end-start;
        System.out.println("Random "+random+" Sequencial "+sequenecial+" "+(random>sequenecial?"Sequencial wins":"Random Wins"));
    }
}
