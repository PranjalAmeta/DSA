public class Increasing{
    public static void incOrder(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        incOrder(n-1);
        System.out.print(n+" ");
    } 
    public static void main(String args[]){
        int n=5;
        incOrder(n);
    }
}