package sample.classes;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;

/**
 * Class Library
 */
public class Library {
    /**
     * Statue of search
     */
    private String status;
    /**
     * Copyright of search
     */
    private String copyright;
    /**
     * Array lit of Book
     */
    private ArrayList<Book> books;

    /**
     * Default construct of library
     */
    public Library() {
        this.status = null;
        this.copyright = null;
        this.books = new ArrayList<>();
    }

    /**
     * Construct of library
     * @param status statue
     * @param copyright copyright
     * @param jsonArray Array of books
     */
    public Library(final String status, final String copyright, final JSONArray jsonArray) {
        this.status = status;
        this.copyright = copyright;
        this.books = new ArrayList<>();
        for (Object o1 : jsonArray) {
            JSONObject object = (JSONObject) o1;
            books.add(new Book((String) object.get("book_title"), (String) object.get("book_author"), (String) object.get("summary"), (ArrayList<String>) object.get("isbn13"), (String) object.get("publication_dt"), (String) object.get("byline")));
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(final String copyright) {
        this.copyright = copyright;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(final ArrayList<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "statue='" + status + '\'' +
                ", copyright='" + copyright + '\'' +
                ", books=" + books +
                '}';
    }
}
