public class TestFerroviariaSwitch {

    public static void main(String args[]){
        
        char condizione;
        float CostoBiglietto,sconto;
        
        condizione = 'a';

        CostoBiglietto = 15.20f;
        sconto = 0.0f;

        switch (condizione) {
            case 'P', 'p' -> sconto = .1f;
            case 'S','s' -> sconto = .15f;
            case 'D','d' -> sconto = .25f;
            default -> System.out.printf("Lo sconto non è applicabile\n");
        }

        if (sconto > 0){
            System.out.printf("Sconto Applicato %.2f%%\n", sconto * 100);
        }

        float costoEffettivo = CostoBiglietto * (1.0f - sconto);
        
        System.out.printf("L'importo effettivo da pagare è %.2f\n", costoEffettivo);
    }
}
