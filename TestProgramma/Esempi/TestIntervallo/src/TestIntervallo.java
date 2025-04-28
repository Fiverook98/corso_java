public class TestIntervallo {
    public static void main(String args[]){
        float a = 0.1f, b = 1.0f, x =10.0f;
        boolean appartiene = false;

        if (x >= a) 
            if (x <= b) 
                appartiene = true;    
            else
                appartiene = false;
        
        
        if (appartiene == true) 
            System.out.printf("Il numero %f appartiene all'intervallo [%f, %f]\n", x, a, b);
        else
            System.out.printf("Il numero %f  non appartiene all'intervallo [%f, %f]\n", x, a, b);
    }
}
