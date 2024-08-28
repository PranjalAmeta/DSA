// Monotonic increasing or decreasing
import java.lang.reflect.Array;
import java.util.*;
public class IncOrDec {
    public static boolean monoTone(ArrayList<Integer> list){
        boolean inc=true;
        boolean dec=true;

        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                inc=false;
            }
            if(list.get(i)<list.get(i+1)){
                dec=false;
            }
        }

        return inc || dec ;
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,2,3));
        System.out.println(monoTone(list));
    }
}
