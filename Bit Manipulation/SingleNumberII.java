//Given an integer array nums where every element appears three times except for one, which appears exactly once. 
//Find the single element and return it.
public class SinglePowerII{
    public static int sPowII(int arr[]){
        int ones=0;
        int twos=0;
        for(int i=0;i<arr.length;i++){
            ones=((ones^arr[i]) & (~twos));
            twos=((twos^arr[i]) & (~ones));
        }
        return ones;
    }
    public static void main(String args[]){
        int arr[]={2,3,2,4,2,4,4};
        System.out.print(sPowII(arr));
    }
}