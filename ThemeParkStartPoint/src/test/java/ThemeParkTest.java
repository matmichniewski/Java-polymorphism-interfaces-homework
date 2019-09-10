import attractions.Attraction;
import attractions.Dodgems;
import attractions.Park;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Visitor visitor;


    Dodgems dodgems;
    Park park;
    TobaccoStall tobaccoStall;

    @Before
    public void before(){
        themePark = new ThemePark("Magic park");
        visitor = new Visitor(23, 178, 33);


        dodgems = new Dodgems("Dog", 6, 0, 0);
        park = new Park("Meadows", 5, 2);
        tobaccoStall = new TobaccoStall("Smoker", "John", ParkingSpot.A4, 4 );
    }

    @Test
    public void hasName(){
        assertEquals("Magic park", themePark.getName());
    }

    @Test
    public void canAddReview(){
        themePark.addReview(park);
        assertEquals(1, themePark.reviewedCount());
    }

    @Test
    public void hasReviewedList(){
        themePark.getAllReviewed();
        assertEquals(0, themePark.reviewedCount());
    }

    @Test
    public void visitAttractionAddsToVisitorsList(){
        themePark.visit(visitor, park);
        themePark.visit(visitor, dodgems);
        assertEquals(2, visitor.getVisitedAttractions().size());
    }

    @Test
    public void visitAttractionIncrementsVisitedCount(){
        themePark.visit(visitor, park);
        themePark.visit(visitor, dodgems);
        themePark.visit(visitor, dodgems);
        assertEquals(2, dodgems.visitCount());
        assertEquals(1, park.visitCount());

    }

}
