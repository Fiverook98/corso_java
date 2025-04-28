public class Test{
    public static void main(String args[]){
        float a, b, x;
        boolean appartiene;

        a= 0.1f;
        b= 1.0f;
        x= b + Float.MIN_VALUE;

        if( x >= a){
            if ( x <= b){
                appartiene = true;
            } else{
                appartiene = false;
            }
        }else{
            appartiene = false;
        }

        if (appartiene == true){
            System.out.printf("Il numero %f appartiene all'intervallo numerico [%f, %f]\n", x, a , b);
        }else{
            System.out.printf("Il numero %f non appartiene all'intervallo numerico [%f, %f]\n", x, a, b);
        }
    }
}