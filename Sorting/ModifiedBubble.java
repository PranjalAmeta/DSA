public class ModifiedBubble{
    public static void bubble(int arr[]){
        for(int i=0;i<arr.length;i++){
            boolean swaps=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps=true;
                }
            }
            if(swaps==false){
                break;
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    // Worst Case TC-O(n^2)
    // Best Case TC-O(n)
    public static void main(String args[]){
        int arr[]={1,2,3,5,4};
        bubble(arr);
        printarr(arr);
    }
}