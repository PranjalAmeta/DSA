//Maximum Subarray Sum Problem-Kadanes Algorithm
public class Kadane{
     public static void kadane(int arr[]){
        int cs=0;
        int max=Integer.MIN_VALUE;
        int maxElement=Integer.MIN_VALUE; //for negative array

        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            if(cs<0){
                cs=0;
            }
            max=Math.max(cs,max);
            maxElement=Math.max(arr[i],maxElement);
        }
        if(max==0){
            max=maxElement;
        }
        System.out.print("MaxSubArray Sum="+max);
    }
    public static void main(String args[]){
        int arr[]={-2,-3,4,-1,-2,,5,-3};
        kadane(arr);
    }
}