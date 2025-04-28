public class Operazione {
    public static void main(String[] args){
        float a = 4.0f, b = 2.0f, risultato;
        char operatore;

        if (a == b){
            risultato = a * b;
            operatore = '*';
        }else{
            risultato = a / b;
            operatore = '/';
        }
        System.out.printf("Il risultato di %.1f %c %.1f = %.1f\n", a, operatore, b, risultato);
    }
}
