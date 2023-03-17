package org.example.inheritance.aggregation.example2;

public class Test {
    public static void main(String[] args) {
        Author objAuthor = new Author("Raffi", 45);
        Book objBook = new Book(236, "Xachagoxi hishatakaran", objAuthor);
        objBook.showDetails();
    }



}
