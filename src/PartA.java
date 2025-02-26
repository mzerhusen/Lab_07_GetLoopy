public class PartA
{
    public static void main(String[] args)
    {
        for(int c=0; c <= 30; c++)
        {
            System.out.print(c + ", ");
        }
        System.out.println();
        for(int c=30; c >= 0; c-=1)
        {
            System.out.print(c + ", ");
        }
        System.out.println();
        for(int c=0; c <= 18; c+=3)
        {
            System.out.print(c + ", ");
        }
        System.out.println();
        for(int c=10; c >= 0; c-= 2)
        {
            System.out.print(c + ", ");
        }
    }
}