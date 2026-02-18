package seminar5.Task52a;

import java.util.ArrayList;

public class Lecture {
    String name;
    ArrayList<Student> teilnehmer = new ArrayList<Student>();

    public Lecture(String name) {
        this.name = name;
    }

    public void addToCourse(Student s) {
        teilnehmer.add(s);
    }

    public void addGrade(Student s, int grade) {
        for(int i = 0; i < 5; i++) {
            if(s.noten[i] == 0) {
                s.noten[i] = grade;
            }
        }
   }

}
