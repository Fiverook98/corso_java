public class Array2DSumCol {
    public static void main(String[] args) {
        int[][] matrice = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int i,j,sumCol;
        int [] sumCols = new int[matrice[0].length];

        for(j = 0; j < matrice[0].length; j++){
            sumCol = 0;
            for(i = 0; i < matrice.length; i++) {
                sumCol += matrice[i][j];
            }
            sumCols[j] = sumCol;
        }
        for (j = 0; j < sumCols.length; j++) {
            System.out.println(sumCols[j]);
        }
    }
}
