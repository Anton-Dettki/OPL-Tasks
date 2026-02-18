package seminar5.Task52;

public class Lager {
    private int regalboedenNr;
    private int faecher;
    private Artikel lager[][];

    public Lager(int rNr, int fNr) {
        regalboedenNr = rNr;
        faecher = fNr;
        lager = new Artikel[rNr][fNr];
    }

    public void printLager() {
        for (int i = 0; i < regalboedenNr; i++) {
            System.out.println("RegalbodenNr: " + i);
            for (int j = 0; j < faecher; j++) {
                if (lager[i][j] != null) System.out.println("In Fach: (" + i + "," + j +") liegt der Artikel mit Id: " + lager[i][j].getId());
                else System.out.println("In Fach: (" + i + "," + j +") liegt kein Artikel");
            }

        }
    }

    public void insert(int rNr, int fNr, Artikel a) {
        if(a.isStored()) {
            System.out.println("Artikel bereits im Lager");
            return;
        }
        if(lager[rNr][fNr] != null) {
            System.out.println("Platz bereits belegt");
            return;
        }
        a.setStored(true);
        lager[rNr][fNr] = a;
    }

    public void empty(int rNr, int fNr) {
        lager[rNr][fNr].setStored(false);
        lager[rNr][fNr] = null;
    }
}
