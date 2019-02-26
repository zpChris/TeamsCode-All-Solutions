import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Chopping_Trees {

    public static void main(String[] args) throws IOException {

        // Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/SampleFiles/chopping.txt"));
        Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/JudgeFiles/chopping.txt"));
        int limit = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < limit; i++) {
            int swingTime = scan.nextInt();
            int swingCount = scan.nextInt();
            int cleanTime = scan.nextInt();
            int treeCount = scan.nextInt();
            System.out.println(treeCount * (swingTime*swingCount + cleanTime));
        }


    }

}
