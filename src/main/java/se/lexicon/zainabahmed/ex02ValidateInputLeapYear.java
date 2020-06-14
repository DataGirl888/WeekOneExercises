package se.lexicon.zainabahmed;
import java.util.Scanner;

//WEEK ONE EXERCISES
//EX. 02 Take a year as input and print if it is a leap year or not
/* USING THE FOLLOWING CRITERIA TO CALCULATE LEAP YEAR
leap Year Rules: How to Calculate Leap Years
In the Gregorian calendar, three criteria must be taken into account to identify leap years:
-1. The year must be evenly divisible by 4;
-2. If the year can also be evenly divided by 100, it is not a leap year;
unless...
-3. The year is also evenly divisible by 400. Then it is a leap year.
https://www.timeanddate.com/date/leapyear.html
*/
public class ex02ValidateInputLeapYear

{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Checking to see if a given year is a 'leap year'. ");
        int userYear = getUserInputSeconds(), yearByFour =userYear%4, yearBy400 =userYear%400;
        //System.out.println( "User year = " + userYear + "User year mod 4 = " + yearByFour +" User year mod 4 = " + yearBy400 ); //testing code

        if ((userYear % 100) == 0)   // testing if it is a century (leap year rule 2)
        {
            if ((userYear % 400) == 0)  // if century, testing if it is divisible by 400 (leap year rule 3)
            {
                System.out.println("Yes, " + userYear + " is a leap year. " );
            }
            else
                {
                    System.out.println("No, " + userYear + " is not a leap year. " );
                }
        }
        else if ((userYear % 4) == 0)   // testing if divisible by 4 (leap year rule 1)
        {
            //System.out.println("Yes, {0} is a leap year. ", userYear);
            System.out.println("Yes, " + userYear + " is a leap year. " );
        }
            else
                {
                 System.out.println("No, " + userYear + " is not a leap year. " );
                }

    }
    //DEFINE INT METHOD TO TAKE YEAR AS USER INPUT WITH SCANNER AND CONVERT TO INT
    public static int getUserInputSeconds()
    {
        System.out.print("Please enter the year in digits: ");
        String userInput = scanner.nextLine();
        return  Integer.valueOf(userInput);
    }
}
