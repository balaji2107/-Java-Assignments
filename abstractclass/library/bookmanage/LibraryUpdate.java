package abstractclass.library.bookmanage;

import abstractclass.library.LibraryManagement;
import abstractclass.library.admin.Admin;
import abstractclass.library.books.Books;

import java.util.Scanner;

public class LibraryUpdate extends BookManage{
    private LibraryManagement libraryManagement;
    public LibraryUpdate(Admin admin){
        super(admin);
        libraryManagement=LibraryManagement.getInstance();
    }

    @Override
    public void updateBook(Books books, String username, String password) {
        Scanner scanner=new Scanner(System.in);
        if(isAuthorized(username,password)){
            System.out.println("Enter the Update Book name: ");
            books.setBookName(scanner.nextLine());
            System.out.println("Book name update successfully");
        }
        else {
            System.out.println("Invalid username and password");
        }
    }

}
