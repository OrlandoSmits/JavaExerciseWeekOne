package domain;

import java.util.Date;

public class Book implements BookInterface {
    private String name;
    private String language;
    private Date releaseDate;
    private Integer numberOfPages;
    private String author;
    private String isbn;


    // Test-case doesn't use constructor so omitting it for now
//    public Book(String name, String language, Date releaseDate, Integer numberOfPages, String author, String isbn) {
//        this.name = name;
//        this.language = language;
//        this.releaseDate = releaseDate;
//        this.numberOfPages = numberOfPages;
//        this.author = author;
//        this.isbn = isbn;
//    }

    // TODO: Vragen/Uitzoeken wat @Override doet

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String newLanguage) {
        this.language = newLanguage;
    }

    public Date getReleaseData() {
        return this.releaseDate;
    }

    public void setReleaseDate(Date newDate) {
        this.releaseDate = newDate;
    }

    public Integer getNumberOfPages() {
        return this.numberOfPages;
    }

    public void setNumberOfPages(Integer newNumberOfPages) {
        this.numberOfPages = newNumberOfPages;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String newISBN) {
        this.isbn = newISBN;
    }



}
