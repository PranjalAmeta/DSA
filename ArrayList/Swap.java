import java.util.*;
public class Swap {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int i=list.get(idx1);
        int j=list.get(idx2);
        list.set(idx1,j);
        list.set(idx2,i);
        System.out.print("After swap"+list);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2,5,9,3,6));
        System.out.println("Enter the 1st index:");
        int idx1=sc.nextInt();
        System.out.println("Enter the 2nd index:");
        int idx2=sc.nextInt();
        System.out.println("before swap:"+list);
        swap(list, idx1, idx2);
        sc.close();
    } 
}
