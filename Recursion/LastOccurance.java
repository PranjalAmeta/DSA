public class LastOccurance{
    public static int lastOcc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOcc(arr,key,i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String args[]){
        int arr[]={8,9,10,5,6,9};
        int key=6;
        System.out.print(lastOcc(arr,key,0));
    }
}