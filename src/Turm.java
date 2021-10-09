public class Turm
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10;i++)
        {
            System.out.println(i);
            if(i==10)
            {
                for(int j = 10; j > 0; j--)
                {
                    System.out.println(j);
                }
            }
        }
        System.out.println("Turm wurde erfolgreich durchgeführt");
    }
}
