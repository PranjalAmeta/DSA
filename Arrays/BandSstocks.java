//Buy and Sell stocks
public class BandSstocks{
    public static int profit(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i<prices.length;i++){
            int sp=prices[i];
            if(buyprice<sp){
                int profit=sp-buyprice;
                maxprofit=Math.max(profit,maxprofit);
            }else{
                buyprice=sp;
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int price[]={7,1,5,3,6,4};
        System.out.print(profit(price));
    }
}