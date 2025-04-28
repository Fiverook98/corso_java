import java.util.Scanner;

public class ArrayMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int min;
        
        System.out.println("Digitare il numero degli elementi dell'array>>> ");
        size = sc.nextInt();
        int numeri[] = new int[size];
        

        for ( int i = 0; i < numeri.length; i++){
            System.out.printf("Digita %d-esimo elemento dell'array>>> \n", i);
            numeri[i]= sc.nextInt();
        }
        min = numeri[0];
        
        for (int i = 1;i < numeri.length; i++){
            if(numeri[i] < min){
                min = numeri[i];
            }
        }
        System.out.printf("L'elemento più piccolo dell'array è: %d\n",min);
        sc.close();
    }
}