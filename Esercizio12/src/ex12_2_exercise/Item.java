package ex12_2_exercise;
public class Item {
    private int id;
    private String desc;
    private double price;
    static int nextId = 1;

    public Item(){
        this("description required",0.0);
    }
    public Item(String desc, double price){
        setId();
        setDesc(desc);
        setPrice(price);
    }
    public void display(){
        String output = "Id: %d\nDescription: %s\nPrice: %.2f\n".formatted(this.getId(), this.getDesc(), this.getPrice());
        System.out.print(output);
        
    }
    private void setId(){
        this.id = nextId++;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }
    private void setPrice(double price){
        this.price = price;
    }

    public int getId(){
        return this.id;
    }
    public String getDesc(){
        return this.desc;
    }
    public double getPrice(){
        return this.price;
    }


}