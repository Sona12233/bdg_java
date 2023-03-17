package org.example.inheritance.aggregation.example2;

public class Book {

    int bookId;
    String bookName;
    Author author;

    public Book(int bookId, String bookName, Author author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
    }

    public void showDetails(){
        System.out.println("BookId: " + bookId + "\nBook name: " + bookName);
    }



}
