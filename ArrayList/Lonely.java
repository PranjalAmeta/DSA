// Lonely Numbers in ArrayList
import java.util.*;
public class Lonely {
    public static List<Integer> lonely(int arr[]){
        Arrays.sort(arr);
        ArrayList<Integer> list=new ArrayList<>();
        if(arr.length==1){
            return Arrays.asList(arr[0]);
        }
        for(int i=0;i<arr.length;i++){
            boolean islonely=true;
            if(i>0 && (arr[i]==arr[i-1] || arr[i]==arr[i-1]+1)){
                islonely=false;
            }
            if(i<arr.length-1 && (arr[i]==arr[i+1] || arr[i]==arr[i+1]-1)){
                islonely=false;
            }
            if(islonely){
                list.add(arr[i]);
            }
        }
        return list;
    }
    public static void main(String args[]){
        int arr[]={1,3,5,3};
        System.out.println(lonely(arr));
    }
}
