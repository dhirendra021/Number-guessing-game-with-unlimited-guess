
import java.util.Scanner;

public class GuessingNumberGame {
    public static void numberGame()
    {
        Scanner sc = new Scanner(System.in);

        // Generate a random number between 1 and 50
        int number = 1 + (int)(50 * Math.random());

        // Track the number of attempts
        int attempts = 0;

        // Maximum attempts per round
        int K = 6;
        boolean guessedCorrectly = false;

        System.out.println(
                "A number is chosen between 1 and 50.");
        System.out.println(
                "You have " + K
                        + " attempts per round to guess the correct number.");

        while (!guessedCorrectly) {

            // Give the user K attempts per round
            for (int i = 0; i < K; i++) {
                System.out.print("Enter your guess number: ");
                int guess = sc.nextInt();
                attempts++; // Increment attempt count

                if (guess == number) {
                    System.out.println(
                            "Congratulations!!! You guessed the correct number in "
                                    + attempts + " attempts.");
                    guessedCorrectly = true;
                    break;
                }
                else if (guess < number) {
                    System.out.println(
                            "The number is greater than "
                                    + guess);
                }
                else {
                    System.out.println(
                            "The number is less than " + guess);
                }
            }

            if (!guessedCorrectly) {

                // Ask the user if they want to continue
                // after exhausting K attempts
                System.out.println("You used your all " + K
                        + " attempts.");
                System.out.print(
                        "Do you want to continue guessing? [yes/no]: ");
                String response = sc.next();

                if (!response.equalsIgnoreCase("yes")) {
                    System.out.println(
                            "Game Over!!!! The correct number was: "
                                    + number);
                    break;
                }
            }
        }

        sc.close();
    }

    public static void main(String[] args)
    {
        numberGame();
    }
}
