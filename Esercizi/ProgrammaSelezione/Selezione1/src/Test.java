public class Test{
    public static void main(String args[]){

        float x, val_assoluto;

        x = -1.0f;
        val_assoluto= x;

        if (x < 0){

            val_assoluto = -x;

        }
        
        System.out.printf("Il valore assoluto di %f è %f\n", x, val_assoluto);
    }
}