import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci un numero intero positivo >>> ");
        int n = sc.nextInt();

        if (n<= 0)
            System.out.println("Inserisci un numero intero positivo maggiore di zero");
        else {
            int num1 = 0 , num2 = 1;
            int fibonacci = 0;

            for (int i = 2;i <=n; i++ ){
                fibonacci = num1 + num2;
                num1 = num2;
                num2 = fibonacci;
            }

            System.err.printf("Il %d-esimo numero di Fibonacci è: %d\n", n, fibonacci);
        }
    }
}