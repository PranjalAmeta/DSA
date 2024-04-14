public class TowerOfHanoi{
    public static void toh(int n,String beg,String aux,String end){
        int count=0;
        if(n==1){
            System.out.println("Disk "+n+" moved from "+beg+" to "+end);
            return;
        }
        /*
        toh(n-1,beg,end,aux);
        toh(1,beg,aux,end);
        toh(n-1,aux,beg,end);
        */
        toh(n-1,beg,end,aux);      
        System.out.println("Disk "+n+" moved from "+beg+" to "+end);
        toh(n-1,aux,beg,end);
        
    }
    public static void main(String args[]){
        toh(3,"a","b","c");
    }
}