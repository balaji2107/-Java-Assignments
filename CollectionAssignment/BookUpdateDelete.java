import java.util.ArrayList;
import java.util.Scanner;

class BookDemo {
    int book_id;
    String book_name;
    String author_name;
    int published_year;
    public BookDemo(int book_id, String book_name, String author_name, int published_year) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.author_name = author_name;
        this.published_year = published_year;
    }
    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }
    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }
    public void setPublished_year(int published_year) {
        this.published_year = published_year;
    }
}
public class BookUpdateDelete{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<BookDemo> books=new ArrayList<>();
        while (true) {
            System.out.println("Enter the choice: ");
            System.out.println("1. Add Book\n2. Update Book\n3. Delete Boook\n4. View Book\n5. Exit");
            int choice= sc.nextInt();
            switch (choice){
                case 1:
                    addBook(books);
                    break;
                case 2:
                    updateBook(books);
                    break;
                case 3:
                    deleteBook(books);
                    break;
                case 4:
                    viewBook(books);
                    break;
                case 5:
                    System.out.println("----Thank You!------");
                    return;
                default:
                    System.out.println("Please Enter Valid input");
            }

        }

    }

    private static void updateBook(ArrayList<BookDemo> books) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the book Id which book can be update: ");
        int bookId=sc.nextInt();
        BookDemo bookDemo=null;
        for(BookDemo book:books){
            if(book.book_id==bookId){
                bookDemo=book;
                break;
            }
        }
        if(bookDemo!=null) {
            System.out.println("Please enter the choice Which column can be update");
            System.out.println("1. Book Name\n2. Author name\n3. Published Year");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Book Name: ");
                    sc.nextLine();
                    String bookName=sc.nextLine();
                    bookDemo.setBook_name(bookName);
                    System.out.println("'"+bookName+"' Update successfully");
                    break;
                case 2:
                    System.out.println("Enter the Book Author Name: ");
                    sc.nextLine();
                    String authorName=sc.nextLine();
                    bookDemo.setAuthor_name(authorName);
                    System.out.println("'"+authorName+"' Update successfully");
                    break;
                case 3:
                    System.out.println("Enter the Book published Year: ");
                    int publishedYear=sc.nextInt();
                    bookDemo.setPublished_year(publishedYear);
                    System.out.println("Published Year update successfully");
                    break;
                default:
                    System.out.println("Please Enter Valid choice");

            }
        }
        else
            System.out.println("Book Id not exists");
    }

    private static void deleteBook(ArrayList<BookDemo> books) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the book Id which book can be delete: ");
        int bookId=sc.nextInt();
        BookDemo bookDemo=null;
        for(BookDemo book:books){
            if(book.book_id==bookId){
                bookDemo=book;
                break;
            }
        }
        if(bookDemo!= null) {
            books.remove(bookDemo);
            System.out.println("Book '" + bookDemo.book_name + "' delete successfully");
        }
        else
            System.out.println("Book Id not exists");
    }

    private static void viewBook(ArrayList<BookDemo> books) {
        System.out.println("-------Book Lists---------");
        for(BookDemo book:books){
            System.out.println("Book Name: "+book.book_name);
            System.out.println("Book Author Name: "+book.author_name);
            System.out.println("Published Year: "+book.published_year);
        }
    }

    private static void addBook(ArrayList<BookDemo> bookList) {
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
            BookDemo book=new BookDemo(id,bookName,bookAuthor,year);
            bookList.add(book);
            System.out.println("Book '"+bookName+"' added successfully");
        }
    }
}