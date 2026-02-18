package seminar6.Task61.Task611;

public abstract class ElektronischeGeräte extends Article{
    private String powerSource;

    public ElektronischeGeräte(String powerSource) {
        super(String.valueOf(counter), "EGerät");
        setPowerSource(powerSource);
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        if(powerSource == "solarpanel" ||
        powerSource == "rechargable battery" ||
        powerSource == "non rechargable battery") {
            this.powerSource = powerSource;
        } else {
            this.powerSource = null;
        }
    }

    public abstract void startDevice(String e);
    public abstract void useDevice(String e);

}
