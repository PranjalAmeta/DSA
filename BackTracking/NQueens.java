public class NQueens{

    public static boolean isSafe(char board[][],int row,int col){
        //vertically up
        for(int i=row;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //diagonally left
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //diagonally right
        for(int i=row,j=col;i>=0 && j<board[0].length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }

    static int count=0;
    
    public static void chessBoard(char board[][],int row){
        if(row==board.length){
            printBoard(board);
            count++;             //for count ways
            return;
        }
        for(int j=0;j<board[0].length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                chessBoard(board,row+1);
                board[row][j]='x';
            }
        }
    } 
    

    //Check if solution exist if it does print only one solution
    /*public static boolean chessBoard(char board[][],int row){
        if(row==board.length){
            //printBoard(board);
            count++;             //for count ways
            return true;
        }
        for(int j=0;j<board[0].length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                if(chessBoard(board,row+1)){
                    return true;
                }
                board[row][j]='x';
            }
        }
        return false;
    }   
    */

    public static void printBoard(char board[][]){
        System.out.println("------- Chess Board -------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String args[]){
        int  n=4;
        char board[][]=new char[n][n];
        //Initialize board
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j]='x';
            }
        }
        chessBoard(board,0);
        //Check if solution exist if it does print only one solution

        /*if(chessBoard(board,0)){
            System.out.print("Solution exist.");
            printBoard(board);
        }else{
            System.out.print("Solution doesnt exist.");
        }
        */

        // Count ways
        System.out.print("No. of ways to solve the problem="+count);
    }
}