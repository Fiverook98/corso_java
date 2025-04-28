public class Array2DMediaRow {

    public static void main(String[] args) {
        int [][] matrice = {
            {1, 2, 3},
            {4, 5, 6},
        };
        int i, j, sumRow;
        int[] media = new int[matrice.length] ;
        

        for (i = 0; i < matrice.length; i++){
            sumRow = 0;
            for (j = 0; j < matrice[i].length; j++){
                sumRow += matrice[i][j];
            }
            media[i] = sumRow / matrice[i].length;
        }

        for (i = 0; i < media.length; i++){
            System.out.println(media[i]);
        }
    }
}