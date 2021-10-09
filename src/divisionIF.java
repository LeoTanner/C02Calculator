import java.util.Scanner;

public class divisionIF
{
    public static void main(String[] args)
    {
        double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie den ersten Wert ein: ");
        a = sc.nextInt();
        System.out.println("Geben sie den zweiten Wert ein: ");
        b = sc.nextInt();

        if (b==0)
        {
            System.out.println("Division durch null nicht möglich");
        }
        else if ((divide (a,b) != 0) || (a == 0))
        {
            System.out.println("Division ist möglich. Ergebnis lautet: "+divide(a,b));
        }
        else
        {
            System.out.println("Fehler bei der Eingabe!!!");
        }
    }

    public static double divide (double dividend, double divisor)
    {
        return dividend / divisor;
    }
}
