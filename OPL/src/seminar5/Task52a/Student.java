package seminar5.Task52a;

public class Student {
    String name;
    String mn;
    int[] noten = new int[5];

    public int avg() {
        int sum = 0;
        int c = 0;
        for(int i = 0; i < noten.length; i++) {
            if(noten[i] != 0) {
                sum = sum + noten[i];
                c++;
            }
        }
        return sum / c;
    }
}

