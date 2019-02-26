import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Compound_Interest {

    public static void main(String[] args) throws IOException {

        // Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/SampleFiles/compound.txt"));
        Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/JudgeFiles/compound.txt"));
        int limit = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < limit; i++) {
            int P = scan.nextInt();
            double n = scan.nextInt();
            double r = scan.nextDouble();
            int t = scan.nextInt();
            System.out.println("$" + (int) (P * (Math.pow(1 + r/n, n*t))));
        }
    }

}
