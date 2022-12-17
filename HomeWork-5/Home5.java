/**
 * Java Basic Home work #5
 *
 * @author Nataliia Terebilo
 * @ TODO: 19.09.2022
 * @ date 30.09.2022
 */

import java.util.Random;
import java.util.Scanner;

class Home5 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] words = {"wood", "bear", "beer", "food", "foot", "boot", "root"};
        String word = words[random.nextInt(words.length)];
        char[] mask = {'*', '*', '*', '*'};
        int counter = 0;
        int letterCounter = 0;

        do {
            counter++;
            System.out.print("Gess the mask:\n" + new String(mask));
            char letter = scanner.next().charAt(0);
            for (int i = 0; i < word.length(); i++) {
                if (letter == word.charAt(i) && mask[i] == '*') {
                    mask[i] = letter;
                    letterCounter++;
                }
            }
        } while (letterCounter < word.length()); 

        System.out.println("You gess the word [" + word + "], attempts: " + counter);
    }
}