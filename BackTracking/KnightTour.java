public class KnightTour{
    static int n=5;
    public static boolean KT(int board[][],int i,int j,int di[],int dj[],int move){
        if(move==(n*n)){
            printBoard(board);
            return true;
        }
        int nexti,nextj;
        for(int idx=0;idx<8;idx++){
            nexti=i+di[idx];
            nextj=j+dj[idx];
            if(nexti>=0 && nexti<board.length && nextj>=0 && nextj<board[0].length && board[nexti][nextj]==-1){
                board[nexti][nextj]=move;
                if(KT(board,nexti,nextj,di,dj,move+1)){
                    return true;
                }else{
                    board[nexti][nextj]=-1;
                }
            }
        }
        return false;
    }
    public static void printBoard(int board[][]){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int board[][]= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]=-1;
            }
        }
        int di[]={ 2, 1, -1, -2, -2, -1, 1, 2 };
        int dj[]={ 1, 2, 2, 1, -1, -2, -2, -1 };
        board[0][0]=0;
        int k=1;
        KT(board,0,0,di,dj,k);
    }
}