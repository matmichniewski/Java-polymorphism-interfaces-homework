package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import behaviours.IVisitCount;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed, ITicketed, IVisitCount {

    private double price;

    public RollerCoaster(String name, int rating, int visitCount, double price) {
        super(name, rating, visitCount);
        this.price = 8.40;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() > 12 && visitor.getHeight() > 145){
            return true;
        } else {
            return false;
        }
    }

    public int visitCount(){
        return this.visitCount;
    }

    @Override
    public int getRating() {
        return super.getRating();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public double getPrice() {
        return price;
    }

    public double defaultPrice(){
        return this.price;
    }

    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() > 200){
            this.price *= 2;
        }
        return this.price;
    }
}
