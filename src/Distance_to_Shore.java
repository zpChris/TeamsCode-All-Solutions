import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Distance_to_Shore {

    public static void main(String[] args) throws IOException {

        // Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/SampleFiles/distance.txt"));
        Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/JudgeFiles/distance.txt"));
        int limit = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < limit; i++) {
            String firstLetter = scan.next();
            double firstNum = scan.nextDouble();
            String secondLetter = scan.next();
            double secondNum = scan.nextDouble();

            // the only letter you need to find is "C"
            if (firstLetter.equals("C")) {
                System.out.println((int) Math.sqrt(firstNum * firstNum - secondNum * secondNum)); // order of operations
            } else if (secondLetter.equals("C")) {
                System.out.println((int) Math.sqrt(secondNum * secondNum - firstNum * firstNum));
            } else {
                System.out.println((int) Math.sqrt(secondNum * secondNum + firstNum * firstNum));
            }

        }


    }

}
