
import java.util.*;
public class Duplicate{
    public static boolean duplicate(int arr[]){
        Arrays.sort(arr);                         //Will have O(nlogn) TC 
        for(int i=1;i<arr.length;i++){            //Can be better by using hash
            if(arr[i]==arr[i-1]){
                return true;
            }
        }
        return false;
    } 
    public static void main(String args[]){
        int arr[]={1,2,3,4,1};
        System.out.print(duplicate(arr));
    }
}