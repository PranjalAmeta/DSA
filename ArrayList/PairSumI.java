import java.util.*;
public class PairSumI {
    public static boolean pS(ArrayList<Integer> list,int target){
        /*
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        */

        int Lp=0,Rp=list.size()-1;
        while(Lp!=Rp){
            if((list.get(Lp)+list.get(Rp))==target){
                return true;
            }

            if((list.get(Lp)+list.get(Rp))<target){
                Lp++;
            }else{
                Rp--;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        int target=5;
        System.out.print(pS(list,target));
    }
}
