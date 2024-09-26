import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println("Random number is: " + randomNumber);

        System.out.println("Guess the output");
        Scanner sc = new Scanner(System.in);

        while (true) {
            int userInput = sc.nextInt();
            if (userInput < randomNumber) {
                System.out.println("Too low, try again.");
            } else if (userInput > randomNumber) {
                System.out.println("Too high, try again.");
            }
            if (userInput == randomNumber)
                break;
        }
    }
}
