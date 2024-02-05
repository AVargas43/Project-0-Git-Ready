import java.util.Random;
import java.util.Scanner;

    public class GuessingGame
    {
        public static void main(String[] args)
        {
            Scanner keyboard = new Scanner(System.in);
            Random rand = new Random();
            if (args.length > 0){
            rand.setSeed(Long.valueOf(args[0]));
            }
            int secretNumber = rand.nextInt(100) + 1;
            int userGuess;
            int guessCounter = 0;

            final int QUIT = 0;

            System.out.println("Guess My Number Game by A. Vargas");
            System.out.println();

            System.out.println("A secret number between 1-100 has been generated...");
            System.out.println("Enter guess 0 to quit.");
            System.out.println();

            System.out.print("Enter your guess? ");
            userGuess = keyboard.nextInt();
            System.out.println();

            while(userGuess != secretNumber && userGuess != 0)
            {
                if(userGuess > secretNumber){
                    System.out.println("Guess is high, try again.");
                    System.out.print("Enter your guess again? ");
                    userGuess = keyboard.nextInt();
                    System.out.println();
                }
                else {
                    System.out.println("Guess is low, try again.");
                    System.out.print("Enter your guess again? ");
                    userGuess = keyboard.nextInt();
                    System.out.println();
                }
                guessCounter++;
            }

            if(userGuess == secretNumber){
                if(guessCounter == 1){
                System.out.println("Congratulations, you got it in 1 guess!");
                } else {
                System.out.println("");
                System.out.println("Correct in " + guessCounter + " guesses.");
                }
            }
            if(userGuess == QUIT){
                System.out.println("");
                System.out.println("The secret number is " + secretNumber);
            }

        }
    }