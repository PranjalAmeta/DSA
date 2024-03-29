import java.util.*;
public class basic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str1="abs;';; 9";
        /*for(int i=0;i<str1.length();i++){
            char a=str1.charAt(i);
            System.out.print(Character.isLetterOrDigit(a)+" ");
        }*/


        /*String str2="tony";
        String str3="tony";
        String str4=new String("tony");

        if(str2==str3){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
        
        if(str2==str4){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
        
        if(str2.equals(str4)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }*/

        /*StringBuilder sb=new StringBuilder("");
        for(char i='a';i<='z';i++){
            sb.append(i);  //TC-O(n or 26)
            //sb+=i;       //TC-O(26 * n) - O(n^2)
        }
        System.out.print("String="+sb+" "+"of length="+sb.length());
        */
        String s="aabedfg";
        char []schar=s.toCharArray();
        //Arrays.sort(schar);
        System.out.print(s);
    }
}