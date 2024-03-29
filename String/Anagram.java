import java.util.*;
public class Anagram{
    public static boolean isAnagram(String s, String t) {
        char schar[]=s.toCharArray();
        char tchar[]=t.toCharArray();
        Arrays.sort(schar);
        Arrays.sort(tchar);
        return Arrays.equals(schar,tchar);
    }
    public static void main(String args[]){
        String s="anagram";
        String t="gramana";
        System.out.print(isAnagram(s,t));
    }
}