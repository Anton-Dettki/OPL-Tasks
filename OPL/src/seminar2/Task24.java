package seminar2;

public class Task24 {
    public static void main(String[] args) {
        // Task 1 
        String vorname = "Anton ";
        String nachname = "Dettki";

        // Task 2
        String name = vorname + nachname;

        // Task 3
        System.out.println(name);
        System.out.println(name.substring(0,5));
        System.out.println(name.substring(6,12));

        // Task 4
        System.out.println(name.substring(6,12) + " " + name.substring(0,5));

        String doubleName = "Anton Dettki Anton Dettki";
        // This is over the top but fun
        System.out.println(doubleName.substring(0, doubleName.length() / 2) + doubleName.substring(doubleName.length() / 2, doubleName.length()).replace("Anton", "Anton xyz"));

        // Task 5
        int a1 = 21;
        int a2 = 21;

        int addition = a1 + a2;
        String additionString = Integer.toString(a1) + Integer.toString(a2);

        System.out.println(addition);
        System.out.println(additionString);
    }
}
