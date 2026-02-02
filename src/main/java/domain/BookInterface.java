package domain;

import java.util.Date;

public interface BookInterface{
    public String getName();
    public void setName(String newName);
    public String getLanguage();
    //Added setLanguage was missing, added it for Justin Case
    public void setLanguage(String newLanguage);
    public Date getReleaseData();
    public void setReleaseDate(Date newDate);
    public Integer getNumberOfPages();
    public void setNumberOfPages(Integer newNumberOfPages);
    public String getAuthor();
    public void setAuthor(String newAuthor);
    public String getIsbn();
    public void setIsbn(String newISBN);
}
