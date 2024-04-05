//Given a non-empty array of integers nums, every element appears twice except for one. 
//Find that single one.

public class Singlenumber{
    public static int sPow(int arr[]){
        int XOR=0;
        for(int i=0;i<arr.length;i++){
            XOR^=arr[i];
        }
        return XOR;
    }
    public static void main(String args[]){
        int arr[]={1,1,3,4,4};
        System.out.print(sNum(arr));
    }
}