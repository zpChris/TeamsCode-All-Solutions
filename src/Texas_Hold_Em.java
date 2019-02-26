import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Texas_Hold_Em {

    public static void main(String[] args) throws IOException {

        ArrayList<String> faceCards = new ArrayList<String>();
        faceCards.add("J");
        faceCards.add("Q");
        faceCards.add("K");
        faceCards.add("A");
        ArrayList<Integer> faceValues = new ArrayList<Integer>();
        faceValues.add(11);
        faceValues.add(12);
        faceValues.add(13);
        faceValues.add(14);

        // Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/SampleFiles/poker.txt"));
        Scanner scan = new Scanner(new File("/Users/christopherelliott/Desktop/all_problems/JudgeFiles/poker.txt"));
        int limit = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < limit; i++) {

            int[] cards = new int[15]; // int[] representing count of cards (cards[5] == 2 means that you have 2 '5's, a '14' is an Ace)
            // go through one line
            for (int j = 0; j < 7; j++) {
                String card = scan.next();
                int value = -1; // placeholder value
                if (!faceCards.contains(card)) {
                    value = Integer.parseInt(card);
                    cards[value]++;
                } else {
                    value = faceValues.get(faceCards.indexOf(card));
                    cards[value]++;
                }

            }

            // search for a triplet and print (do nothing if n/a)
            boolean triplet = false;
            for (int j = 14; j >= 2; j--) {
                if (cards[j] == 3) {
                    if (j > 10) {
                        String faceOfCard = faceCards.get(faceValues.indexOf(j));
                        System.out.println(faceOfCard + " " + faceOfCard + " " + faceOfCard);
                    } else {
                        System.out.println(j + " " + j + " " + j);
                    }
                    triplet = true;
                    break;
                }
            }
            // if no triplet, repeat by searching for double
            if (!triplet) {
                for (int j = 14; j >= 2; j--) {
                    if (cards[j] == 2) {
                        if (j > 10) {
                            String faceOfCard = faceCards.get(faceValues.indexOf(j));
                            System.out.println(faceOfCard + " " + faceOfCard);
                        } else {
                            System.out.println(j + " " + j + " " + j);
                        }
                        break;
                    }
                }
            }

        }



    }

}
