package seminar6.Task61.Task611;

public class MobilePhone extends ElektronischeGeräte{
    private String brand;
    private String pin;

    public MobilePhone(String brand, String pin) {
        super("rechargable battery");
        this.brand = brand;
        this.pin = pin;
    }

    @Override
    public void startDevice(String e) {
        if(e == pin) {
            System.out.println("Handy ist an");
        } else {
            System.out.println("pin ist falsch");
        }
    }

    @Override
    public void useDevice(String e) {
        if(e == "browse" || e == "call") {
            System.out.println("Using the phone properly currently doing: " + e);
        } else {
            System.out.println("This action is not supported by the phone");
        }
    }
}
