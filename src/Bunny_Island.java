import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Bunny_Island {

    static int months = -1; // placeholder value, changed in main

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/SampleFiles/bunny.txt"));
        // Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/JudgeFiles/bunny.txt"));
        int limit = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < limit; i++) {
            int f2 = scan.nextInt();
            int f1 = scan.nextInt();
            months = scan.nextInt();
            System.out.println(fibonacci(1, f1, f2));
        }

    }

    public static int fibonacci(int limit, int n1, int n2) {

        if (limit == months) {
            return n1+n2;
        } else {
            return fibonacci(limit+1, n1+n2, n1);
        }

    }

}
