import java.util.Scanner;
import java.util.Random;

// Chat GPT 코드 (240905)
// Let me know simple JAVA code to make interesting for beginner.
// 숫자를 추측하기 게임
public class My_first_JAVA_Code_240905 {
    public static void main(String[] args) {
        // Create a random number generator
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Generates a number between 1 and 100
        int numberOfTries = 0;
        int guess = 0;
        boolean hasGuessedCorrectly = false;

        // Create a scanner object to get user input
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

        // Game loop
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt(); // Get user's guess
            numberOfTries++; // Increment the number of tries

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true; // User guessed correctly
                System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
            }
        }
    }
}