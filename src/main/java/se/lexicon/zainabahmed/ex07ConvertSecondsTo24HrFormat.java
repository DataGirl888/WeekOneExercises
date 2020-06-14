package se.lexicon.zainabahmed;
import java.util.Scanner;

//WEEK ONE EXERCISES
//EX. 07 Convert input seconds to hours, minutes and seconds

public class ex07ConvertSecondsTo24HrFormat
{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Taking time in seconds and converting to hours, minutes and seconds (HH:MM:SS).");

    int timeHours, timeMinutes, timeSeconds, userSeconds; //=getUserInputSeconds();  // declare variables for time
    int divisorToHours = 3600, divisorToMinutes = 60;  // literals for division: 3600 seconds in an hour, 60 seconds in a minute
    userSeconds = getUserInputSeconds(); // take seconds as input from user

    timeHours = userSeconds / divisorToHours;  // get the quotient, ignore remainder, of user seconds divided by 3600 for hours
    timeMinutes = (userSeconds % divisorToHours) / divisorToMinutes; // get the remainder of the above, divide by 60 for minutes
    timeSeconds = (userSeconds % divisorToHours) % divisorToMinutes; // get the remainder of above, for seconds

    //OUTPUT DISPLAYED TO USER
   /* System.out.println("The time in hours is " + timeHours);  // testing code
    System.out.println("The time in minutes is " + timeMinutes);
    System.out.println("The time in seconds is " + timeSeconds);*/

    System.out.println("The time in HH:MM:SS is " +timeHours +":" + timeMinutes + ":" + timeSeconds );
    }

    //DEFINE INT METHOD TO TAKE SECONDS AS USER INPUT WITH SCANNER AND CONVERT TO INT
    public static int getUserInputSeconds()
    {
        System.out.print("Please enter the time in seconds: ");
        String userInput = scanner.nextLine();
        return  Integer.valueOf(userInput);
    }
}
