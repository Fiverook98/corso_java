import java.util.Scanner;

public class ArrayMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int media = 0;
        
        System.out.println("Digitare il numero degli elementi dell'array>>> ");
        size = sc.nextInt();
        int numeri[] = new int[size];

        for (int i = 0; i < numeri.length; i++){
            System.out.printf("Digita %d-esimo elemento dell'array>>> \n", i);
            numeri[i]= sc.nextInt();
            media += numeri[i];
        }
        media /= numeri.length;
        System.out.printf("La media degli elementi dell'array è: %d\n", media);
        sc.close();
    }
}
