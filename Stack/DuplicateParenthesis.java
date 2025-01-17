import java.util.*;
public class DuplicateParenthesis {
    public static boolean isDuplicate(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){
                int count=0;
                while(s.peek()!='('){  // while(s.pop()!='('){
                    s.pop();           //     count++;       
                    count++;           //  }  
                }                      //  if(count<1){ 
                if(count<1){           //     return true
                    return true;       //  }
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            } 
        }
        return false;
    }
    public static void main(String[] args) {
        String str="(((a+b)+(c+d)))";
        System.out.print("Is Duplicate: "+isDuplicate(str));
    }
}
