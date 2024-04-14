// Print all binary strings of size N without consecutive ones.
public class BinaryString{
    public static void totalWays(int n,String str,int Lastplace){
        if(n==0){
            System.out.println(str);
            return;
        }
        // 0 should always be placed Conditions are only applied to 1
        totalWays(n-1,str+"0",0);
        if(Lastplace==0){
            totalWays(n-1,str+"1",1);
        }
    }
    public static void main(String args[]){
        totalWays(3,"",0);
    }
}