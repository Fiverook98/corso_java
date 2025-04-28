public class TestSwitch{

    public static void main(String args[]){

        char x;
        final char napoli = 'n';
        final char caserta = 'c';
        final char avellino = 'a';
        final char benevento = 'b';
        final char NAPOLI = 'N';
        final char CASERTA = 'C';
        final char AVELLINO = 'A';
        final char BENEVENTO = 'B';


        x = 'N';

        switch(x){
            case napoli:
            case NAPOLI:
                System.out.printf("Napoli è la più sud delle 4\n");
                break;
            case caserta:
            case CASERTA:
                System.out.printf("Caserta è più a sud di Benevento\n");
                break;
            case avellino:
            case AVELLINO:
                System.out.printf("Avellino è più a nord solo di Napoli\n");
                break;
            case benevento:
            case BENEVENTO:
                System.out.printf("Risposta esatta\n");
                break;
            default:
                System.out.printf("Errore nell'inserimento della città\n");
        }

    }
}