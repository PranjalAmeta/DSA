/*Given an array nums with n objects colored red, white, or blue, 
sort them in-place so that objects of the same color are adjacent, 
with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function. */
public class SortColors {
    public void sortColors(int[] arr) {
        int cRed=0,cWhite=0,cBlue=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                cRed+=1;
            }else if(arr[i]==1){
                cWhite+=1;
            }else{
                cBlue+=1;
            }
        }
        int i=0;
        while(cRed!=0){
            arr[i++]=0;
            cRed--;
        }
        while(cWhite!=0){
            arr[i++]=1;
            cWhite--;
        }
        while(cBlue!=0){
            arr[i++]=2;
            cBlue--;
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,2,0,2};
        SortColors sc=new SortColors();
        sc.sortColors(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
