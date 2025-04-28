import java.util.Scanner;

public class ArraySum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int somma = 0;
        
        System.out.println("Digitare il numero degli elementi dell'array>>> ");
        size = sc.nextInt();
        int numeri[] = new int[size];

        for (int i = 0; i < numeri.length; i++){
            System.out.printf("Digita %d-esimo elemento dell'array>>> \n", i);
            numeri[i]= sc.nextInt();
            somma += numeri[i];
            
        }
        System.out.printf("La somma di tutti gli elementi dell'array è: %d\n", somma);
        sc.close();
    }
}