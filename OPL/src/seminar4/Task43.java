package seminar4;

public class Task43 {
    public static void main(String[] args) {
        // Task 2 Already did in Task42
        // Task 3: Man kann mit dem Wert im programm weiter arbeiten
        // Task 5: prints are wrong

        Task43 t = new Task43();
        String[] arr = t.breakdown("Break down this sentence.");
        String[] arr2 = t.breakdown("No");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

    String[] breakdown(String text) {
        return text.split(" ");
    }
}

//                                 boolean width?
//    public static void checkSize(boolean width, double depth, double height) {
//        if (width <= 800) {
//            if (depth <= 1200) {
//                if (height <= 1600) {
//                    System.out.println(“Box too big.“);
//                } else {
//                    return „Box okay.“; //Void return statement
//                }
//            else{
//                    System.out.println(„Box okay.“);
//                }
//            }
//        }
//    }
