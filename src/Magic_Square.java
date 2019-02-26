import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Magic_Square {

    public static void main(String[] args) throws IOException {

        // Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/SampleFiles/magic.txt"));
        Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/JudgeFiles/magic.txt"));
        int limit = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < limit; i++) {
            int[][] square = new int[3][3];
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    square[r][c] = scan.nextInt();
                }
            }
            int totalCount = 0; // total count of those that don't add up to 15
            // add rows
            for (int r = 0; r < 3; r++) {
                if (square[r][0] + square[r][1] + square[r][2] != 15) {
                    totalCount++;
                }
            }
            // add columns
            for (int c = 0; c < 3; c++) {
                if (square[0][c] + square[1][c] + square[2][c] != 15) {
                    totalCount++;
                }
            }
            // add diagonals
            if (square[0][0] + square[1][1] + square[2][2] != 15) {
                totalCount++;
            }
            if (square[0][2] + square[1][1] + square[2][0] != 15) {
                totalCount++;
            }

            System.out.println(totalCount);
        }

    }

}
