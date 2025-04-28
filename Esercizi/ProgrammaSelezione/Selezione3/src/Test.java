public class Test{
    
    public static void main(String args[]){

        int a, b, s;

        a = 15;
        b = 15;
        s = a + b;

        if ( a == b){
            int p = a * b;
            System.out.printf("Il prodotto di %d x %d è %d\n", a, b, p);
        }

        System.out.printf("La somma di %d + %d è %d\n", a, b, s);
        
    }
}