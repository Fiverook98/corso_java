public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();
        
        item1.setItemFields("Belt", 1, 29.50);
        item1.displayItem();

        int risultato = item1.setItemFields("Shirt", 1, 34.99, ' ');
        if (risultato < 0){
            System.out.println("Invalid color code");
        }else{
            item1.displayItem();
        }
    }
}
