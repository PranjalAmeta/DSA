public class TilingProblem{
    // 2xn he toh sirf n pass karenge main role usi ka he
    public static int tileProb(int n){   
        if(n==0 || n==1){
            return 1;
        }
        int vertical=tileProb(n-1);
        int horizontal=tileProb(n-2);
        
        return vertical+horizontal;
    }
    public static void main(String args[]){
        System.out.print(tileProb(2));
    }
}