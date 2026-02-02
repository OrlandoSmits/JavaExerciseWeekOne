package service;

import domain.Book;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
    // TODO wat is final
    private ArrayList<Book> bookArrayList = new ArrayList<>();


    @Override
    public void addBook(Book book) {
        this.bookArrayList.add(book);
    }

    @Override
    public void deleteBook(String ISBN) {
        for (int i = 0; i < bookArrayList.size(); i++) {
            Book book = this.bookArrayList.get(i);
            if (book.getIsbn().equals(ISBN)) {
                this.bookArrayList.remove(i);
                return;
            }
        }
    }

    @Override
    public List<Book> getAllBooks() {
//        return List.of(this.bookArrayList);
        return this.bookArrayList;
    }


    @Override
    public Book findBookByISBN(String ISBN) {
//        this.bookArrayList.forEach(book -> {
//            if (book.getIsbn().equals(ISBN)) {
//                return book; // TODO ??????????
//            }
//        });
//        return null;
        for (int i = 0; i < bookArrayList.size(); i++) {
            Book book = this.bookArrayList.get(i);
            if (book.getIsbn().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public List<Book> getAllBooksOrderedByReleaseDate() {
        List<Book> sortedBooks = new ArrayList<>(this.bookArrayList);
        sortedBooks.sort((a, b) -> {
            return a.getReleaseData().compareTo(b.getReleaseData());
        });
        return sortedBooks;
    }

    @Override
    public void deleteAllBooks() {
        this.bookArrayList.clear();
    }
}
