package ex12_2_exercise;

public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.display();

        Shirt myShirt = new Shirt("desc", 15.05, 'M', 'R');
        myShirt.display();
    }
}
