public class Swap{
    public static void main(String args[]){
        int x=6,y=7;
        System.out.println("numbers before swap x="+x+","+"y="+y);
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.print("numbers after swap x="+x+","+"y="+y);
    }
}