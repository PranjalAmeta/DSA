public class Compression{
    public static String compression(String str){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            int count=1;
            sb.append(str.charAt(i));
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            if(count>1){
                sb.append(count);//.toString());
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str="aaabbbcccddd";
        System.out.print(compression(str));
    }
}