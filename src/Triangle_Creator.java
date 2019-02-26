import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Triangle_Creator {

    /* To solve this problem, I suggest you draw out the triangle.*/

    public static void main(String[] args) throws IOException {

        // Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/SampleFiles/triangle.txt"));
        Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/JudgeFiles/triangle.txt"));
        int limit = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < limit; i++) {
            int size = Integer.parseInt(scan.nextLine());
            // for loop for the number of lines
            for (int j = 0; j < size; j++) {
                // print the spaces
                for (int k = size-1-j; k >= 0; k--) {
                    System.out.print(" ");
                }
                System.out.print("/"); // print the '/'
                // print the spaces in between '/' and '\'
                for (int k = 0; k < j*2; k++) {
                    if (j == size-1) {
                        System.out.print("_"); // if at the last line, print the bottom of the triangle
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("\\"); // print the '\' and give new line
            }
            System.out.println(); // separator line between the triangles
        }

    }

}
