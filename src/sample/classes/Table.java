package sample.classes;

import javafx.beans.property.SimpleStringProperty;

/**
 * Class Table
 */
public class Table {
    /**
     * Book title
     */
    private SimpleStringProperty bookTitle;
    /**
     * Book author
     */
    private SimpleStringProperty bookAuthor;
    /**
     * Book summary
     */
    private SimpleStringProperty summary;
    /**
     * Book isbn
     */
    private SimpleStringProperty isbn;
    /**
     * Table column of by line New York Times
     */
    private SimpleStringProperty byLine;
    /**
     * Table column of publication date in New York Times
     */
    private SimpleStringProperty publicationDT;

    /**
     * Construct of table
     * @param book Object book
     */
    public Table(final Book book) {
        StringBuilder ISBN = new StringBuilder();
        this.bookTitle = new SimpleStringProperty(book.getBookTitle());
        this.bookAuthor = new SimpleStringProperty(book.getBookAuthor());
        this.summary = new SimpleStringProperty(book.getSummary());
        for (String temp : book.getIsbn()) {
            ISBN.append(temp).append("\n");
        }
        this.isbn = new SimpleStringProperty(ISBN.toString());
        this.byLine = new SimpleStringProperty(book.getByLine());
        this.publicationDT = new SimpleStringProperty(book.getPublicationDT());
    }

    public String getBookTitle() {
        return bookTitle.get();
    }

    public SimpleStringProperty bookTitleProperty() {
        return bookTitle;
    }

    public void setBookTitle(final String bookTitle) {
        this.bookTitle.set(bookTitle);
    }

    public String getBookAuthor() {
        return bookAuthor.get();
    }

    public SimpleStringProperty bookAuthorProperty() {
        return bookAuthor;
    }

    public void setBookAuthor(final String bookAuthor) {
        this.bookAuthor.set(bookAuthor);
    }

    public String getSummary() {
        return summary.get();
    }

    public SimpleStringProperty summaryProperty() {
        return summary;
    }

    public void setSummary(final String summary) {
        this.summary.set(summary);
    }

    public String getIsbn() {
        return isbn.get();
    }

    public SimpleStringProperty isbnProperty() {
        return isbn;
    }

    public void setIsbn(final String isbn) {
        this.isbn.set(isbn);
    }

    public String getByLine() {
        return byLine.get();
    }

    public SimpleStringProperty byLineProperty() {
        return byLine;
    }

    public void setByLine(final String byLine) {
        this.byLine.set(byLine);
    }

    public String getPublicationDT() {
        return publicationDT.get();
    }

    public SimpleStringProperty publicationDTProperty() {
        return publicationDT;
    }

    public void setPublicationDT(final String publicationDT) {
        this.publicationDT.set(publicationDT);
    }
}
