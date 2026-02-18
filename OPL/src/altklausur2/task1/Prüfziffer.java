package altklausur2.task1;

public class Prüfziffer {

    public static void main(String[] args) {
        Prüfziffer p = new Prüfziffer();
        System.out.println(p.checkIsbn(new int[]{0,7,4,7,5,6,9,3,6,3}));
    }

    public String checkIsbn(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i] * (i+1);
        }

        int mod = sum % 11;
        return mod == 10 ? "X" : Integer.toString(mod);
    }
}
