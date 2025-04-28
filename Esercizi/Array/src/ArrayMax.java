import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int max;
        
        System.out.println("Digitare il numero degli elementi dell'array>>> ");
        size = sc.nextInt();
        int numeri[] = new int[size];
        

        for (int i = 0; i < numeri.length; i++){
            System.out.printf("Digita %d-esimo elemento dell'array>>> \n", i);
            numeri[i]= sc.nextInt();
        }
        max = numeri[0];
        for (int i = 1; i < numeri.length; i++){
            if (numeri[i] > max){
                max = numeri[i];
            }
        }

        System.out.printf("L'elemento più grande dell'array è: %d\n",max);
        sc.close();
    }
}
