package methodoverloadAndmethodOverride;

class Movie{
    void movie(){
        System.out.println("Generic Movie...");
    }
}
class HorrorMovie extends Movie{
    void movie(){
        System.out.println("Horror Movie...");
    }
}
class CartoonMovie extends Movie{
    void movie(){
        System.out.println("Cartoon Movie...");
    }
}
public class MovieDemo {
    public static void main(String[] args) {
        Movie h=new HorrorMovie();
        Movie c=new CartoonMovie();
        h.movie();
        c.movie();
    }
}
