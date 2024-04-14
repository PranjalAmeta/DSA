public class FirstOccurance{
    public static int firstOcc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOcc(arr,key,i+1);
    }
    public static void main(String args[]){
        int arr[]={8,9,10,5,6};
        int key=67;
        System.out.print(firstOcc(arr,key,0));
    }
}