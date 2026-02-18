package altklausur.task6;

public abstract class Animal {
    protected String name;
    protected String habitat;

    public abstract void eat();
    public abstract void move();

    public String getName() {
        return name;
    }

    public String getHabitat() {
        return habitat;
    }
}
