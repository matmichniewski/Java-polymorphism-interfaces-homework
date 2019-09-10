package stalls;

import behaviours.IReviewed;

public class IceCreamStall extends Stall implements IReviewed {

    public IceCreamStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
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
