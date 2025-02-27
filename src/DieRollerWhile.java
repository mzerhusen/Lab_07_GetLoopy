import java.util.Random;

public class DieRollerWhile
{
    public static void main(String[] args)
    {
        //Set variables for Die
        int dieOne = 1;
        int dieTwo = 2;
        int dieThree = 3;
        int rollNumber = 1;

        //Set up table format
        System.out.println("Roll \tDie 1 \tDie 2 \tDie 3");
        while(dieOne != dieTwo || dieOne != dieThree)
        {
            dieOne = new Random().nextInt(6) + 1;
            dieTwo = new Random().nextInt(6) + 1;
            dieThree = new Random().nextInt(6) + 1;
            System.out.printf("%1d \t\t %1d \t\t %1d \t\t%1d \n", rollNumber, dieOne, dieTwo, dieThree);
            rollNumber++;
        }
    }
}
