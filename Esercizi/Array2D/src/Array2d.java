import java.util.Scanner;

public class Array2d {

    public static void main(String[] args) {

        int [][] matrice = null;
        Scanner sc = new Scanner(System.in);
        int i, j, nRow, nCol = 0;
        boolean flag = false;
        int maxCol = 0;


        do{
            System.out.println("Insersci il numero di righe: ");
            nRow = sc.nextInt();
            flag = nRow <= 0;
            if(flag){
                System.out.println("Numero inserito non valido! Ripetere.");
            }else{
                matrice = new int[nRow][];
                for (i = 0; i< nRow;){
                    System.out.printf("Inserisci il numero di colonne della %d-esima riga: ", i);
                    nCol = sc.nextInt();
                    flag = nCol <= 0;
                    if(flag)
                        System.out.println("Numero inserito non valido! Ripetere.");
                    else{
                        matrice[i] = new int [nCol];
                        i++;}
                }
            }
        }while(flag);

        for(i = 0; i < nRow; i++){
            flag = matrice[i].length > maxCol;
            if(flag){
                maxCol = matrice[i].length;
            }
        }

        for (i = 0; i < nRow; i++){
            nCol = matrice[i].length;
            for (j = 0; j < nCol; j++){
                System.out.printf("Inserire elemento matrice[%d][%d]: ",i , j);
                matrice [i][j] = sc.nextInt();
            }
        }

        for (j = 0; j < maxCol; j++){
            for (i = 0; i < nRow; i++){
                flag = j < matrice[i].length;
                if (flag) {
                    System.out.printf("%d ", matrice[i][j]);
                }else{
                    System.out.print("");
                }
                           
            }
            System.out.println();
        }
    }
}

