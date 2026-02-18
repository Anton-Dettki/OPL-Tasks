package altklausur.aufgabe2;

public class main {
    public static void main(String[] args) {
        main m = new main();
        m.chooseVersandkarton("flammable");
        System.out.println("------------------------------");
        m.chooseVersandkarton("flammable contains batteries");
        System.out.println("------------------------------");
        m.chooseVersandkarton("contains batteries");
        System.out.println("------------------------------");
        m.chooseVersandkarton("meow");

        m.werbegeschenke(501);

        int[] arr = m.computeFirst10Primes(300,1000);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void chooseVersandkarton(String s) {
        if(s.contains("flammable")) {
            System.out.println("Flammable");
        }
        if(s.contains("contains batteries")) {
            System.out.println("Contains batteries");
        }
        System.out.println("Institut für Technische Logistik");
        System.out.println("Theodor-Yorck-Strasse 8");
        System.out.println("21079 Hamburg");
    }

    public void werbegeschenke(int p) {
        if (p >= 500) {
            System.out.println("20€ Gutschein");
        } if (p >= 200) {
            System.out.println("10€ Gutschein");
        } if (p >= 100) {
            System.out.println("Taschenrechner");
        } if (p >= 50) {
            System.out.println("Schlüsselanhänger");
        }
    }

    public int[] computeFirst10Primes(int a, int b) {
        int[] arr = { 0,0,0,0,0,0,0,0,0,0 };
        int c = 0;

            for (int i = a; i <= b; i++) {
                if(c < 10) {
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            break;
                        }
                        if( j == i-1) {
                            arr[c] = i;
                            c++;
                        }
                    }
                }
            }
        return arr;
    }

}
