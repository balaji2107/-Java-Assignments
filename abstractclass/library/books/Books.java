package abstractclass.library.books;

public class Books {
    private String ISBN;
    private String bookName;
    private String author;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Books(String ISBN, String bookName, String author) {
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.author = author;
    }
    @Override
    public String toString() {
        return "Books-->" +
                "ISBN='" + ISBN + '\'' +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\''
                ;
    }

}