import attractions.Attraction;

import behaviours.IReviewed;
import behaviours.IVisitCount;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> reviewed;
    private String name;

    public ThemePark(String name){
        this.name = name;
        this.reviewed = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int reviewedCount(){
        return this.reviewed.size();
    }

    public void addReview(IReviewed ireview){
        this.reviewed.add(ireview);
    }

    public ArrayList getAllReviewed(){
        return this.reviewed;
    }

    public void visit(Visitor visitor, Attraction attraction) {
        attraction.visitCount += 1;
        visitor.addAttraction(attraction);
    }
}
