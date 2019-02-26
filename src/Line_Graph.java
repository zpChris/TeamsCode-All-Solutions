import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Line_Graph {

    public static void main(String[] args) throws IOException {

        // Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/SampleFiles/line.txt"));
        Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/JudgeFiles/line.txt"));
        int limit = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < limit; i++) {
            int m = scan.nextInt();
            int x = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(m * x + b);
        }

    }

}
