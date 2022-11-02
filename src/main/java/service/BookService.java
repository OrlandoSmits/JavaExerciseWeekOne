package service;

import domain.Book;

import java.util.List;

public interface BookService {

    /**
     * Adds a book to the bookcase.
     *
     * @param book a domain.Book.
     */
    void addBook(Book book);

    /**
     * Deletes a book from teh bookcase.
     *
     * @param ISBN unique identifier of a book.
     */
    void deleteBook(String ISBN);

    /**
     * Get a list of all the books that are in the bookcase.
     *
     * @return list of books.
     */
    List<Book> getAllBooks();

    /**
     * Find book by ISBN.
     *
     * @param ISBN Unique identifier of a book.
     * @return A book.
     */
    Book findBookByISBN(String ISBN);

    /**
     * Get a list of all the books, ordered by the release date.
     */
    List<Book> getAllBooksOrderedByReleaseDate();

    /**
     * Remove all books from the book case.
     */
    void deleteAllBooks();
}
