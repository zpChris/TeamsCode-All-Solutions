import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Bookcase {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/SampleFiles/bookcase.txt"));
        // Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/JudgeFiles/bookcase.txt"));
        int limit = Integer.parseInt(scan.nextLine());
        String[] books = new String[limit];
        for (int i = 0; i < limit; i++) {
            books[i] = scan.nextLine();
        }

        Arrays.sort(books);

        for (int i = 0; i < limit; i++) {
            System.out.println(books[i]);
        }

    }

}
