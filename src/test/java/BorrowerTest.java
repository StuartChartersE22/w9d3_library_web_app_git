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
}