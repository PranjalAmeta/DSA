public class Substring{
    public static String subString(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str="helloworld";
        //System.out.print(subString(str,0,4));
        System.out.print(str.substring(0,4));
    }
}