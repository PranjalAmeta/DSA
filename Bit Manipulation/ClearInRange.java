public class ClearInRange{
    public static int ClearBits(int n,int i,int j){
        int a=(~0)<<j+1;
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n & bitmask;
    }
    public static void main(String args[]){
        System.out.print(ClearBits(15,2,4));
    }
}