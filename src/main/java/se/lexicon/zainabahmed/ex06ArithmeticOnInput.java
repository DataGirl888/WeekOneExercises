package se.lexicon.zainabahmed;

import com.sun.media.sound.InvalidFormatException;

import java.io.IOException;
import java.util.Scanner;

//WEEK ONE EXERCISES
//EX. 06 Take User Input of two numbers and print their sum, multiplication, division and subtraction

public class ex06ArithmeticOnInput
{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        //PLACEHOLDER VARIABLES TO HOLD OPERAND VALUES
        int myFirstNumber, mySecondNumber;
        //int result = 0;

        // removing while loop for menu, for now, throwing errors
        //String exitLoopX ="a";   // variable storing user input to exit while loop
        //Integer exitZero = 1;   // was trying integer 0 to exit while loop

        //Integer exitZero = scanner.nextInt() ;   // variable storing user input to exit
        /*while (exitLoopX != "x") //|| exitLoopX != "X");
        {*/   // removing while loop for menu, throwing errors

            //TAKE NUMBERS FROM USER
           /*try // commenting out the try catch exception handling block, was testing it for later
           {*/
               System.out.println("Performing calculations on two numbers entered below. ");
               myFirstNumber = getUserInput();
               mySecondNumber = getUserInput();
           /*}
           catch(InvalidFormatException ex)   // commented out, was checking out java exception handling
           {
           System.out.println(ex.getMessage());
           }*/  // commenting out the try catch block, was testing it
            //System.out.println("The numbers are: " + myFirstNumber + " and " + mySecondNumber );  // testing my code

            //MENU DISPLAYED TO USER
                                        //char menuOperator = 'a';  // redundant
            System.out.println("Which calculation do you require? " );
            System.out.println("(Enter A for addition, M for multiplication, D for division, S for subtraction )" );
            char menuOperator = scanner.next().charAt(0);
            switch(menuOperator)
            {
                case 'A':
                case 'a':
                case '+':
                    System.out.println("The sum of " + myFirstNumber + " + "+ mySecondNumber + " = "+(myFirstNumber+mySecondNumber));
                    break;
                case 'M':
                case 'm':
                case '*':
                    System.out.println("The product of " + myFirstNumber + " * "+ mySecondNumber + " = "+(myFirstNumber * mySecondNumber));
                    break;
                case 'D':
                case 'd':
                case '/':
                    System.out.println("The quotient of " + (float)myFirstNumber + " / "+ (float)mySecondNumber + " = "+(float)(myFirstNumber) / mySecondNumber);
                    break;
                case 'S':
                case 's':
                case '-':
                    System.out.println("The difference between " + myFirstNumber + " - "+ mySecondNumber + " = "+(myFirstNumber+mySecondNumber));
                    break;
                default:
                    System.out.println("Error: only +, *, /, - are supported. ");
            /*}  // removing while loop, errors
            System.out.println("Press x to exit :");
            exitLoopX = scanner.nextLine(); */  // take user input to exit loop
            //exitZero = Integer.valueOf(scanner.nextLine());  // Removing exit loop, throwing format exception
            //exitZero = Integer.parseInt(scanner.nextLine());  // was throwing a format exception
        }

    }
    //DEFINE INT METHOD TO TAKE USER INPUT AND CONVERT TO INT
    public static int getUserInput()
    {
        System.out.print("Please enter a number: ");
        String userInput = scanner.nextLine();
        return  Integer.valueOf(userInput);
        //return userInputNumber;
    }
}
