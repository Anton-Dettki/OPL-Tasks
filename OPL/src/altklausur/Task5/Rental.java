package altklausur.Task5;

public class Rental {
    private Customer customer;
    private Car car;
    private int mietdauer;



    public double calculatePrice() {
        return mietdauer * car.getPricePerDay();
    }
}
