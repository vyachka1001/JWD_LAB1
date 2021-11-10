package by.bsuir.webtech.task12_14_15.comparator;

import by.bsuir.webtech.task12_14_15.Book;
import by.bsuir.webtech.task12_14_15.util.ObjectComparator;

import java.util.Comparator;

public class AuthorTitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook) {
        int authorComparisonResult = ObjectComparator.compare(firstBook.getAuthor(), secondBook.getAuthor());
        int result = (authorComparisonResult == 0 ? ObjectComparator.compare(firstBook.getTitle(), secondBook.getTitle())
                : authorComparisonResult);
        return result;
    }
}
