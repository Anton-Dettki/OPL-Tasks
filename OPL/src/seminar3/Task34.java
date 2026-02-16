package seminar3;

import java.util.ArrayList;

public class Task34 {
    public static void main(String[] args) {
        int[] array1 = {2,5,2,8,6,9,5,3,6,7,2,3,5,1,7,8,5,9,7,5,3,4,6,3,4,2,1};
//        ArrayList<Integer> ind = new ArrayList<Integer>();
//
//
//        for(int i = 0; i < array1.length; i++) {
//            if(array1[i] == 2) {
//                ind.add(i);
//            }
//        }
//        System.out.println(ind.size());
//        System.out.println(ind);

        int[] array2 = new int[array1.length];
        int[] array3 = new int[array1.length];

        for(int i = 0; i < array1.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += array1[j];
            }
            array2[i] = sum;
        }

        // With one for loop
        int sum = 0;
        for (int i = 0; i < array3.length; i++) {
            sum += array1[i];
            array3[i] = sum;
        }


        for(int i = 0; i < array2.length; i++) {
            System.out.println(array2[i] + " AND " + array3[i]);
            // Check if each place is the same
            System.out.println(array2[i] == array3[i]);
        }
        System.out.println(array2.length == array3.length);


        for(int i = 7; i <= 70; i = i + 7) {
            System.out.println(i);
        }

    }
}
