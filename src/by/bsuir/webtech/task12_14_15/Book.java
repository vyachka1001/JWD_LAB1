package by.bsuir.webtech.task12_14_15;

import by.bsuir.webtech.task12_14_15.util.ObjectComparator;

public class Book implements Comparable<Book>{
    private final String title;
    private final String author;
    private final int price;
    private static int edition;
    private final String isbn;

    public Book(String title, String author, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPrice() {
        return this.price;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }

        Book book = (Book) obj;
        boolean isTitleEqual = (title != null && title.equals(book.title)) || (title == book.title);
        boolean isAuthorEqual = (author != null && author.equals(book.author)) || (author == book.author);
        boolean result = (price == book.price && isAuthorEqual && isTitleEqual);

        return result;
    }

    @Override
    public int hashCode() {
        int result = 31 * (title.hashCode() + author.hashCode() + Integer.hashCode(price));

        return result;
    }

    @Override
    public String toString() {
        return "Author: " + author + ", Title: " + title + "\n" + "Price = " + price;
    }

    @Override
    public Object clone() {
        return new Book(this.title, this.author, this.price, this.isbn);
    }

    @Override
    public int compareTo(Book obj) {
        return ObjectComparator.compare(this.isbn, obj.isbn);
    }
}
