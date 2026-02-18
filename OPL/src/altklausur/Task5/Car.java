package altklausur.Task5;

public class Car {
    private String carNo;
    private double pricePerDay;
    private Tyre[] tyres;

    public Car(String carNo, boolean winter, double pricePerDay) {
        this.carNo = carNo;
        this.pricePerDay = pricePerDay;

        Tyre t1 = new Tyre(winter);
        Tyre t2 = new Tyre(winter);
        Tyre t3 = new Tyre(winter);
        Tyre t4 = new Tyre(winter);

        this.tyres = new Tyre[]{t1, t2, t3, t4};
    }

    public String getCarNo() {
        return carNo;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}
