import java.util.*;
public class UpperToLower{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        System.out.print("Upper case of "+ch+" is:"+(char)(ch|' '));
    }
}