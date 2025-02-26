public class PartB
{
    public static void main(String[] args)
    {
        System.out.println("Task 5");
        for(int row = 0; row < 5; row++)
        {
            for(int col = 0; col <= row; col++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println();
        System.out.println("Task 6");
        for(int row = 4; row >= 0; row -= 1)
        {
            for(int col = 0; col <= row; col++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println();
        System.out.println("Task 7");
        for(int row = 0; row < 5; row++)
        {
            for(int col = 0; col < 5; col++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
