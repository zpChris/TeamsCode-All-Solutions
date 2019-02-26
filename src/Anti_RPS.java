import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Anti_RPS {

    public static void main(String[] args) throws IOException {

        // Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/SampleFiles/anti-rps.txt"));
        Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/JudgeFiles/anti-rps.txt"));
        String rps = scan.nextLine();
        for (int i = 0; i < rps.length(); i++) {
            if (rps.charAt(i) == 'R') {
                System.out.print("S");
            } else if (rps.charAt(i) == 'S') {
                System.out.print("P");
            } else if (rps.charAt(i) == 'P') {
                System.out.print("R");
            }
        }

    }

}
