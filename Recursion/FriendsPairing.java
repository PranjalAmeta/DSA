public class FriendsPairing{
    public static int totalWays(int n){
        if(n==1 || n==2){
            return n;
        }
        //           single   +  Paired
        return totalWays(n-1) + (n-1)*totalWays(n-2);
    }
    public static void main(String args[]){
        System.out.print(totalWays(3));
    }
}