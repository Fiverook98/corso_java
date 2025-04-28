public class test{
    public static void main(String args[]){
        
        float a = 1.0f,b = 0.1f;
        float m, M;
        
        m = (a < b) ? a : b;
        M = (a < b) ? b : a;
        System.out.printf("Il minimo tra %.1f e %.1f è %.1f\n" ,a, b, m);
        System.out.printf("Il massimo tra %.1f e %.1f è %.1f\n" ,a, b, M);
    }
}