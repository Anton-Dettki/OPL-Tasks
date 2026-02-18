package altklausur.task6;

public class Wale extends Mammal{
    private final String habitat = "water";
    @Override
    public void eat() {}

    @Override
    public void move() {
        System.out.println("is swimming");
    }

}
