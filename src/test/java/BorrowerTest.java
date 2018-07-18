import models.Borrower;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;

    @Before
    public void before() {
        this.borrower = new Borrower("Stuart", 0001);
    }

    @Test
    public void hasId() {
        assertEquals(0, borrower.getId());
    }

    @Test
    public void canSetId() {
        borrower.setId(25);
        assertEquals(25, borrower.getId());
    }

    @Test
    public void hasName() {
        assertEquals("Stuart", borrower.getName());
    }

    @Test
    public void canSetName() {
        borrower.setName("Gary");
        assertEquals("Gary", borrower.getName());
    }

    @Test
    public void hasLibraryNumber() {
        assertEquals(0001, borrower.getLibraryNumber());
    }

    @Test
    public void canSetLibraryNumber() {
        borrower.setLibraryNumber(17);
        assertEquals(17, borrower.getLibraryNumber());
    }

    @Test
    public void itemsBorrowedStartsEmpty() {
        assertEquals(0, borrower.getItemsBorrowed().size());
    }
}