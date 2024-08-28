import java.util.*;
public class FindMax{
    public static int findMax(ArrayList<Integer> list){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
            //max=Math.max(max,list.get(i));
        }
        return max;
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2,5,9,3,6));
        System.out.println(findMax(list));
    }
}
