package sample.classes;


import java.util.List;

public class Book {
    private String url;
    private String publicationDate;
    private String byLine;
    private String bookTitle;
    private String bookAuthor;
    private String summary;
    private String uuid;
    private String uri;
    private List<String> isbn;

    public Book(String url, String publicationDate, String byLine, String bookTitle, String bookAuthor, String summary, String uuid, String uri, List<String> isbn) {
        this.url = url;
        this.publicationDate = publicationDate;
        this.byLine = byLine;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.summary = summary;
        this.uuid = uuid;
        this.uri = uri;
        this.isbn = isbn;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getByLine() {
        return byLine;
    }

    public void setByLine(String byLine) {
        this.byLine = byLine;
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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public List<String> getIsbn() {
        return isbn;
    }

    public void setIsbn(List<String> isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "url='" + url + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                ", byLine='" + byLine + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", summary='" + summary + '\'' +
                ", uuid='" + uuid + '\'' +
                ", uri='" + uri + '\'' +
                ", isbn=" + isbn +
                '}';
    }
}
