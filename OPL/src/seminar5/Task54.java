package seminar5;

public class Task54 {

    public static void main(String[] args) {
        Task54 t = new Task54();
        t.printSquare(500,30);
    }

    public void printSquare(int width, int height) {
        String s = "*";
        String tb = "";
        for (int i = 0; i < width-2; i++) {
            s = s + " ";
        }
        s = s + "*";

        for (int i = 0; i < width; i++) {
            tb = tb + "*";
        }

        System.out.println(tb);
        for (int i = 0; i < height-2; i++) {
            System.out.println(s);
        }
        System.out.println(tb);
    }
}
