package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor tallVisitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10, 0, 0);
        visitor = new Visitor(11, 123, 55.00);
        tallVisitor = new Visitor(17, 201, 44);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void visitorAllowed__not(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void visitorAllowed__yes(){
        assertEquals(true, rollerCoaster.isAllowedTo(tallVisitor));
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void visitorOver2mPaysDoublePrice(){
        rollerCoaster.priceFor(tallVisitor);
        assertEquals(16.80, rollerCoaster.getPrice(), 0.01);
    }

    @Test
    public void visitorOver2mPaysNormalPrice(){
        rollerCoaster.priceFor(visitor);
        assertEquals(8.40, rollerCoaster.getPrice(), 0.01);
    }

}
