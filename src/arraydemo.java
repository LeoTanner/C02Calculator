public class arraydemo
{
    public static void main(String[] args) {

        double loopsum = 0;
        double[]products = new double[5];
        products[0] = 2.4;  //1te Element
        products[1] = 2.0;  //2te Element
        products[2] = 2.9;  //3te Element

        //double sum = products[0]+products[1]+products[2]+products[3]+products[4];
        //System.out.println("sum = " + sum);

        for (int i = 0; i < products.length; i++ )
        {
            loopsum = loopsum+products[i];
        }
        System.out.println("Gesamtpreis: "+loopsum);
    }
}
