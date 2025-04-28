import java.util.Scanner;

public class PinWhile_continue {
    
    public static void main(String[] args) {
        
        final char p1c = 'C', p2c = '1', p3c = '4', p4c = 'o';
        char p1, p2, p3, p4;
        final byte maxTentativi = 3;
        byte nTentativo = 0;
        Scanner sc = new Scanner(System.in);;
        boolean pinCorretto = false;
    
        while (nTentativo < maxTentativi && !pinCorretto){
            System.out.printf("Tentativo Numero: %d\n", nTentativo + 1);    
            
            System.out.print("Digitare il Primo Carattere >>> ");
            p1 = sc.nextLine().charAt(0);
    
            System.out.print("Digitare il Secondo Carattere >>> ");
            p2 = sc.nextLine().charAt(0);
    
            System.out.print("Digitare il Terzo Carattere >>> ");
            p3 = sc.nextLine().charAt(0);
    
            System.out.print("Digitare il Quarto Carattere >>> ");
            p4 = sc.nextLine().charAt(0);
        
            if ((p1+p2+p3+p4)==(p1c+p2c+p3c+p4c)){
                System.out.println("Il Pin inserito è corretto. Puoi passare!");
                pinCorretto = true;
                
            } else {
                System.out.println("Il Pin non è corretto. Riprova!"); 
                continue;
               
            }
           
        }
        
        if (!pinCorretto) {
            System.out.println("Inserimento annullato. Massimo numero di tentativi raggiunto!");
        }
    }
}
    

