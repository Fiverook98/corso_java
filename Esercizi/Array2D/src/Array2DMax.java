public class Array2DMax {
    public static void main(String[] args) {
        int[][] matrice = {
            {-1, -2, -3},
            {-4, -5, -6}
        };
        int i, j;
        int [] maxRows = new int[matrice.length];
        int [] maxCols = new int[matrice[0].length];
        boolean flag;
        
        for (i = 0; i < maxRows.length; i++){
            maxRows[i] = matrice[i][0];
        }

        for(j = 0; j < maxCols.length; j++){
            maxCols[j] = matrice[0][j];
        }

        for (i = 0; i < matrice.length; i++){
            for (j = 0; j < matrice[i].length; j++){
                flag = maxRows[i] < matrice[i][j];
                if (flag) {
                    maxRows[i] = matrice [i][j];
                }
            }
        }
        for (j = 0; j < matrice[0].length; j++){
            for (i = 0; i < matrice.length; i++){
                flag = maxCols[j] < matrice[i][j];
                if (flag) {
                    maxCols[j] = matrice[i][j];
                }
            }
        }

        for(i = 0; i < maxRows.length; i++){
            System.out.printf("Numero massimo per riga: %d\n", maxRows[i]);
        }
        for(j = 0; j < maxCols.length; j++){
            System.out.printf("Numero massimo per colonna: %d\n", maxCols[j]);
        }
    }
}
