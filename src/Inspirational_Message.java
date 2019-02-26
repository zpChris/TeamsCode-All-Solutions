import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Inspirational_Message {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/SampleFiles/inspiring.txt"));
        // Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/JudgeFiles/inspiring.txt"));
        int limit = Integer.parseInt(scan.nextLine());
        System.out.println("/----------\\");
        for (int i = 0; i < limit; i++) {
            String word = scan.nextLine();
            System.out.println("\\*!" + word + "!*/");
        }
        System.out.println("\\----------/");

    }


}
