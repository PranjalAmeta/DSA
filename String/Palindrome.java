import java.util.*;
public class Palindrome{
    public static boolean palindrome(String str){
       int i=0,j=str.length()-1;
        if(str.isEmpty()){
            return true;
        }
        while(i<=j){
            char charfirst=str.charAt(i),charlast=str.charAt(j);
            if(!Character.isLetterOrDigit(charfirst)){           //check if the char is letter or digit or not
                i++;  
            }else if(!Character.isLetterOrDigit(charlast)){
                j--;
            }else{
               if(Character.toLowerCase(charfirst)!=Character.toLowerCase(charlast)){   
                   return false;
               }
               i++;
               j--;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.print(palindrome(str));
    }
}