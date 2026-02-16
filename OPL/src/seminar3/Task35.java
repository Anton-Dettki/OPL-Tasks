package seminar3;

public class Task35 {

    public static void main(String[] args) {

        //Task 1
        int i = 5;
        int j = 6;
        int sum = 0;
        do {
            sum += i;
            j--;
        }
        while (j != 0);
        System.out.println(sum);

        // This doesnt work when multiplying with 0

        //Task 2
        double randomNumber = 0;
        do {
            randomNumber = Math.random();
            System.out.println(randomNumber);
        } while (randomNumber > 0.2);

        double randomNumbersSum = 0;
        for (int r = 0; r < 100; r++) {
            randomNumbersSum += Math.random();
        }
        System.out.println("Average is: " + randomNumbersSum / 100);


        //Task 3
        for(int h = 3; h < 10000; h++) {
            int q = 1;
            do {
                q++;
            } while ( h % q != 0);

            if(q == h) {
                System.out.println("Found a prime: " + h);
            }
        }
    }
}
