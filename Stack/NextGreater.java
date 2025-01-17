import java.util.*;
public class NextGreater {
    public static int[] nextGreater(int arr[]){
        Stack<Integer> s=new Stack<>();
        int ans[]=new int[arr.length];
        ans[arr.length-1]=-1;
        s.push(arr.length-1);
        for(int i=arr.length-2;i>=0;i--){
            while(!s.isEmpty() && arr[i]>=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=arr[s.peek()];
            }
            s.push(i);
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[]={6,8,0,1,3};
        int ans[]=nextGreater(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
