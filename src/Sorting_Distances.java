import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Sorting_Distances {

    public static void main(String[] args) throws IOException {

        // Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/SampleFiles/sorting.txt"));
        Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/JudgeFiles/sorting.txt"));
        int limit = Integer.parseInt(scan.nextLine());
        int[] distances = new int[limit];
        for (int i = 0; i < limit; i++) {
            distances[i] = Integer.parseInt(scan.nextLine());
        }

        // use the Arrays.sort() method
        Arrays.sort(distances);

        // print backwards through array
        for (int i = limit-1; i >= 0; i--) {
            System.out.println(distances[i]);
        }

    }

}
