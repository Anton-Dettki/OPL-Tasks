package seminar5.Task52;

public class TestClass {
    public static void main(String[] args) {
        Artikel a1 = new Artikel(1, "Zeug", 1,1,1,1,true);
        Artikel a2 = new Artikel(2, "Zeug", 1,1,1,1,true);

        Lager l = new Lager(2,2);
        l.insert(0,0,a1);
        l.insert(0,1,a1);
        l.insert(1,0,a2);

        l.printLager();

    }
}
