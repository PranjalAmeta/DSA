// Rotated Sorted Array using D&C approach
public class RSA{
    public static int find(int arr[],int key,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(arr[mid]==key){
            return mid;
        }

        //Left
        if(arr[si]<=arr[mid]){
            //Left
            if(key>=arr[si] && key<arr[mid]){
                return find(arr,key,si,mid-1);
            }else{
                return find(arr,key,mid+1,ei);
            }
        }
        else{
            if(key>arr[mid] && key<=arr[ei]){
                return find(arr,key,mid+1,ei);
            }else{
                return find(arr,key,si,mid-1);
            }
        }
    }
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2,3};
        int key=10;
        int idx=find(arr,key,0,arr.length-1);
        if(idx==-1){
            System.out.print("Element not found!");
        }else{
            System.out.print("Element found at index:"+idx);
        }
    }
}