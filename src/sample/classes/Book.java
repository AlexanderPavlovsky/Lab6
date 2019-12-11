package sample.classes;

public class Book {
    private String url;
    private String publicationDate;
    private String byLine;
    private String bookTitle;
    private String bookAuthor;
    private String summary;
    private String uuid;
    private String uri;
    private String isbn;

    public Book(String url, String publicationDate, String byLine, String bookTitle, String bookAuthor, String summary, String uuid, String uri, String isbn) {
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

    public String getPublicationDate() {
        return publicationDate;
    }

    public String getByLine() {
        return byLine;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getSummary() {
        return summary;
    }

    public String getUuid() {
        return uuid;
    }

    public String getUri() {
        return uri;
    }

    public String getIsbn() {
        return isbn;
    }
}
