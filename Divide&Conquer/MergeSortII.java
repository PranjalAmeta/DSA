// Merge Sort on Strings
public class MergeSortII{
    public static void divide(String arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;

        //left
        divide(arr,si,mid);

        //right
        divide(arr,mid+1,ei);

        //merge
        merge(arr,si,mid,ei);
    }

    public static void merge(String arr[],int si,int mid,int ei){
        //Temporary array eg-if start arr is (0,3)=4 and ending arr is (4,6)=3  4+3=7 so 6-0+1=7
        String temp[]=new String[ei-si+1];
        int i=si;    //left array
        int j=mid+1; //right array
        int k=0;    //fot temp array

        while(i<=mid && j<=ei){
            if(arr[i].compareTo(arr[j])<0){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        

        //leftover elements from left array
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        //leftover elements from right array
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        //copying temp arr to real arr
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }

    public static void printarr(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        String arr[]={"earth","mars","sun","moon"};
        divide(arr,0,arr.length-1);
        printarr(arr);
    }
}