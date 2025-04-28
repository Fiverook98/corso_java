package gestione_di_veicoli;

public class Moto extends Veicolo {
    //Costruttore
    public Moto(String marca, String modello, int anno){
        setMarca(marca);
        setModello(modello);
        setAnno(anno);
    }
    //Display overide
    public void display(){
        super.display();
        output = "Ruote: 2";
        System.out.println(output);
    }
    //Muovi
    public void muovi(){
        output = "La tua moto si sta muovendo!";
        System.out.println(output);    
    }
    /* 
    public void muovi(char direzione){
        switch (direzione){
            case 'w','W' -> output = "La tua moto sta andando dritto";
            case 'a','A' -> output = "La tua moto sta svoltando a sinistra";
            case 'd','D' -> output = "La tua moto sta svoltando a destra.";
            case 's','S' -> output = "La tua moto sta andando indietro,Attenzione!";
            default -> output = "La tua moto è ferma!";
            }
        System.out.println(output);
    }*/
}
