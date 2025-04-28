import java.util.Scanner;

public class PinWhile_break {
    
    public static void main(String[] args) {
        
        final char p1c = 'C', p2c = '1', p3c = '4', p4c = 'o';
        char p1, p2, p3, p4;
        final byte maxTentativi = 3;
        byte nTentativo = 0;
        Scanner sc = new Scanner(System.in);;
        
    
        while (nTentativo < maxTentativi){
            System.out.printf("Tentativo Numero: %d\n", nTentativo + 1);    
            
            System.out.print("Digitare il Primo Carattere >>> ");
            p1 = sc.nextLine().charAt(0);
    
            System.out.print("Digitare il Secondo Carattere >>> ");
            p2 = sc.nextLine().charAt(0);
    
            System.out.print("Digitare il Terzo Carattere >>> ");
            p3 = sc.nextLine().charAt(0);
    
            System.out.print("Digitare il Quarto Carattere >>> ");
            p4 = sc.nextLine().charAt(0);
    
            
            nTentativo = (byte) (nTentativo + 1);

            if ((p1+p2+p3+p4)==(p1c+p2c+p3c+p4c)){
                System.out.println("Il Pin inserito è corretto. Puoi passare!");
                break;
            } else {
                System.out.println("Il Pin non è corretto. Riprova!");
            }
            if (nTentativo == maxTentativi) {
                System.out.println("Inserimento annullato. Massimo numero di tentativi raggiunto!");
            }
        };
            
    }
}
    

