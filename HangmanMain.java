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

    /**
     * This method obtains whether the user wants to play against the computer
     * or another player in the same room.
     * @param s a Scanner
     * @return a String that represents the game mode or whether they want to quit
     */
    public static String getMode(Scanner s) {
        System.out.println("1. One Player Game\n" +
                "2. Two Player Game\n" +
                "q. Quit");
        String mode = s.nextLine();

        return mode;
    }

}
