public class PowerII{
    public static int powII(int x,int n){
        if(n==0){
            return 1;
        }
        // int halfpowsq=powII(x,n/2)*powII(x,n/2);  Still O(n) TC
        // for it to be O(n) we have to do the following
        int halfpow=powII(x,n/2);
        int halfpowsq= halfpow * halfpow;
        if(n%2!=0){
            halfpowsq= x * halfpowsq;
        }
        return halfpowsq;
    }
    public static void main(String args[]){
        System.out.print(powII(2,10));
    }
}