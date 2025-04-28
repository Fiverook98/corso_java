public class Array2DMin {
    public static void main(String[] args) {
        int[][] matrice = {
            {-1, -2, -3},
            {-4, -5, -6}
        };
        int i, j;
        int [] minRow = new int[matrice.length];
        int [] minCol = new int[matrice[0].length];
        boolean flag;
        
        for (i = 0; i < minRow.length; i++){
            minRow[i] = matrice[i][0];
        }
        for(j = 0; j < minCol.length; j++){
            minCol[j] = matrice[0][j];
        }

        for (i = 0; i < matrice.length; i++){
            for (j = 0; j < matrice[i].length; j++){
                flag = minRow[i] > matrice[i][j];
                if (flag) {
                    minRow[i] = matrice [i][j];
                }
            }
        }
        for (j = 0; j < matrice[0].length; j++){
            for (i = 0; i < matrice.length; i++){
                flag = minCol[j] > matrice[i][j];
                if (flag) {
                    minCol[j] = matrice[i][j];
                }
            }
        }

        for(i = 0; i < minRow.length; i++){
            System.out.printf("Numero minimo per riga: %d\n", minRow[i]);
        }
        for(j = 0; j < minCol.length; j++){
            System.out.printf("Numero minimo per colonna: %d\n", minCol[j]);
        }
    }
}

