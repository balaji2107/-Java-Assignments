package abstractclass.library.bookmanage;

import abstractclass.library.admin.Admin;
import abstractclass.library.books.Books;

public abstract class BookManage {
    public String username;
    public String password;
    public BookManage(Admin admin) {
        this.username = admin.getUsername();
        this.password = admin.getPassword();
    }
    public abstract void updateBook(Books books,String username,String password);
    protected boolean isAuthorized(String username,String password) {
        return username.equals("admin") && password.equals("admin123");
    }


}
