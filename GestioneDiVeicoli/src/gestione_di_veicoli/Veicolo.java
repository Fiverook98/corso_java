package gestione_di_veicoli;

public abstract class Veicolo {
    private String marca;
    private String modello;
    private int anno;
    static String output;
    
    //Metodi Setter
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModello(String modello){
        this.modello = modello;
    }
    public void setAnno(int anno){
        this.anno = anno;
    }
    //Metodi Getter
    public String getMarca(){
        return this.marca;
    }
    public String getModello(){
        return this.modello;
    }
    public int getAnno(){
        return this.anno;
    }
    //Metodi comuni sottoclassi
    public void accendi(){
         output = "La tua %s %s si è accesa!".formatted(getMarca(),getModello());
        System.out.println(output);
    }

    public void display(){
         output = """
                 Marca: %s;
                 Modello: %s;
                 Anno: %d;
                 """.formatted(getMarca(),getModello(),getAnno());
        System.out.println(output);
    }
    public abstract void muovi();
    //public abstract void muovi(char direzione);


    
}