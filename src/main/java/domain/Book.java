package domain;

import java.util.Date;

public class Book {

    private String name;
    private String language;
    private Date releaseDate;
    private int numberOfPages;
    private String author;
    private String ISBN;

    public Book(String name, String language, Date releaseDate, int numberOfPages, String author, String ISBN) {
        this.name = name;
        this.language = language;
        this.releaseDate = releaseDate;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
