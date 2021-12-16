/*
* The "Template" program is a template
*
* @author  Darien R-H
* @version 1.0
* @since   2021-12-15
*/
import java.util.Random;
import java.util.Scanner;

/**
* This is a program that blanks.
*/
final class Main {
    /**
    * Constant.
    */
    public static final int C6 = 6;
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    } /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // variables
        boolean win = false;
        int myGuess = 0;
        int trys = 1;
        Random rNumber = new Random();
        int computerPick = rNumber.nextInt(C6);
        System.out.println("Dice Game");
        System.out.println();

        final Scanner myInput = new Scanner(System.in);
        while (!win) {   //Loop as long as the correct number is not picked
            System.out.print("Please Enter your Guess:");
            // Block of code to try
            try {
               myGuess = myInput.nextInt();
            } catch (java.util.InputMismatchException errorCode) {

            // Block of code to handle errors
                System.out.println("\nYou have not entered a valid input.");
            }
            if (myGuess == computerPick) {
                System.out.println();
                System.out.println("You WIN! The computer picked "
                  + computerPick);
                System.out.println("You took " + trys
                  + " trys to guess the correct number");
                win = true;
            }
            if (myGuess > C6 || myGuess < 1) {
                System.out.println("Your Pick is out of the range Try again");
            }

            else if (myGuess < computerPick) {
                System.out.println("You Picked Low.  Try Again.");
                trys = trys + 1;
            } else if (myGuess > computerPick) {
                System.out.println("You Picked High");
                trys = trys + 1;
            }
          }
        }
    }
