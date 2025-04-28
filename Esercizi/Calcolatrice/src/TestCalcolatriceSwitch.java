public class TestCalcolatriceSwitch {
    
    public static void main(String args[]){

        double operatore1, operatore2, risultato;
        final char addizione = '+', sottrazione = '-', moltiplicazione ='*', divisione = '/';
        char op;
        boolean operazioneValida;
        
      
        operatore1 = 5.0;
        operatore2 = 0.0;
        op = '/';
        
        risultato = 0.0;
        operazioneValida = true;

        

        switch (op) {
            case addizione -> risultato = operatore1 + operatore2; 
            case sottrazione -> risultato = operatore1 - operatore2; 
            case moltiplicazione -> risultato = operatore1 * operatore2;
            case divisione -> {if (operatore2 != 0.0) {
                            risultato = operatore1 / operatore2;
                        }else{
                            operazioneValida = false;
                            System.out.print("L'operazione di divisione non è valida\n");
                        };
                    }
            default -> {operazioneValida = false;
                        System.out.print("L'operazione non è valida\n");
            }
        }

        if (operazioneValida){
            System.out.printf("Il risultato dell'operazione %f %c %f è %f\n", operatore1, op, operatore2, risultato);
        }
    }
}
