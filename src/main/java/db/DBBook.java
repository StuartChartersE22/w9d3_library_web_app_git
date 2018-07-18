package db;

import models.Book;

public class DBBook extends DBHelper {

    public Book find(int id){
        return find(id, Book.class);
    }
}
