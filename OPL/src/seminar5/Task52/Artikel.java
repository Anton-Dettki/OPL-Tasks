package seminar5.Task52;

public class Artikel {
    private int id;
    private String bezeichnung;
    private double gewicht;
    private double laenge;
    private double breite;
    private double tiefe;
    private boolean gefahrgut = false;
    private boolean isStored = false;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getTiefe() {
        return tiefe;
    }

    public void setTiefe(double tiefe) {
        this.tiefe = tiefe;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public boolean isGefahrgut() {
        return gefahrgut;
    }

    public void setGefahrgut(boolean gefahrgut) {
        this.gefahrgut = gefahrgut;
    }

    public boolean isStored() {
        return isStored;
    }

    public void setStored(boolean stored) {
        isStored = stored;
    }
}
