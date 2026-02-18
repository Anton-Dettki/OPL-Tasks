package seminar6.Task61.Task611;

public class Table extends Article {
    private static int tCounter = 0;
    private String material;
    private int height;
    private Chair chair;

    public Table(String material, int height, Chair chair) {
        super(String.valueOf(counter), "Table");
        this.material = material;
        this.height = height;
        this.chair = chair;
        this.id = "a" + counter + "_t" + tCounter;
        tCounter++;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
