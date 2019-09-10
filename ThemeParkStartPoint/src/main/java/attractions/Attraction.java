package attractions;

public abstract class Attraction {
    private String name;
    private int rating;
    public int visitCount;

    public Attraction(String name, int rating, int visitCount) {
        this.name = name;
        this.rating = rating;
        this.visitCount = 0;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getVisitCount() {
        return visitCount;
    }
}
