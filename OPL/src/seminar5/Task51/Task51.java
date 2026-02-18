package seminar5.Task51;

public class Task51 {
    public static void main(String[] args) {
        Artikel a = new Artikel(1,"Zeugs",2,20,40,10);

        a.print();

        System.out.println(a.volumen());
        System.out.println(a.dichte());

        System.out.println(a.passtInVerpackung(20, 40, 10));
        System.out.println(a.passtInVerpackung(25, 50, 15));
        System.out.println(a.passtInVerpackung(19, 40, 10));

        Artikel b  = a.createClone();

        System.out.println(b == a);

        Lager l = new Lager(1,2,2);
        Artikel a1 = new Artikel(1, "Zeugs", 2,2,2,2);
        Artikel a2 = new Artikel(2, "Zeugs", 2,2,2,2);
        Artikel a3 = new Artikel(3, "Zeugs", 2,2,2,2);
        Artikel a4 = new Artikel(4, "Zeugs", 2,2,2,2);
        Artikel a5 = new Artikel(5, "Zeugs", 2,2,2,2);

        l.intoFach(0,1,1, a1);
        l.intoFach(0,1,1, a2);
        l.nextEmptyFach(a2);
        l.nextEmptyFach(a3);
        l.nextEmptyFach(a4);
        l.nextEmptyFach(a5);
        l.printLager();
        l.emptyFirstArtikel(3);
        l.emptyFirstArtikel(5);
        l.printLager();


    }
}
