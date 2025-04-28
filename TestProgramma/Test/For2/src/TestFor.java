public class TestFor{

    public static void main(String args[]){

        int i;
        int prodotto;

        System.out.printf("TABELLINA DEL 3");

        for(i = 0; i <= 10; i = i +1){
            prodotto = 3 * i;
            System.out.printf("3 x %-2d = %-2d\n", i, prodotto);
        }

    }
}