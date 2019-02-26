import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Valid_DNA {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/SampleFiles/dna.txt"));
        // Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/JudgeFiles/dna.txt"));
        int limit = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < limit; i++) {
            boolean valid = true;
            String firstDNA = scan.nextLine();
            String secondDNA = scan.nextLine();
            for (int j = 0; j < 10; j++) {
                if (firstDNA.charAt(j) == 'A' && secondDNA.charAt(j) != 'T') {
                    valid = false;
                } else if (firstDNA.charAt(j) == 'T' && secondDNA.charAt(j) != 'A') {
                    valid = false;
                } else if (firstDNA.charAt(j) == 'C' && secondDNA.charAt(j) != 'G') {
                    valid = false;
                } else if (firstDNA.charAt(j) == 'G' && secondDNA.charAt(j) != 'C') {
                    valid = false;
                }
            }
            if (valid) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }

    }

}
