package models;

import behaviours.IDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Borrower implements IDB {

    private int id;
    private String name;
    private int libraryNumber;
    private List<Book> itemsBorrowed;

    public Borrower() {}

    public Borrower(String name, int libraryNumber) {
        this.name = name;
        this.libraryNumber = libraryNumber;
        this.itemsBorrowed = new ArrayList<Book>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLibraryNumber() {
        return libraryNumber;
    }

    public void setLibraryNumber(int libraryNumber) {
        this.libraryNumber = libraryNumber;
    }

    public List<Book> getItemsBorrowed() {
        return itemsBorrowed;
    }

    public void setItemsBorrowed(List<Book> itemsBorrowed) {
        this.itemsBorrowed = itemsBorrowed;
    }

    public void addBook(Book book) {
        this.itemsBorrowed.add(book);
    }
}
