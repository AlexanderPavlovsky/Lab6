package sample.classes;


import java.util.ArrayList;

public class Book {
    private String url;
    private String bookTitle;
    private String bookAuthor;
    private String summary;
    private ArrayList<String> isbn;

    public Book(String url, String bookTitle, String bookAuthor, String summary, ArrayList<String> isbn) {
        this.url = url;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.summary = summary;
        this.isbn = isbn;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public ArrayList<String> getIsbn() {
        return isbn;
    }

    public void setIsbn(ArrayList<String> isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "url='" + url + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", summary='" + summary + '\'' +
                ", isbn=" + isbn +
                '}';
    }
}
