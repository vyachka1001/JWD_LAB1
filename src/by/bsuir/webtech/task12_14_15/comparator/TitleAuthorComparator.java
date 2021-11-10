package by.bsuir.webtech.task12_14_15.comparator;

import by.bsuir.webtech.task12_14_15.Book;
import by.bsuir.webtech.task12_14_15.util.ObjectComparator;

import java.util.Comparator;

public class TitleAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        TitleComparator titleComparator = new TitleComparator();
        int titleComparisonResult = titleComparator.compare(firstBook, secondBook);
        int result = titleComparisonResult == 0 ? ObjectComparator.compare(firstBook.getAuthor(), secondBook.getAuthor())
                : titleComparisonResult;
        return result;
    }
}
