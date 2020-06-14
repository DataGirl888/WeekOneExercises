package se.lexicon.zainabahmed;

//WEEK ONE EXERCISES
//EX. 03 Print sum, multiplication, division, subtraction of two numbers

public class ex03ArithmeticTwoNumbers
{
    public static void main(String[] args)
    {
        System.out.println("Demonstrating arithmetic operations: addition, multiplication, division and subtraction.");
        //SUM
        int myFirstTerm = 45;
        int mySecondTerm = 11;
        int mySum = myFirstTerm + mySecondTerm;
        System.out.println("Sum: " + myFirstTerm + " + " + mySecondTerm + " = " + mySum);

        //MULTIPLICATION
        int myFirstFactor = 12;
        int mySecondFactor = 4;
        int myProduct = myFirstFactor * mySecondFactor;
        System.out.println("Multiplication: " + myFirstFactor + " + " + mySecondFactor + " = " + myProduct);

        //DIVISIOIN
        int myDividend = 24;
        int myDivisor = 6;
        int myQuotient = myDividend / myDivisor;
        System.out.println("Division: " + myDividend + " / " + myDivisor + " = " + myQuotient);

        //SUBTRACTION
        int myMinuend = 55;
        int mySubtrahend = 12;
        int myDifference = myMinuend - mySubtrahend;
        System.out.println("Subtraction: " + myMinuend + " - " + mySubtrahend + " = " + myDifference);


    }
}
