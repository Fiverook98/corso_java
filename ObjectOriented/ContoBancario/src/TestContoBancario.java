import java.util.Scanner;
public class TestContoBancario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserire l'importo del saldo iniziale: ");
        double saldoIniziale = sc.nextDouble();
        ContoBancario conto1 = new ContoBancario(saldoIniziale);

        if(conto1.isInError()){
            System.out.println("Saldo non impostato correttamente.");
        }else {
            System.out.println("Saldo impostato correttamente.");
            System.out.println("Quanto vuoi prevelare? Inserire importo: ");
            double importo = sc.nextDouble();
            if (conto1.preleva(importo)){
                System.out.println("Prelievo andato a buon fine");
            }else{
                System.out.println("Vai a lavorare!!!");
            }
        }
        sc.close();
    }
}
