package Esercizi;

public class EsempioSconto{

    public static void main(String args[]){

        float costoInEuro;
        float importoDaPagare;
        float sconto;

        costoInEuro = 250.0f ;

        if(costoInEuro > 300.0f)
            sconto = .10f;
        else if (costoInEuro > 100.0f) 
            sconto = .05f;
        else
            sconto = .0f;

        importoDaPagare = costoInEuro * (1.0f - sconto);
        System.out.printf("L'importo da pagare è di %.2f euro\n", importoDaPagare);
        
    }
}