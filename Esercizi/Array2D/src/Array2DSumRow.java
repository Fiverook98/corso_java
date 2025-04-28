public class Array2DSumRow {
    public static void main(String[] args) {
        int [][] matrice = {
            {1, 2, 3},
            {4, 5, 6},
        };
        int i, j, sumRow;
        int [] sumRows = new int[matrice.length];

        for (i = 0; i < matrice.length; i++){
            sumRow = 0;
            for (j = 0; j < matrice[i].length; j++){
                sumRow += matrice[i][j];
            }
            sumRows[i] = sumRow;
        }
        for (i = 0; i < sumRows.length; i++){
            System.out.println(sumRows[i]);
        }
    }
    
}
