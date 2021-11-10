package by.bsuir.webtech.task13;

import by.bsuir.webtech.task12_14_15.Book;

public class ProgrammerBook extends Book {
    private final String language;
    private final int level;


    public ProgrammerBook(String title, String author, int price, String isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        if(!super.equals(obj)) {
            return false;
        }

        ProgrammerBook book = (ProgrammerBook) obj;
        boolean isLanguageEqual = (language != null && language.equals(book.language)) || (language == book.language);
        boolean result = (level == book.level) && isLanguageEqual;
        return result;
    }

    @Override
    public int hashCode() {
        int result = 31 * (super.hashCode() + language.hashCode() + Integer.hashCode(level));
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Additionally: language: " + language + " level = " + level;
    }
}
