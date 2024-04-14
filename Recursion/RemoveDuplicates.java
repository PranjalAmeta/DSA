public class RemoveDuplicates{
    public static void remDup(StringBuilder sb,int idx,String str,boolean map[]){
        if(idx==str.length()){
            System.out.print(sb.toString());
            return;
        }

        char currch=str.charAt(idx);

        if(map[currch-'a']==true){
            remDup(sb,idx+1,str,map);
        }else{
            map[currch-'a']=true;
            remDup(sb.append(currch),idx+1,str,map);
        }
        
    }
    public static void main(String args[]){
        String str="appnacollege";
        remDup(new StringBuilder(""),0,str,new boolean[26]);
    }
}