package altklausur.task6;

public class Main {
    public static void main(String[] args) {
        Jellyfish j = new Jellyfish();
        Wale w = new Wale();

        Animal[] arr = {j, w};

        for (int i = 0; i < arr.length; i++) {
            arr[i].move();
        }
    }
}
