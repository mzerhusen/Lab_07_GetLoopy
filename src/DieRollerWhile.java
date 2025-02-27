import java.util.Random;
import java.util.Scanner;

public class DieRollerWhile
{
    public static void main(String[] args)
    {
        //Set variables for Die
        Scanner in = new Scanner(System.in);
        Random dice = new Random();
        int dieOne;
        int dieTwo = 2;
        int dieThree = 3;
        int rollNumber;
        String rollAgain;
        boolean validRollAgain;
        boolean playAgain = true;

        //Set up table format
        while(playAgain)
        {
            dieOne = 0;
            rollNumber = 1;
            System.out.println("Roll \tDie 1 \tDie 2 \tDie 3");
            while (dieOne != dieTwo || dieOne != dieThree) {
                dieOne = dice.nextInt(6) + 1;
                dieTwo = dice.nextInt(6) + 1;
                dieThree = dice.nextInt(6) + 1;
                System.out.printf("%1d \t\t %1d \t\t %1d \t\t%1d \n", rollNumber, dieOne, dieTwo, dieThree);
                rollNumber++;
            }
            System.out.print("Would you like to roll again? Y/N ");
            do
            {
                rollAgain = in.nextLine();
                rollAgain=rollAgain.toUpperCase();
                if (rollAgain.equals("Y") || rollAgain.equals("N"))
                {
                    validRollAgain = true;
                }
                else
                {
                    validRollAgain = false;
                }
            }
            while(!validRollAgain);
            if (rollAgain.equals("Y"))
            {
                playAgain = true;
            }
            else
            {
                playAgain = false;
            }
        }
        System.out.println("Have a great day!");
    }
}
