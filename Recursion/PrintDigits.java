public class PrintDigits{
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printdig(int n){
        if(n==0){
            return;
        }
        int LD=n%10;
        printdig(n/10);
        System.out.print(digits[LD]+" ");
    }
    public static void main(String args[]){
        printdig(2010);
    }
}