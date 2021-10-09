public class arraydemo2
{
    public static void main(String[] args)
    {
        /*int []Array1 = new int[3];
        Array1[0] = 3;
        Array1[1] = 4;
        Array1[2] = 5;*/

/*        int []Array2 = new int[3];
        Array2[0] = 7;
        Array2[1] = 1;
        Array2[2] = 2;*/

        int []Array1 = {3,4,5};
        int []Array2 = {7,1,2};

        System.out.print("Summen: ");
        int erg;
        for(int i = 0; i < Array1.length; i++)
        {
            erg = Array1[i]+Array2[i];
            System.out.print(erg + " ");
        }

        System.out.print("\nMultiplikationen: ");
        for (int j = 0; j < Array1.length;j++)
        {
            erg = Array1[j]*Array2[j];
            System.out.print(erg + " ");
        }
    }
}
