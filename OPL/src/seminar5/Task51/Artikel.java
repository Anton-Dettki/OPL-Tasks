package seminar5.Task51;

public class Artikel {
    public int id;
    public String bezeichnung;
    public double gewicht;
    public double laenge;
    public double breite;
    public double tiefe;
    public boolean gefahrgut = false;

    public Artikel(int ID, String bezeichnung, double gewicht, double laenge, double breite, double tiefe, boolean gefahrgut) {
        this.id = ID;
        this.bezeichnung = bezeichnung;
        this.gewicht = gewicht;
        this.laenge = laenge;
        this.breite = breite;
        this.tiefe = tiefe;
        this.gefahrgut = gefahrgut;
    }

    public Artikel(int ID, String bezeichnung, double gewicht,
                   double laenge, double breite, double tiefe) {
        this(ID, bezeichnung, gewicht, laenge, breite, tiefe, false);
    }

    public void print() {
        System.out.println("ID: "+id);
        System.out.println("Bezeichnung: "+bezeichnung);
        System.out.println("Gewicht: "+gewicht);
        System.out.println("Länge: "+laenge);
        System.out.println("Breite: "+breite);
        System.out.println("Tiefe: "+tiefe);
        System.out.println("Gefahrgut: "+gefahrgut);
    }

    public double volumen() {
        return laenge * breite * tiefe;
    }

    public double dichte() {
        return gewicht/volumen();
    }

    public boolean passtInVerpackung(double vLaenge, double vBreite, double vTiefe) {
        return this.laenge <= vLaenge &&
                this.breite <= vBreite &&
                this.tiefe <= vTiefe;
    }

    public Artikel createClone() {
        return new Artikel(id, bezeichnung, gewicht, laenge, breite, tiefe, gefahrgut);
    }
}
