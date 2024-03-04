public class SetMatrixZeroes{
    //Brute force approach
    public static void zeroes(int mat[][]){
        int rows[]=new int[mat.length];
        int col[]=new int [mat[0].length];

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(mat[i][j]==0){
                    rows[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i=0;i<rows.length;i++){
            for(int j=0;j<col.length;j++){
                if(rows[i]==1 || col[j]==1){
                    mat[i][j]=0;
                }
            }
        }

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    //optimalApproach-doing all the work inside the matrix
    public static int[][] zeros1(int mat[][]){
        //rows-mat[i][0]
        //col-mat[0][j]
        int col0=1;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    //for rows
                    mat[i][0]=0;
                    //for cols
                    if(j!=0){
                        mat[0][j]=0;
                    }else{
                        col0=0;
                    }

                }
            }
        }
        //first filling the rest of the matrix without row-0 and col-0
        for(int i=1;i<mat.length;i++){
            for(int j=1;j<mat[0].length;j++){
                if(mat[i][0]==0 || mat[0][j]==0){
                    mat[i][j]=0;
                }
            }
        }

        //Finally filling the row-0 and col-0
        //first filling row because the column is dependent on row
        if(mat[0][0]==0){
            for(int j=0;j<mat[0].length;j++){
                mat[0][j]=0;
            }
        }
        
        if(col0==0){
            for(int i=0;i<mat.length;i++){
                mat[i][0]=0;
            }
        }

        return mat;
    }
    public static void main(String args[]){
        int matrix[][]={{1,1,1,1},
                     {0,1,1,1},
                     {0,1,0,1},
                     {0,0,0,1}};
        //zeroes(mat);
        zeros1(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}