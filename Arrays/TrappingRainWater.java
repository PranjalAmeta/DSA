//Trapping Rain water Problem
public class TrappingRainWater{
    public static int TrappedWater(int height[]){
        int n=height.length;

        //left max
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }

        //right max
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }

        //loop
        int trappedwater=0;
        for(int i=0;i<height.length;i++){
            //Waterlevel
            int waterlev=Math.min(leftmax[i],rightmax[i]);

            //trappedwater
            trappedwater+=waterlev-height[i];
        }

        return trappedwater;
    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.print("TrappedWater="+TrappedWater(height));
    }
}