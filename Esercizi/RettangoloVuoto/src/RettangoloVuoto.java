public class RettangoloVuoto{

    public static void main(String args[]){

        int i, j;
        int base, altezza;

        base = 5;
        altezza = 6;

        for (i = 1; i <= altezza; i = i + 1){
                for(j = 1; j <= base; j = j + 1){
                    if(i == 1 || i == altezza  || j == 1 || j == base ){
                        System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
        }
    }
}