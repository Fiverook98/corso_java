public class test5 {

    public static void main(String[] args) {
        
        int i, start, stop, step;

        start = 7;
        stop = 70;
        step = 7;

        i = start;
        do{
            if(i%7 == 0 && i%9 == 0){
                i= i + step;
                continue;
            }
            System.out.printf("i = %d\n", i);
            i = i + step;
        } while ( i <= stop);
    }
    
}
