package seminar2;

public class Task25 {

    public static void main(String[] args) {
        // Task 1
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        // arr[2] = arr[0] + arr[1];

        System.out.println(arr[2]);

        // Task 2
        String[] words = {"Hello", "World", "from TUHH"};

        // Task 3 - The point is to show that when cloning, we dont point to the same memory anymore
        int[] arr2 = arr;
        //arr[2] = arr[0] + arr[1];
        System.out.println(arr2[2]);

        int[] arr3 = arr.clone();
        arr[2] = arr[0] + arr[1];
        System.out.println(arr3[2]);

        // Task 4
        int[][] doubleArr = new int[3][2];
        
        int[][] doubleArr2 = {{0,0},{1,1}};

    }
    
}
