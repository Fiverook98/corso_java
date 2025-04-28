package gestione_di_veicoli;

public class Auto extends Veicolo {
    //Costruttore 
    public Auto(String marca,String modello, int anno){
        setMarca(marca);
        setModello(modello);
        setAnno(anno);
    }
    //Display overide
    public void display(){
        super.display();
        output = "Ruote: 4";
        System.out.println(output);
    }
    //Muovi
    public void muovi(){
        output = "La tua auto si sta muovendo!";
        System.out.println(output);
    }
    /* 
    public void muovi(char direzione){
        switch (direzione){
            case 'w','W' -> output = "La tua auto sta andando dritto";
            case 'a','A' -> output = "La tua auto sta svoltando a sinistra";
            case 'd','D' -> output = "La tua auto sta svoltando a destra.";
            case 's','S' -> output = "La tua auto sta andando in retro,guarda bene gli specchietti!";
            default -> output = "La tua auto è ferma!";
            }
        System.out.println(output);
    };*/
}

