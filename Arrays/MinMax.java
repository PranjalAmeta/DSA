public class MinMax{
    public static void MINMAX(int arr[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum value="+max);
        System.out.println("Minimum value="+min);
    }
    public static void main(String args[]){
        int arr[]={22, 14, 8, 17, 35, 3};
        MINMAX(arr);
    }
}