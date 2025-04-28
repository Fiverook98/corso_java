
//import java.util.Scanner;

import gestione_di_veicoli.*;

public class GestioneVeicoli {
    public static void main(String[] args) {
        Auto toyota = new Auto("Toyota", "Supra mk4", 2024);
        Moto kawasaki = new Moto("Kawasaki", "Ninja 650", 2023);
        //Scanner sc = new Scanner(System.in);
        //char direzione;

        //Utilizzo display()

        toyota.display();
        kawasaki.display();
        
        //Utlizzo accendi()

        toyota.accendi();
        kawasaki.accendi();

        //Utilizzo muovi
        /*System.out.println("In che direzione vuoi che vada la tua auto? ");
        direzione = sc.next().charAt(0);
        toyota.muovi(direzione);*/
        toyota.muovi();

        /*System.out.println("In che direzione vuoi che vada la tua moto? ");
        direzione = sc.next().charAt(0);
        kawasaki.muovi(direzione)*/
        kawasaki.muovi();


        //sc.close();
    }
}
