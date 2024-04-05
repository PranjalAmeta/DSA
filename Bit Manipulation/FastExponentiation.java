public class FastExponentiation{
    public static int fastExpo(int a,int n){
        int ans=1;
        while(n>0){
            if((n & 1)==1){
                ans=ans*a;
            }
            n=n>>1;
            a=a*a;
        }
        return ans;
    }
    public static void main(String args[]){
        System.out.print(fastExpo(5,3));
    }
}