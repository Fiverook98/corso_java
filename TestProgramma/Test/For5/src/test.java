public class test {

    public static void main(String[] args) {
        
        
        final int START = -8, STOP = 10, STEP = 2;
        int i = START;
        for( ; i <= STOP; ){
            System.out.printf("Numero i = %d\n", i);
            i= i + STEP;
        }
    }
}