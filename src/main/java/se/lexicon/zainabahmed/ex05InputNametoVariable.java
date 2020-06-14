package se.lexicon.zainabahmed;
import java.util.Scanner;
//WEEK ONE EXERCISES
//EX. 05 Take user name as input, store as variable and print 'Hello Username'

public class ex05InputNametoVariable
{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Taking your name as input and displaying a greeting.");
        String userName = getUserName();                    // call the method to take and save user name, then print
        System.out.println("Hello " + userName);
    }

    //DEFINED A METHOD TO TAKE USER NAME INPUT
    public static String getUserName()
    {
        System.out.println("Please enter your name: ");
        String userNameInput = scanner.nextLine();
        return userNameInput;
    }
}
