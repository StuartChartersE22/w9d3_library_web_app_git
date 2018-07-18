package models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("IT", "Stephen King");
    }

    @Test
    public void canGetTitle(){
        assertEquals("IT", book.getTitle());
    }

    @Test
    public void canGetAuthor(){
        assertEquals("Stephen King", book.getAuthor());
    }

    @Test
    public void canGetOnLoan(){
        assertFalse(book.isOnLoan());
    }



}
