//For a given integer of size N.You have to find all the occurances of given element 
//and print them.
public class Occurances{
    public static void occur(int arr[],int key,int i){
        if(i==arr.length){
            return;
        }

        if(arr[i]==key){
            System.out.print(i+" "); 
        }
        occur(arr,key,i+1);
    }
    public static void main(String args[]){
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        occur(arr,key,0);
    }
} 