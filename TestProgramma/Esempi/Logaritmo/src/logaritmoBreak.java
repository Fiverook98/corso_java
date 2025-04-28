import java.util.Scanner;

public class logaritmoBreak {
    public static void main(String[] args) {
        final float rispostaCorretta = 10.0f;
        float risposta;
        Scanner sc;

        sc = new Scanner(System.in);
        do{
            System.out.printf("Qual è il logaritmo in base 2 di 1024?\n");
            risposta = sc.nextFloat();
            if (risposta == rispostaCorretta){
                System.out.println("Risposta corretta!");
                break;
            }
            System.out.println("Risposta errata! Riprova.");
        } while(true);
    }
}
