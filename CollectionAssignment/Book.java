import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    int book_id;
    String book_name;
    String author_name;
    int published_year;
    public Book(int book_id, String book_name, String author_name, int published_year) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.author_name = author_name;
        this.published_year = published_year;
    }
}
class BookDemos{
    public static void main(String[] args) {
        ArrayList<Book> books=new ArrayList<>();
        addBook(books);
        System.out.println("-------Book Lists---------");
        for(Book book:books){
            System.out.println("Book Name: "+book.book_name);
            System.out.println("Book Author Name: "+book.author_name);
            System.out.println("Published Year: "+book.published_year);
        }
    }

    private static void addBook(ArrayList<Book> bookList) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many book are add: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter book "+(i+1)+" Details:- ");
            System.out.println("Enter the Book Id : ");
            int id=sc.nextInt();
            System.out.println("Enter the Book name");
            sc.nextLine();
            String bookName=sc.nextLine();
            System.out.println("Enter the book author name: ");
            String bookAuthor=sc.nextLine();
            System.out.println("Enter the published Year: ");
            int year=sc.nextInt();
            Book book=new Book(id,bookName,bookAuthor,year);
            bookList.add(book);
        }
    }
}