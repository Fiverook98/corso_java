package ex12_2_exercise;
public class Shirt extends Item {
    
    private char size;
    private char colorCode;

    //Costruttori
    public Shirt(){
        this ("description required", 0.0, 'U', 'U');
        
    }
    public Shirt(String desc, double price, char size, char color){
        super (desc, price);
        setSize(size);
        setColorCode(color);
    }
    
    //Display
    public void display(){
        super.display();
        String output = """
        Taglia: %c
        Colore: %c
        """.formatted(getSize(), getColorCode());
        System.out.println(output);
    }
    /* 
    public void displayShirt(){
        displayItem();
        String output = """
        Taglia: %c
        Colore: %c
        """.formatted(getSize(), getColorCode());
        System.out.println(output);
    }*/
    
    //Setter
    private void setSize(char size){
        this.size = size;
    }
    private void setColorCode(char color){
        this.colorCode = color;
    }

    //Getter
    public char getSize(){
        return this.size;
    }
   
    public char getColorCode(){
        return this.colorCode;
    }
}
