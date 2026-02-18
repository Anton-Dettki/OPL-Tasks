package seminar4;

public class Task41 {
    public static void main(String[] args) {
        Task41 t = new Task41();

        for(int i = 0; i < 10; i++) {
            t.printName("Hans");
            t.printOther("Meow");
        }
    }

    void printName(String name) {
        System.out.println("Dein Name ist: "+ name);
    }

    void printOther(String text) {
        System.out.println(text);
    }
}
