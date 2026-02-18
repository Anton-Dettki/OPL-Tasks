package seminar5.Task51;

public class Lager {
    Artikel[][][] regale;

    public Lager(int amtRegale, int regalboeden, int stellplaetze) {
        this.regale = new Artikel[amtRegale][regalboeden][stellplaetze];
    }

    public void intoFach(int regalNr, int bodenNr, int stellplatzNr, Artikel objekt) {
        if(regale[regalNr][bodenNr][stellplatzNr] == null) {
            regale[regalNr][bodenNr][stellplatzNr] = objekt;
        } else {
            System.out.println("Fach bereits belegt");
        }
    }

    public boolean nextEmptyFach(Artikel obj) {
        for(int i = 0; i < regale.length; i++) {
            for(int j = 0; j < regale[i].length; j++) {
                for(int k = 0; k < regale[i][j].length; k++) {
                    if (regale[i][j][k] == null || regale[i][j][k].id == 0) {
                        regale[i][j][k] = obj;
                        System.out.println("Saved in " + i + " " + j + " " + k);
                        return true;
                    }
                }
            }
        }
        System.out.println("Kein Freies Fach mehr verfügbar");
        return false;
    }

    public Artikel emptyFach(int regalNr, int bodenNr, int stellplatzNr) {
        Artikel r = regale[regalNr][bodenNr][stellplatzNr];
        regale[regalNr][bodenNr][stellplatzNr] = null;
        return r;
    }

    public int emptyFirstArtikel(int artikelId) {
        for(int i = 0; i < regale.length; i++) {
            for(int j = 0; j < regale[i].length; j++) {
                for(int k = 0; k < regale[i][j].length; k++) {
                    if (regale[i][j][k] != null && regale[i][j][k].id == artikelId) {
                        regale[i][j][k] = null;
                        System.out.println("Removed from fach");
                        return artikelId;
                    }
                }
            }
        }
        System.out.println("Nicht im Lager gefunden");
        return artikelId;
    }

    public void findAllOccur(int rNr, int bNr, int sNr, Artikel artikel) {
        for(int i = 0; i < regale.length; i++) {
            for(int j = 0; j < regale[i].length; j++) {
                for(int k = 0; k < regale[i][j].length; k++) {
                    if (regale[i][j][k] == artikel) {
                        System.out.println("Artikel at: " + i + " " + j + " " + k);
                    }
                }
            }
        }
    }

    public void printFach(int regalNr, int bodenNr, int stellplatzNr) {
        regale[regalNr][bodenNr][stellplatzNr].print();
    }

    public void printLager() {
        for(int i = 0; i < regale.length; i++) {
            for(int j = 0; j < regale[i].length; j++) {
                for(int k = 0; k < regale[i][j].length; k++) {
                    if(regale[i][j][k] != null) {
                        regale[i][j][k].print();
                    }
                    else {
                        System.out.println("Lager platz leer");
                    }
                }
            }
        }
    }
}
