package altklausur.task4;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.compute(new int[]{1, 2, 3, 4, 5, 6}));
    }

    public int compute(int[] arr) {
        int x = 0;
        if(arr.length % 2 == 0){
            for (int i = 0; i<arr.length-1; i++) {
                x += arr[i] * arr[i+1];
            }
        } else {
            for (int i = 0; i<arr.length-2; i++) {
                x += arr[i] * arr[i+1];
            } x+= arr[arr.length -1];
        }
        return x;
    }

    public int compute2(int[] arr) {
        int x = 0;
        for (int i = 0; i<arr.length-2; i++) {
            x += arr[i] * arr[i+1];
        }
        return x;
    }
}
