package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitorYoung;
    Visitor visitorOld;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5, 0, 0);
        visitorOld = new Visitor(13,123,43);
        visitorYoung = new Visitor(11,123,43);

    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hadDefaultPrice(){
        assertEquals(4.50, dodgems.getPrice(), 0.01);
    }

    @Test
    public void visitorUnder12PayHalfPrice(){
        dodgems.priceFor(visitorYoung);
        assertEquals(2.25, dodgems.getPrice(), 0.01);
    }

    @Test
    public void visitorOver12PayFullPrice(){
        dodgems.priceFor(visitorOld);
        assertEquals(4.50, dodgems.getPrice(), 0.01);
    }

}
