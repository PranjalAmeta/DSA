public class MaxAndMin{
    public static void MinMax(int matrix[][]){
    public static void MinMax(int matrix[][]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }
        }
        System.out.print("largest element is:"+max+"\n"+"Smallest Element is:"+min);
    }
    public static void main(String args[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        MinMax(matrix);
    }
}