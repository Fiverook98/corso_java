public class TestMedia{

    public static void main(String args[]){

        //Parte Dichiarativa
        int voto1 ,voto2, voto3;
        float media;

        //Parte Esecutiva

        voto1 = 4;
        voto2 = 6;
        voto3 = 9;

        media=(voto1 + voto2 + voto3) / 3.0f;
        System.out.printf("Media = %.1f Giudizio = ", media);
        if(media < 4.5f){
            System.out.printf("Gravemente Insufficiente\n");
        } else if (media < 6.0f){
            System.out.printf("Insufficiente\n");
        } else if (media < 7.5f){
            System.out.printf("Sufficiente\n");
        } else{
            System.out.printf("Buono\n");
        }

    }
}