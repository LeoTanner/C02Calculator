import java.util.Scanner;

public class FindEven
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie einen Wert für die Berechnung der geraden Zahlen ein: ");
        int inputnumber = sc.nextInt();
        int counter = 0;

        /*while (counter<=inputnumber)
        {
            if((counter > 0) && (counter % 2 == 0))
            {
                System.out.print(counter + ",");
            }
            counter++;
        }
        System.out.println("\nEs wurden alle geraden Zahlen bis zur Inputnumber überprüft");*/ //While Schleife

        for (int i = 1; i <= inputnumber; i++)
        {
            if((i > 0) && (i % 2 == 0))
            {
                System.out.print(i + " ");
                counter++;
            }
        }
        System.out.println("\nEs wurden alle geraden Zahlen bis zur Inputnumber überprüft");
        System.out.println("Es wurden insgesamt "+counter+ " gerade Zahlen gefunden");
    }
}
