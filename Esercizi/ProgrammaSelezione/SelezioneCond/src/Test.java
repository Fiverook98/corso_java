public class Test {
    public static void main(String args[]){

        int a = 25, b = 8, c= 15;

        int largest = a >= b ? a > c ? a : c : b > c ? b : c;

        System.out.printf("Massimo = %d\n", largest);

    }
}
