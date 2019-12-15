package sample.classes;


import java.util.ArrayList;

/**
 * Class Book
 */
public class Book {
    /**
     * Book title
     */
    private String bookTitle;
    /**
     * Book author
     */
    private String bookAuthor;
    /**
     * Book summary
     */
    private String summary;
    /**
     * Book isbn
     */
    private ArrayList<String> isbn;
    /**
     * Table column of by line New York Times
     */
    private String publicationDT;
    /**
     * Table column of publication date in New York Times
     */
    private String byLine;

    /**
     * Construct of book
     * @param bookTitle title
     * @param bookAuthor author
     * @param summary summary
     * @param isbn isbn
     * @param publicationDT publication date
     * @param byLine by line
     */
    public Book(final String bookTitle, final String bookAuthor, final String summary, final ArrayList<String> isbn, final String publicationDT, final String byLine) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.summary = summary;
        this.isbn = isbn;
        this.publicationDT = publicationDT;
        this.byLine = byLine;

    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(final String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(final String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(final String summary) {
        this.summary = summary;
    }

    public ArrayList<String> getIsbn() {
        return isbn;
    }

    public void setIsbn(final ArrayList<String> isbn) {
        this.isbn = isbn;
    }

    public String getPublicationDT() {
        return publicationDT;
    }

    public void setPublicationDT(final String publicationDT) {
        this.publicationDT = publicationDT;
    }

    public String getByLine() {
        return byLine;
    }

    public void setByLine(final String byLine) {
        this.byLine = byLine;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", summary='" + summary + '\'' +
                ", isbn=" + isbn +
                ", publication_dt='" + publicationDT + '\'' +
                ", byLine='" + byLine + '\'' +
                '}';
    }
}
