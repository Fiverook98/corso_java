

public class Array2dMinTot {
    public static void main(String[] args) {
        int[][] matrice = {
            {-10, 0, 3},
            {14, -5, 6}
        };
        int i, j, minCol = matrice[0].length, minRow = matrice.length;
        int [] minCols = new int[minCol];
        int [] minRows = new int[minRow];

        //Minore per righe
        for(i = 0; i < matrice.length; i++){
            minRow = matrice[i][0];
            for(j = 0; j < matrice[i].length; j++){
                if (minRow > matrice[i][j]){
                    minRow = matrice[i][j];
                }
            }
            minRows[i] = minRow;
            
        }
        
        //Minore per colonne 
        for(j = 0; j < matrice[0].length; j++ ){
            minCol = matrice[0][j];
            for(i = 0; i < matrice.length; i++){
                if(matrice[i][j] < minCol){
                    minCol = matrice[i][j];
                }
            }
        minCols[j] = minCol;
        
        }
        for (i = 0;i < minRows.length; i++){
            minRow = minRows[0];
            if (minRows[i] < minRow){
                minRow = minRows[i];
            }
        }
        System.out.printf("L'elemento più piccolo tra le righe è: %d\n", minRow);
        
        for (j = 0;j < minCols.length; j++){
            minCol = minCols[0];
            if (minCols[j] < minCol){
                minCol = minCols[j];
            }
        }
        System.out.printf("L'elemento più piccolo tra le colonne è: %d\n", minCol);
        
    }
}
