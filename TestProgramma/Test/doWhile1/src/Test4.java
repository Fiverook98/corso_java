public class Test4 {
    
    public static void main(String[] args) {
        
        int start, stop, step;
        int i;
        boolean condizione = true;

        start = 7;
        stop = 70;
        step = 10;

        i = start;
        do{
            System.out.printf("NUMERO i = %d\n", i);
            i = i + step;
        }while (i <= stop && (condizione = !(i%7==0 && i%9==0)));

        if (i<=stop && !condizione) {{
            System.out.printf("Generato un numero divisibile per 7 e per 9\n");
        }
            
        }
    }
}
