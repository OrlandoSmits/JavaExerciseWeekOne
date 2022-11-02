package service;

import domain.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This is a test class. Within this class we write methods to verify that are methods work as intended.
 * As you can see there are some methods that not work. The goal is to make sure that all these tests are succeeding.
 * As an extra assignment you can try to write a valid test case for the last method.
 * In IntelliJ you can use CTRL+Shift+F10, or click the run test symbol to run all the tests in this class.
 */
class BookServiceTest {

    private BookService bookService = new BookServiceImpl();

    @AfterEach
    void afterEach() {
        bookService.deleteAllBooks();
    }

    @Test
    void addBook() {
        Book book = new Book();

        bookService.addBook(book);
        List<Book> allBooks = bookService.getAllBooks();

        assertEquals(allBooks.size(), 1);
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

        assertEquals(allBooks.size(), 1);
    }

    @Test
    void getAllBooks() {
        bookService.addBook(this.insertOneBook());
        bookService.addBook(this.insertOneBook());
        bookService.addBook(this.insertOneBook());
        bookService.addBook(this.insertOneBook());

        List<Book> allBooks = bookService.getAllBooks();

        assertEquals(allBooks.size(), 4);
    }

    @Test
    void getAllBooksOrderedByReleaseDate() {
        // TODO: Write a valid test.
    }

    private Book insertOneBook() {
        Book book = new Book();

        bookService.addBook(book);

        return book;
    }
}