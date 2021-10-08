public class arithmetischeOperationen
{
    public static void main(String[] args)
    {
        int value1 = 4;
        int value2 = 3;

        int t = 3;
        int r = 2;

        double f = t/ (r*1.0);
        System.out.println("float f = " + f);

        int o = 3;
        int l = ++o;

        System.out.println("o = " + o);
        System.out.println("l = " + l);

        String firstName = "Tanner";
        String SecondName = "Tanner";

        boolean nametest = firstName.equals(SecondName);
        System.out.println("boolean nametest = " + nametest);

        boolean b = 2 == 2 && 3 == 3;
        System.out.println("boolean und = " + b);

        boolean ceh = 2==2||3==4;
        System.out.println("boolean oder = " + ceh);

        //addition
        System.out.println("addition: " + (value1+value2));

        //subtraction
        System.out.println("subtraction: "+ (value1 - value2));

        //multiplikation
        System.out.println("multiplication: "+ value1*value2);

        //division
        System.out.println("division: "+ value1/value2);

        //modulo
        System.out.println("Modulo: "+ value1%value2);

        printResult(2+3);
        int val123 = 2 + 4;
        printResult(val123);
        val123++;
        printResult(val123);


        int result = add (17,3);
        printResult(result);
    }

    public static void printResult (int result)
    {
        System.out.println("Methodenausgabe: " + result);
    }

    public static int add (int a, int b)
    {
        return a + b;
    }
}
