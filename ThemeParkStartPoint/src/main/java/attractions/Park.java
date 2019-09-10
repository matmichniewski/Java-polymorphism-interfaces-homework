package attractions;

import behaviours.IReviewed;
import behaviours.IVisitCount;

public class Park extends Attraction implements IReviewed, IVisitCount {

    public Park(String name, int rating, int visitCount) {
        super(name, rating, visitCount);
    }



    public int visitCount(){
        return super.visitCount;
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
