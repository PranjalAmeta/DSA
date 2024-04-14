public class LengthOfString{
    public static int length(String str){
        if(str.length()==0){
            return 0;
        }
        int l=length(str.substring(1));
        return l+1;
    }
    public static void main(String args[]){
        String str="abcd";
        System.out.println(length(str));
        //System.out.print(str.substring(2));
    } 
}