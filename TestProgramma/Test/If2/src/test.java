public class test {
    public static void main(String[] args) {
        float x = -0.1f;
        int a;

        if(x > 0.0f){
            a = 1;
        }else {
            System.out.printf("Il numero %f non è maggiore di 0\n", x);
            if (x == 0.0f){
                a = 0;
            }else{
                a = -1;
            }
        }
        System.out.printf("Il valore di a è %d\n", a);
    }
}
