package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import behaviours.IVisitCount;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ITicketed, IVisitCount {

    private double price;

    public Dodgems(String name, int rating, int visitCount, double price) {
        super(name, rating, visitCount);
        this.price = 4.50;
    }


    public int visitCount(){
        return this.visitCount;
    }

    @Override
    public int getRating() {
        return super.getRating();
    }

    public String getName() {
        return super.getName();
    }

    public double defaultPrice(){
        return this.price = 4.50;
    }

    public double priceFor(Visitor visitor) {
        if(visitor.getAge() < 12){
            this.price /= 2;
        }
        return this.price;
    }

    public double getPrice() {
        return price;
    }
}
