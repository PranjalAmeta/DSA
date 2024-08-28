// Strivers
public class QuickSort{
    public static void quickSort(int arr[],int si,int ei){
        if(si>ei){
            return;
        }
        
        int pidx=findPartition(arr,si,ei);
        quickSort(arr,si,pidx-1);
        quickSort(arr,pidx+1,ei);
    }

    public static int findPartition(int arr[],int si,int ei){
        int pivot=arr[si];
        int i=si;
        int j=ei;
        while(i<j){
            while(arr[i]<=pivot && i<=ei-1){   //for left
                i++;
            } 
            while(arr[j]>pivot && j>=si+1){    //for right
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //swap for pivot
        int temp=arr[j];
        arr[j]=arr[si];
        arr[si]=temp;
        
        return j;
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={4,6,2,5,7,9,1,3};
        quickSort(arr,0,arr.length-1);
        printarr(arr);
    }
}