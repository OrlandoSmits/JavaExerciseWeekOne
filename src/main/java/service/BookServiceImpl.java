package service;

import domain.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookServiceImpl implements BookService {

    private List<Book> books = new ArrayList<>();
    @Override
    public void addBook(Book book) {
        this.books.add(book);
    }

    @Override
    public void deleteBook(String ISBN) {

        Book book = null;

        for (Book book1 : books) {
           if(book1.getISBN().equalsIgnoreCase(ISBN)) {
               book = book1;
           }
        }

        this.books.remove(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return this.books;
    }

    @Override
    public Book findBookByISBN(String ISBN) {
        Book book = null;
        for (Book book1 : this.books) {
            if(book1.getISBN().equalsIgnoreCase(ISBN)) {
                book = book1;
            }
        }

        return book;
    }

    @Override
    public List<Book> getAllBooksOrderedByReleaseDate() {
        this.books.sort(Comparator.comparing(Book::getReleaseDate));
        return books;
    }

    @Override
    public void deleteAllBooks() {
        this.books.clear();
    }
}
