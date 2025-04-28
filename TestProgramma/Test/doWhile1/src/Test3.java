public class Test3 {
    
    public static void main(String[] args) {
        
        int start, stop, step;
        int i;

        start = 7;
        stop = 70;
        step = 7;

        i = start;
        do {
            if (i%7==0 && i%9==0){
                System.out.printf("Generato numero divisibile per 7 e per 9: %d\n", i);
                break;
            }
            System.out.printf("NUMERO i = %d\n", i);
            i = i + step;
        } while(i <= stop);
    }
}
