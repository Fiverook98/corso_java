import java.util.Scanner;

public class PariDispari {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String P="pari", D = "dispari";
        int modulo = 2;

        System.out.print("Inserisci un intero >>> ");
        int numero = sc.nextInt();

        if (numero % modulo == 0) 
            System.out.printf("Il numero %d è %s\n", numero, P);
        else
            System.out.printf("Il numero %d è %s\n", numero, D);
        
        if (numero > 0) 
            System.out.printf("Il numero %d è positivo\n", numero);
        else if (numero < 0)
            System.out.printf("Il numero %d è negativo\n", numero);
        else 
            System.out.println("Il numero " + numero + " è zero");
    }
}
