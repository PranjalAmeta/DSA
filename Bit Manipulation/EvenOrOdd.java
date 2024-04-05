import java.util.*;
public class EvenOrOdd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int bitmask=1;
        if((n & bitmask)==1){
            System.out.print("odd");
        }else{
            System.out.print("even");
        }
    }
}