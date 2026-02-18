package altklausur.task6;

public class Jellyfish extends Animal {
    protected final String habitat = "water";

    @Override
    public void eat() {}

    @Override
    public void move() {
        System.out.println("is floating");
    }
}
