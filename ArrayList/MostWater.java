// Conatiner with most water
import java.util.*;
public class MostWater {
    public static int mostWater(ArrayList<Integer> list){
        int maxWater=0;
        
        //BruteForce - O(n^2)

        /*
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int height=Math.min(list.get(i),list.get(j));
                int width=j-i;
                int water=height*width;
                maxWater=Math.max(maxWater,water);
            }
        }*/


        //Optimal case-2 Pointer approach -O(n)

        int Lp=0,Rp=list.size()-1;
        while(Lp<Rp){
            int height=Math.min(list.get(Lp),list.get(Rp));
            int width=Rp-Lp;
            int currWater=height*width;
            maxWater=Math.max(maxWater,currWater);

            //Check for 2 pointer
            if(list.get(Lp)<list.get(Rp)){
                Lp++;
            }else{
                Rp--;
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,8,6,2,5,4,8,3,7));
        System.out.print("maximum water container can store="+mostWater(list));
    }
}
