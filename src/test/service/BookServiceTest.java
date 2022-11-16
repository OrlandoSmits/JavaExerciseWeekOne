package service;

import domain.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * This is a test class. Within this class we write methods to verify that are methods work as intended.
 * As you can see there are some methods that not work. The goal is to make sure that all these tests are succeeding.
 * As an extra assignment you can try to write a valid test case for the last method.
 * In IntelliJ you can use CTRL+Shift+F10, or click the run test symbol to run all the tests in this class.
 */
class BookServiceTest {

    private final BookService bookService = new BookServiceImpl();

    @AfterEach
    void afterEach() {
        bookService.deleteAllBooks();
    }

    @Test
    void addBook() {
        Book book = new Book("Test", "Nederlands", Date.from(Instant.now()), 10, "Me", "12345");

        bookService.addBook(book);
        List<Book> allBooks = bookService.getAllBooks();

        assertEquals(1, allBooks.size());
        assertEquals(allBooks.get(0).getAuthor(), book.getAuthor());
    }

    @Test
    void findBookByISBN() {
        Book book = insertOneBook();

        Book bookByISBN = bookService.findBookByISBN(book.getISBN());

        assertNotNull(bookByISBN);
    }

    @Test
    void deleteBook() {
        Book bookOne = this.insertOneBook();
        Book bookTwo = this.insertOneBook();

        bookService.deleteBook(bookOne.getISBN());
        List<Book> allBooks = bookService.getAllBooks();

        assertEquals(1, allBooks.size());
    }

    @Test
    void getAllBooks() {
        this.insertOneBook();
        this.insertOneBook();
        this.insertOneBook();
        this.insertOneBook();

        List<Book> allBooks = bookService.getAllBooks();

        assertEquals(4, allBooks.size());
    }

    @Test
    void getAllBooksOrderedByReleaseDate() {
        Date firstDate = Date.from(Instant.now());
        Date secondDate = Date.from(Instant.now());
        Date thirdDate = Date.from(Instant.now());

        this.insertOneBookWithDate(firstDate);
        this.insertOneBookWithDate(secondDate);
        this.insertOneBookWithDate(thirdDate);

        List<Book> allBooksOrderedByReleaseDate = bookService.getAllBooksOrderedByReleaseDate();

        assertEquals(3, allBooksOrderedByReleaseDate.size());
        assertEquals(allBooksOrderedByReleaseDate.get(0).getReleaseDate(), firstDate);
        assertEquals(allBooksOrderedByReleaseDate.get(1).getReleaseDate(), secondDate);
        assertEquals(allBooksOrderedByReleaseDate.get(2).getReleaseDate(), thirdDate);
    }

    private Book insertOneBook() {
        Book book = new Book("Test", "Nederlands", Date.from(Instant.now()), 10, "Me", "12345");

        bookService.addBook(book);

        return book;
    }

    private Book insertOneBookWithDate(Date date) {
        Book book = new Book("Test", "Nederlands", date, 10, "Me", "12345");

        bookService.addBook(book);

        return book;
    }
}