package seminar5.Task52a;

public class StudentTest {

    public static void main(String[] args) {
        Student s = new Student();

        Lecture l1 = new Lecture("Logik");
        Lecture l2 = new Lecture("Mathe");

        l1.addToCourse(s);
        l1.addGrade(s,5);

        System.out.println(s.avg());

    }
}
