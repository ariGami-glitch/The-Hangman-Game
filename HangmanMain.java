import java.util.*;

/**
 * This class represents where the main program will be running
 */
public class HangmanMain {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        Scanner s = new Scanner(System.in);

    }

    /**
     * This method obtains the userInput
     * @param s a Scanner
     * @return a String which is the user's word
     */
    public static String getInput(Scanner s) {
        System.out.print("Player 1, please input your word: ");
        String word = s.nextLine();
        return word;

    }

    public static String getMode(Scanner s) {

    }
}
