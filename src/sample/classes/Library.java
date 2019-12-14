package sample.classes;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;

public class Library {
    private String status;
    private String copyright;
    private ArrayList <Book> books;

    public Library() {
        this.status = null;
        this.copyright = null;
        this.books = new ArrayList<>();
    }

    public Library(String status, String copyright, JSONArray jsonArray) {
        this.status = status;
        this.copyright = copyright;
        this.books = new ArrayList<>();
        for (Object o1 : jsonArray) {
            JSONObject object = (JSONObject) o1;
            books.add(new Book((String) object.get("url"), (String) object.get("book_title"), (String) object.get("book_author"), (String) object.get("summary"), (ArrayList<String>)object.get("isbn13")));
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
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
