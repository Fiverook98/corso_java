public class Item {
    String desc;
    int quantity;
    double price;
    char colorCode = 'U';


    public void displayItem(){
        System.out.println(this.desc);
        System.out.println(this.quantity);
        System.out.println(this.price);
        System.out.println(this.colorCode);
    }

    public void setItemFields(String desc, int quantity, double price){
        this.desc = desc;
        this.quantity = quantity;
        this.price = price;
    }
    public int setItemFields(String desc, int quantity, double price, char color){
        if(color != ' '){
            this.colorCode = color;
            setItemFields(desc, quantity, price);
            return 0;
        }
        return -1;
    }

}