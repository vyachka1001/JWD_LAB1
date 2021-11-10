package by.bsuir.webtech.task12_14_15.comparator;

import by.bsuir.webtech.task12_14_15.Book;
import by.bsuir.webtech.task12_14_15.util.ObjectComparator;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        int result = ObjectComparator.compare(firstBook.getTitle(), secondBook.getTitle());
        return result;
    }
}
