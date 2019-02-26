import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Word_Spelling {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/SampleFiles/spelling.txt"));
        // Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/JudgeFiles/spelling.txt"));
        int limit = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < limit; i++) {
            char[] target = scan.next().toCharArray();
            char[] letters = new char[scan.nextInt()];
            for (int j = 0; j < letters.length; j++) {
                letters[j] = scan.next().charAt(0); // convert String to character, add to array
            }

            if (letters.length < target.length) {
                System.out.println("no");
            } else {

                // when the target[] char is found in letters[], the char in letters[] is replaced by ' ' (to avoid double counting)
                int count = 0;
                for (int j = 0; j < target.length; j++) {
                    for (int k = 0; k < letters.length; k++) {
                        if (target[j] == letters[k]) {
                            letters[k] = ' ';
                            count++;
                            break;
                        }
                    }
                }

                if (count == target.length) {
                    System.out.println("yes"); // all chars in target[] were found
                } else {
                    System.out.println("no");
                }

            }
        }

    }

}
