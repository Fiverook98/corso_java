import java.util.Scanner;

public class logaritmoTrue {
    public static void main(String[] args) {
        final float rispostaCorretta = 10.0f;
        float risposta;
        boolean rispostaErrata;
        Scanner sc;

        sc = new Scanner(System.in);
        do{
            System.out.printf("Qual è il logaritmo in base 2 di 1024?\n");
            risposta = sc.nextFloat();
            rispostaErrata = risposta != rispostaCorretta;
            if (rispostaErrata)
                System.out.println("Risposta errata! Riprova.");
            else 
                System.out.println("Risposta corretta!");
        } while(rispostaErrata);
    }
}
