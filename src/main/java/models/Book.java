package models;

import behaviours.IDB;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book implements IDB {

    private int id;
    private String title;
    private String author;
    private boolean onLoan;
//    private Borrower borrower;

    public Book(){}

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.onLoan = false;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "author")
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    @Column(name = "loan_status")
    public boolean isOnLoan() {
        return onLoan;
    }
    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }
}
