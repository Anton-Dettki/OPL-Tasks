package seminar6.Task61.Task611;

public class Chair extends Article{
    private boolean upholstered;
    private static int cCounter = 0;


    public Chair(boolean upholstered) {
        super(String.valueOf(counter), "Chair");
        this.upholstered = upholstered;
        this.id = "a" + counter + "_c" + cCounter;
        cCounter++;
    }

    public boolean isUpholstered() {
        return upholstered;
    }

    public void setUpholstered(boolean upholstered) {
        this.upholstered = upholstered;
    }
}
