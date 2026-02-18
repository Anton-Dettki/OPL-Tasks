package seminar4;

public class Task42 {
    public static void main(String[] args) {
        Task42 t = new Task42();
        System.out.println(t.square(5));
        System.out.println(t.square(3.2));

        System.out.println(t.isPrime(15));
        System.out.println(t.isPrime(17));

        System.out.println(t.exp(2,-4));

        t.relation(t.exp(2,5), t.exp(5,2));
        t.relation(3*17, 9*8);
    }

    double exp(double base, int exp) {
        if (exp == 0) {
            return 1;
        }

        double result = 1.0;
        int power = Math.abs(exp);

        for (int i = 0; i < power; i++) {
            result *= base;
        }

        if (exp < 0) {
            return 1.0 / result;
        }

        return result;
    }


    double square(double n) {
        return n * n;
    }

    boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    void relation(double a, double b) {
        if(a < b) System.out.println(a + " is smaller than " + b);
        else if(a > b) System.out.println(a + " is bigger than " + b);
        else System.out.println(a + " and " + b + " are equal");

    }
}
