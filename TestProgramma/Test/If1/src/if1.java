public class if1 {
    public static void main(String args[]){

        float x, valAssoluto;

        x = 15.0f;
        valAssoluto = x;

        if (x < 0.0f)
            valAssoluto = -x;
        
        System.out.printf("Il valore assoluto di %.2f è %.2f\n", x , valAssoluto);
    }
}
