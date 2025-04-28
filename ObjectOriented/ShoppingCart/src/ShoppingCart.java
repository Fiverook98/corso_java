public class ShoppingCart {
    
    public static void main(String args[]){
       Item item1 = new Item();
       Item item2 = new Item();

       item1.desc = "shirt";
       item2.desc = "pants";

       System.out.println(item1.desc);
       System.out.println(item2.desc);

       item1 = item2;

       System.out.println(item1.desc);
       System.out.println(item2.desc);
    }
}
