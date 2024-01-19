import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        boolean tryAgain = true;

        while (tryAgain){
            System.out.println("Hello and welcome");
            System.out.print("Choose a number between 1 to 100: ");

            //range
            Random random = new Random();
            int numberGuess = random.nextInt(100);

            Scanner input = new Scanner(System.in);
            String inputString = input.nextLine();
            int Guess = Integer.parseInt(inputString);

            System.out.println("Number to Guess: " + numberGuess);

            if (Guess == numberGuess) {
                System.out.println("Congrats you guessed the number!");
            } else {
                System.out.println("Nice Try!");
            }

            System.out.println("Do you want to try Again? (y/n): ");
            String tryAgainInput = input.nextLine().toLowerCase();
            tryAgain = tryAgainInput.equals("y");
        }
    }
}