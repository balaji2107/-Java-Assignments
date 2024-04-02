package abstractclass.library;

import abstractclass.library.admin.Admin;
import abstractclass.library.bookmanage.BookManage;
import abstractclass.library.bookmanage.LibraryUpdate;
import abstractclass.library.books.Books;

import java.util.Scanner;

public class LibraryManagement {
    private static LibraryManagement libraryManagement;

    public static void main(String[] args) {
        Books books=new Books("ISBN-978-0-545-01022-1","Java","James Gosling");
        LibraryManagement.getInstance().init(books);
    }
    public  void init(Books books) {
        Scanner sc=new Scanner(System.in);
        Admin admin=new Admin("admin","admin123");
        checkForUpdate(books,admin);
        System.out.println(books);
    }

    private void checkForUpdate(Books books, Admin admin) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you want Book update or not: (Yes/No)");
        String check=sc.nextLine();
        if(check.equals("yes")){
            updateBook(books,admin);
        }
        else if(check.equals("no")){
            System.out.println("--Thank You---");
        }
        else {
            System.out.println("Please Enter valid input");
            checkForUpdate(books,admin);
        }
    }

    public static LibraryManagement getInstance(){
        if(libraryManagement==null){
            libraryManagement=new LibraryManagement();
        }
        return libraryManagement;
    }
    public void updateBook(Books books, Admin admin) {
        Scanner sc=new Scanner(System.in);
        BookManage bookManage=new LibraryUpdate(admin);
        System.out.println("Enter the Username: ");
        String username=sc.nextLine();
        System.out.println("Enter the password");
        String password=sc.nextLine();
        bookManage.updateBook(books,username,password);
    }
}