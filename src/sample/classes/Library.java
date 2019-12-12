package sample.classes;

import java.util.ArrayList;

public class Library {
    private String statue;
    private String copyright;
    private int num_results;
    private ArrayList<Book> books;

    public Library() {
        this.statue = null;
        this.copyright = null;
        this.num_results = 0;
        this.books = new ArrayList<>();
    }

    public Library(String statue, String copyright, int num_results, ArrayList<Book> books) {
        this.statue = statue;
        this.copyright = copyright;
        this.num_results = num_results;
        this.books = books;
    }

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public int getNum_results() {
        return num_results;
    }

    public void setNum_results(int num_results) {
        this.num_results = num_results;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook(Book book){
        books.add(book);
    }

    @Override
    public String toString() {
        return "Library{" +
                "statue='" + statue + '\'' +
                ", copyright='" + copyright + '\'' +
                ", num_results=" + num_results +
                ", books=" + books +
                '}';
    }
}
