import java.util.*;
public class ReverseString {
    public static String reverseString(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        StringBuilder str1=new StringBuilder("");
        while(!s.isEmpty()){
            str1.append(s.pop());
        }

        return str1.toString();
    }
    public static void main(String args[]){
        String str="abc";  
        System.out.print(reverseString(str));
    }
}
