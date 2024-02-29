//Rotated Sorted Array
public class RSA{
    public static int rsa(int arr[],int key){
        int s=0,e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            
            if(arr[mid]==key){
                return mid;
            }

            //Left Sorted
            if(arr[s]<arr[mid]){
                if(key<arr[mid] && key>=arr[s]){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }

            //Right Sorted
            else{
                if(key>arr[mid] && key<=arr[e]){
                    s=mid+1;
                }else{
                    e=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[]={4,5,6,1,2,3};
        int key=1;
        int idx=rsa(arr,key);
        if(idx==-1){
            System.out.print("Element not present in the array");
        }else{
            System.out.print("element is present at index:"+idx);
        }
    }
}