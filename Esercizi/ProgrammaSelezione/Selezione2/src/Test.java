public class Test{
    public static void main(String args[]){

        float a = 15.0f*3.0f , b = 16.26f+10.0f*2.5f;

        float massimo;

        if (a >= b){
            massimo = a;
        } else {
            massimo = b;
        }
        System.out.printf("Il massimo tra %f e %f vale %f\n" , a , b, massimo);
        
    }  


    
}
