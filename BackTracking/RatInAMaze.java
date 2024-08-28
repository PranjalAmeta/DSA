public class RatInAMaze{
    public static void solve(int maze[][],int vis[][],int i,int j,String move){
        if(i==maze.length-1 && j==maze[0].length-1){
            System.out.println(move);
            return;
        }
        //down
        if(i+1<maze.length && vis[i+1][j]==0 && maze[i+1][j]==1){
            vis[i][j]=1;
            solve(maze,vis,i+1,j,move+"D");
            vis[i][j]=0;
        }
        //left
        if(j-1>0 && vis[i][j-1]==0 && maze[i][j-1]==1){
            vis[i][j]=1;
            solve(maze,vis,i,j-1,move+"L");
            vis[i][j]=0;
        }
        //right
        if(j+1<maze.length && vis[i][j+1]==0 && maze[i][j+1]==1){
            vis[i][j]=1;
            solve(maze,vis,i,j+1,move+"R");
            vis[i][j]=0;
        }
        //up
        if(i-1>0 && vis[i-1][j]==0 && maze[i-1][j]==1){
            vis[i][j]=1;
            solve(maze,vis,i-1,j,move+"U");
            vis[i][j]=0;
        }
    }

    //Better way of writing the same code
    public static void solve1(int maze[][],int vis[][],int i,int j,String move,int di[],int dj[]){
        if(i==maze.length-1 && j==maze[0].length-1){
            System.out.println(move);
            return;
        }

        String moves="DLRU";
        for(int idx=0;idx<4;idx++){
            int nexti=i+di[idx];
            int nextj=j+dj[idx];

            if(nexti>=0 && nexti<maze.length && nextj>=0 && nextj<maze[0].length 
            && vis[nexti][nextj]==0 && maze[nexti][nextj]==1){
                vis[i][j]=1;
                solve1(maze,vis,nexti,nextj,move+moves.charAt(idx),di,dj);
                vis[i][j]=0;
            }
        }
    }



    public static void main(String args[]){
        int maze[][]={{1,0,0,0},
                      {1,1,0,0},
                      {1,1,0,0},
                      {0,1,1,1}};
        int vis[][]=new int[maze.length][maze[0].length];
        /*if(maze[0][0]==1){
            solve(maze,vis,0,0,"");
        }else{
            System.out.print("Solution doesnt exist!");
        }*/

        //better version
        int di[]={1,0,0,-1};
        int dj[]={0,-1,1,0};
        if(maze[0][0]==1){
            solve1(maze,vis,0,0,"",di,dj);
        }else{
            System.out.print("Solution doesnt exist!");
        }
    }
}