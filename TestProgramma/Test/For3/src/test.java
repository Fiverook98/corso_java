public class test {

    public static void main(String[] args) {
        final int START = 1,
                  STOP = 20,
                  STEP = 2;
        int i = 0;

        for( i = START; i <= STOP; i = i + STEP){
            System.out.printf("i = %d\n", i);
        } 
        System.out.printf("Valore di i dopo il ciclo for: %d\n", i);
    }
}