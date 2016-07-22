package palimdromy;

import java.util.Scanner;

public class Palimdromy {

    static int[] letters = new int[32];

    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);
        System.out.println("Podaj palindrom: ");
        String text = reading.nextLine().toUpperCase().replace(" ", "");
        int oddNumber = 0;

        for (int i = 0; i <= text.length() - 1; i++) {
            addLetterToTable(text.substring(i, i + 1));
        }

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] % 2 != 0 && letters[i] != 0) {
                oddNumber++;
            }
        }

        if (oddNumber > 1) {
            System.out.println("Słowo nie jest palindromem");
        } else {
            System.out.println("Słowo jest palindromem");
        }
    }

    public static void addLetterToTable(String a) {
        char character = a.charAt(0);
        int ascii = (int) character;
        letters[ascii - 65] += 1;
    }
}
