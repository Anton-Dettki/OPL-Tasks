package altklausur.Task5;

public class Customer {
    private boolean isCompany;
    private String name;
    private static int kNr;

    public Customer(boolean isCompany, String name) {
        this.isCompany = isCompany;
        this.name = name;
        kNr++;
    }
}
