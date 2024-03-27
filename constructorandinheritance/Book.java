package assignment;

import java.util.Scanner;

public class Book {
    private String title;
    private String isbn;
    private String author;
    private int yearPublished;
    private double price;
    private static double tax = 0.8;
    public Book(String title, String isbn, String author, int yearPublished, double price) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }


    public String getTitle() {
        return title;
    }


    public String getIsbn() {
        return isbn;
    }


    public String getAuthor() {
        return author;
    }



    public int getYearPublished() {
        return yearPublished;
    }


    public double getPrice() {
        return price;
    }

}
class BookDemo{
    public static void main(String[] args) {
        Book[] arrOfBook=new Book[2];
        addBook(arrOfBook, new Book("Java","ISBN 234-1-90" ,"Author1", 2000,200));
        addBook(arrOfBook, new Book("Python", "ISBN 234-1-90","Author2", 2003,300));

        displayBooks(arrOfBook);
    }

    private static void addBook(Book[] arrOfBook, Book book) {
        for(int i=0;i<arrOfBook.length;i++){
            if(arrOfBook[i] == null) {
                arrOfBook[i] = book;
                break;
            }
        }
    }
    public static void displayBooks(Book[] books) {
        System.out.println("Books in the library:");
        for (Book book : books) {
            if (book != null) {
                System.out.println("Title: " + book.getTitle() + ", ISBN: " + book.getIsbn() + ", Author: " + book.getAuthor()+",Price: " +book.getPrice());
            }
        }
    }
}