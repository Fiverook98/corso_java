public class TestCalcolatriceIf{

    public static void main(String args[]){

        double operatore1, operatore2, risultato;
        char op;
        boolean operazioneValida;

        operatore1 = 5.0;
        operatore2 = 10.0;
        op = '*';
        
        risultato = 0.0;
        operazioneValida = true;

    

        if (op == '+') {
            risultato = operatore1 + operatore2;
        } else if (op == '-') {
            risultato = operatore1 - operatore2;
        } else if (op == '*'){
            risultato = operatore1 * operatore2;
        } else if (op =='/') {
            if (operatore2 != 0.0) {
                risultato = operatore1 / operatore2;
            } else {
                operazioneValida = false;
                System.out.print("L'operazione di divisione non è valida\n");
            }
        } else {
            operazioneValida = false;
            System.out.print("L'operazione non è valida\n");
        }

        if (operazioneValida){
            System.out.printf("Il risultato dell'operazione %f %c %f è %f\n", operatore1, op, operatore2, risultato);
        }
    }
}