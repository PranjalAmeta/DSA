public class DiagonalTraversal{
    public static int[] findDiagonalOrder(int[][] mat) {
    // Check for empty matrix
    if (mat == null || mat.length == 0) {
        return new int[0];
    }
    
    int rows = mat.length;
    int cols = mat[0].length;
    int[] result = new int[rows * cols];
    int row = 0, col = 0;
    
    for (int i = 0; i < result.length; i++) {
        result[i] = mat[row][col];
        
        // Moving upwards
        if ((row + col) % 2 == 0) {
            if (col == cols - 1) {
                row++;
            } else if (row == 0) {
                col++;
            } else {
                row--;
                col++;
            }
        }
        // Moving downwards
        else {
            if (row == rows - 1) {
                col++;
            } else if (col == 0) {
                row++;
            } else {
                row++;
                col--;
            }
        }
    }
    
    
    return result;
}

    public static void main(String args[]){
        int matrix[][]={{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};
    
        
        int matri[]=findDiagonalOrder(matrix);
        for(int i=0;i<matri.length;i++){
            System.out.print(matri[i]+" ");
        }
    }
}