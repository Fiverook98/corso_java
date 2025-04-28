public class test {

    public static void main(String[] args) {
        final int start = -8, stop = 10, step = 2;
        
        for(int i = start, j = stop; i <= stop; 
            System.out.printf("i = %d\tj = %d\n", i, j),
            i = i +step, j = j - step);
    }
}
