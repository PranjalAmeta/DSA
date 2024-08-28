import java.util.*;
public class PairSumII {  // O(n)
    public static boolean pSII(ArrayList<Integer> list,int target){
        int i=0,n=list.size();
        while(list.get(i)<list.get(i+1)){
            i++;
        }
        int Lp=i+1;
        int Rp=i;
        while(Lp!=Rp){
            if((list.get(Lp)+list.get(Rp))==target){
                return true;
            }

            if((list.get(Lp)+list.get(Rp))<target){
                Lp=(Lp+1)%n;
            }else{
                Rp=(n+Rp-1)%n;
            }
        }
        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(11,15,6,8,9,10));
        int target=14;
        System.out.println(pSII(list,target));
    }
}
