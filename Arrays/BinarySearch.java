public class BinarySearch{
    public static int BS(int arr[],int key){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={13,23,54,67,78};
        int key=54;
        int idx=BS(arr,key);
        if(idx==-1){
            System.out.print("Element is not present in the array");
        }else{
            System.out.print("Element found at index:"+idx);
        }
    }
}