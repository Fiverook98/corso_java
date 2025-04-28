public class Test2 {

    public static void main(String[] args){
    
        int start, stop, step;
        int i;
        
        start = 10;
        stop = 1;
        step = 1;

        if (start > stop){
            System.out.printf("ERRORE: L'estremo sinistro è maggiore dell'estremo destro\n");
        }else{
            i = start;
            do {
                System.out.printf("Numero i = %d\n", i);
                i = i + step;
            } while(i <= stop);
        }

    }
    
}
