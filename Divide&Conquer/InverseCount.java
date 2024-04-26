public class InverseCount{
    public static int divide(int arr[],int si,int ei){
        int invcount=0;
        if(ei>si){
        
            int mid=si+(ei-si)/2;
            invcount+=divide(arr,si,mid);
            invcount+=divide(arr,mid+1,ei);
            invcount+=merge(arr,si,mid,ei);
        }
        return invcount;
    }


    public static int merge(int arr[],int si,int mid,int ei){
        int i=si;
        int j=mid+1;
        int k=0;
        int count=0;
        int temp[]=new int[ei-si+1];

        while(i<=mid && j<=ei){
            if(arr[i]>arr[j]){
                count+=(mid-si+1);
                temp[k]=arr[j];
                j++;
            }else{
                temp[k]=arr[i];
                i++;
            }
            k++;
        }

        if(i<=mid){
            temp[k++]=arr[i++]; 
        }

        if(j<=ei){
            temp[k++]=arr[j++];
        }

        for(i=si,k=0;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
        return count;
    }

    public static void main(String args[]){
        int arr[]={5,3,2,4,1};
        System.out.print("count="+divide(arr,0,arr.length-1));
    }
}