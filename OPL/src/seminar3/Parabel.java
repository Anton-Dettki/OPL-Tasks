package seminar3;

public class Parabel {

    public static double f(double x) {
        return 0.25 * x * x - 3 * x + 12.5;
    }

    public static void main(String[] args) {

        double x = 0;
        double step = 0.1;

        if (f(x + step) > f(x)) {
            step = -step;
        }

        while (f(x + step) < f(x)) {
            x += step;
        }

        System.out.println("Genäherter Tiefpunkt:");
        System.out.println("x = " + x);
        System.out.println("y = " + f(x));
    }
}
