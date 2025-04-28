public class TestFerroviariaIf {

    public static void main(String args[]){

        final char PENSIONATI , STUDENTI , DISOCCUPATI;
        final char pensionati , studenti , disoccupati, condizione;
        float CostoBiglietto,sconto;
        boolean categoriaNonPrevista = false;
        
    
        PENSIONATI = 'P'; pensionati = 'p';
        STUDENTI = 'S'; studenti = 's';
        DISOCCUPATI = 'D'; disoccupati = 'd';
        condizione = 'p';

        CostoBiglietto =1.0f;
        sconto = 0.0f;
        
        if (condizione == PENSIONATI || condizione == pensionati){
            sconto = .1f; 
        } else if (condizione == STUDENTI || condizione == studenti){
            sconto = .15f;
        }else if (condizione == DISOCCUPATI || condizione == disoccupati){
            sconto = .25f;
        }else{
            categoriaNonPrevista = true;
            
        }

        if (categoriaNonPrevista) {
            System.out.print("Lo sconto non è applicabile");
        }else{
            System.out.printf("Sconto Applicato %.2f%%\n", sconto * 100);
            float CostoEffettivo = CostoBiglietto * (1.f - sconto);
            System.out.printf("L'importo effettivo da pagare è %.2f \n" ,CostoEffettivo); 
        }

        
        
    }
    

    
}
