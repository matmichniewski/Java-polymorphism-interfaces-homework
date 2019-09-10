package people;

import attractions.Dodgems;
import attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    Dodgems dodgems;
    Park park;


    @Before
    public void before(){
        visitor = new Visitor(14, 1.2, 40.0);
        dodgems = new Dodgems("Dog", 6, 0, 0);
        park = new Park("Meadows", 5, 0);
    }


    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void canAddAttraction(){
        visitor.addAttraction(park);
        visitor.addAttraction(dodgems);
        assertEquals(2, visitor.getVisitedAttractions().size());
    }

}
