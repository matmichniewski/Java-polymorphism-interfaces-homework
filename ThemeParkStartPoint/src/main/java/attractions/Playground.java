package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.IVisitCount;
import people.Visitor;

public class Playground extends Attraction implements ISecurity, IReviewed, IVisitCount {

    public Playground(String name, int rating, int visitCount) {
        super(name, rating, visitCount);
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() <= 15){
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


}
