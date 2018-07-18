package models;

import java.util.Set;

public class Borrower {

    private int id;
    private String name;
    private int libraryNumber;
    private Set<Book> itemsBorrowed;
}
