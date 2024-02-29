public class Insertion{
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];  //temporary store
            int prev=i-1;

            //Finding pos to insert element
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }

            //inserting Element
            arr[prev+1]=curr;
        }
    }

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        insertionSort(arr);
        printarr(arr);
    }
}