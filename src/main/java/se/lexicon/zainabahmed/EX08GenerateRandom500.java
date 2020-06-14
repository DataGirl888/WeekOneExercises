package se.lexicon.zainabahmed;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

//WEEK ONE EXERCISES
/*EX. 08  Write a program that first generates a random number between 1 and 500
and stores it into a variable (see the Random class).
Then let the user make a guess for which number it is.
If the user types the correct number, display a message (including the number of guesses he has made).
If he types a number that is greater or smaller than the given number, display either “Your guess was too small”
or “Your guess was too big”.
The program should keep executing until the user input the correct guess.

 */
public class EX08GenerateRandom500 // USING  Random.ints as this is familiar from C#
{

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Welcome to Bingo: guess the secret number!: ");

        int userNumber =0, randomizedNumber = 1, guessCounter=0;
        randomizedNumber = generateRandomNumberInts(1, 501);  // the randomly generated number between 1 to 500

        while(userNumber != randomizedNumber)    // program continues until user enters the correct number
        {
           userNumber = getUserInputRandomNumber();    // the user's input between 1 to 500
           guessCounter++;  // increment the number of guesses by one with every iteration
                /*System.out.println("Guess counter " + guessCounter);  //testing my code
                System.out.println("User number " + userNumber);
                System.out.println("Random number " + randomizedNumber); */
         if (userNumber == randomizedNumber)
         {
            System.out.println("Bingo! Good guess! The correct number is " + userNumber );
            System.out.println("You got lucky in " + guessCounter + " guesses.");
         }
         else if (userNumber > randomizedNumber)
            {
                System.out.println("Your guess was too big.");
            }
         else if (userNumber < randomizedNumber)
                {
                    System.out.println("Your guess was too small. ");
                }
        }
    }
    public static int generateRandomNumberInts(int min, int max)
    {
        Random random = new Random();
        return random.ints(1, 501).findFirst().getAsInt();
    }
    //DEFINE INT METHOD TO TAKE A NUMBER AS USER INPUT WITH SCANNER AND CONVERT TO INT
    public static int getUserInputRandomNumber()
    {
        System.out.print("Please enter any whole number between 1 and 500: ");
        String userInput = scanner.nextLine();
        return  Integer.valueOf(userInput);
    }
}
