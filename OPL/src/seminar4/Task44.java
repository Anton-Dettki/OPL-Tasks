package seminar4;

import java.util.Arrays;

public class Task44 {
    public static void main(String[] args) {
        Task44 t = new Task44();
        System.out.println(t.factorial(7));
        System.out.println(t.zinsenIterativ(100,12));
        System.out.println(t.zinsenRekursive(100,12));

        System.out.println(t.sum(new int[]{1, 2, 3, 10}));
        System.out.println(t.sumRec2(new int[]{1, 2, 3, 10},0,0));
    }

    int factorial(int i) {
        int sum = 1;
        if(i == 0) return 1;

        return i * factorial(i-1);
    }

    double zinsenIterativ(double geld, int jahre) {
        for (int i = 0; i < jahre; i++) {
            geld = geld + geld * 0.05;
        }
        return geld;
    }

    double zinsenRekursive(double geld, int jahre) {
        if (jahre == 0) return geld;
        return zinsenRekursive(geld * 1.05, jahre - 1);
    }

    public int ggtIterativ(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a; // oder b, da a == b
    }

    public static int ggtRekursiv(int a, int b) {
        if (a == b) {
            return a;
        }

        if (a > b) {
            return ggtRekursiv(a - b, b);
        } else {
            return ggtRekursiv(a, b - a);
        }
    }

    public static int head(int[] arr) { //gibt das erste Element eines Arrays zurück, oder -1 falls es [] ist
        return arr.length >= 1 ? arr[0] : -1;
    }

    public static int[] tail(int[] arr) { //gibt ‚den Rest‘ eines Arrays wider, also das Array ohne das erste Element
        return arr.length >= 1 ? Arrays.copyOfRange(arr,1,arr.length) : arr;
    }

    public int sum(int[] arr) {
        if(head(arr) == -1) return 0;
        return head(arr) + sum(tail(arr));
    }

    public int sumRec2(int[] arr, int i, int j) {
        if(j != arr.length) {
            int c = i + arr[j];
            sumRec2(arr, c, j + 1);
        };
        return i;
    }
}
