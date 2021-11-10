package by.bsuir.webtech.task12_14_15.comparator;

import by.bsuir.webtech.task12_14_15.Book;
import by.bsuir.webtech.task12_14_15.util.ObjectComparator;

import java.util.Comparator;

public class AuthorTitlePriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        AuthorTitleComparator authorTitleComparator = new AuthorTitleComparator();
        int authorTitleComparisonResult = authorTitleComparator.compare(firstBook, secondBook);
        int result = (authorTitleComparisonResult == 0 ? ObjectComparator.compare(firstBook.getPrice(), secondBook.getPrice())
                : authorTitleComparisonResult);
        return result;
    }
}
