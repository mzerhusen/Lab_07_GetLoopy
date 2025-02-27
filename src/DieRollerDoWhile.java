import java.util.Random;

public class DieRollerDoWhile
{
    public static void main(String[] args)
    {
        int dieOne;
        int dieTwo;
        int dieThree;
        int rollNumber = 1;
        boolean dieMatch;

        System.out.println("Roll \tDie 1 \tDie 2 \tDie 3");
        do
        {
            dieOne= new Random().nextInt(6) + 1;
            dieTwo= new Random().nextInt(6) + 1;
            dieThree= new Random().nextInt(6) + 1;
            System.out.printf("%1d \t\t%1d \t\t%1d \t\t%1d\n", rollNumber, dieOne, dieTwo, dieThree);
            if (dieOne==dieTwo && dieOne==dieThree)
            {
                dieMatch = true;
            }
            else
            {
                dieMatch = false;
                rollNumber++;
            }
        }
        while(!dieMatch);



    }
}
